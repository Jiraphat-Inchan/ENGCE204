package Lab;

	import java.util.Scanner;

	final class TempConverter {

	    private TempConverter() {
	    }

	    public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9.0 / 5.0) + 32;
	    }

	    public static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5.0 / 9.0;
	    }
	}

	public class Lab2_8 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	     
	        String mode = scanner.nextLine().trim().toUpperCase();

	        if (!mode.equals("C TO F") && !mode.equals("F TO C")) {
	            System.err.println("Error: Invalid mode. Please use 'C TO F' or 'F TO C'.");
	            scanner.close();
	            return;
	        }
	        
	        double temperature;
	        if (scanner.hasNextDouble()) {
	            temperature = scanner.nextDouble();
	        } else {
	            System.err.println("Error: Invalid temperature. Must be a number (double).");
	            scanner.close();
	            return;
	        }
	        
	        scanner.close();

	        double convertedResult;
	        String unitTo;

	        if (mode.equals("C TO F")) {
	            convertedResult = TempConverter.celsiusToFahrenheit(temperature);
	            unitTo = "Fahrenheit (°F)";
	        } else {
	            convertedResult = TempConverter.fahrenheitToCelsius(temperature);
	            unitTo = "Celsius (°C)";
	        }

	        System.out.printf(
	            "%.2f\n", 
	            convertedResult, 
	            unitTo
	        );
	    }
	}
