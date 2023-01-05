package neeraj;

public class ClassObj {
	public static void main(String[] args) {
		employee e1= new employee();
		employee e2 = new employee();
		e1.eid = 101;
		e1.ename = "Neeraj";
		e1.shareddata=700;
		e2.sharedname="Verma";
		e1.edata();
		e2.edata();
		System.out.println(e1.shareddata);
		System.out.println(e2.sharedname);
	}
}
	
	class employee{
		int eid;
		static int shareddata;
		String ename;
		static String sharedname;
		//non- static data
		void edata() {
			System.out.println(eid); 
			System.out.println(ename);
			System.out.println(shareddata);
		}
		//static method
		static void fun() {
			System.out.println(shareddata);
		/*cannot access non static data from static method
		 * example = System.out.println(ename);
		 */
		}
	}



    
	
	