package strategy;

import java.util.List;

/**
 * The LinearSearch class implements the SearchBehavior interface using 
 * the linear search algorithm. It checks if a specified Person is 
 * present in a list of people by iterating through the list.
 */
public class LinearSearch implements SearchBehavior {

    /**
     * Searches for the specified person in the provided list using a linear search.
     * It iterates through the list and checks for equality with each person in the list.
     *
     * @param people The list of Person objects to search through.
     * @param person The Person object to search for in the list.
     * @return true if the person is found in the list, false otherwise.
     */
    @Override
    public boolean contains(List<Person> people, Person person) {
        for (Person p : people) {
            if (p.equals(person)) {
                return true;
            }
        }
        return false;
    }
}
