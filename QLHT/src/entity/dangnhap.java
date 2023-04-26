package entity;

public class dangnhap {
	private String taikhoan;
	private String matkhau;
	public String getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public dangnhap(String taikhoan, String matkhau) {
		super();
		this.taikhoan = taikhoan;
		this.matkhau = matkhau;
	}
	
}
