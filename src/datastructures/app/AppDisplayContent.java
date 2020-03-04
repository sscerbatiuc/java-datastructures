package datastructures.app;

import datastructures.model.Accountant;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class AppDisplayContent {

    // Cream o lista unde vom pastra datele
    private static final List<Accountant> LIST = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // 1. Accesam fisierul
            FileReader reader = new FileReader("C:\\struct.csv");
            BufferedReader lineReader = new BufferedReader(reader);
            
            while (lineReader.ready()) {
                String line = lineReader.readLine();
                String[] csv = line.split(",");
                // 2. Adaugam datele in lista
                LIST.add(new Accountant(csv[0],
                        csv[1],
                        csv[2].trim().charAt(0),
                        LocalDate.parse(csv[4]),
                        Float.parseFloat(csv[3])));
            }
            int i = 0;
            // 3. Afisam
            for (Accountant ac : LIST) {
                System.out.println(i++ + " " + ac);
            }
            // 4. Cautam
            searchByNameOrSurname();

        } catch (FileNotFoundException ex) {
            System.err.println("File not found: struct.csv");
        } catch (IOException ex) {
            System.err.println("Cannot read file: struct.csv");
        }
    }

    private static void searchByNameOrSurname() {
        // Verificam daca avem ce cauta
        if (LIST.isEmpty()) {
            throw new RuntimeException("There is nothing to search. Quitting.");
        }

        // Variabile temporare
        String option = null;
        Accountant found = null;
        
        // Atat timp cat utilizatorul nu a introdus 
        while (option == null || !option.equalsIgnoreCase("exit")) {
            System.out.println("Please enter what to search.");
            option = SCANNER.nextLine();
            // Variabile temporare: numar de comparari si pozitia elementului gasit
            int comparison = 0;
            int position;
            for (position = 0; position < LIST.size(); position++) {
                // Daca am gasit ceva ce seamana cu ce a introdus utilizatorul, oprim cautarea
                // La fiecare comparare incrementam comparison
                if ((LIST.get(position).getName().equalsIgnoreCase(option) & ++comparison > -1)
                        || (LIST.get(position).getSurname().equalsIgnoreCase(option) & ++comparison > -1)) {
                    found = LIST.get(position);
                    break;
                }
            }
            if (found == null) {
                System.out.println("Could not find accountant. Count not find anything");
            } else {
                System.out.println("Found " + found.toString() + " on position " + position);
            }
            System.out.println("Comparisons: " + comparison + "\nDone? Please enter 'exit' to quit.");
            option = SCANNER.nextLine();
        }
    }

}
