package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.NhanVien;

public class NhanVien_DAO {
	public NhanVien_DAO() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<NhanVien> getAllNhanVien(){
		ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			
			String sql = "Select * from NhanVien";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				int maNV = rs.getInt(1);
				String hoNV = rs.getString(2);
				String tenNV = rs.getString(3);
				int tuoi = rs.getInt(4);
				boolean phai = rs.getBoolean(5);
				double luong = rs.getDouble(6);
				NhanVien nv = new NhanVien(maNV, hoNV, tenNV, tuoi, phai, luong);
				dsnv.add(nv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsnv;
	}
	public NhanVien getNhanVienTheoMa(int string) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		NhanVien nv = null;
		String sql = "Select * from NhanVien where maNV = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, string);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				nv = new NhanVien(string, rs.getString(2), rs.getString(3), rs.getInt(4), rs.getBoolean(5),rs.getDouble(6));
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nv;
	}
	 
	public boolean createNV(NhanVien nv) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("Insert into NhanVien values(?,?,?,?,?,?)");
			stmt.setInt(1, nv.getMaNV());
			stmt.setString(2, nv.getHoNV());
			stmt.setString(3,nv.getTenNV());
			stmt.setInt(4, nv.getTuoi());
			stmt.setBoolean(5, nv.isPhai());
			stmt.setDouble(6, nv.getLuong());
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return n>0;
	}
	public boolean updateNV(NhanVien nv) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("update NhanVien set ho = ?,ten=?,tuoi=?,phai=?,tienLuong=? where maNV=?");
			stmt.setInt(6, nv.getMaNV());
			stmt.setString(1, nv.getHoNV());
			stmt.setString(2,nv.getTenNV());
			stmt.setInt(3, nv.getTuoi());
			stmt.setBoolean(4, nv.isPhai());
			stmt.setDouble(5, nv.getLuong());
			n=stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return n>0;
	}
	public boolean deleteNV(int maNV) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n=0;
		String sql = "Delete NhanVien where maNV = ?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, maNV);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n>0;
	}
}

