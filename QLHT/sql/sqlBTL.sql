create database btl
go
use btl
go
CREATE TABLE NHOMTHUOC(
   nhomThuoc  VARCHAR (20) primary key,
   moTa NVARCHAR (30) NOT NULL,     
);
CREATE TABLE DonViTinh(
	donViTinh VARCHAR (20) primary key,
   moTa NVARCHAR (30) NOT NULL,     
);
CREATE TABLE Thuoc(
   maThuoc  NVARCHAR (30) primary key,
   ten NVARCHAR (50)  NULL,
   donViQuyDoi NVARCHAR (50)  NULL,
   giaNhap float,
   giaBan float,
   donViTinh  VARCHAR (20) NULL, 
   Constraint F_dvt Foreign key(donViTinh) references DonViTinh(donViTinh),
   nhomThuoc  VARCHAR (20) NULL, 
   Constraint F_NT Foreign key(nhomThuoc) references NHOMTHUOC(nhomThuoc),
);

CREATE TABLE NhaCungCap(
	maNhaCungCap NVARCHAR (20) primary key,
	tenNhaCungCap NVARCHAR (50) ,
	SDTNhaCungCap NVARCHAR (20),
	diaChiNhaCungCap NVARCHAR (100),
	STKNhaCungCap NVARCHAR (20),
	FAXNhaCungCap NVARCHAR (20),
);

CREATE TABLE phieuNhapHang (
	maPhieu NVARCHAR (20) primary key,
	maNhaCungCap NVARCHAR (20),
	foreign key (maNhaCungCap) references NhaCungCap(maNhaCungCap), 
	tenNhaCungCap NVARCHAR (50),
	maThuoc NVARCHAR (30),
	foreign key (maThuoc) references Thuoc (maThuoc),
	tenThuoc NVARCHAR (50),
	soLuongThuocNhap INT,
);
create table khoangchi (
	stt INT primary key,
	maPhieu NVARCHAR(20) foreign key references phieuNhapHang(maPhieu),
	manhacungcap nvarchar(20),
	tennhacungcap nvarchar(50),
	mathuoc nvarchar(30),
	tenthuoc nvarchar(30),
	soluong INT,
	gianhap float,
	khoangchi FLOAT,

);
CREATE TABLE PhieuBanHang (
	maPhieu NVARCHAR (20) primary key,
	mathuoc NVARCHAR (30),
	Foreign key(mathuoc) references Thuoc(maThuoc),
	tenthuoc NVARCHAR (50),
	soLuongThuoc INT,
);
create table khoangthu (
	stt INT primary key,

	maPhieu NVARCHAR(20) foreign key references phieuBanHang(maPhieu),
	mathuoc nvarchar(30),
	tenthuoc nvarchar(30),
	soluong INT,

	giaNhap float,
	giaBan float,
	khoangthu FLOAT,
);
create table dangnhap (
	taikhoan NVARCHAR (20) primary key,
	matkhau NVARCHAR (20),
);
	Insert dangnhap values ('sa','12345678')

	INSERT NHOMTHUOC VALUES ('NT1', 'NHOMTHUOC1')
	INSERT NHOMTHUOC VALUES ('NT2', 'NHOMTHUOC2')
	INSERT NHOMTHUOC VALUES ('NT3', 'NHOMTHUOC3')

	INSERT DonViTinh VALUES ('Cái', '')
	INSERT DonViTinh VALUES ('Vi', '')
	INSERT DonViTinh VALUES ('Lon', '')
	INSERT DonViTinh VALUES ('Kg', '')
	INSERT DonViTinh VALUES ('Viên', '')

CREATE TABLE NhanVien(
   maNV  NVARCHAR (30) primary key,
   ho NVARCHAR (50)  NULL,
   ten NVARCHAR (50)  NULL,
   tuoi int NULL,
   phai bit  NULL,
   tienLuong float,
);
