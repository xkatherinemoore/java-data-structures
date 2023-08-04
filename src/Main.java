import java.util.*;

public class Main {

	//1. Write a program to sum all the values of a given Array
	public static int sumArray(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	}
	
	//2. What is the output? 
	public static void findMaxLocation() {
		double[] exampleArray = {1, 5, 6, 5, 4, 1}; //given example array
		double maximum = exampleArray[0]; //used to compare array values in for loop
		int index = 0; //index location of max value
		for (int i = 1; i < exampleArray.length; i++) {
			if (exampleArray[i] > maximum) {
				maximum = exampleArray[i];
				index = i;
			}
		}
		
		System.out.println(index); //for given exampleArray, prints 2
	}
	
	//3. Write toPower method
	public static int[] toPower(int size, int power) {
		int[] poweredArray = new int[size];
		
		System.out.printf("Each index value has been raised to a power of %d:\n", power);
		
		//Populate array
		for (int i = 0; i < size; i++) {
			poweredArray[i] = (int) Math.pow(i, 2);
			System.out.printf("array[%d] = %d\n", i, poweredArray[i]);
		}

		return poweredArray;
	}
	
	public static void main(String[] args) {
		int[] myArr = {4, 8, 2, 9};
		System.out.println(sumArray(myArr));
		
		System.out.println("--");
		findMaxLocation();
		
		System.out.println("--");
		toPower(4, 2);
	}
}
