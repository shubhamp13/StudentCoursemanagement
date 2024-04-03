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
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		processRequest(request, response);

	}

	protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
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
		dao.updateStudent(student);
		req.setAttribute("student", student);
		RequestDispatcher dispatcher=req.getRequestDispatcher("welcome.jsp");
		dispatcher.forward(req, resp);
	}
}
