package wrapperClasses;

public class WrapperClassMethodsExample {

	public static void main(String[] args) {
		 // Using parseInt() method
        String str = "100";
        int parsedInt = Integer.parseInt(str);  // Convert String to int
        System.out.println("Parsed Integer: " + parsedInt);

        // Using toString() method
        Integer number = 500;
        String numberStr = number.toString();  // Convert Integer to String
        System.out.println("Integer to String: " + numberStr);

        // Using compareTo() method
        Integer num1 = 30;
        Integer num2 = 70;
        System.out.println("Comparison Result: " + num1.compareTo(num2));
    }

	}

