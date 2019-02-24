package Oops;

public class Demo {

	String z="hello";
	String x= "Gracis";
	
	
void Pablo(){
	 String z="Escobar";
	String x="Fernandez";
	
System.out.println(this.z);// hello
System.out.println(this.x);// Gracis
System.out.println(z);// Escobar
System.out.println(x);// Fernandez
}	
	
public static void main(String[] args) {
	
	Demo d= new Demo();
	d.Pablo();
	
}




}
