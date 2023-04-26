package entity;

import java.util.Objects;

public class BanHang {
	private String maPhieu;
	private Thuoc thuoc;
	private int soLuong;
	
	public String getMaPhieu() {
		return maPhieu;
	}
	public void setMaPhieu(String maPhieu) {
		this.maPhieu = maPhieu;
	}
	public Thuoc getThuoc() {
		return thuoc;
	}
	public void setThuoc(Thuoc thuoc) {
		this.thuoc = thuoc;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public BanHang(String maPhieu, Thuoc thuoc, int soLuong) {
		super();
		this.maPhieu = maPhieu;
		this.thuoc = thuoc;
		this.soLuong = soLuong;
	}
	public BanHang(String maPhieu) {
		this.maPhieu = maPhieu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhieu);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BanHang other = (BanHang) obj;
		return Objects.equals(maPhieu, other.maPhieu);
	}
	
}
