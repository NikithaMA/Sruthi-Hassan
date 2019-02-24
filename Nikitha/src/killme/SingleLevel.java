package killme;

public class SingleLevel {

	int a=10;
	void parent(int x, int y) {
		int z= x+y;
		System.out.println(z);
		
	}
	
	static void method1() {
		SingleLevel sl=new SingleLevel();
		System.out.println(sl.a);
		
	}

	
	
	
}
