package datastructures.model;

import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 */
public class Accountant extends Employee implements Comparator<Accountant> {

    public float performanceBonus = 1.1F;

    /**
     * Constructor 1.
     * @param name
     * @param surname
     * @param gender 
     */
    public Accountant(String name, String surname, char gender) {
        super(name, surname, gender);
    }

    /**
     * * Constructor 2.
     * @param name
     * @param surname
     * @param gender
     * @param birthDate 
     */
    public Accountant(String name, String surname, char gender, LocalDate birthDate) {
        super(name, surname, gender, birthDate);
    }

    /**
     * * Constructor 3.
     * @param name
     * @param surname
     * @param gender
     * @param birthDate
     * @param salary 
     */
    public Accountant(String name, String surname, char gender, LocalDate birthDate, float salary) {
        super(name, surname, gender, birthDate, salary);
    }

    /**
     * Metoda cmp(). Compare care compara dupa salariu.
     * @param a1
     * @param a2
     * @return 
     */
    @Override
    public int compare(Accountant a1, Accountant a2) {
        return Float.compare(a1.getSalary(), a2.getSalary());
    }

    /**
     * Metoda suprascrisa din Employee. Acolo este metoda abstracta getBonus()
     * @return 
     */
    @Override
    public float getBonus() {
        return performanceBonus;
    }

    /**
     * Metoda de iesire (vihod).
     *
     * @return
     */
    @Override
    public String toString() {
        return "Accountant{" + "name=" + this.getName() + ", surname=" + this.getSurname() + ", gender=" + this.getGender() + ", birthDate=" + this.getBirthDate() + ", salary=" + this.getSalary() + '}';
    }

}
