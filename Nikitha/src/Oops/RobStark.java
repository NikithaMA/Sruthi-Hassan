package Oops;

public class RobStark {
	
	void m4(){
		
		AryaStark r= new AryaStark();
		System.out.println(r.x); // rule 1
		r.m1(); // rule 1
		System.out.println(AryaStark.y); // rule 2
		r.m3(); // rule 2
		
		System.out.println("instance method m4");
	}
	
	public static void main(String[] args) {
		
		AryaStark a1 = new AryaStark();
		
		System.out.println(AryaStark.y); // rule 3
		a1.m3(); // rule number 3
		System.out.println(a1.x); // rule 4
		a1.m1(); // rule 4
	RobStark r1= new RobStark();
	r1.m4(); // rule 4	
	}
}
