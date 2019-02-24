package Oops;

public class SansaStark {

	int x;
	static int y;
	
	public static void main(String[] args) {
		SansaStark s1= new SansaStark();
		s1.x++;
		s1.y++;
		System.out.println(s1.x); //1
		System.out.println(s1.y);//1   y=1
		SansaStark s2= new SansaStark(); // x=0;
		s2.x++; //1
		s2.y++; //2
		System.out.println(s2.x); //1
		System.out.println(s2.y); //2
			
	SansaStark s3= new SansaStark(); //x=0
	s3.x++;//1
	s3.y++;//3
	System.out.println(s3.x);
System.out.println(s3.y);	
	
	
	
	
		
		
	}	
}
