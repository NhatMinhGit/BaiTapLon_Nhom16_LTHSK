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

public class BanThuoc_DAO {
	
	public ArrayList<BanHang> getAllDSBanHang(){
		ArrayList<BanHang> dsBanHang=new ArrayList<BanHang>();
		try {
			ConnectDB.getInstance();
			Connection con=ConnectDB.getConnection();
			
			String sql="select * from PhieuBanHang";
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while (rs.next()) {
				String maPhieu=rs.getString(1);
				Thuoc t=new Thuoc(rs.getString(2),rs.getString(3) );
				int sl=rs.getInt(4);
				BanHang bh=new BanHang(maPhieu, t, sl);
				dsBanHang.add(bh);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsBanHang;
	}
	
	public boolean create (BanHang bh) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("insert into PhieuBanHang values (?,?,?,?)");
			statement.setString(1,bh.getMaPhieu());
			statement.setString(2, bh.getThuoc().getMaThuoc());
			statement.setString(3,bh.getThuoc().getTenThuoc());
			statement.setInt(4,bh.getSoLuong());
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
	public boolean xoa (BanHang bh) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("delete from PhieuBanHang where maPhieu=? ");
			statement.setString(1, bh.getMaPhieu());
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
