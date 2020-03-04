package datastructures.app.data;

import datastructures.model.Accountant;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author sscerbatiuc
 */
public class Keyboard {

    private final static Scanner sc = new Scanner(System.in);

    public static Accountant readAccountant() {
        System.out.println("- Enter name:");
        String name = sc.nextLine();
        System.out.println("- Enter surname:");
        String surname = sc.nextLine();
        LocalDate birthdate = null;
        boolean dateValid = false;
        while (!dateValid) {
            try {
                System.out.println("- Enter birthdate:");
                String input = sc.nextLine();
                birthdate = LocalDate.parse(input);
                dateValid = true;
            } catch (DateTimeParseException e) {
                System.out.println("Error: Date is incorrect. Please use format YYYY-MM-DD");
            }
        }
        System.out.println("- Enter salary:");
        Float salary = sc.nextFloat();
        System.out.println("- Enter gender (M/F):");
        char gender = sc.nextLine().charAt(0);
        return new Accountant(name, surname, gender, birthdate, salary);
    }

}
