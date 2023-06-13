package com.takeo;

import java.util.List;
import java.util.Scanner;

import com.takeo.dao.impl.UserDAOImpl;
import com.takeo.model.User;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserDAOImpl daoImpl = new UserDAOImpl();
		while(true)
		{
		System.out.println("=============================");
		System.out.println("        1)Register            ");
		System.out.println("        2)Login            ");
		System.out.println("        3)ViewUsers           ");
		System.out.println("        4)Exit           ");
		System.out.println("=============================");
		
		System.out.println("Enter the Choice");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			//Read the data from the console
			System.out.println("Enter First Name");
			String fname = sc.next();
			System.out.println("Enter Last Name");
			String lname = sc.next();
			System.out.println("Enter Email");
			String email = sc.next();
			System.out.println("Enter User Name");
			String uname = sc.next();
			System.out.println("Enter Password");
			String pass = sc.next();
			User user = new User(fname,lname,email,uname,pass);
			
			String msg = daoImpl.register(user);
			if(msg!=null)	
				System.out.println(msg);
			else
				System.out.println(msg);
			break;
			
		case 2:
			System.out.println("Enter Email");
			String mail = sc.next();
			System.out.println("Enter Password");
			String passWord = sc.next();
			boolean verifyEmailAndPassWord = daoImpl.verifyEmailAndPassword(mail, passWord);
			if(verifyEmailAndPassWord)
			{
				List<User> viewRegisters = daoImpl.viewRegister();
				
				for(User u : viewRegisters)
				{
			      
				System.out.println(u.getUid()+"\t"+u.getFirstName()+"\t"+u.getLastName()+"\t"+ u.getEmail()+"\t"+u.getUserName());
				}
			}
				
				else
				{
					System.out.println("Invalid Email/Password");
				}
			
			break;
			
			
			case 3:
				
				List<User> viewRegisters = daoImpl.viewRegister();
				
				for(User us: viewRegisters)
				{
					System.out.println(us.getUid()+"\t"+us.getFirstName()+"\t"+us.getLastName()+"\t"+us.getEmail()+"\t"+us.getUserName());
					
				}
				break;
				
			case 4:
				System.out.println("Thanks for visiting us");
				System.exit(0);
				
			default:
				System.out.println("Choose 1 to 4 between");
				
				
			
		}
	
		}
	
	}


}

