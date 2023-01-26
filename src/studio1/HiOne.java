package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your name : ");
		String name = scan.nextLine();
		System.out.println("Hi " + name + "." + " How are you? ");	
	}

}
