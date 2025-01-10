package wrapperClasses;

public class BooleanWrapperExample {

	public static void main(String[] args) {
		    String boolStr = "true";
	        Boolean boolObj = Boolean.valueOf(boolStr);  // Converts String to Boolean object
	        System.out.println("Boolean object: " + boolObj);

	        // Using booleanValue() to extract primitive boolean value
	        boolean primitiveBool = boolObj.booleanValue();  
	        System.out.println("Primitive boolean: " + primitiveBool);
	}

}
