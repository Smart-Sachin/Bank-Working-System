package test;

import java.sql.*;

import javax.servlet.http.*;
@SuppressWarnings("serial")
public class DeleteAccountDAO extends HttpServlet{
	public int k = 0;
	public int delet(HttpServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("delete BankCustomer where accountno=? and phno=?");
			ps.setLong(1, Long.parseLong(req.getParameter("accountno")));
			ps.setLong(2, Long.parseLong(req.getParameter("phno")));
			
			k = ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}
}
