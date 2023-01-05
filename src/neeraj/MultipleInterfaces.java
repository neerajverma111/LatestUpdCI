package neeraj;
interface A{
	void getSum(int a , int b);
}
interface B{
	void getSub(int a, int b);
	
}
class C implements A,B{
	public void getSum(int a , int b) {
		System.out.println("the sum of thhe num is  :  " + (a+b));
	}
	public void getSub(int a , int b) {
		System.out.println("the subtraction of the numbers is: " + (a-b));
	}
	
}
public class MultipleInterfaces {
	public static void main(String[] args) {
		C s1 = new C();
		s1.getSum(5, 6);
		s1.getSub(5, 3);
	}

}
