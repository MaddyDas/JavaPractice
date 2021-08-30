
import java.util.Scanner;

public class tempConvert {

    public static Double FahrenheitToCelcius(Double fahrenheit) {
        double celcius = (fahrenheit - 31) * (5.0 / 9.0);
        return celcius;
    }

    public static void main(String[] args) {
        try {
        Scanner scnr = new Scanner(System.in); 
        Double tempFahrenheit ; 
        Double tempCelcius; 
        System.out.println("Enter temprature in fahrenheit: "); // get input from user 
            tempFahrenheit = Double.valueOf(scnr.next()); 
            tempCelcius = FahrenheitToCelcius(tempFahrenheit);

        
        System.out.printf("%.2f degrees fahrenheit is equal to %.2f degrees celcius\n" , tempFahrenheit, tempCelcius); 
        } 
        catch (Exception e) {
        System.out.println("Invalid input");
        }
   }
}