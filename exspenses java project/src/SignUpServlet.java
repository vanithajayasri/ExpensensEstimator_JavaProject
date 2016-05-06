

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpPath")
public class SignUpServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String fname, lname, email, mobile,userName,userPassword;
		fname = request.getParameter("fname");
		lname = request.getParameter("lname");
		email = request.getParameter("email");
		mobile = request.getParameter("mobile");
		userName =request.getParameter("username");
		userPassword = request.getParameter("userpassword");
		
		HttpSession session =  request.getSession(false);
		SignUpService signUp = new  SignUpService();
		boolean signUpVerified = signUp.signUpAuthentication(fname,lname,email,mobile,userName,userPassword);
		if(signUpVerified==true)
			
			{	
				if (session != null) {
				    session.invalidate();
				}
				RequestDispatcher dispatch = request.getRequestDispatcher("signUpSuccess.jsp");
				dispatch.forward(request ,response);
			
			}
		else
			
			{
				RequestDispatcher dispatch = request.getRequestDispatcher("signUpForm.jsp");
				dispatch.forward(request ,response);
			
			}
		
			
	}

}
