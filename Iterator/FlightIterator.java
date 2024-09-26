package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The FlightIterator class provides an iterator to filter and iterate over flights
 * that match a specific origin and destination airport.
 * 
 * @author Alok Patel
 */
public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position = 0;
    private Airport from;
    private Airport to;

    /**
     * Constructs a FlightIterator for the given list of flights, filtering by origin 
     * and destination airports.
     * 
     * @param flights The list of flights to iterate through.
     * @param from The origin airport to filter flights by.
     * @param to The destination airport to filter flights by.
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
    }

    /**
     * Checks if there are more flights that match the origin and destination.
     * 
     * @return true if a matching flight is found, false otherwise.
     */
    @Override
    public boolean hasNext() {
        while (position < flights.size()) {
            Flight flight = flights.get(position);
            if (flight.sameLoc(from, to)) {
                return true;
            }
            position++;
        }
        return false;
    }

    /**
     * Returns the next flight that matches the origin and destination airports.
     * 
     * @return The next matching Flight object.
     */
    @Override
    public Flight next() {
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}
