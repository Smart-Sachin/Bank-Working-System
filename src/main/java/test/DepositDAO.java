package test;

import java.sql.*;
import javax.servlet.http.*;
public class DepositDAO {
	private UserBean ub = null;
	public UserBean deposit(HttpServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("Update BankCustomer set balance=balance+? where phno=?");
			ps.setLong(1, Long.parseLong(req.getParameter("amount")));
			ps.setLong(2, Long.parseLong(req.getParameter("phno")));
			
			int k = ps.executeUpdate();
			
			if(k>0) {
				ub = new UserBean();
				ub.setBalance(12);
			}
		}catch(Exception e) {e.printStackTrace();}
		return ub;
	}
}
