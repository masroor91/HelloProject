package seriazableAndDes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeseriazableDemo {
	public static void main(String[] args){
		Employee e=null;
		try{
					
			FileInputStream fis= new FileInputStream("emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			e = (Employee) ois.readObject();	
			
			ois.close();
			fis.close();
			
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		catch(ClassNotFoundException cex){
			cex.printStackTrace();
		}
		
		System.out.println("Desired Employee is ...");
		System.out.println("Name: "+ e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: " + e.SSN);
		System.out.println("Number: "+ e.number);
		
	}
}
