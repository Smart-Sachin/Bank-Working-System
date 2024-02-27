package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/checkbal")
public class CheckBalanceServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException
		{
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			HttpSession hs = req.getSession(false);
			
			if(hs==null) {
				//pw.println("Session Expired...");
				
				
				 req.setAttribute("msg", "Session Expired..."); 
				 RequestDispatcher rd=req.getRequestDispatcher("logout.jsp");
				 rd.include(req, res);
				 //Here i can use invalid.jsp and
			//	 this will forward to index.html59 rd.forward(req, res);
				
			}else {						
				//pw.println("Logind...");
				
				RequestDispatcher rd=req.getRequestDispatcher("checkbalance.jsp");
				rd.forward(req, res);
				
			}
		}
}
