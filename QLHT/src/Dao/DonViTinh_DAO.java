package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.DonViTinh;
import entity.NhomThuoc;


public class DonViTinh_DAO {
	public ArrayList<DonViTinh> getAllDSDonViTinh(){
		ArrayList<DonViTinh> dsDonViTinh=new ArrayList<DonViTinh>();
		try {
			ConnectDB.getInstance();
			Connection con=ConnectDB.getConnection();
			
			String sql="select * from DonViTinh";
			Statement statement=con.createStatement();
			//Thực thi câu lệnh trả sql về đối tượng result
			ResultSet rs=statement.executeQuery(sql);
			//duyệt trên kết quả trả về
			while (rs.next()) {
				String donvi=rs.getString(1);
				String mota=rs.getString(2);
				
				DonViTinh dv=new DonViTinh(donvi, mota);
				dsDonViTinh.add(dv);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsDonViTinh;
	}
	public boolean create (DonViTinh dvt) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("insert into DonViTinh values (?,?)");
			statement.setString(1,dvt.getDonViTinh());
			statement.setString(2, dvt.getMoTa());
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
	public boolean update (DonViTinh dvt, String a) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("update DonViTinh set donViTinh=?,mota=? Where DonViTinh=?");
			statement.setString(1,dvt.getDonViTinh());
			statement.setString(2, dvt.getMoTa());
			statement.setString(3, a);
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
	public boolean xoa (DonViTinh dvt) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("delete from DonViTinh where DonViTinh=? ");
			statement.setString(1, dvt.getDonViTinh());
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
