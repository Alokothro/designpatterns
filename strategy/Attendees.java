package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * The Attendees class represents a list of people invited to an event.
 * It allows adding new attendees, setting a search behavior to determine
 * how to check if a person is already in the list, and retrieving the list
 * of attendees.
 */
public class Attendees {
    private String title; // The title of the event or the list.
    private List<Person> people; // The list of attendees.
    private SearchBehavior searchBehavior; // The strategy used to search for attendees.

    /**
     * Constructs an Attendees object with a specified title.
     * Initializes the list of people and sets the default search behavior to LinearSearch.
     *
     * @param title The title of the event or attendee list.
     */
    public Attendees(String title) {
        this.title = title;
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();  // Default to LinearSearch
    }

    /**
     * Adds a new person to the attendee list if they are not already present.
     *
     * @param firstName    The first name of the person.
     * @param lastName     The last name of the person.
     * @param phoneNumber  The phone number of the person.
     * @param reminder     A reminder or note about the person.
     * @return The Person object if the person was added to the list,
     *         or null if the person was already in the list.
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person person = new Person(firstName, lastName, phoneNumber, reminder);
        if (!searchBehavior.contains(people, person)) {
            people.add(person);
            return person;  // Return the added person
        }
        return null;  // Return null if the person is already on the list
    }

    /**
     * Gets the title of the event or attendee list.
     *
     * @return The title of the event or attendee list.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the search behavior strategy for the attendee list.
     * This strategy determines how the list checks for the presence of a person.
     *
     * @param searchBehavior The search behavior strategy to be used.
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    /**
     * Gets the list of attendees.
     *
     * @return A list of Person objects representing the attendees.
     */
    public List<Person> getList() {
        return people;
    }
}
