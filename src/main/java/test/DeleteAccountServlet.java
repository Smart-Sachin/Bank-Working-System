package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteAccountServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			int k = new DeleteAccountDAO().delet(req);
			
			if(k>0) {
				pw.println("Account Deleted Sucessfully...");
				//RequestDispatcher rd = req.getRequestDispatcher("creationdetails.jsp");			
				//rd.forward(req, res);		
			}else {
				pw.println("Account not deleted...<br.");
			}
		}catch(Exception e) {e.printStackTrace();}
	}
}
