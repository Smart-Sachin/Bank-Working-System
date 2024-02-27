package test;

import java.sql.*;
import javax.servlet.http.*;

public class ViewAccountByNoDAO {
	public UserBean ub = null;
	public UserBean retrieve(HttpServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("Select * from BankCustomer where phno=?");
			ps.setString(1, req.getParameter("phno"));
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
