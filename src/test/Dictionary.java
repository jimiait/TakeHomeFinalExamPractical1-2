package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Dictionary {
	
	static String path = "src\\data\\MyData.properties";

	public static void main(String[] args) {
		
		doesFileExist(path);
		
	}
	
	public static void doesFileExist(String path) {
		Properties prop= new Properties();
		File f= new File(path);
		FileInputStream fi;
		
		try {
			String w1 = "word1";
			String w2 = "word2";
			String w3 = "word3";
			String w4 = "word4";
			
			 fi= new FileInputStream(f);
				prop.load(fi);
				System.out.print(w1+":");
				System.out.println(prop.getProperty("word1"));
				System.out.println("======================");
				System.out.print(w2+":");
				System.out.println(prop.getProperty("word2"));
				System.out.println("======================");
				System.out.print(w3+":");
				System.out.println(prop.getProperty("word3"));
				System.out.println("======================");
				System.out.print(w4+":");
				System.out.println(prop.getProperty("word4"));
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} 
}
