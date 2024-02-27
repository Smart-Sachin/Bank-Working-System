package test;

import java.sql.*;
import java.util.*;
public class ViewAllAccountDAO {
	public ArrayList<UserBean> al = new ArrayList<UserBean>();
	//Created with size=0
	public ArrayList<UserBean> retrieve()
	{
		try {
			Connection con = DBConnection.getCon();
			//Accessing DB Connection
			PreparedStatement ps = con.prepareStatement("select * from BankCustomer");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				UserBean ub = new UserBean();
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
				al.add(ub);	//Bean object added to ArrayList
			}//End of loop
			
		}catch(Exception e) {e.printStackTrace();}
		return al;
	}
}
