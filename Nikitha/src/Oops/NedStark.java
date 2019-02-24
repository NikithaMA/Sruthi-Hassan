package Oops;

public class NedStark {

	int x=50;
	static int y=100;
	
	void show(){
		
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	static void display(){
		//System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
	
		NedStark n= new NedStark();
		n.show();
		NedStark.display();
		
		
	}
	
	
	
}
