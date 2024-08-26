package strategy;

import java.util.Collections;
import java.util.List;

/**
 * The BinarySearch class implements the SearchBehavior interface using 
 * the binary search algorithm. It checks if a specified Person is 
 * present in a list of people.
 */
public class BinarySearch implements SearchBehavior {

    /**
     * Searches for the specified person in the provided list using a binary search.
     * The list is sorted before performing the search.
     *
     * @param people The list of Person objects to search through.
     * @param person The Person object to search for in the list.
     * @return true if the person is found in the list, false otherwise.
     */
    @Override
    public boolean contains(List<Person> people, Person person) {
        Collections.sort(people);  // Ensure the list is sorted before performing binary search
        return Collections.binarySearch(people, person) >= 0;
    }
}
