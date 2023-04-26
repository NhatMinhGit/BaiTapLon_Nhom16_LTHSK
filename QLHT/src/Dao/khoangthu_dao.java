package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.BanHang;
import entity.NhaCungCap;
import entity.NhapHang;
import entity.Thuoc;
import entity.khoangChi;
import entity.khoangThu;

public class khoangthu_dao {
	public ArrayList<khoangThu> getALLkhoangThu() {
		ArrayList<khoangThu> dskhoangthu = new ArrayList<khoangThu>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select * from khoangthu");
			while(rs.next()) {
				int STT = rs.getInt(1);
				Thuoc z = new Thuoc(rs.getString(3), rs.getString(4));
				BanHang y = new BanHang(rs.getString(2),z,rs.getInt(5));
				khoangThu khoangthu = new khoangThu(STT, y, rs.getFloat(6), rs.getFloat(7), rs.getFloat(8));
				dskhoangthu.add(khoangthu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dskhoangthu;
	}
}
