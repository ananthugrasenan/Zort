import java.util.Comparator;
import java.util.List;

public class SimpleZorter implements Zorter {

    public List<Person> sort(List<Person> persons, String sortField, Boolean ascending) {
        Comparator<Person> comparator = makeComparator(sortField, ascending);
        persons.sort(comparator);
        return persons;
    }

    protected Comparator<Person> makeComparator(String sortField, boolean ascending) {
        Comparator<Person> cmp;
        switch (sortField) {
            case "ssn":
                cmp = Comparator.comparing(Person::getSsn);
                break;
            case "dateOfBirth":
                cmp = Comparator.comparing(Person::getDateOfBirth);
                break;
            case "firstName":
                cmp = Comparator.comparing(Person::getFirstName);
                break;
            case "lastName":
                cmp = Comparator.comparing(Person::getLastName);
                break;
            case "heightIn":
                cmp = Comparator.comparing(Person::getHeightIn);
                break;
            case "weightLb":
                cmp = Comparator.comparing(Person::getWeightLb);
                break;
            default:
                cmp = Comparator.comparing(Person::getSsn);
                break;
        }
        return ascending ? cmp : cmp.reversed();
    }
}
