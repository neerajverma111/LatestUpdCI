package neeraj;
//final value cannot be changed.
//final method cannot be overridden.
//final class cannot be inherited.

final class FinalClass{
	public void display() {
		System.out.println("this is final method");
		
	}
}
class Main extends FinalClass{
	public void display() {
		System.out.println("the final method is overridden");
		
	}

public class FinalClass {
    public static void main(String[] args) {
    	Main obj = new Main();
    	obj.display();
    }
}
}//this code will give an error. and is not able to run.