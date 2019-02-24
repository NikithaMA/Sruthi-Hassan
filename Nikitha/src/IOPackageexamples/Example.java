package IOPackageexamples;

import java.io.File;
import java.io.IOException;

public class Example {

	
	public static void main(String[] args) throws IOException {
		
		File x= new File("D:\\nikitha.xls");
		
		
		if (!(x.exists())){
			
			x.createNewFile();
			
		}
		
		if(x.exists()){
			System.out.println("file exists");
			
		}
// to print absoulte path 		
		System.out.println(x.getAbsolutePath());
		
		
	// to delete files 
		 x.delete();
		
		
		
		
	}
	
	
	
	
	
}
