

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.Options;
/**
 * Servlet implementation class UserFormServlet
 */
@WebServlet("/UserFormPath")
public class UserFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String income,place,apt,transport;
		income = request.getParameter("income");
		place = request.getParameter("place");
		apt = request.getParameter("apt");
		transport = request.getParameter("transport");
		UserFormService ufs = new  UserFormService();
		Options op = ufs.getOptionsList(income,place,apt,transport);
        HttpSession session = request.getSession();
        session.setAttribute("option", op);
        if(transport.equals("Fuel")){
        	session.setAttribute("transport", "OwnVehicle");
        }
        else{
        	session.setAttribute("transport", "Public_Transport");
        }
    	session.setAttribute("accomodation", apt);
    	session.setAttribute("IncomeTax", op.getStateTax()*(Double.parseDouble(income)/100.0));
        System.out.println(op.toString());
		RequestDispatcher dispatch = request.getRequestDispatcher("estimator.jsp");
		dispatch.forward(request ,response);
	}
}
