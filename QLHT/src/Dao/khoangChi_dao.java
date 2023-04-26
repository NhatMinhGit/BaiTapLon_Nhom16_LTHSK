package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.NhaCungCap;
import entity.NhapHang;
import entity.Thuoc;
import entity.khoangChi;
public class khoangChi_dao {
	public ArrayList<khoangChi> getALLkhoangChi() {
		ArrayList<khoangChi> dskhoangchi = new ArrayList<khoangChi>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select * from khoangchi");
			while(rs.next()) {
				NhaCungCap y = new NhaCungCap(rs.getString(3), rs.getString(4));
				Thuoc z = new Thuoc(rs.getString(5), rs.getString(6));
				
				int STT = rs.getInt(1);
				NhapHang x = new NhapHang(rs.getString(2),y,z, rs.getInt(7));
				float gianhap = rs.getFloat(8);
				float tong = rs.getFloat(9);
				khoangChi khoangchi = new khoangChi(STT, x, gianhap, tong);
				dskhoangchi.add(khoangchi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dskhoangchi;
	}
}
