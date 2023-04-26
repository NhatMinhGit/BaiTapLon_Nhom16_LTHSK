package entity;

public class Thuoc {
private String maThuoc;
private String tenThuoc;
private String donViQuyDoi;
private float giaNhap;
private float giaBan;
private DonViTinh donViTinh;
private NhomThuoc nhomThuoc;




public String getMaThuoc() {
	return maThuoc;
}
public void setMaThuoc(String maThuoc) {
	this.maThuoc = maThuoc;
}
public String getTenThuoc() {
	return tenThuoc;
}
public void setTenThuoc(String tenThuoc) {
	this.tenThuoc = tenThuoc;
}
public String getDonViQuyDoi() {
	return donViQuyDoi;
}
public void setDonViQuyDoi(String donViQuyDoi) {
	this.donViQuyDoi = donViQuyDoi;
}
public float getGiaNhap() {
	return giaNhap;
}
public void setGiaNhap(float giaNhap) {
	this.giaNhap = giaNhap;
}
public float getGiaBan() {
	return giaBan;
}
public void setGiaBan(float giaBan) {
	this.giaBan = giaBan;
}
public DonViTinh getDonViTinh() {
	return donViTinh;
}
public void setDonViTinh(DonViTinh donViTinh) {
	this.donViTinh = donViTinh;
}
public NhomThuoc getNhomThuoc() {
	return nhomThuoc;
}
public void setNhomThuoc(NhomThuoc nhomThuoc) {
	this.nhomThuoc = nhomThuoc;
}
public Thuoc(String maThuoc, String tenThuoc, String donViQuyDoi,float giaNhap, float giaBan, DonViTinh donViTinh,
		NhomThuoc nhomThuoc) {
	this.maThuoc = maThuoc;
	this.tenThuoc = tenThuoc;
	this.donViQuyDoi = donViQuyDoi;
	this.giaNhap = giaNhap;
	this.giaBan = giaBan;
	this.donViTinh = donViTinh;
	this.nhomThuoc = nhomThuoc;
}
public Thuoc(String maThuoc) {
	this.maThuoc = maThuoc;
}
public Thuoc(String maThuoc, String tenThuoc) {
	this.maThuoc = maThuoc;
	this.tenThuoc = tenThuoc;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((maThuoc == null) ? 0 : maThuoc.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Thuoc other = (Thuoc) obj;
	if (maThuoc == null) {
		if (other.maThuoc != null)
			return false;
	} else if (!maThuoc.equals(other.maThuoc))
		return false;
	return true;
}


}
