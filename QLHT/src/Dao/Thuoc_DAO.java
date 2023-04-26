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
import entity.Thuoc;


public class Thuoc_DAO {
	private int Thuoc;
	public ArrayList<Thuoc> getAllDSThuoc(){
		ArrayList<Thuoc> dsThuoc=new ArrayList<Thuoc>();
		try {
			ConnectDB.getInstance();
			Connection con=ConnectDB.getConnection();
			
			String sql="select * from Thuoc";
			Statement statement=con.createStatement();
			//Thực thi câu lệnh trả sql về đối tượng result
			ResultSet rs=statement.executeQuery(sql);
			//duyệt trên kết quả trả về
			while (rs.next()) {
				String maT=rs.getString(1);
				String tenT=rs.getString(2);
				String dvqd=rs.getString(3);
				Float giaN=rs.getFloat(4);
				Float giaB=rs.getFloat(5);
				DonViTinh dvt=new DonViTinh(rs.getString(6));
				NhomThuoc nt=new NhomThuoc(rs.getString(7));
				Thuoc thuoc=new Thuoc(maT, tenT, dvqd, giaN, giaB, dvt,nt);
				dsThuoc.add(thuoc);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsThuoc;
	}
	public boolean create (Thuoc t) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("insert into Thuoc values (?,?,?,?,?,?,?)");
			statement.setString(1,t.getMaThuoc());
			statement.setString(2, t.getTenThuoc());
			statement.setString(3,t.getDonViQuyDoi());
			statement.setFloat(4, t.getGiaNhap());
			statement.setFloat(5, t.getGiaBan());
			statement.setString(6,t.getDonViTinh().getDonViTinh());
			statement.setString(7,t.getNhomThuoc().getNhomThuoc());
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
	public boolean update (Thuoc t) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("update Thuoc set ten=?,Donviquydoi=?,giaNhap=?,giaBan=?,donvitinh=?,nhomThuoc=? Where maThuoc=?");
			statement.setString(7,t.getMaThuoc());
			statement.setString(1, t.getTenThuoc());
			statement.setString(2,t.getDonViQuyDoi());
			statement.setFloat(3, t.getGiaNhap());
			statement.setFloat(4, t.getGiaBan());
			statement.setString(5,t.getDonViTinh().getDonViTinh());
			statement.setString(6,t.getNhomThuoc().getNhomThuoc());
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
	public boolean xoa (String ma) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("delete from Thuoc where maThuoc=? ");
			statement.setString(1,ma);
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
	public ArrayList<Thuoc> getThuocTheoMaThuoc(String id){
		ArrayList<Thuoc> dsT=new ArrayList<Thuoc>();
		ConnectDB.getInstance();
		Connection con =ConnectDB.getConnection();
		PreparedStatement statement=null;
		try {
			
			
			String sql="select * from Thuoc where maThuoc=?";
			statement=con.prepareStatement(sql);
			statement.setString(1, id);
			ResultSet rs=statement.executeQuery();
			while (rs.next()) {
				String maT=rs.getString(1);
				String tenT=rs.getString(2);
				String dvqd=rs.getString(3);
				Float giaN=rs.getFloat(4);
				Float giaB=rs.getFloat(5);
				DonViTinh dvt=new DonViTinh(rs.getString(6));
				NhomThuoc nt=new NhomThuoc(rs.getString(7));
				Thuoc thuoc=new Thuoc(maT, tenT, dvqd, giaN, giaB, dvt,nt);
				dsT.add(thuoc);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally {
			try {
				statement.close();
			}catch (SQLException e) {
			e.printStackTrace();
		}
		}
		return dsT;
	}
}
