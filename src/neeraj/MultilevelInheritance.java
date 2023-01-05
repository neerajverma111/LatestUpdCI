package neeraj;
class Starbucks{
	String city;
	//multiple inheritance.
	public void welcome() {
		System.out.println("Hello customer");
		
	}}
	class Branch extends Starbucks{
		public void display() {
			System.out.println("Our branch is in " + city + " city" );
		}}
		
	class Person extends Branch{
		public void visit() {
			System.out.println("You can visit anytime.");
		}
	}
		
	
	
	

public class MultilevelInheritance {
	public static void main( String[] args) {
	   	Person coffee = new Person();
		coffee.city = "Ludhiana";
		coffee.welcome();
		coffee.display();
		coffee.visit();
		
		
	}

}