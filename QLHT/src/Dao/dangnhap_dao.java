package Dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connect.ConnectDB;
import entity.DonViTinh;
import entity.dangnhap;

public class dangnhap_dao {
	private String tk;
	private String mk;

	public dangnhap gettkmk() throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		java.sql.Statement statement = con.createStatement();
		ResultSet rs=((java.sql.Statement) statement).executeQuery("select * from dangnhap");
		while (rs.next()) {
			tk = rs.getString(1);
			mk = rs.getString(2);
			
		}
		dangnhap x = new dangnhap(tk,mk);
		return x;
	}
	public boolean doimatkhau (String tk, String mk) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("update dangnhap set matkhau = ? where taikhoan = ?");
			statement.setString(1, mk);
			statement.setString(2, tk);
			n = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return n>0;
	}
}
