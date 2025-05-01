package UniversityManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AskInput {
    Scanner sc = new Scanner(System.in);

    public AskInput() {
    }

    public String askString(String message) {
        String a;
        while (true) {
            try {
                System.out.print(message);
                a = sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("something went wrong");
                sc.nextLine();
            }
        }
        return a;
    }

    public int askInt(String message) {
        int a;
        while (true) {
            try {
                System.out.print(message);
                a = sc.nextInt();

                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter Integer only");
                sc.nextLine();
            }
        }
        return a;
    }

    public double askDouble(String message) {
        double a;
        while (true) {
            try {
                System.out.print(message);
                a = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter double only");
                sc.nextLine();
            }
        }
        return a;
    }
}
