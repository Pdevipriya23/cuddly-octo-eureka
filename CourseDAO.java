package com.sbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class CourseDAO 
{
	public boolean insertCourse(Course cs)
	{
		int count=0;
		Connection con=null;
		PreparedStatement pst = null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
    	try
    	{

    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		con = DriverManager.getConnection(url,"scott","tiger");
    		pst = con.prepareStatement("insert into course values(?,?,?,?)");
    		pst.setInt(1, cs.getCourse_id());  pst.setString(2, cs.getCourse_name());
    		pst.setDouble(3, cs.getCourse_duration());  pst.setInt(4, cs.getCourse_fees());
    		count = pst.executeUpdate();
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			if(pst!=null) pst.close();
    			if(con!=null) con.close();
    		}
    		catch(Exception ex)
    		{
    			ex.printStackTrace();
    		}
    	}
    	return count == 1; 
    }
	public boolean modifyCourse(Course cs)
    {
    	int count = 0;
    	Connection con = null;
    	PreparedStatement pst = null;
    	String url="jdbc:oracle:thin:@localhost:1521:orcl";
    	try
    	{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		con = DriverManager.getConnection(url,"scott","tiger");
    		pst = con.prepareStatement("update employee set ename=?,salary=? where empid=?");
    		pst.setInt(1, cs.getCourse_id());  pst.setString(2, cs.getCourse_name());  
    		pst.setInt(3, cs.getCourse_duration());  pst.setInt(4, cs.getCourse_fees());
    		count = pst.executeUpdate();
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			if(pst!=null) pst.close();
    			if(con!=null) con.close();
    		}
    		catch(Exception ex)
    		{
    			ex.printStackTrace();
    		}
    	}
    	return count == 1; 
    }
	
public boolean removeCourse( int Course_id)
{
	int count = 0;
	Connection con = null;
	PreparedStatement pst = null;
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url,"scott","tiger");
		pst = con.prepareStatement("delete from course where Course_id=?");
	    pst.setInt(1, Course_id);
		count = pst.executeUpdate();
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
		
	}
	finally
	{
		try
		{
			if(pst!=null) pst.close();
			if(con!=null) con.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	return count == 1; 
}
	public Course getCourse(int Course_id)
{
	Course cs = null;
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url,"scott","tiger");
		pst = con.prepareStatement("select * from Course where Course_id = ?");
		pst.setInt(1, Course_id);
		rs = pst.executeQuery();
		if(rs.next())
			cs = new Course(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
		
	}
	finally
	{
		try
		{
			if(rs!= null) rs.close();
			if(pst!=null) pst.close();
			if(con!=null) con.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	return cs; 
}
public ArrayList<Course> getCourse()
{
	ArrayList<Course> clist = new ArrayList<Course>();
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url,"scott","tiger");
		pst = con.prepareStatement("select * from employee");
		rs = pst.executeQuery();
		while(rs.next())
			clist.add(new Course(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
		
	}
	finally
	{
		try
		{
			if(rs!= null) rs.close();
			if(pst!=null) pst.close();
			if(con!=null) con.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	return clist; 
}
}

