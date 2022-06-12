import java.util.*;
public class Comparer  implements Comparator<Employee> {
    /**
     * It compares two employees Id of Employee objects
     */
    public int compare(Employee o1, Employee o2) {
        return o1.ID().compareTo(o2.ID());
    }
}
