package Iterator;

import java.time.LocalTime;

/**
 * The Flight class represents a flight with a flight number, departure and arrival airports, 
 * start and end times, and the number of transfers.
 * 
 * @author Alok Patel
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Constructs a Flight object with the specified flight number, origin, destination, 
     * start time, end time, and the number of transfers.
     * 
     * @param flightNum The flight number.
     * @param from The departure airport.
     * @param to The arrival airport.
     * @param startTime The time the flight departs.
     * @param endTime The time the flight arrives.
     * @param numTransfers The number of transfers for the flight.
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Returns the departure airport of the flight.
     * 
     * @return The departure airport.
     */
    public Airport getFrom() {
        return from;
    }

    /**
     * Returns the arrival airport of the flight.
     * 
     * @return The arrival airport.
     */
    public Airport getTo() {
        return to;
    }

    /**
     * Checks if the flight's origin and destination match the provided airports.
     * 
     * @param from The departure airport to compare.
     * @param to The arrival airport to compare.
     * @return True if both the origin and destination match; false otherwise.
     */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }

    /**
     * Returns a string representation of the flight details, including origin, destination, 
     * departure time, arrival time, duration, and number of transfers.
     * 
     * @return A formatted string with flight details.
     */
    @Override
    public String toString() {
        return String.format("%s to %s %s - %s (%dh %dm) %s",
                from, to, startTime, endTime,
                (endTime.getHour() - startTime.getHour()), 
                (endTime.getMinute() - startTime.getMinute()),
                numTransfers == 0 ? "Direct Flight" : numTransfers + " Transfers");
    }
}
