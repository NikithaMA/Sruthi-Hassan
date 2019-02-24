package Execptions;

public class Arr_Boundary {


public static void main(String[] args) {
	
	int[] a= new int[3];
	
	try{
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		}
	catch(Exception nikitha){
		
		System.out.println("Nikitha sucks!!!");
		
	}
	
System.out.println(a[0]);
System.out.println(a.length);


	}

}
