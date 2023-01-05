package neeraj;

public class ComstructerWithArgs {

	String languages;
	//constructer accepting single value
	ComstructerWithArgs(String lang){
		languages = lang;
		System.out.println(languages+ "programming langs");
		
	}
	public static void main(String[] args) {
		ComstructerWithArgs obj1= new ComstructerWithArgs("java ");
		ComstructerWithArgs obj2 = new ComstructerWithArgs("cpp ");
	}
}
