package strategy;
import java.util.List;

public interface SearchBehavior {
    boolean contains(List<Person> people, Person person);
}