package Oops;

public class Polymorphism {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.msg();// hello sadist
		Child c= new Child();
		c.msg();// hello psychopathy
		Parent p1= new Child();
		p1.msg();// hello psychopathy 
			
	}	
}
