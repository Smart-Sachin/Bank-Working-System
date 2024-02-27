package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class UserLogoutServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException,IOException
		{
			res.setContentType("text/http");
			HttpSession hs = req.getSession(false);//Accessing existing session
				
			if(hs==null) {
				req.setAttribute("msg", "Session Expired...<br>");
			}else {
				hs.removeAttribute("ubean");
				hs.invalidate();	//Destroying session
				req.setAttribute("msg","Logout Sucessfully...");
			}
			RequestDispatcher rd=req.getRequestDispatcher("logout.jsp");//Here i can use invalid.jsp and this will forward to index.html59
			rd.forward(req, res);
		}	
}
