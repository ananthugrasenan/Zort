import java.util.Comparator;

public class PairingZorter extends SimpleZorter {

    /**
     * Override the makeComparator method to add on secondary
     * comparison fields if appropriate
     */
    @Override
    protected Comparator<Person> makeComparator(String sortField, boolean ascending) {
        Comparator<Person> cmp = super.makeComparator(sortField, ascending);
        switch (sortField) {
            case "firstName":
                cmp = cmp.thenComparing(Person::getLastName);
                break;
            case "lastName":
                cmp = cmp.thenComparing(Person::getFirstName);
                break;
            case "heightIn":
                cmp = cmp.thenComparing(Person::getWeightLb);
                break;
            case "weightLb":
                cmp = cmp.thenComparing(Person::getHeightIn);
                break;
        }
        return cmp;
    }
}
