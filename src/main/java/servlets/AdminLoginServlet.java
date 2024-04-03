package servlets;

import java.io.IOException;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLoginServlet
 */
 
public class AdminLoginServlet extends HttpServlet {
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	protected void processRequest(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		String emailId=null;
		String password=null;
 

		try(Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRegestration","root","root");)
		{
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from admin");
			while(resultSet.next())
			{
				emailId=resultSet.getString(1);
				password=resultSet.getString(2);
			}
			System.out.println(emailId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String userEmail=req.getParameter("email");
		String userPassword=req.getParameter("password");
		System.out.println(userEmail);
		System.out.println(emailId);
		if(userEmail.equals(emailId))
		{
			if(userPassword.equals(password))
			{
				RequestDispatcher dispatcher=req.getRequestDispatcher("display");
				dispatcher.forward(req, resp);
			}
			else
			{
				RequestDispatcher dispatcher=req.getRequestDispatcher("adminlogin.jsp");
				req.setAttribute("message", "Invalid Password");
				dispatcher.include(req, resp);
			}
		}
		else
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("adminlogin.jsp");
			req.setAttribute("message", "Invalid Email id");
			dispatcher.include(req, resp);
		}
	}
	public static void main(String[] args) 
	{
		 
	
	}
}
