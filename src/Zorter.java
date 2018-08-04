import java.util.List;

public interface Zorter {
    List<Person> sort(List<Person> persons, String sortField, Boolean ascending);
}
