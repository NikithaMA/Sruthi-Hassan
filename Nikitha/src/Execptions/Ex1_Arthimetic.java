package Execptions;

public class Ex1_Arthimetic {

public static void main(String[] args) {
	
	
	try{
		
		int x=50/0;
	}
	catch (Exception ExpMsg){
		
		System.out.println(ExpMsg);
			}
	
	
	int a=10;
	int b=50;
	System.out.println(a+b);
	
}

}
