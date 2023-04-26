package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.BanHang;
import entity.NhaCungCap;
import entity.NhapHang;
import entity.Thuoc;

public class NhapThuoc_DAO {
	public ArrayList<NhapHang> getAllDSNhapHang(){
		ArrayList<NhapHang> dsNhapHang=new ArrayList<NhapHang>();
		try {
			ConnectDB.getInstance();
			Connection con=ConnectDB.getConnection();
			
			String sql="select * from PhieuNhapHang";
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while (rs.next()) {
				String maPhieu=rs.getString(1);
				NhaCungCap x = new NhaCungCap(rs.getString(2),rs.getString(3));
				Thuoc t=new Thuoc(rs.getString(4),rs.getString(5) );
				int sl=rs.getInt(6);
				NhapHang nhaphang=new NhapHang(maPhieu,x, t, sl);
				dsNhapHang.add(nhaphang);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsNhapHang;
	}
	public boolean create (NhapHang nh) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		int n = 0;
		try {
			statement = con.prepareStatement("insert into PhieuNhapHang values (?,?,?,?,?,?)");
			statement.setString(1, nh.getMaPhieu());
			statement.setString(2, nh.getNhacungcap().getMaNhaCungCap());
			statement.setString(3, nh.getNhacungcap().getTenNhaCungCap());
			statement.setString(4, nh.getThuoc().getMaThuoc());
			statement.setString(5, nh.getThuoc().getTenThuoc());
			statement.setInt(6, nh.getSoLuong());
			n = statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return n>0;
	}
	public boolean remove (NhapHang nh) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		int n=0;
		try {
			statement = con.prepareStatement("delete from PhieuNhapHang where maPhieu=?");
			statement.setString(1,nh.getMaPhieu());
			n = statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return n>0;
	}
}
