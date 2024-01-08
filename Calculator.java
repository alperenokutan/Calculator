import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Please enter the second number: ");
            double secondNumber = scanner.nextDouble();

            System.out.println("Select an action:");
            System.out.println("1 - +");
            System.out.println("2 - -");
            System.out.println("3 - *");
            System.out.println("4 - /");

            int choice = scanner.nextInt();

            double result = 0.0;

            switch (choice) {
                case 1:
                    result = firstNumber + secondNumber;
                    break;
                case 2:
                    result = firstNumber - secondNumber;
                    break;
                case 3:
                    result = firstNumber * secondNumber;
                    break;
                case 4:
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                    } else {
                        System.out.println("Numbers cannot be divided by 0!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid selection, please try again.");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.println("Do you want to another calculation?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int choiceForContinue = scanner.nextInt();
            if (choiceForContinue != 1) {
                System.out.println("Calculator closing...");
                break;
            }
        }
    }
}
