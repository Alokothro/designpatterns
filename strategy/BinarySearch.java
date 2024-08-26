package strategy;
import java.util.Collections;
import java.util.List;

public class BinarySearch implements SearchBehavior {

    @Override
    public boolean contains(List<Person> people, Person person) {
        Collections.sort(people);  
        return Collections.binarySearch(people, person) >= 0;
    }
}