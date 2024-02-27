package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/deposit")
public class DepositServlet extends HttpServlet{	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		
		HttpSession hs = req.getSession();
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...");
			RequestDispatcher rd=req.getRequestDispatcher("logout.jsp");
			rd.forward(req, res);
		}else {
			UserBean ub = new DepositDAO().deposit(req);
			if(ub==null) {
				hs.setAttribute("msg", "Invalid Phone No...");
				RequestDispatcher rd=req.getRequestDispatcher("invalidlogin.jsp");//Here i can use invalid.jsp and this will forward to index.html59
				rd.forward(req, res);
			}else {
				RequestDispatcher rd=req.getRequestDispatcher("withdawal.jsp");
				rd.forward(req, res);
			}
		}
	}
	
}
