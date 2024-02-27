package test;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/viewall")
public class ViewAllAccountServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) 
	throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		ArrayList<UserBean> al = new ViewAllAccountDAO().retrieve();
		
		
		if(al.size()==0) {			
			req.setAttribute("msg","Invalid Login Process...");
			RequestDispatcher rd = req.getRequestDispatcher("invalidlogin.jsp");
			rd.forward(req, res);
		}else {
			//HttpSession hs=req.getSession();
			//hs.setAttribute("abean", hs);
			
			  req.setAttribute("transactionList", al); 
			  RequestDispatcher rd = req.getRequestDispatcher("ViewAllAccount.jsp"); 
			  rd.include(req, res);
			 
			/*
			 Iterator<UserBean> it = al.iterator();
			 
			 pw.println("<style>"
			 		+ "table, th, td {"
			 		+ "  border:1px solid black;"
			 		+ "}"
			 		+ "td{"
			 		+ "   text-align: end;"
			 		+ "}"
			 		+ "</style>");
			 
			 pw.println("<center><table style=\"width:80%\">"
						+ "  <thead>"
						+ "    <tr>"
						+ "      <th>Account No</th>"
						+ "      <th>Name</th>"
						+ "      <th>Phone No</th>"
						+ "      <th>Balance</th>"
						+ "    </tr>"
						+ "  </thead>"
				);
			 while(it.hasNext()) 
			 { 
				 UserBean ub = (UserBean)it.next();				 
			 
				 		pw.print("<br><tbody>"						
						+ "      <tr>"
						+ "        <td>"+ub.getAccountNo()+"</td>"
						+ "        <td>"+ub.getuName()+"</td>"
						+ "        <td>"+ub.getPhNo()+"</td>"
						+ "		   <td>"+ub.getBalance()+"</td>"
						+ "      </tr>"
						+ "    </c:forEach>"
						+ "  </tbody>"
						);
			 }
			 pw.println("</table></center>");
			 pw.println("<button onclick=\"window.print()\">Print this page</button>");
			 
			 */
					
			}//End of else
	}
}
