import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Unit Converter!");
        System.out.println("Choose a conversion type:");
        System.out.println("1. Length");
        System.out.println("2. Weight");
        System.out.println("3. Temperature");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                convertLength(scanner);
                break;
            case 2:
                convertWeight(scanner);
                break;
            case 3:
                convertTemperature(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }

        scanner.close();
    }

    // Length conversion
    private static void convertLength(Scanner scanner) {
        System.out.println("Length conversion: ");
        System.out.println("1. Meters to Feet");
        System.out.println("2. Feet to Meters");

        int choice = scanner.nextInt();
        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = value * 3.28084; // meters to feet
                System.out.println(value + " meters is " + result + " feet.");
                break;
            case 2:
                result = value / 3.28084; // feet to meters
                System.out.println(value + " feet is " + result + " meters.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Weight conversion
    private static void convertWeight(Scanner scanner) {
        System.out.println("Weight conversion: ");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");

        int choice = scanner.nextInt();
        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = value * 2.20462; // kg to lbs
                System.out.println(value + " kilograms is " + result + " pounds.");
                break;
            case 2:
                result = value / 2.20462; // lbs to kg
                System.out.println(value + " pounds is " + result + " kilograms.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Temperature conversion
    private static void convertTemperature(Scanner scanner) {
        System.out.println("Temperature conversion: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();
        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = (value * 9/5) + 32; // Celsius to Fahrenheit
                System.out.println(value + " Celsius is " + result + " Fahrenheit.");
                break;
            case 2:
                result = (value - 32) * 5/9; // Fahrenheit to Celsius
                System.out.println(value + " Fahrenheit is " + result + " Celsius.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
