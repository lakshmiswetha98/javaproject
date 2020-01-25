package com.mysql.jdbc.driver; 
import java.sql.*;
import java.util.Scanner;

public class MyApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. Load driver in memory
			Class.forName("com.mysql.jdbc.Driver");

			// 2. Set up a connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/trainers", "root", "");

			// 3. Create a statement
			Statement stmt = conn.createStatement();

			// insert a record
		   /*	String  query = "insert into info set id='5',name='swetha',number='6578945', mail='swetha@gmail.com'";
			int n = stmt.executeUpdate(query);
			System.out.println("Rows Added : " + n);*/  
			Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the id to insert");
		    int n=sc.nextInt();
		    System.out.println("enter name to insert");
		    String m=sc.next();
            System.out.println("enter mail to insert");
            String o=sc.next();
			ResultSet rs =  stmt.executeQuery("select * from info");

			while(rs.next()) {
				System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString("mail"));
			}

			rs.close();
			conn.close();


			/*ResultSet rs = stmt.executeQuery(""); // Retrieval  : select
			if(rs.next()) {
				rs.getString(1);  // 1 based indexing
				rs.getString("email");
			}
			
			while(rs.next()) {
				
			}
			
			int n = stmt.executeUpdate(""); // DMQ/DML : insert,update,delete
			// n : number of rows affected
			 
			 */
		}
		catch(Exception ex) {
			System.out.print(ex);

		}
	}

}


