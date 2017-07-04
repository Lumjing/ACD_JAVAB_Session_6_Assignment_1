package arraytest;// Package name arraytest

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * This assignment helped me to master the concepts to declare and initialize an array.
		 */

		int[] arrayOfIntegers=new int[10];    //Creating array of integers of size 10.
				
				System.out.println("The even Numbers of the array are :");     //We have to print even numbers from the array.
				
				for(int i = 0 ; i < 10 ; i++)           //for loop to initialize the array elements.
				{
					arrayOfIntegers[i] = i + 1;    //i is starting from zero, and we want 1 to 10, so we are adding 1.
					
					if(arrayOfIntegers[i] % 2 == 0)       //Checking the element is even or not.
						System.out.println(arrayOfIntegers[i]);     //Printing even elements.
				}
				
			}    //End of main function.

		}   //End of class.	}

