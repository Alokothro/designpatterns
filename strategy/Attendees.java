package strategy;

import java.util.ArrayList;
import java.util.List;

public class Attendees {
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    public Attendees(String title) {
        this.title = title;
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();  // Default to LinearSearch
    }

    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person person = new Person(firstName, lastName, phoneNumber, reminder);
        if (!searchBehavior.contains(people, person)) {
            people.add(person);
            return person;  // Return the added person
        }
        return null;  // Return null if the person is already on the list
    }

    public String getTitle() {
        return title;
    }

    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    public List<Person> getList() {
        return people;
    }
}