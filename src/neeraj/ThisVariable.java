package neeraj;
class Alpha{
	int instVar;
	//this keyword used to store the reference of address of object.
	Alpha(int instVar){
		this.instVar = instVar;
		System.out.println("this reference: "+ this);
		
	}
}

public class ThisVariable {
public static void main(String[] args) {
	Alpha obj = new Alpha(8);
	System.out.println("object refrence: " + obj);
}

}
