package wrapperClasses;

public class WrapperValueOfExample {

	public static void main(String[] args) {
		 // Using valueOf() method to convert primitive to wrapper
        int num = 150;
        Integer wrapperNum = Integer.valueOf(num);  // Convert int to Integer
        System.out.println("Wrapper object: " + wrapperNum);

        // Using intValue() method to convert wrapper to primitive
        Integer wrapperNum2 = 200;
        int primitiveNum = wrapperNum2.intValue();  // Convert Integer to int
        System.out.println("Primitive int: " + primitiveNum);
	}

}
