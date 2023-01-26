package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the year number: ");
		int number = scan. nextInt();
		boolean yearNumber = number % 4 == 0 && number % 100 != 0 || number % 400 ==0;
		System.out.println(yearNumber);
		
		
	}

}
