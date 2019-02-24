package Oops;

public class AbstractDemo {

	public static void main(String[] args) {
		CersieLanister c;
		c= new Programmer1();
		
		
		Programmer1 x;
		Programmer1 p1= new Programmer1();
		p1.msg(); // hello friends
		p1.shaitan(10);// result-20
		Programmer2 p2= new Programmer2();
		p2.msg();// hello friends 
		p2.shaitan(30);
		Programmer3 p3 = new Programmer3();
		p3.msg();
		p3.shaitan(40);
		
	}	
}
