package entity;

public class NhomThuoc {
private String nhomThuoc;
private String moTa;
public String getNhomThuoc() {
	return nhomThuoc;
}
public void setNhomThuoc(String nhomThuoc) {
	this.nhomThuoc = nhomThuoc;
}
public String getMoTa() {
	return moTa;
}
public void setMoTa(String moTa) {
	this.moTa = moTa;
}
public NhomThuoc(String nhomThuoc, String moTa) {
	this.nhomThuoc = nhomThuoc;
	this.moTa = moTa;
}
public NhomThuoc(String nhomThuoc) {
	super();
	this.nhomThuoc = nhomThuoc;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nhomThuoc == null) ? 0 : nhomThuoc.hashCode());
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
	NhomThuoc other = (NhomThuoc) obj;
	if (nhomThuoc == null) {
		if (other.nhomThuoc != null)
			return false;
	} else if (!nhomThuoc.equals(other.nhomThuoc))
		return false;
	return true;
}

}
