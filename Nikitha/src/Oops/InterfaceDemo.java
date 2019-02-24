package Oops;

public class InterfaceDemo implements SolomonVandy,Test{

	public void msg(){
	System.out.println("multipe inheritance");

	}
	
public static void main(String[] args) {
	System.out.println(x);
	System.out.println(y);
	
	InterfaceDemo id =new InterfaceDemo();
	id.msg();
	
	SolomonVandy s = new InterfaceDemo();
	s.msg();
	Test t = new InterfaceDemo();
	t.msg();
 
		
}
	
}
