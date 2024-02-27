package test;

import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
public class TransferMoneyDAO {
	public TransactionBean tb = null;
	public TransactionBean transaction(HttpServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps1 =con.prepareStatement("");
			PreparedStatement ps2 = con.prepareStatement("insert into BankTransaction values(?,?,?,?,?)");
			con.setAutoCommit(false);
			Savepoint sp=con.setSavepoint();
			
			//Transaction Date
			ps2.setString(1, req.getParameter(""));
			ps2.setString(2, req.getParameter(""));
			ps2.setString(3, req.getParameter(""));
			ps2.setDouble(4, Double.parseDouble(req.getParameter("")));
			ps2.setDouble(5, Double.parseDouble(req.getParameter("")));
			ps2.setDouble(6, Double.parseDouble(req.getParameter("")));
			
			
		}catch(Exception e) {e.printStackTrace();}
		return tb;
	}
}
