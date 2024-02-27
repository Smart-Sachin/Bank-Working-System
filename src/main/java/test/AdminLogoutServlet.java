package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/adminlogout")
public class AdminLogoutServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		HttpSession hs = req.getSession(false);
		
		if(hs==null) {
			pw.println("Session Expired...<br>");
			//RequestDispatcher rd=req.getRequestDispatcher("invalidlogin.jsp");//Here i can use invalid.jsp and this will forward to index.html59
			//rd.forward(req, res);
		}else {
			hs.removeAttribute("abean");
			hs.removeAttribute("ubean");
			hs.invalidate();	//Destroing session
			req.setAttribute("msg","Logout Sucessfully...");
			//pw.println("Logout Sucessfully...<br>");
			//RequestDispatcher rd=req.getRequestDispatcher("index.html");
			//rd.include(req, res);
		}
		RequestDispatcher rd=req.getRequestDispatcher("logout.jsp");//Here i can use invalid.jsp and this will forward to index.html59
		rd.forward(req, res);
	}
}
