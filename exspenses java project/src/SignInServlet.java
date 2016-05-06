

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/SignInPath")
public class SignInServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String id,pwd;
		id = request.getParameter("userId");
		pwd = request.getParameter("password");
		
        HttpSession session = request.getSession();		
		SignInService login = new  SignInService();
		boolean verified =login. authentication(id,pwd);
		if(verified)
			
			{
			session.setAttribute("user", id);			
			RequestDispatcher dispatch = request.getRequestDispatcher("userForm.jsp");
			dispatch.forward(request ,response);
				
			}
			else
				
			{
				session.setAttribute("user", "false");
				RequestDispatcher dispatch = request.getRequestDispatcher("signIn.jsp");
				dispatch.forward(request ,response);
			}
		
	}

}
