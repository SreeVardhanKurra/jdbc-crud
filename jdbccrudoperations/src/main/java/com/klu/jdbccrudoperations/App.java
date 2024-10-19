package com.klu.jdbccrudoperations;

import java.sql.*;
public class App 
{
    public static void main( String[] args )throws Exception
    {
    	String url="jdbc:mysql://localhost:3306/klu";
        String username="root";
        String passowrd="1997";
        Connection con=DriverManager.getConnection(url, username, passowrd);
        Statement st=con.createStatement();
        //String query="insert into student values(1010,'amitsir')";  
        //String query="update student set name='lokesh' where rollno=1001";
        String query="delete from student where  rollno=1050";
        st.executeUpdate(query);
        System.out.println("Done...");
    	 
    }
    }
    	
    	
    	
    	
    

