package entity;

public class DonViTinh {
private String donViTinh;
private String moTa;
public String getDonViTinh() {
	return donViTinh;
}
public void setDonViTinh(String donViTinh) {
	this.donViTinh = donViTinh;
}
public String getMoTa() {
	return moTa;
}
public void setMoTa(String moTa) {
	this.moTa = moTa;
}
public DonViTinh(String donViTinh, String moTa) {
	this.donViTinh = donViTinh;
	this.moTa = moTa;
}
public DonViTinh(String donViTinh) {
	this.donViTinh = donViTinh;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((donViTinh == null) ? 0 : donViTinh.hashCode());
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
	DonViTinh other = (DonViTinh) obj;
	if (donViTinh == null) {
		if (other.donViTinh != null)
			return false;
	} else if (!donViTinh.equals(other.donViTinh))
		return false;
	return true;
}


}
