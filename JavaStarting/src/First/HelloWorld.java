package First;

import java.sql.Date;
import java.util.Arrays;

public class HelloWorld {
	public static void main (String [] args) {
//		System.out.println("Hello World");
//		int age = 30;
		//primitive data type, JRE will allocate and release
//		Date now = new Date(age);
		//reference data type, allocate memory for now variable, JRE will release
		//object now is an instance of class Date
		
		int[] numbers1 = new int[5];
		numbers1[0] = 1;
		numbers1[1] = 1;
		numbers1[2] = 1;
		numbers1[3] = 1;
		numbers1[4] = 1;
//		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers1));
		
		int[] numbers2 = {1, 6, 3, 5, 8};
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));
	}
}
