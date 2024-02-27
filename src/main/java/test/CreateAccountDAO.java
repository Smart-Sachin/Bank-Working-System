package test;

import java.sql.*;
public class CreateAccountDAO {
	public int k = 0;
	public int inseri(UserBean ub) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareCall("insert into BankCustomer values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			//Inserting data into DataBase
			ps.setLong(1, ub.getAccountNo());
			ps.setString(2, ub.getuName());
			ps.setString(3, ub.getfName());
			ps.setString(4, ub.getDob());
			ps.setString(5, ub.getGender());
			ps.setLong(6, ub.getPhNo());
			ps.setString(7, ub.getMailId());
			ps.setString(8, ub.getAddress());
			ps.setString(9, ub.getIdProof());
			ps.setLong(10, ub.getIdProofNo());
			ps.setString(11, ub.getAccType());
			ps.setLong(12, ub.getBalance());
			ps.setString(13, ub.getpWord());
			
			k = ps.executeUpdate();

		}catch(Exception e) {e.printStackTrace();}
		return k;
	}
}
