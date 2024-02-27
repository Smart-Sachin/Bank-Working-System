package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/userlogin")
public class UserLoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
				
		UserBean ub=new UserLoginDAO().userLogin(req);
		
		if(ub==null) {
			req.setAttribute("msg", "Invalid Login Process...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("invalidlogin.jsp");//Here i can use invalid.jsp and this will forward to index.html59
			rd.forward(req, res);
		}else {
			HttpSession hs=req.getSession();
			hs.setAttribute("ubean", ub);
			RequestDispatcher rd=req.getRequestDispatcher("usermenu.jsp");
			rd.forward(req, res);
		}
	}
}
