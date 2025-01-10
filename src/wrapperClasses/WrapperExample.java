package wrapperClasses;

public class WrapperExample {
    public static void main(String[] args) {
    	
        // Autoboxing: Primitive to Wrapper
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt;  
        System.out.println("Autoboxing example: " + wrapperInt);

        // Unboxing: Wrapper to Primitive
        Integer wrapperInt2 = 20;
        int primitiveInt2 = wrapperInt2;  
        System.out.println("Unboxing example: " + primitiveInt2);
    }
}

