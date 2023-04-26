package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.NhaCungCap;


public class NhaCungCap_DAO {
	public ArrayList<NhaCungCap> getAllDSNhaCungCap(){
		ArrayList<NhaCungCap> dsNCC=new ArrayList<NhaCungCap>();
		try {
			ConnectDB.getInstance();
			Connection con=ConnectDB.getConnection();
			
			String sql="select * from NhaCungCap";
			Statement statement=con.createStatement();
			//Thực thi câu lệnh trả sql về đối tượng result
			ResultSet rs=statement.executeQuery(sql);
			//duyệt trên kết quả trả về
			while (rs.next()) {
				String maNCC=rs.getString(1);
				String tenNCC=rs.getString(2);
				String sdt=rs.getString(3);
				String diaChi =rs.getString(4);
				String stk=rs.getString(5);
				String fax=rs.getString(6);
				NhaCungCap ncc=new NhaCungCap(maNCC, tenNCC, sdt, diaChi, stk, fax);
				dsNCC.add(ncc);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsNCC;
	}
	public boolean createNCC (NhaCungCap ncc) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("insert into NhaCungCap values (?,?,?,?,?,?)");
			statement.setString(1,ncc.getMaNhaCungCap());
			statement.setString(2, ncc.getTenNhaCungCap());
			statement.setString(3,ncc.getSdt());
			statement.setString(4,ncc.getDiaChi());
			statement.setString(5, ncc.getSTK());
			statement.setString(6,ncc.getFax());
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
	public boolean updateNCC (NhaCungCap ncc) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("update NhaCungCap set tenNhaCungCap=?,SDTNhaCungCap=?,diaChiNhaCungCap=?,STKNhaCungCap=?,FAXNhaCungCap=? Where maNhaCungCap=?");
			statement.setString(1, ncc.getTenNhaCungCap());
			statement.setString(2,ncc.getSdt());
			statement.setString(3, ncc.getDiaChi());
			statement.setString(4, ncc.getSTK());
			statement.setString(5,ncc.getFax());
			statement.setString(6,ncc.getMaNhaCungCap());
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
	public boolean xoaNCC (NhaCungCap ncc) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement=null;
		int n=0;
		try {
			statement=con.prepareStatement("delete from NhaCungCap where maNhaCungCap=? ");
			statement.setString(1, ncc.getMaNhaCungCap());
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
	public ArrayList<NhaCungCap> getNhaCungCapTheoMa(String id){
		ArrayList<NhaCungCap> dsNCC=new ArrayList<NhaCungCap>();
		ConnectDB.getInstance();
		Connection con =ConnectDB.getConnection();
		PreparedStatement statement=null;
		try {
			
			
			String sql="select * from NhaCungCap where maNCC=?";
			statement=con.prepareStatement(sql);
			statement.setString(1, id);
			ResultSet rs=statement.executeQuery();
			while (rs.next()) {
				String maNCC=rs.getString(1);
				String tenNCC=rs.getString(2);
				String sdt=rs.getString(3);
				String diaChi =rs.getString(4);
				String stk=rs.getString(5);
				String fax=rs.getString(6);
				NhaCungCap ncc=new NhaCungCap(maNCC, tenNCC, sdt, diaChi, stk, fax);
				dsNCC.add(ncc);
				
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
		return dsNCC;
	}
}
