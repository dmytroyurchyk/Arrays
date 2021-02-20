package working_with_arrays;

import java.util.Arrays;

public class Home_Work {
	
	/** 5. Create an int array called marks with 4 elements;
	 * If the first item in this array is equal to the last item print, 'equal!'
	 * If the second item in this array is equal to the second from the last, print 'equal again!'
	 * 
	 * 
	 * 6. Let;s say you have an int array as follows
	 * [56,22,34,19]
	 * 
	 * a. add the first element to the second element and save it in a variable  
	 * b. divide the sum of second and third elements by 11 and save it in a variable
	 * c. substract the first element from the last element and save it a variable
	 * d. get the sum of all elements squared by 2 and save it in a variable
	 * e. print all variable in the console
	 * 
	 * 
	 */  
	public static void main(String[] args) {
		
//		int [] marks = { 2 , 4, 3, 2};
//		
//		if(marks[0] == marks[3]) {
//			System.out.println("equal!");
//		}
		int numbers [] = {56,22,34,19};
		int sumOfFirstAndSecond = numbers[0] + numbers[1];
		int difference = (numbers[1] + numbers[2]) / 11;
		int differenceOfFirstAndLast = numbers[3] - numbers[0];
		double square = ( numbers[0] * numbers[0] ) + (numbers[1] * numbers[1]) + (numbers[2] * numbers[2]) + (numbers[3] * numbers[3]);
		
		 System.out.println(square);
		
		String[] names = new String[4];
		names[0] = "David";
		names[1] = "Jerry";
		names[2] = "George";
		names[3] = "Magee";
		int size = names.length;
		char[] firstChar = new char [size];
		
		firstChar[0] = names[0].charAt(0);
		firstChar[1] = names[1].charAt(0);
		firstChar[2] = names[2].charAt(0);
		firstChar[3] = names[3].charAt(0);
		
		System.out.println(Arrays.toString(firstChar));
		
		
		
		
	}
	
	
	

}
