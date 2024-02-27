package test;

import java.sql.*;
import javax.servlet.http.*;
public class AdminLoginDAO {
	public AdminBean ab = null;
	public AdminBean adminLogin(HttpServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from BankAdmin where userid=? and uname=? and pword=?");
			ps.setString(1, req.getParameter("userid"));
			ps.setString(2, req.getParameter("uname"));
			ps.setString(3, req.getParameter("pword"));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				ab = new AdminBean();
				ab.setUserId(rs.getString(1));
				ab.setName(rs.getString(2));
				ab.setpWord(rs.getString(3));
			}
		}catch(Exception e) {e.printStackTrace();}
		return ab;
	}
}
