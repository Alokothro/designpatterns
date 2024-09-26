package Iterator;

import java.util.ArrayList;

/**
 * The Airline class represents an airline that contains a collection of flights.
 * It provides methods to manage flights and create an iterator to search for flights
 * between specified airports.
 * 
 * @author Alok Patel
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Constructs an Airline object with the specified title.
     * It loads the flights using the FlightLoader.
     * 
     * @param title The name of the airline.
     */
    public Airline(String title) {
        this.title = title;
        this.flights = new ArrayList<>();

        // Use FlightLoader to load flights
        FlightLoader flightLoader = new FlightLoader();
        this.flights = flightLoader.getFlights();  // Assuming FlightLoader has this method
    }

    /**
     * Returns the title of the airline.
     * 
     * @return The airline's title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates a FlightIterator to iterate over flights from the specified origin to
     * the specified destination. If invalid airport codes are provided, an empty iterator
     * is returned and an error message is printed.
     * 
     * @param fromCode The code of the origin airport.
     * @param toCode The code of the destination airport.
     * @return A FlightIterator for the specified route.
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        try {
            // Convert String to Airport enum and handle invalid codes
            Airport from = Airport.valueOf(fromCode);
            Airport to = Airport.valueOf(toCode);
            return new FlightIterator(flights, from, to);
        } catch (IllegalArgumentException e) {
            // Print error message if invalid airport codes are entered
            System.out.println("Must enter valid airport codes");
            // Return an empty iterator to ensure AirlineDriver can proceed without modification
            return new FlightIterator(new ArrayList<>(), null, null);
        }
    }

    /**
     * Adds a flight to the airline's list of flights.
     * 
     * @param flight The flight to add.
     */
    public void addFlight(Flight flight) {
        flights.add(flight);
    }
}
