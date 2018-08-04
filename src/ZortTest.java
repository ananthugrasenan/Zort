import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

public class ZortTest {

    static Collection<Person> setupCollection() {
        Collection<Person> persons = new HashSet<>();

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        try {
            Person JA = new Person("901-01-2211", df.parse("1/14/1967"), "John", "Adams", 70d, 180d);
            Person EA = new Person("567-01-5371", df.parse("7/24/1971"), "Emma", "Adams", 67d, 140d);
            Person AA = new Person("041-01-2271", df.parse("7/24/1947"), "Amy", "Adams", 66d, 140d);
            Person JS = new Person("701-77-1234", df.parse("11/4/1973"), "Jeremy", "Swan", 77d, 186d);
            Person LM = new Person("342-01-3333", df.parse("2/9/1989"), "Lily", "Meyer", 70d, 148d);
            Person LW = new Person("021-01-5345", df.parse("5/18/1969"), "Lucinda", "Williams", 68d, 154d);

            persons.add(JA);
            persons.add(EA);
            persons.add(AA);
            persons.add(JS);
            persons.add(LM);
            persons.add(LW);

        } catch (ParseException ex) {
        }
        return persons;
    }

    public static void main(String... args) {

        Iterable<Person> people = setupCollection();
        System.out.println("People: " + people);

        List<Person> ordered = ZortHelper.sort(people, "ssn", "true");
        System.out.println("ssn asc: " + ordered);

        ordered = ZortHelper.sort(people, "firstName", "true");
        System.out.println("fn asc: " + ordered);

        ordered = ZortHelper.sort(people, "lastName", "false");
        System.out.println("ln desc: " + ordered);

        ordered = ZortHelper.sort(people, "lastName", "true");
        System.out.println("ln asc: " + ordered);

        ordered = ZortHelper.sort(people, "swim", "trains");
        System.out.println("invalid inputs: " + ordered);

    }

}
