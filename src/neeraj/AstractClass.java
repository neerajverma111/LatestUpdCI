package neeraj;

abstract class Language{
	abstract void method1();
	
	void method2() {
		System.out.println("this is regular method");
	}
	}
	class Alpha extends Language{
		void method1() {
			System.out.println("method of abstract class");
			
		}
		
	}
	


public class AstractClass {
	public static void main(String[] args) {
		Alpha obj = new Alpha();
		obj.method1();
		
	}

}
