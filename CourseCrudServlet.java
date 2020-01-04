package com.del.second.servlet;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbi.Course;
import com.sbi.CourseDAO;






@WebServlet("/CourseCrudServlet")
public class CourseCrudServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 String submit=request.getParameter("sub");
	 CourseDAO cdao = new CourseDAO();
	 Course cs=new Course();
	  String message="Successfully";
	cs.setEmpid(Integer.parseInt(request.getParameter("course_id")));
     RequestDispatcher rd = request.getRequestDispatcher("EmployeeCrud.jsp");	
	if(submit.equals("Add_Employee")||submit.equals("Modify_Employee"))
		{
		
		cs.setName(request.getParameter("ename"));
	cs.setSalary(Double.parseDouble(request.getParameter("salary")));
		
			if(submit.equals("Add_Course"))
				{
				cdao.insertCourse(cs);
				message=message+"Inserted Record";
			}
			else
			{
				cdao.modifyCoure(cs);
				message=message+"Modified Record";
			}
		
		}
		else if(submit.equals("Delete_Course"))
			
		{
		  if(cdao.removeEmployee(cs.getCourseid()))
			  message=message+"Record Deleted";
		  else
		  message="Deletion Failed";
	}
		else if(submit.equals("Show_Employee"))
		{
			cs = cdao.getCourse(cs.getCourseid());
			request.setAttribute("course", cs);
			
			
		}
		out.print("<h1><center>"+message+"</center></h1>");
		rd.include(request,response);
	}
}


