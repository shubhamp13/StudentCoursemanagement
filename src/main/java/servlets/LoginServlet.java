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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String emailId=req.getParameter("email");
		String password=req.getParameter("password");
		StudentDao dao=new StudentDao();
		Student dbStudent=dao.getStudent(emailId);
		if(dbStudent!=null)
		{
			if(dbStudent.getPassword().equals(password))
			{
				req.setAttribute("name",dbStudent.getName());
				RequestDispatcher dispatcher=req.getRequestDispatcher("welcome.jsp");
				dispatcher.forward(req, resp);
			}
			else
			{
				req.setAttribute("message","Invalid Password!!");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				dispatcher.include(req, resp);
			}
		}
		else
		{
			req.setAttribute("message","First Register Yourself Then Login!!!");
			RequestDispatcher dispatcher=req.getRequestDispatcher("register.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
