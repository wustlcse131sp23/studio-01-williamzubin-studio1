package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your name1 : ");
		String name1 = scan.nextLine();
		System.out.println("Please Enter your name2 : ");
		String name2 = scan.nextLine();
		System.out.println("Please Enter your name3 : ");
		String name3 = scan.nextLine();
		System.out.println("Please Enter your name4 : ");
		String name4 = scan.nextLine();
		System.out.println("Hello " + name1 + ", " + name2 + ", " + name3 + ", " + "and " + name4);
	}
}
