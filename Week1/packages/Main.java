package packages;
import java.util.Scanner;

import mypack.Maximum;
import mypack.Minimum;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		System.out.println("Maximum of "+a+" and "+b+" is "+ new Maximum().max(a,b));
		System.out.println("Minimum of "+a+" and "+b+" is "+ new Minimum().min(a,b));
		sc.close();
	}

}
