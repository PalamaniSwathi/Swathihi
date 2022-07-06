package jdk5andabove;

public class GenericMethodTest {
	public static<E>void printArray(E[] inputArray){
		for(E element :inputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//create arrays of integers,and character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Character[] charArray= {'H','E','L','L','O'};
		System.out.println("Array integer Array contains:");
		printArray(intArray);//pass an integer array
		System.out.println("\nArray character Array contains:");
		printArray(charArray);//pass a character array
	}

}
