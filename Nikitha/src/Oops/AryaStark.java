package Oops;

public class AryaStark {
	
	int x=60;
	static int y=50;
	
	void m1(){
		System.out.println("instance method m1");
		}
	void m2(){
		
		System.out.println(x); // 1st rule 
		m1(); // rule 1
		System.out.println(y); // rule 2
		m3();// 2nd rule 
		System.out.println("instance method m2");
		
	}
	
	static void m3(){
		
		System.out.println("instance method m3");
	}
	
public static void main(String[] args) {
	System.out.println(y);// rule 3
	m3();// rule 
	AryaStark a= new AryaStark();
	System.out.println(a.x);// 4th rule 
	a.m2();// 4th rule 
	
	
}	

}
