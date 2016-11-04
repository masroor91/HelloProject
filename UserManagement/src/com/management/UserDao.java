package com.management;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	public List <User> getAllUsers(){
		List <User> userList=null;
		
		try{
			File file = new File("Users.dat");
			
			if (!file.exists()){
				User user = new User(1, "Mahesh", "Teacher");
				userList = new ArrayList<User>();
				userList.add(user);
				saveUserList(userList);
			}
			else{
				FileInputStream fis= new FileInputStream(file);
				ObjectInputStream ois= new ObjectInputStream(fis);
				
				userList= (List<User>) ois.readObject();
				ois.close();
				fis.close();	
			}
			
		}
		catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		catch(ClassCastException e){
			e.printStackTrace();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	
		return userList;
				
	
		
	}
	
	private void saveUserList(List <User> userList){
		try{
		
			File file = new File("Users.dat");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
		
			oos.writeObject(userList);
			oos.close();
			fos.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
