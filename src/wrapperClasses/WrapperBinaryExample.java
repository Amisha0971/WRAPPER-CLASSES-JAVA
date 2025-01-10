package wrapperClasses;

public class WrapperBinaryExample {

	public static void main(String[] args) {
		int num = 10;
        String binaryString = Integer.toBinaryString(num);  // Convert integer to binary string
        System.out.println("Binary representation of 10: " + binaryString);
    }
}
