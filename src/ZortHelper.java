import java.util.ArrayList;
import java.util.List;

public class ZortHelper {
    static List<Person> sort(Iterable<Person> people, String sortField, String ascending){
        List<Person> persons = new ArrayList<>();
        people.forEach(persons::add);
        Zorter zorter = new SimpleZorter();
        // Zorter zorter = new PairingZorter();
        return  zorter.sort(persons, sortField, Boolean.valueOf(ascending));
    }
}
