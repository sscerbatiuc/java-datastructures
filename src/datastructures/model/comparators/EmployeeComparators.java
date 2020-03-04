package datastructures.model.comparators;

import datastructures.model.Employee;
import java.util.Comparator;

/**
 *
 * @author sscerbatiuc
 */
public class EmployeeComparators {

    public static final Comparator<Employee> BY_NAME = (e1, e2) -> e1.getName().compareTo(e2.getName());
    public static final Comparator<Employee> BY_SURNAME = (e1, e2) -> e1.getSurname().compareTo(e2.getSurname());
    public static final Comparator<Employee> BY_GENDER = (e1, e2) -> Character.compare(e1.getGender(), e2.getGender());
    public static final Comparator<Employee> BY_BIRTHDATE = (e1, e2) -> e1.getBirthDate().compareTo(e2.getBirthDate());
    public static final Comparator<Employee> BY_SALARY = (e1, e2) -> Float.compare(e1.getSalary(), e2.getSalary());
}
