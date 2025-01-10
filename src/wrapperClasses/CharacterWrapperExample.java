package wrapperClasses;

public class CharacterWrapperExample {

	public static void main(String[] args) {
		char ch = 'A';
        Character wrapperChar = ch;  // Autoboxing char to Character

        // Using isDigit() method
        System.out.println("Is 'A' a digit? " + Character.isDigit(wrapperChar));  

        // Using toLowerCase() method
        System.out.println("Lowercase of 'A': " + Character.toLowerCase(wrapperChar));  
    }

}
