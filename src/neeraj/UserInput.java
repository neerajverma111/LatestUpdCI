package neeraj;
import java.util.Scanner;


public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a line: ");
		String name = sc.nextLine();
		
		System.out.println("Enter a string: ");
		String data = sc.next();
		
		System.out.println("Enter integer: ");
		int age = sc.nextInt();
		
		System.out.println("Enter long integer: ");
		long mobileno = sc.nextLong();
		
		System.out.println("enter double value: ");
		double cgpa= sc.nextDouble();
		
		System.out.println("name is "+name);
		
		System.out.println(age);
		System.out.println(data);
		System.out.println(mobileno);
		System.out.println(cgpa);
	}

}
