package seriazableAndDes;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerizableDemo {
	public static void main(String[] args){
		Employee e= new Employee();
		e.name="Neil Young";
		e.address="Mobile, AL";
		e.SSN=11122333;
		e.number=101;
		
		try{
			FileOutputStream fis= new FileOutputStream("emp.ser");
			ObjectOutputStream oos= new ObjectOutputStream(fis);
			
			oos.writeObject(e);
			
			oos.close();
			fis.close();
			
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
