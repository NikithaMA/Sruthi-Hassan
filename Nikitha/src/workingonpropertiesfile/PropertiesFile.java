package workingonpropertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Properties obj= new Properties();
		
		obj.load(new FileInputStream("E:\\SELENIUM\\Nikitha\\src\\workingonpropertiesfile\\data.properties"));
		
		
		String stURL=obj.getProperty("URL");
System.out.println(stURL);	
String strUN=obj.getProperty("username");
System.out.println(strUN);	
String strPWD= obj.getProperty("password");
System.out.println(strPWD);


// the above variables can be further used in the program 

		
		
		
		
		
	}

}
