package entity;

import java.util.Objects;

public class khoangChi {
	private int stt;
	private NhapHang nhaphang;
	private double gianhap;
	private double khoangChi;
	
	
	public double getGianhap() {
		return gianhap;
	}
	public void setGianhap(double gianhap) {
		this.gianhap = gianhap;
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public NhapHang getNhaphang() {
		return nhaphang;
	}
	public void setNhaphang(NhapHang nhaphang) {
		this.nhaphang = nhaphang;
	}
	public double getKhoangChi() {
		return khoangChi;
	}
	public void setKhoangChi(double khoangChi) {
		this.khoangChi = khoangChi;
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
		khoangChi other = (khoangChi) obj;
		return stt == other.stt;
	}
	

	public khoangChi(int stt, NhapHang nhaphang, double gianhap, double khoangChi) {
		super();
		this.stt = stt;
		this.nhaphang = nhaphang;
		this.gianhap = gianhap;
		this.khoangChi = khoangChi;
	}
	public khoangChi(int stt) {
		this.stt = stt;
	}
}
