package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")

public class ViewAccountByNoServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException,IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		UserBean ub = new ViewAccountByNoDAO().retrieve(req);
		
		if(ub==null) {
			req.setAttribute("msg", "Invalid Login Process");			
			RequestDispatcher rd = req.getRequestDispatcher("invalidlogin.jsp");
			rd.forward(req, res);
		}else {
			HttpSession hs=req.getSession(); 
			hs.setAttribute("abean", hs);
			RequestDispatcher rd = req.getRequestDispatcher("accountdetailsbyno.jsp");
			rd.forward(req, res);
		}
	}
}
