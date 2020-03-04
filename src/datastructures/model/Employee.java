package datastructures.model;

import java.time.LocalDate;

/**
 *
 */
public abstract class Employee {
    
    private String name;
    private String surname;
    private char gender;
    private LocalDate birthDate;
    private float salary;
    
    public abstract float getBonus();

    public Employee(String name, String surname, char gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public Employee(String name, String surname, char gender, LocalDate birthDate) {
        this(name, surname, gender);
        this.birthDate = birthDate;
    }

    public Employee(String name, String surname, char gender, LocalDate birthDate, float salary) {
        this(name, surname, gender, birthDate);
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public float getSalary() {
        return salary;
    }
    
}
