package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please Enter the n1: ");
	int n1 = scan.nextInt();
	System.out.println("Please Enter the n2: ");
	int n2 = scan.nextInt();
	double average = (double) (n1+n2)/2;
	System.out.println("Average of " + n1 + " and " + n2 + " is " + average);

	}

}
