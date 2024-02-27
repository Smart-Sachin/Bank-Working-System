package test;

import java.sql.*;
import javax.servlet.http.*;
public class UserLoginDAO {
	public UserBean ub = null;
	public UserBean userLogin(HttpServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from BankCustomer where accountno=? and uname=? and pword=?");
			ps.setLong(1, Long.parseLong(req.getParameter("accountno")));
			ps.setString(2, req.getParameter("uname"));
			ps.setString(3, req.getParameter("pword"));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				ub = new UserBean();
				ub.setAccountNo(rs.getLong(1));
				ub.setuName(rs.getString(2));
				ub.setfName(rs.getString(3));
				ub.setDob(rs.getString(4));
				ub.setGender(rs.getString(5));
				ub.setPhNo(rs.getLong(6));
				ub.setMailId(rs.getString(7));
				ub.setAddress(rs.getString(8));
				ub.setIdProof(rs.getString(9));
				ub.setIdProofNo(rs.getLong(10));
				ub.setAccType(rs.getString(11));
				ub.setBalance(rs.getLong(12));
				ub.setpWord(rs.getString(13));				
			}
		}catch(Exception e) {e.printStackTrace();}
		return ub;
	}
}
