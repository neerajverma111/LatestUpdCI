package neeraj;
interface Language1{
	void getName(String name);
	
}
class ProgrammingLanguage implements Language1{
	public void getName(String name) {
		System.out.println("this is programming language" +  name);
		
	}
}
public class INterfaceLanguage {
	public static void main(String[] args) {
   ProgrammingLanguage p1 = new ProgrammingLanguage();
   p1.getName("Java");
}
}