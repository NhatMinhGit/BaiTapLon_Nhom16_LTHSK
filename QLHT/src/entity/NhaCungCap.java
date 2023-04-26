package entity;

import java.util.Objects;

public class NhaCungCap {
	private String maNhaCungCap;
	private String tenNhaCungCap;
	private String sdt;
	private String diaChi;
	private String STK;
	private String Fax;
	public String getMaNhaCungCap() {
		return maNhaCungCap;
	}
	public void setMaNhaCungCap(String maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}
	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}
	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSTK() {
		return STK;
	}
	public void setSTK(String sTK) {
		STK = sTK;
	}
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		Fax = fax;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maNhaCungCap);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhaCungCap other = (NhaCungCap) obj;
		return Objects.equals(maNhaCungCap, other.maNhaCungCap);
	}
	public NhaCungCap(String maNhaCungCap, String tenNhaCungCap, String sdt, String diaChi, String sTK, String fax) {
		this.maNhaCungCap = maNhaCungCap;
		this.tenNhaCungCap = tenNhaCungCap;
		this.sdt = sdt;
		this.diaChi = diaChi;
		STK = sTK;
		Fax = fax;
	}
	public NhaCungCap(String maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}
	public NhaCungCap(String maNhaCungCap, String tenNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
		this.tenNhaCungCap = tenNhaCungCap;
	}
}
