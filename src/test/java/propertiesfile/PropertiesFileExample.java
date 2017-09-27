package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {
	public static void main(String[] args)  {
		//create a Properties file
		//Create a package called testdata under src/test/resources
		//Create a file with .properties extension
		//Path to the properties file
		try {
			String filePath="./src/test/resources/testdata/configuration.properties";
			//Open the properties file using FileInputStream
			FileInputStream input=new FileInputStream(filePath);
			//Create object of Properties class so that we can work easily with properties file
			Properties config=new Properties();
			//Load all the data provided by fileInput stream
			config.load(input);
			//close the inputstream file to free up the momory
			input.close();
			//REad from Properties file using getProperty method.
			//getProperty method accepts Key / Property name and will return value for that key
			//if the key does not exist --> it will return null
			System.out.println(config.getProperty("toLanguage"));
			System.out.println(config.getProperty("appurl"));
		} catch (FileNotFoundException  e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Hey ! file is not there!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After try catch");
	
		
	
	}
}
