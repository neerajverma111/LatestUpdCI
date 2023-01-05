package neeraj;
//constructer name and class name should be same.
public class Constructer {
	private String name;
	
	//constructer
	Constructer(){
		System.out.println("Constructer called:");
		name = "Programmer Neeraj";
	}
	public static void main(String[] args) {
		//constructer is invoked while
		//creating an object of the main class.
		Constructer obj = new Constructer();
		System.out.println("The name is "+ obj.name);
	}
	

}
