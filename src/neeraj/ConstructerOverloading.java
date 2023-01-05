package neeraj;

public class ConstructerOverloading {

	String language;
	//constructer with no parameters
	ConstructerOverloading(){
		this.language = "Java";
		
	}
	//constructer with a single args
	ConstructerOverloading(String language){
		this.language = language;
		
	}
	public void getName() {
		System.out.println("Programming language:"+ this.language);
		
	}
	public static void main(String[] agrs) {
		//
		ConstructerOverloading obj1= new ConstructerOverloading();
		ConstructerOverloading obj2= new ConstructerOverloading("python");
		obj1.getName();
		obj2.getName();
	}
}
