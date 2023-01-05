package neeraj;

class School{
	String name;
	public void popular() {
		System.out.println("DPS is a popular school");
		
	}
}

class Student extends School{
	public void display() {
		System.out.println("My name is " + name);
	}
}
public class Inheritance {
	public static void main(String[] args) {
	   Student DPS = new Student();
	   DPS.name = "Neeraj";
	   DPS.popular();
	   DPS.display();
	   
			   
	}


}
