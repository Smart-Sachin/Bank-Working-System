package test;

import java.util.Random;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/create")
public class CreateAccountServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		UserBean ub = new UserBean();
		
		String s="";
		Random random = new Random();
		for(int i=0; i<4; i++) {
			s+=random.nextInt(10);
		}
		ub.setAccountNo(Long.parseLong(s));
		ub.setuName(req.getParameter("uname"));
		ub.setfName(req.getParameter("fname"));
		ub.setDob(req.getParameter("dob"));
		ub.setGender(req.getParameter("gender"));
		ub.setPhNo(Long.parseLong(req.getParameter("phno")));
		ub.setMailId(req.getParameter("mailid"));
		ub.setAddress(req.getParameter("address"));
		ub.setIdProof(req.getParameter("idproof"));
		ub.setIdProofNo(Long.parseLong(req.getParameter("idproofno")));
		ub.setAccType(req.getParameter("acctype"));
		ub.setBalance(Long.parseLong(req.getParameter("balance")));
		ub.setpWord(req.getParameter("pword"));
		
		int k = new CreateAccountDAO().inseri(ub);
		
		if(k>0) {
			//Here we can forward to JSP
			HttpSession hs=req.getSession();
			hs.setAttribute("ubean", ub);
			RequestDispatcher rd = req.getRequestDispatcher("creationdetails.jsp");			
			rd.forward(req, res);			
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("createaccount.html");
			rd.include(req, res);
		}
	}
}
