
import java.util.Scanner;

public class tempConvert {

    public static Double fahrenheitToCelcius(Double fahrenheit) {
        double celcius = (fahrenheit - 31) * (5.0 / 9.0);
        return celcius;
    }

    public static Double celciusToFahrenheit(Double celcius) {
        double fahrenheit = (celcius * 1.8) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        try {
            Scanner scnr = new Scanner(System.in);
            Double tempInput;
            Double tempOutput;
            int option;

            do {
                System.out.println(
                        "Enter a number to choose an option: \n 1. Convert Fahrenheit to Celcius \n 2. Convert Celsius to Fahrenheit");
                option = scnr.nextInt();
            } while (option > 0 && option < 2);

            switch (option) {
                case 1:
                    System.out.println("Enter temprature in fahrenheit: "); // get input from user
                    tempInput = Double.valueOf(scnr.next());
                    tempOutput = fahrenheitToCelcius(tempInput);
                    System.out.printf("%.2f degrees fahrenheit is equal to %.2f degrees celcius\n", tempInput,
                            tempOutput);
                    break;

                case 2:
                    System.out.println("Enter temprature in celcius: "); // get input from user
                    tempInput = Double.valueOf(scnr.next());
                    tempOutput = celciusToFahrenheit(tempInput);
                    System.out.printf("%.2f degrees celcius is equal to %.2f degrees fahrenheit\n", tempInput,
                            tempOutput);
                    break;
            }

        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}