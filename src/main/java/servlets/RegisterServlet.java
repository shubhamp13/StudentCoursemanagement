package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.Student;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		String userName=req.getParameter("username");
		String emailId=req.getParameter("email");
		String phoneNo=req.getParameter("phoneno");
		String password=req.getParameter("password");
		String address=req.getParameter("address");
		
		Student student=new  Student();
		student.setEmailId(emailId);
		student.setName(userName);
		student.setPassword(password);
		student.setPhoneNo(phoneNo);
		student.setAddress(address);
		StudentDao dao=new StudentDao();
		if(dao.getStudent(emailId)!=null)
		{
			req.setAttribute("message","User Already Exist!!!!!");
			RequestDispatcher dispatcher=req.getRequestDispatcher("register.jsp");
			dispatcher.include(req, resp);
		}
		else
		{
			dao.saveStudent(student);
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}
		
		
	}

}
