package strategy;

import java.util.List;

/**
 * The SearchBehavior interface defines a contract for search strategies 
 * that can be applied to a list of Person objects. Classes that implement 
 * this interface must provide an implementation of the contains method, 
 * which checks if a specified Person is present in the list.
 */
public interface SearchBehavior {
    
    /**
     * Checks if the specified person is present in the provided list of people.
     * The implementation of this method will vary depending on the search strategy
     * (e.g., linear search, binary search).
     *
     * @param people The list of Person objects to search through.
     * @param person The Person object to search for in the list.
     * @return true if the person is found in the list, false otherwise.
     */
    boolean contains(List<Person> people, Person person);
}
