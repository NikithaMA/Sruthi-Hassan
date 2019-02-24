package Oops;

public class Example {
int rollNo;

Example(int x){
	rollNo=x;
	
}
	
void display(){
	
	System.out.println(rollNo);
	
}
	
public static void main(String[] args) {
Example e= new Example(10);
e.display();
Example e1= new Example(20);
e1.display();
Example e3= new Example(30);
e3.display();



	
}	




}


