package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.NhomThuoc;

public class NhomThuoc_DAO {
	public ArrayList<NhomThuoc> getAllDSNhomThuoc(){
		ArrayList<NhomThuoc> dsNhomThuoc=new ArrayList<NhomThuoc>();
		try {
			ConnectDB.getInstance();
			Connection con=ConnectDB.getConnection();
			
			String sql="select * from NhomThuoc";
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while (rs.next()) {
				String nhomT=rs.getString(1);
				String motaT=rs.getString(2);
				
				NhomThuoc nt=new NhomThuoc(nhomT, motaT);
				dsNhomThuoc.add(nt);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsNhomThuoc;
	}
	public boolean create (NhomThuoc nt) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("insert into nhomThuoc values (?,?)");
			statement.setString(1,nt.getNhomThuoc());
			statement.setString(2, nt.getMoTa());
			n=statement.executeUpdate();
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
	public boolean update (NhomThuoc nt) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("update NhomThuoc set mota=? Where nhomThuoc=?");
			statement.setString(1,nt.getMoTa());
			statement.setString(2, nt.getNhomThuoc());
			n=statement.executeUpdate();
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
	public boolean xoa (NhomThuoc nt) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("delete from NhomThuoc where NhomThuoc=? ");
			statement.setString(1, nt.getNhomThuoc());
			n=statement.executeUpdate();
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
