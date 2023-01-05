package neeraj;

interface A1{ 
	public void getName(String a);
	
}
interface B2{
	public void getAdd(String b);
}
interface C1{
	public void getPhn(int c);
}
class D implements A1,B2,C1{
    public void getName(String a) {
    	System.out.println("the name of Person is : "+ a);
    	
    }
    public void getAdd(String b) {
    	System.out.println("the adress of the eprson is :"+b);
    }
    public void getPhn(int c) {
    	System.out.println("the contact number of the person is :"+c);
    }
}
public class PracticeAbstract {
	public static void  main(String[] args) {
        D p1= new D();
        p1.getName("Neeraj");
        p1.getAdd("ludhiana");
        p1.getPhn(123456);
	}
        
        
}
