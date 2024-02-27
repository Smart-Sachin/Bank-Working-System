package test;

import java.sql.*;
import javax.servlet.http.*;
public class WithdrawalDAO {
	private UserBean ub = null;
	public UserBean withdrawal(HttpServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("Update BankCustomer set balance=balance-? where phno=?");
		//	PreparedStatement ps1 =con.prepareStatement("insert into BankTransaction values(?,?,?,?,?)");
			//con.setAutoCommit(false);
			//Savepoint sp = con.setSavepoint();
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
