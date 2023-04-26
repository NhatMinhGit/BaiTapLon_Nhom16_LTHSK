package entity;

import java.util.Objects;

public class khoangThu {
	private int stt;
	private BanHang banhang;
	private double gianhap;
	private double giaban;
	private double khoangThu;
	
	public double getGianhap() {
		return gianhap;
	}
	public void setGianhap(double gianhap) {
		this.gianhap = gianhap;
	}
	public double getGiaban() {
		return giaban;
	}
	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}
	
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	
	public BanHang getBanhang() {
		return banhang;
	}
	public void setBanhang(BanHang banhang) {
		this.banhang = banhang;
	}
	public double getKhoangThu() {
		return khoangThu;
	}
	public void setKhoangThu(double khoangThu) {
		this.khoangThu = khoangThu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(stt);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		khoangThu other = (khoangThu) obj;
		return stt == other.stt;
	}
	
	
	public khoangThu(int stt, BanHang banhang, double gianhap, double giaban, double khoangThu) {
		super();
		this.stt = stt;
		this.banhang = banhang;
		this.gianhap = gianhap;
		this.giaban = giaban;
		this.khoangThu = khoangThu;
	}
	public khoangThu(int stt) {
		this.stt = stt;
	}
	
}
