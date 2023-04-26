/*package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Dao.BanThuoc_DAO;
import Dao.DonViTinh_DAO;
import Dao.NhaCungCap_DAO;
import Dao.NhapThuoc_DAO;
import Dao.NhomThuoc_DAO;
import Dao.Thuoc_DAO;
import Dao.dangnhap_dao;
import Dao.khoangChi_dao;
import connect.ConnectDB;
import Dao.NhanVien_DAO;
import entity.BanHang;
import entity.DonViTinh;
import entity.NhaCungCap;
import entity.NhanVien;
import entity.NhapHang;
import entity.NhomThuoc;
import entity.Thuoc;
import entity.dangnhap;


public class QuanLiThuoc extends JFrame implements ActionListener, MouseListener {
		private JTabbedPane tabbedPanetong;
		private JPanel panelhethong;
		private JPanel hethong;
		private JTabbedPane tabbedPane;
		private DefaultTableModel modelthuoc;
		private JTable tablethuoc;
		private JLabel lblmathuoc;
		private JTextField txtmathuoc;
		private JLabel lbltenthuoc;
		private JTextField txttenthuoc;
		private JTextField txtDVQD;
		private JLabel lblgianhap;
		private JTextField txtgianhap;
		private JTextField txtgiaban;
		private JLabel lbldonvitinh;
		private JComboBox<String> cbodonvitinh;
		private JComboBox<String> cboNhomThuoc;
		private JTextField txttimthuoc;
		private JButton btttimthuoc;
		private JButton bttthemthuoc;
		private JButton bttxoatrangthuoc;
		private JButton bttxoathuoc;
		private JButton bttluuthuoc;
		private Component lblDvt;
		private JTextField txtgianban;
		private JTextField txtnhomthuoc;
		private JLabel lblnhomthuoc;
		private JLabel lblMoTa;
		private JTextField txtMoTa;
		private JTable tablenhomthuoc;
		private DefaultTableModel modelnhomthuoc;
		private JTextField txttimnhomthuoc;
		private JButton bttimnhomthuoc;
		private JButton bttluunhomthuoc;
		private JButton bttxoanhomthuoc;
		private JButton bttxoatrangnhomthuoc;
		private JButton bttthemnhomthuoc;
		private DefaultTableModel modelkhoangthu;
		private JTable tablekhoangthu;
		private JButton btntraitraikhoangthu;
		private JButton btntraikhoangthu;
		private JButton btnphaiphaikhoangthu;
		private JButton btnphaikhoangthu;
		private JLabel lblkhoangthu;
		private JLabel lbltitletongkhoangthu;
		private Component lbltitletongkhoangchi;
		private JButton btnphaikhoangchi;
		private JButton btnphaiphaikhoangchi;
		private JButton btntraikhoangchi;
		private JButton btntraitraikhoangchi;
		private JTable tablekhoangchi;
		private DefaultTableModel modelkhoangchi;
		private Component lblkhoangchi;
		private JPanel content;
		private JLabel title;
		private JTextField maPhieutf;
		private JComboBox tentf;
		private JTextField soLuongtf;
		private JTextField nhomtf;
		private DefaultTableModel model;
		private JTable table;
		private JTextField timtf;
		private JButton btnxoa;
		private JButton btnthem;
		private JButton btnxoatrang;
		private JButton btnluu;
		private JTextField tiencktf;
		private JTextField tienthuetf;
		private JTextField chietkhauhdtf;
		private JTextField vanchuyentf;
		private JTextField tongtientf;
		private JPanel contentnhaphang;
		private JTextField maCCtf;
		private JComboBox tenCC;
		private JComboBox tenThuoctf;
		private JTextField maThuocCCtf;
		private JTextField maThuoctf;
		private JTextField tenCCtf;
		private JComboBox combotenthuoccuabanthuoc;
		private JButton bttsuathuoc;
		private JLabel lblTenThuocdvt;
		private JLabel lblmathuocdvt;
		private JLabel lblSLdvt;
		private JTextField txtMaThuocdvt;
		private JTextField txtTenThuocdvt;
		private JTextField txtSLdvt;
		private JComboBox<String> cbxTim1dvt;
		private ComboBoxModel<String> cbxMode1;
		private DefaultComboBoxModel<String> cbxMode1dvt;
		private JButton btnXoadvt;
		private JButton btnXoaRongdvt;
		private JButton btnSuadvt;
		private JButton btnLuudvt;
		private JLabel lblTimdvt;
		private DefaultComboBoxModel<String> cbxModedvt;
		private ComboBoxModel<String> cbxMode;
		private Component cbxTimdvt;
		private JScrollPane jscrdvt;
		private JTable tListdvt;
		private DefaultTableModel tModedvt;
		private JButton btnThemdvt;
		private JLabel lbldvt;
		private JLabel lblmotadvt;
		private JTextField txtdvt;
		private JTextField txtmotadvt;
		private JLabel lblmaThuocncc;
		private JLabel lblMancc;
		private JLabel lblTenncc;
		private JLabel lblSDTncc;
		private JLabel lblDCncc;
		private JLabel lblTKncc;
		private JLabel lblFaxncc;
		private JTextField txtmaThuocncc;
		private JTextField txtMancc;
		private JTextField txtTenncc;
		private JTextField txtSDTncc;
		private JTextField txtDCncc;
		private JTextField txtTKncc;
		private JTextField txtFaxncc;
		private JButton btnXoancc;
		private JButton btnThemncc;
		private JButton btnXoaRongncc;
		private JButton btnSuancc;
		private JButton btnLuuncc;
		private JLabel lblTimncc;
		private DefaultComboBoxModel<String> cbxModencc;
		private JComboBox<String> cbxTimncc;
		private DefaultTableModel tModencc;
		private JTable tListncc;
		private JScrollPane jscrncc;
		private Thuoc_DAO thuoc_dao;
		private ConnectDB connect;
		private DonViTinh_DAO donViTinh_dao;
		private NhomThuoc_DAO nt_dao;
		private ArrayList<Thuoc> listthuoc;
		private ArrayList<NhomThuoc> listnhomthuoc;
		private NhomThuoc_DAO donvitinh_dao;
		private ArrayList<DonViTinh> listdonvitinh;
		private NhaCungCap_DAO ncc_dao;
		private JTable tablebh;
		private DefaultTableModel modelbh;
		private JButton btnxoabh;
		private JButton btnthembh;
		private JButton btnxoatrangbh;
		private BanThuoc_DAO bt_dao;
		private JTextField maPhieutfbh;
		private JTextField maThuoctfbh;
		private JTextField soLuongtfbh;
		private JComboBox combomathuoccuabanthuoc;
		private JComboBox combonhaccchonhaphang;
		private JComboBox combomanhaccchonhaphang;
		private JComboBox combotennhaccchonhaphang;
		private JComboBox tenThuoccombochonhaphang;
		private JComboBox maThuoccombochonhaphang;
		private NhapThuoc_DAO nhaphang_dao;
		private khoangChi_dao khoangChi_dao;
		private JTextField labletongkhoangthu;
		private double tongcackhoangthu;
		private Box khoangthu4;
		private double tongcackhoangchi;
		private JTextField labletongkhoangchi;
		private DecimalFormat df;
		private JTextField tienhangtf;
		private double tongthanhtoanbanhang;
		private double tongtienhang;
		private double tienthuebanhang;
		private double tienvanchuyenbanhang;
		private JTextField tienhangtfnhaphang;
		private double tongtienhangnhaphang;
		private JTextField tftaikhoan;
		private JTextField tfmatkhau;
		private JButton btndangnhap;
		private JLabel lbldangnhap;
		private int xacnhan = 0;
		private ImageIcon iconnhacungcap;
		private ImageIcon iconthongke;
		private ImageIcon iconbanhang;
		private ImageIcon iconnhaphang;
		private ImageIcon condonvitinh;
		private ImageIcon iconnhomthuoc;
		private ImageIcon iconthuoc;
		private ImageIcon iconhethong;
		private JPanel thuoc;
		private JPanel nhomthuoc;
		private JPanel donvitinh;
		private JPanel nhaphang;
		private JPanel banhang;
		private JPanel khoangthu;
		private JPanel khoangchi;
		private JPanel nhacungcap;
		private ImageIcon icondonvitinh;
		private Object taikhoan;
		private Object matkhau;
		private dangnhap_dao Dangnhap_dao;
		private dangnhap dangnhap;
		private entity.dangnhap Dangnhap;
		private JButton btnluunhaphang;
		private JButton btnluubanhang;
		private JPanel nhanvien;
		private ImageIcon iconnhanvien;
		private DefaultTableModel modelnv;
		private JTable tablenv;
		private JLabel lblmanv;
		private JTextField txtmanv;
		private JLabel lbltennv;
		private JTextField txttennv;
		private JLabel lblhonv;
		private JTextField txthonv;
		private JLabel lblTuoi;
		private JLabel lblPhai;
		private JLabel lblTienLuong;
		NhanVien_DAO nv_dao = new NhanVien_DAO();
		private AbstractButton btttimnv;
		private AbstractButton bttthemnv;
		private AbstractButton bttxoanv;
		private AbstractButton bttsuanv;
		private AbstractButton bttxoatrangnv;
		private JTextField txtTuoi;
		private JCheckBox chkNu;
		private JTextField txtTienLuong;
		private JTextField txttimnv;
		private JButton bttluunv;

		public QuanLiThuoc() throws SQLException {
			super("Quản Lí Thuốc");
			setSize(1920, 1080);
			setLocationRelativeTo(null);
			iconhethong = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/image/iconhethong.png")));
			iconthuoc = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/image/thuoc.png")));
			iconnhomthuoc = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/image/nhomthuoc.png")));
			icondonvitinh = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/image/donvitinh.png")));
			iconnhaphang = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/image/nhaphang.png")));
			iconbanhang = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/image/banhang.png")));
			iconthongke = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/image/thongke.png")));
			iconnhacungcap = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/image/nhacungcap.png")));
			iconnhanvien = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/image/icons8-man-64.png")));
			Font font = new Font("Time New Roman", Font.BOLD, 20);
			tabbedPane = new JTabbedPane();
			tabbedPane.setFont(font);
			tabbedPane.setPreferredSize(new Dimension(1530, 778));
			Panel trangchu = new Panel();
			trangchu.add(tabbedPane);
			trangchu.setBackground(new Color(255, 161, 161));
			add(trangchu);
			// khoi tao cac trang
			hethong = new JPanel();
			hethong.setBackground(new Color(255, 240, 255));
			tabbedPane.addTab("Hệ Thống", iconhethong, hethong);
			thuoc = new JPanel();
			nhomthuoc = new JPanel();
			donvitinh = new JPanel();
			nhaphang = new JPanel();
			banhang = new JPanel();
			khoangthu = new JPanel();
			khoangchi = new JPanel();
			nhacungcap = new JPanel();
			nhanvien = new JPanel();
			thuoc.setBackground(new Color(255, 240, 255));
			nhomthuoc.setBackground(new Color(255, 240, 255));
			donvitinh.setBackground(new Color(255, 240, 255));
			nhaphang.setBackground(new Color(255, 240, 255));
			banhang.setBackground(new Color(255, 240, 255));
			khoangthu.setBackground(new Color(255, 240, 255));
			khoangchi.setBackground(new Color(255, 240, 255));
			nhacungcap.setBackground(new Color(255, 240, 255));
			nhanvien.setBackground(new Color(255, 240, 255));

			UIManager.put("TabbedPane.background", new Color(255, 213, 158));
			UIManager.put("JTabbedPane.Font", new Font("Dialog", Font.ITALIC, 20));
			SwingUtilities.updateComponentTreeUI(tabbedPane);
			tabbedPane.setTabPlacement(JTabbedPane.LEFT);

			// DAO
			try {
				ConnectDB.getInstance().connect();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			thuoc_dao = new Thuoc_DAO();
			donViTinh_dao = new DonViTinh_DAO();
			nt_dao = new NhomThuoc_DAO();
			ncc_dao = new NhaCungCap_DAO();
			bt_dao = new BanThuoc_DAO();
			nhaphang_dao = new NhapThuoc_DAO();
			khoangChi_dao = new khoangChi_dao();
			Dangnhap_dao = new dangnhap_dao();
			Dangnhap = Dangnhap_dao.gettkmk();

			// _DAO_

			// Giao diện hệ thống
			Box tonghethong, hethong1, hethong2, hethong3, hethong4, hethong5, hethong6;
			tonghethong = Box.createVerticalBox();
			hethong1 = Box.createHorizontalBox();
			hethong2 = Box.createHorizontalBox();
			hethong3 = Box.createHorizontalBox();
			hethong4 = Box.createHorizontalBox();
			hethong5 = Box.createHorizontalBox();
			hethong6 = Box.createHorizontalBox();
			hethong.add(tonghethong);
			tonghethong.add(Box.createRigidArea(new Dimension(1, 40)));
			tonghethong.add(hethong1);
			tonghethong.add(Box.createRigidArea(new Dimension(1, 40)));
			tonghethong.add(hethong2);
			tonghethong.add(Box.createRigidArea(new Dimension(1, 10)));
			tonghethong.add(hethong3);
			tonghethong.add(Box.createRigidArea(new Dimension(1, 20)));
			tonghethong.add(hethong4);
			tonghethong.add(Box.createRigidArea(new Dimension(1, 100)));
			tonghethong.add(hethong5);
			tonghethong.add(Box.createRigidArea(new Dimension(1, 20)));
			tonghethong.add(hethong6);
			hethong1.add(lbldangnhap = new JLabel("Đăng Nhập Bằng TK MK của CSDL"));
			lbldangnhap.setFont(new Font("Arial", Font.BOLD, 30));
			hethong2.add(new JLabel("Tài Khoản : "));
			hethong2.add(tftaikhoan = new JTextField());
			tftaikhoan.setText(Dangnhap.getTaikhoan());
			hethong3.add(new JLabel("Mật Khẩu  : "));
			hethong3.add(tfmatkhau = new JTextField());
			tfmatkhau.setText(Dangnhap.getMatkhau());
			hethong4.add(btndangnhap = new JButton("Đăng Nhập"));
			btndangnhap.addActionListener(this);
			hethong5.add(Box.createRigidArea(new Dimension(48, 1)));
			hethong5.add(new JButton(new ImageIcon("hinh/them.png")));
			hethong5.add(new JLabel("     : NÚT CHỨC NĂNG THÊM"));
			hethong5.add(Box.createRigidArea(new Dimension(100, 1)));
			hethong5.add(new JButton(new ImageIcon("hinh/xoa.png")));
			hethong5.add(new JLabel("     : NÚT CHỨC NĂNG XÓA"));
			hethong5.add(Box.createRigidArea(new Dimension(100, 1)));
			hethong5.add(new JButton(new ImageIcon("hinh/xoatrang.png")));
			hethong5.add(new JLabel("     : NÚT CHỨC NĂNG XÓA TRẮNG"));

			hethong6.add(new JButton(new ImageIcon("hinh/sua.jpg")));
			hethong6.add(new JLabel("     : NÚT CHỨC NĂNG SỬA"));
			hethong6.add(Box.createRigidArea(new Dimension(100, 1)));
			hethong6.add(new JButton(new ImageIcon("hinh/luu.png")));
			hethong6.add(new JLabel("     : NÚT CHỨC NĂNG LƯU"));
			hethong6.add(Box.createRigidArea(new Dimension(100, 1)));
			hethong6.add(new JButton(new ImageIcon("hinh/tim.png")));
			hethong6.add(new JLabel("     : NÚT CHỨC NĂNG TÌM"));
			// Giao Diện Thuốc
			JLabel lblTieuDe;
			lblTieuDe = new JLabel("THÔNG TIN THUỐC");
			lblTieuDe.setFont(new Font("Arial", Font.BOLD, 30));
			lblTieuDe.setForeground(Color.blue);

			Box bthuoc = Box.createVerticalBox();
			Box tongthuoc = Box.createVerticalBox();
			Box b11thuoc, b1thuoc, b2thuoc, b3thuoc, b4thuoc;

			tongthuoc.add(Box.createRigidArea(new Dimension(30, 20)));
			bthuoc.add(b11thuoc = Box.createHorizontalBox());
			b11thuoc.add(lblTieuDe);
			bthuoc.add(Box.createRigidArea(new Dimension(10, 10)));
			bthuoc.add(b1thuoc = Box.createHorizontalBox());
			bthuoc.add(Box.createVerticalStrut(10));
			b1thuoc.add(lblmathuoc = new JLabel("Mã thuốc"));
			b1thuoc.add(txtmathuoc = new JTextField(120));

			bthuoc.add(b2thuoc = Box.createHorizontalBox());
			bthuoc.add(Box.createVerticalStrut(10));
			b2thuoc.add(lbltenthuoc = new JLabel("Tên Thuốc"));
			b2thuoc.add(txttenthuoc = new JTextField());
			b2thuoc.add(Box.createRigidArea(new Dimension(30, 10)));
			b2thuoc.add(new JLabel("Đơn vị quy đổi: "));
			b2thuoc.add(txtDVQD = new JTextField());

			bthuoc.add(b3thuoc = Box.createHorizontalBox());
			bthuoc.add(Box.createVerticalStrut(10));
			b3thuoc.add(lblgianhap = new JLabel("Giá nhập: "));
			b3thuoc.add(txtgianhap = new JTextField());
			b3thuoc.add(Box.createRigidArea(new Dimension(30, 10)));
			b3thuoc.add(new JLabel("Giá bán: "));
			b3thuoc.add(txtgiaban = new JTextField());

			bthuoc.add(b4thuoc = Box.createHorizontalBox());
			bthuoc.add(Box.createVerticalStrut(10));
			b4thuoc.add(lblDvt = new JLabel("Đơn vị tính: "));
			b4thuoc.add(cbodonvitinh = new JComboBox<String>());
			cbodonvitinh.addItem("Chưa Có Đơn Vị Tính");
			b4thuoc.add(Box.createRigidArea(new Dimension(30, 10)));
			cbodonvitinh.setEditable(true);
			ArrayList<DonViTinh> listDVT = donViTinh_dao.getAllDSDonViTinh();
			for (DonViTinh dvt : listDVT) {
				cbodonvitinh.addItem(dvt.getDonViTinh());
			}

			b4thuoc.add(new JLabel("Nhóm thuốc: "));

			b4thuoc.add(cboNhomThuoc = new JComboBox<String>());
			cboNhomThuoc.addItem("Chưa Có Nhóm Thuốc");
			cboNhomThuoc.setEditable(true);
			ArrayList<NhomThuoc> listNT = nt_dao.getAllDSNhomThuoc();
			for (NhomThuoc nt : listNT) {
				cboNhomThuoc.addItem(nt.getNhomThuoc());
			}

			// lblMa.setPreferredSize(lblDvt.getPreferredSize());
			// lblTen.setPreferredSize(lblDvt.getPreferredSize());
			// lblGiaN.setPreferredSize(lblDvt.getPreferredSize());

			bthuoc.add(Box.createVerticalStrut(10));
			tongthuoc.add(bthuoc);

			tongthuoc.add(Box.createRigidArea(new Dimension(30, 20)));
			String[] colHeader = { "Mã thuốc", "Tên thuốc", "Đơn vị quy đổi", "Gía nhập", "Gía bán", "Đơn vị tính",
					"Nhóm thuốc" };
			modelthuoc = new DefaultTableModel(colHeader, 0);
			tablethuoc = new JTable(modelthuoc);
			tongthuoc.add(new JScrollPane(tablethuoc));
			tongthuoc.add(Box.createRigidArea(new Dimension(30, 20)));
			// =================================
			// doc du lieu tu database SQL vao Jtable
			docDuLieuVaoTableThuoc();

			// =================================

			JPanel p = new JPanel();
			tongthuoc.add(p);
			JPanel pnlLeft, pnlRight;
			p.add(pnlLeft = new JPanel());
			p.add(pnlRight = new JPanel());
			pnlLeft.add(new JLabel("Nhập Mã Cần Tìm : "));
			pnlLeft.add(txttimthuoc = new JTextField(10));
			pnlLeft.add(btttimthuoc = new JButton(new ImageIcon("hinh/tim.png")));
			pnlRight.add(bttthemthuoc = new JButton(new ImageIcon("hinh/them.png")));
			pnlRight.add(bttxoatrangthuoc = new JButton(new ImageIcon("hinh/xoatrang.png")));
			pnlRight.add(bttxoathuoc = new JButton(new ImageIcon("hinh/xoa.png")));
			pnlRight.add(bttsuathuoc = new JButton(new ImageIcon("hinh/sua.jpg")));
			thuoc.add(tongthuoc);
			btttimthuoc.addActionListener(this);
			bttthemthuoc.addActionListener(this);
			bttxoathuoc.addActionListener(this);
			bttsuathuoc.addActionListener(this);
			bttxoatrangthuoc.addActionListener(this);
			tablethuoc.addMouseListener(this);
			// _Giao Diện Thuốc_

			// Giao Diện Nhóm Thuốc
			JLabel lblTieuDenhomthuoc;
			lblTieuDenhomthuoc = new JLabel("THÔNG TIN NHÓM THUỐC");
			lblTieuDenhomthuoc.setFont(new Font("Arial", Font.BOLD, 30));
			lblTieuDenhomthuoc.setForeground(Color.blue);

			Box bnhomthuoc = Box.createVerticalBox();
			Box tongnhomthuoc = Box.createVerticalBox();
			Box b11nhomthuoc, b1nhomthuoc, b2nhomthuoc;

			tongnhomthuoc.add(Box.createRigidArea(new Dimension(30, 20)));
			bnhomthuoc.add(b11nhomthuoc = Box.createHorizontalBox());
			b11nhomthuoc.add(lblTieuDenhomthuoc);
			bnhomthuoc.add(Box.createRigidArea(new Dimension(30, 15)));
			bnhomthuoc.add(b1nhomthuoc = Box.createHorizontalBox());
			bnhomthuoc.add(Box.createVerticalStrut(10));
			b1nhomthuoc.add(lblnhomthuoc = new JLabel("Nhóm thuốc"));
			b1nhomthuoc.add(txtnhomthuoc = new JTextField(120));

			bnhomthuoc.add(b2nhomthuoc = Box.createHorizontalBox());
			bnhomthuoc.add(Box.createVerticalStrut(10));
			b2nhomthuoc.add(lblMoTa = new JLabel("Mô tả"));
			b2nhomthuoc.add(txtMoTa = new JTextField());

			lblMoTa.setPreferredSize(lblnhomthuoc.getPreferredSize());
			bnhomthuoc.add(Box.createVerticalStrut(10));
			tongnhomthuoc.add(bnhomthuoc);

			tongnhomthuoc.add(Box.createRigidArea(new Dimension(30, 20)));
			String[] mangnhomthuoc = { "Nhóm thuốc", "Mô tả" };
			modelnhomthuoc = new DefaultTableModel(mangnhomthuoc, 0);
			tablenhomthuoc = new JTable(modelnhomthuoc);
			tongnhomthuoc.add(new JScrollPane(tablenhomthuoc));
			docDuLieuVaoTableNhomThuoc();
			// =================================
			// doc du lieu tu database SQL vao Jtable
			// docDuLieuVaoTable();

			// =================================

			JPanel pnhomthuoc = new JPanel();
			tongnhomthuoc.add(pnhomthuoc);
			JPanel pnlLeftnhomthuoc, pnlRightnhomthuoc;
			pnhomthuoc.add(pnlLeftnhomthuoc = new JPanel());
			pnhomthuoc.add(pnlRightnhomthuoc = new JPanel());
			pnlRightnhomthuoc.add(bttthemnhomthuoc = new JButton(new ImageIcon("hinh/them.png")));
			pnlRightnhomthuoc.add(bttxoatrangnhomthuoc = new JButton(new ImageIcon("hinh/xoatrang.png")));
			pnlRightnhomthuoc.add(bttxoanhomthuoc = new JButton(new ImageIcon("hinh/xoa.png")));
			nhomthuoc.add(tongnhomthuoc);
			bttthemnhomthuoc.addActionListener(this);
			bttxoanhomthuoc.addActionListener(this);
			bttxoatrangnhomthuoc.addActionListener(this);
			tablenhomthuoc.addMouseListener(this);
			// _Giao DIện Nhóm Thuốc_

			// Khởi tạo trang Bán hàng
			JPanel contentbh = new JPanel();

			banhang.add(contentbh);
			title = new JLabel("Thông tin bán hàng");
			contentbh.add(title);
			Font x = new Font("Arial", Font.BOLD, 30);
			title.setFont(x);

			Box a, b, c, d, e, f, g, h, i, k, l, m;
			a = Box.createVerticalBox();
			b = Box.createHorizontalBox();
			c = Box.createHorizontalBox();
			d = Box.createHorizontalBox();
			e = Box.createHorizontalBox();
			f = Box.createHorizontalBox();
			g = Box.createHorizontalBox();
			h = Box.createHorizontalBox();
			i = Box.createHorizontalBox();
			k = Box.createHorizontalBox();
			l = Box.createHorizontalBox();
			m = Box.createHorizontalBox();
			contentbh.add(a);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.setFont(x);
			a.add(b);
			b.add(title);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.add(c);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.add(d);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.add(e);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.add(f);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.add(g);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.add(h);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.add(i);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.add(k);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.add(l);
			a.add(Box.createRigidArea(new Dimension(1, 15)));
			a.add(m);

			c.add(Box.createRigidArea(new Dimension(10, 1)));
			c.add(new JLabel("Mã Phiếu: "));
			c.add(maPhieutfbh = new JTextField(30));
			c.add(Box.createRigidArea(new Dimension(10, 1)));
			c.add(new JLabel("Mã Thuốc: "));
			combomathuoccuabanthuoc = new JComboBox();
			combomathuoccuabanthuoc.addItem("Chưa Có Mã Thuốc");
			c.add(combomathuoccuabanthuoc);
			c.add(Box.createRigidArea(new Dimension(10, 1)));
			d.add(Box.createRigidArea(new Dimension(10, 1)));
			d.add(new JLabel("Tên Thuốc: "));
			combotenthuoccuabanthuoc = new JComboBox();
			combotenthuoccuabanthuoc.addItem("Chưa Có Tên Thuốc");
			ArrayList<Thuoc> dscbMaThuoc = thuoc_dao.getAllDSThuoc();
			for (Thuoc cbma : dscbMaThuoc) {
				combotenthuoccuabanthuoc.addItem(cbma.getTenThuoc());
				combomathuoccuabanthuoc.addItem(cbma.getMaThuoc());
			}
			d.add(combotenthuoccuabanthuoc);
			d.add(Box.createRigidArea(new Dimension(400, 1)));
			d.add(new JLabel("Số Lượng: "));
			d.add(soLuongtfbh = new JTextField(50));
			d.add(Box.createRigidArea(new Dimension(10, 1)));
			String mangbh[] = { "Mã Phiếu", "Mã Thuốc", "Tên Thuốc", "Đơn Giá", "Số Lượng", "Thành Tiền" };
			modelbh = new DefaultTableModel(mangbh, 0);
			tablebh = new JTable(modelbh);
			JScrollPane panebh = new JScrollPane(tablebh);
			f.add(panebh);
			g.add(Box.createRigidArea(new Dimension(200, 1)));
			g.add(btnxoabh = new JButton(new ImageIcon("hinh/xoa.png")));
			g.add(Box.createRigidArea(new Dimension(10, 1)));
			g.add(btnthembh = new JButton(new ImageIcon("hinh/them.png")));
			g.add(Box.createRigidArea(new Dimension(10, 1)));
			g.add(btnxoatrangbh = new JButton(new ImageIcon("hinh/xoatrang.png")));
			g.add(Box.createRigidArea(new Dimension(10, 1)));
			g.add(btnluubanhang = new JButton(new ImageIcon("hinh/luu.png")));
			g.add(Box.createRigidArea(new Dimension(100, 1)));
			g.add(new JLabel("Tổng tiền hàng :            "));
			g.add(tienhangtf = new JTextField(20));
			tienhangtf.setEditable(false);
			tongtienhang = 0;
			tienhangtf.setText(tongtienhang + "");

			btnthembh.addActionListener(this);
			btnxoabh.addActionListener(this);
			btnxoatrangbh.addActionListener(this);
			tablebh.addMouseListener(this);
			btnluubanhang.addActionListener(this);
			// docDuLieuVaoTableBanHang();
			// Khởi tạo trang nhập hàng
			contentnhaphang = new JPanel();

			nhaphang.add(contentnhaphang);
			title = new JLabel("Thông tin nhập hàng");
			contentnhaphang.add(title);
			Font y = new Font("Arial", Font.BOLD, 30);
			title.setFont(y);

			Box n, z, t, o, v, q, w, r, p1, s, u, cuoi;
			n = Box.createVerticalBox();
			z = Box.createHorizontalBox();
			t = Box.createHorizontalBox();
			o = Box.createHorizontalBox();
			v = Box.createHorizontalBox();
			q = Box.createHorizontalBox();
			w = Box.createHorizontalBox();
			r = Box.createHorizontalBox();
			p1 = Box.createHorizontalBox();
			s = Box.createHorizontalBox();
			u = Box.createHorizontalBox();
			cuoi = Box.createHorizontalBox();
			contentnhaphang.add(n);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.setFont(y);
			n.add(z);
			z.add(title);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.add(t);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.add(o);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.add(v);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.add(q);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.add(w);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.add(r);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.add(p1);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.add(s);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.add(u);
			n.add(Box.createRigidArea(new Dimension(1, 15)));
			n.add(cuoi);

			t.add(Box.createRigidArea(new Dimension(10, 1)));
			t.add(new JLabel("Mã Phiếu: "));
			t.add(maPhieutf = new JTextField(30));
			t.add(Box.createRigidArea(new Dimension(10, 10)));
			t.add(new JLabel("Mã nhà cung cấp: "));
			combomanhaccchonhaphang = new JComboBox();
			combomanhaccchonhaphang.addItem("Chưa Có Mã Nhà Cung Cấp");
			t.add(combomanhaccchonhaphang);
			t.add(Box.createRigidArea(new Dimension(10, 1)));
			o.add(Box.createRigidArea(new Dimension(10, 1)));
			o.add(new JLabel("Tên nhà cung cấp: "));
			combotennhaccchonhaphang = new JComboBox();
			combotennhaccchonhaphang.addItem("Chưa Có Tên Nhà Cung Cấp");
			o.add(combotennhaccchonhaphang);
			o.add(Box.createRigidArea(new Dimension(20, 1)));
			o.add(new JLabel("Số Lượng: "));
			o.add(soLuongtf = new JTextField(70));
			o.add(Box.createRigidArea(new Dimension(10, 1)));
			v.add(Box.createRigidArea(new Dimension(10, 1)));
			v.add(new JLabel("Mã Thuốc: "));
			v.add(maThuoccombochonhaphang = new JComboBox());
			maThuoccombochonhaphang.addItem("Chưa có mã thuốc");
			v.add(Box.createRigidArea(new Dimension(10, 1)));
			v.add(new JLabel("Tên thuốc: "));
			v.add(tenThuoccombochonhaphang = new JComboBox());
			tenThuoccombochonhaphang.addItem("Chưa có tên thuốc");

			ArrayList<Thuoc> dsnhaphangthuoc = thuoc_dao.getAllDSThuoc();
			for (Thuoc nhangthuoc : dsnhaphangthuoc) {
				maThuoccombochonhaphang.addItem(nhangthuoc.getMaThuoc());
				tenThuoccombochonhaphang.addItem(nhangthuoc.getTenThuoc());
			}
			ArrayList<NhaCungCap> dsnhaphangncc = ncc_dao.getAllDSNhaCungCap();
			for (NhaCungCap nhangncc : dsnhaphangncc) {
				combomanhaccchonhaphang.addItem(nhangncc.getMaNhaCungCap());
				combotennhaccchonhaphang.addItem(nhangncc.getTenNhaCungCap());
			}
			v.add(Box.createRigidArea(new Dimension(10, 1)));
			String bang[] = { "Mã Phiếu", "Mã Thuốc", "Tên Thuốc", "Mã Nhà Cung Cấp", "Tên Nhà Cung Cấp", "Số Lượng" };
			model = new DefaultTableModel(bang, 0);
			table = new JTable(model);
			JScrollPane control = new JScrollPane(table);
			q.add(control);
			w.add(Box.createRigidArea(new Dimension(200, 1)));
			w.add(btnxoa = new JButton(new ImageIcon("hinh/xoa.png")));
			w.add(Box.createRigidArea(new Dimension(10, 1)));
			w.add(btnthem = new JButton(new ImageIcon("hinh/them.png")));
			w.add(Box.createRigidArea(new Dimension(10, 1)));
			w.add(btnxoatrang = new JButton(new ImageIcon("hinh/xoatrang.png")));
			w.add(Box.createRigidArea(new Dimension(10, 1)));
			w.add(btnluunhaphang = new JButton(new ImageIcon("hinh/luu.png")));
			w.add(Box.createRigidArea(new Dimension(200, 1)));
			w.add(new JLabel("Tổng tiền hàng :"));
			w.add(tienhangtfnhaphang = new JTextField(20));

			tienhangtfnhaphang.setEditable(false);
			tongtienhangnhaphang = 0;
			tienhangtfnhaphang.setText(tongtienhangnhaphang + "");
			btnthem.addActionListener(this);
			btnxoatrang.addActionListener(this);
			btnxoa.addActionListener(this);
			btnluunhaphang.addActionListener(this);
			// Đơn Vị Tính
			Box tongdvt1;
			tongdvt1 = Box.createVerticalBox();
			lbldvt = new JLabel("Đơn Vị Tính:");
			lblmotadvt = new JLabel("Mô Tả:");

			txtdvt = new JTextField(50);
			txtmotadvt = new JTextField(50);

			btnThemdvt = new JButton(new ImageIcon("hinh/them.png"));
			btnXoadvt = new JButton(new ImageIcon("hinh/xoa.png"));
			btnXoaRongdvt = new JButton(new ImageIcon("hinh/xoatrang.png"));
			btnSuadvt = new JButton(new ImageIcon("hinh/sua.jpg"));
			btnLuudvt = new JButton(new ImageIcon("hinh/luu.png"));

			String[] col = { "Đơn vị tính", "Mô Tả" };
			tModedvt = new DefaultTableModel(col, 0);
			tListdvt = new JTable(tModedvt);
			jscrdvt = new JScrollPane(tListdvt);
			jscrdvt.setBorder(BorderFactory.createTitledBorder("Danh Sách Đơn Vị Tính"));
			docDuLieuVaoTableDonViTinh();

			Box b1 = Box.createHorizontalBox();
			b1.add(lbldvt);
			b1.add(txtdvt);
			b1.add(Box.createRigidArea(new Dimension(30, 10)));
			b1.add(lblmotadvt);
			b1.add(Box.createRigidArea(new Dimension(0, 10)));
			b1.add(txtmotadvt);
			b1.add(Box.createRigidArea(new Dimension(0, 10)));

			JPanel pBottom = new JPanel();
			pBottom.add(btnThemdvt);
			pBottom.add(btnXoaRongdvt);
			pBottom.add(btnSuadvt);
			pBottom.add(btnXoadvt);

			Box bTop = Box.createVerticalBox();
			bTop.setBorder(BorderFactory.createTitledBorder("Records Editor"));
			bTop.add(b1);

			Box bN = Box.createVerticalBox();
			bN.add(bTop);
			bN.add(pBottom);
			tongdvt1.add(Box.createRigidArea(new Dimension(30, 50)));
			tongdvt1.add(bN, BorderLayout.NORTH);
			tongdvt1.add(Box.createRigidArea(new Dimension(30, 20)));
			tongdvt1.add(jscrdvt);
			donvitinh.add(tongdvt1);
			btnThemdvt.addActionListener(this);
			btnXoaRongdvt.addActionListener(this);
			btnXoadvt.addActionListener(this);
			btnSuadvt.addActionListener(this);
			tListdvt.addMouseListener(this);
			// _ Đơn Vị Tính_

			// Nhà Cung Cấp
			lblmaThuocncc = new JLabel("Mã Thuốc:");
			lblMancc = new JLabel("Mã NCC:");
			lblTenncc = new JLabel("Tên NCC:");
			lblSDTncc = new JLabel("SDT:");
			lblDCncc = new JLabel("Địa chỉ:");
			lblTKncc = new JLabel("Số TK:");
			lblFaxncc = new JLabel("Fax:");

			txtmaThuocncc = new JTextField();
			txtMancc = new JTextField(50);
			txtTenncc = new JTextField(50);
			txtSDTncc = new JTextField();
			txtDCncc = new JTextField();
			txtTKncc = new JTextField();
			txtFaxncc = new JTextField();

			btnThemncc = new JButton(new ImageIcon("hinh/them.png"));
			btnXoancc = new JButton(new ImageIcon("hinh/xoa.png"));
			btnXoaRongncc = new JButton(new ImageIcon("hinh/xoatrang.png"));
			btnSuancc = new JButton(new ImageIcon("hinh/sua.jpg"));
			btnLuuncc = new JButton(new ImageIcon("hinh/luu.png"));

			String[] colncc = { "Mã NCC", "Tên NCC", "SDT", "Địa chỉ", "Số TK", "Fax" };
			tModencc = new DefaultTableModel(colncc, 0);
			tListncc = new JTable(tModencc);
			jscrncc = new JScrollPane(tListncc);
			jscrncc.setBorder(BorderFactory.createTitledBorder("Danh sách nhà cung cấp"));

			Box b2ncc = Box.createHorizontalBox();
			b2ncc.add(lblMancc);
			b2ncc.add(txtMancc);
			b2ncc.add(Box.createRigidArea(new Dimension(26, 10)));
			b2ncc.add(lblTenncc);
			b2ncc.add(Box.createRigidArea(new Dimension(21, 10)));
			b2ncc.add(txtTenncc);
			b2ncc.add(Box.createRigidArea(new Dimension(21, 10)));

			Box b3ncc = Box.createHorizontalBox();
			b3ncc.add(Box.createRigidArea(new Dimension(21, 10)));
			b3ncc.add(lblSDTncc);
			b3ncc.add(Box.createRigidArea(new Dimension(1, 10)));
			b3ncc.add(txtSDTncc);
			b3ncc.add(Box.createRigidArea(new Dimension(40, 10)));
			b3ncc.add(lblDCncc);
			b3ncc.add(Box.createRigidArea(new Dimension(21, 10)));
			b3ncc.add(txtDCncc);
			b3ncc.add(Box.createRigidArea(new Dimension(21, 10)));

			Box b4ncc = Box.createHorizontalBox();
			b4ncc.add(Box.createRigidArea(new Dimension(10, 10)));
			b4ncc.add(lblTKncc);
			b4ncc.add(Box.createRigidArea(new Dimension(1, 10)));
			b4ncc.add(txtTKncc);
			b4ncc.add(Box.createRigidArea(new Dimension(60, 10)));
			b4ncc.add(lblFaxncc);
			b4ncc.add(Box.createRigidArea(new Dimension(20, 10)));
			b4ncc.add(txtFaxncc);
			b4ncc.add(Box.createRigidArea(new Dimension(20, 10)));

			JPanel pBottomncc = new JPanel();
			pBottomncc.add(btnThemncc);
			pBottomncc.add(btnXoaRongncc);
			pBottomncc.add(btnSuancc);
			pBottomncc.add(btnXoancc);
			pBottomncc.add(Box.createRigidArea(new Dimension(25, 10)));

			Box bTopncc = Box.createVerticalBox();
			bTopncc.setBorder(BorderFactory.createTitledBorder("Records Editor"));
			bTopncc.add(b2ncc);
			bTopncc.add(Box.createRigidArea(new Dimension(25, 10)));
			bTopncc.add(b3ncc);
			bTopncc.add(Box.createRigidArea(new Dimension(25, 10)));
			bTopncc.add(b4ncc);

			Box bNncc = Box.createVerticalBox();
			bNncc.add(Box.createRigidArea(new Dimension(1, 50)));
			bNncc.add(bTopncc);
			bNncc.add(Box.createRigidArea(new Dimension(1, 20)));
			bNncc.add(pBottomncc);
			Box tongncc = Box.createVerticalBox();
			tongncc.add(bNncc, BorderLayout.NORTH);
			tongncc.add(jscrncc);
			nhacungcap.add(tongncc);
			docDuLieuVaoTableNhaCungCap();
			tListncc.addMouseListener(this);
			btnThemncc.addActionListener(this);
			btnSuancc.addActionListener(this);
			btnXoancc.addActionListener(this);
			btnXoaRongncc.addActionListener(this);
			// _Nhà Cung Cấp_
			String formatPattern = "###,###.###";
			df = new DecimalFormat(formatPattern);
			// Giao Diện Khoảng Thu
			Box tongkhoangthu, khoangthu1, khoangthu2, khoangthu3;
			tongkhoangthu = Box.createVerticalBox();
			khoangthu1 = Box.createHorizontalBox();
			khoangthu2 = Box.createHorizontalBox();
			khoangthu3 = Box.createHorizontalBox();
			khoangthu4 = Box.createHorizontalBox();
			khoangthu.add(tongkhoangthu);
			tongkhoangthu.add(Box.createRigidArea(new Dimension(1, 40)));
			tongkhoangthu.add(khoangthu1);
			tongkhoangthu.add(Box.createRigidArea(new Dimension(1, 20)));
			tongkhoangthu.add(khoangthu2);
			tongkhoangthu.add(Box.createRigidArea(new Dimension(1, 20)));
			tongkhoangthu.add(khoangthu4);
			tongkhoangthu.add(Box.createRigidArea(new Dimension(1, 20)));
			tongkhoangthu.add(khoangthu3);
			khoangthu1.add(Box.createRigidArea(new Dimension(450, 1)));
			khoangthu1.add(lblkhoangthu = new JLabel("Thông Tin Khoảng Thu"));
			khoangthu1.add(Box.createRigidArea(new Dimension(450, 1)));
			lblkhoangthu.setFont(new Font("Arial", Font.BOLD, 30));
			lblkhoangthu.setForeground(Color.blue);
			String[] mangkhoangthu = { "STT", "Mã Phiếu", "Mã Thuốc", "Tên Thuốc", "Giá Nhập", "Giá Bán Lẻ", "Số Lượng",
					"Khoảng Thu" };
			modelkhoangthu = new DefaultTableModel(mangkhoangthu, 0);
			tablekhoangthu = new JTable(modelkhoangthu);
			JScrollPane panekhoangthu = new JScrollPane(tablekhoangthu);
			khoangthu2.add(panekhoangthu);
			khoangthu4.add(lbltitletongkhoangthu = new JLabel("Tổng Các Khoảng Thu : "));

			docDuLieuVaoTablekhoangthu();
			tongcackhoangthu = 0;
			int n1 = tablekhoangthu.getRowCount();
			if (n1 != 0) {
				for (int i1 = 0; i1 < n1; i1++) {
					double zz = (double) tablekhoangthu.getValueAt(i1, 7);
					tongcackhoangthu = tongcackhoangthu + zz;
				}
			}
			labletongkhoangthu = new JTextField(df.format(tongcackhoangthu) + " VND");
			labletongkhoangthu.setFont(new Font("Arial", Font.BOLD, 25));
			lbltitletongkhoangthu.setFont(new Font("Arial", Font.BOLD, 25));
			khoangthu4.add(labletongkhoangthu);
			// _Giao Diện Khoảng Thu_

			// Giao Diện Khoảng Chi
			Box tongkhoangchi, khoangchi1, khoangchi2, khoangchi3, khoangchi4;
			tongkhoangchi = Box.createVerticalBox();
			khoangchi1 = Box.createHorizontalBox();
			khoangchi2 = Box.createHorizontalBox();
			khoangchi3 = Box.createHorizontalBox();
			khoangchi4 = Box.createHorizontalBox();
			khoangchi.add(tongkhoangchi);
			tongkhoangchi.add(Box.createRigidArea(new Dimension(1, 40)));
			tongkhoangchi.add(khoangchi1);
			tongkhoangchi.add(Box.createRigidArea(new Dimension(1, 20)));
			tongkhoangchi.add(khoangchi2);
			tongkhoangchi.add(Box.createRigidArea(new Dimension(1, 20)));
			tongkhoangchi.add(khoangchi4);
			tongkhoangchi.add(Box.createRigidArea(new Dimension(1, 20)));
			tongkhoangchi.add(khoangchi3);
			khoangchi1.add(Box.createRigidArea(new Dimension(450, 1)));
			khoangchi1.add(lblkhoangchi = new JLabel("Thông Tin Khoảng Chi"));
			khoangchi1.add(Box.createRigidArea(new Dimension(450, 1)));
			lblkhoangchi.setFont(new Font("Arial", Font.BOLD, 30));
			lblkhoangchi.setForeground(Color.blue);
			String[] mangkhoangchi = { "STT", "Mã Phiếu", "Mã Thuốc", "Tên Thuốc", "Mã Nhà Cung Cấp", "Tên Nhà Cung Cấp",
					"Giá Nhập", "Số Lượng", "Khoảng Chi" };
			modelkhoangchi = new DefaultTableModel(mangkhoangchi, 0);
			tablekhoangchi = new JTable(modelkhoangchi);
			JScrollPane panekhoangchi = new JScrollPane(tablekhoangchi);

			khoangchi2.add(panekhoangchi);
			khoangchi4.add(lbltitletongkhoangchi = new JLabel("Tổng Các Khoảng Chi : "));
			docDuLieuVaoTablekhoangchi();
			tongcackhoangchi = 0;
			int n2 = tablekhoangchi.getRowCount();
			if (n2 != 0) {
				for (int i2 = 0; i2 < n2; i2++) {
					double zz = (double) tablekhoangchi.getValueAt(i2, 8);
					tongcackhoangchi = tongcackhoangchi + zz;
				}
			}
			labletongkhoangchi = new JTextField(df.format(tongcackhoangchi) + " VND");
			labletongkhoangchi.setFont(new Font("Arial", Font.BOLD, 25));
			lbltitletongkhoangchi.setFont(new Font("Arial", Font.BOLD, 25));
			khoangchi4.add(labletongkhoangchi);
//	        				giao diện nhân viên
			JLabel lblTieuDeNV;
			lblTieuDeNV = new JLabel("THÔNG TIN NHÂN VIÊN");
			lblTieuDeNV.setFont(new Font("Arial", Font.BOLD, 30));
			lblTieuDeNV.setForeground(Color.blue);

			Box btNV = Box.createVerticalBox();
			Box tongNV = Box.createVerticalBox();
			Box b11nv, b1nv, b2nv, b3nv, b4nv, b5nv;

			tongNV.add(Box.createRigidArea(new Dimension(30, 20)));
			btNV.add(b11nv = Box.createHorizontalBox());
			b11nv.add(lblTieuDeNV);
			btNV.add(Box.createRigidArea(new Dimension(10, 10)));
			btNV.add(b1nv = Box.createHorizontalBox());
			btNV.add(Box.createVerticalStrut(10));
			b1nv.add(lblmanv = new JLabel("Mã nhân viên  "));
			b1nv.add(txtmanv = new JTextField(100));

			btNV.add(b2nv = Box.createHorizontalBox());
			btNV.add(Box.createVerticalStrut(10));
			b2nv.add(lblhonv = new JLabel("Họ nhân viên "));
			b2nv.add(txthonv = new JTextField());
			b2nv.add(Box.createRigidArea(new Dimension(30, 10)));
			b2nv.add(new JLabel("Tên nhân viên: "));
			b2nv.add(txttennv = new JTextField());

			btNV.add(b3nv = Box.createHorizontalBox());
			btNV.add(Box.createVerticalStrut(10));
			b3nv.add(lblTuoi = new JLabel("Tuổi: "));
			b3nv.add(txtTuoi = new JTextField());
			b3nv.add(lblPhai = new JLabel("Phái: "));
			b3nv.add(chkNu = new JCheckBox("Nữ"));

			btNV.add(b4nv = Box.createHorizontalBox());
			btNV.add(Box.createVerticalStrut(10));
			b4nv.add(lblTienLuong = new JLabel("Tiền lương: "));
			b4nv.add(txtTienLuong = new JTextField());

			btNV.add(Box.createVerticalStrut(10));
			tongNV.add(btNV);

			tongNV.add(Box.createRigidArea(new Dimension(30, 20)));
			String[] themnv = { "Mã NV", "Họ NV", "Tên NV", "Tuổi", "Phái", "Lương" };
			modelnv = new DefaultTableModel(themnv, 0);
			tablenv = new JTable(modelnv);
			tongNV.add(new JScrollPane(tablenv), BorderLayout.CENTER);
			tongNV.add(Box.createRigidArea(new Dimension(30, 20)));
			// =================================
			// doc du lieu tu database SQL vao Jtable
			DocDLTuDB();

			// =================================

			JPanel pnv = new JPanel();
			tongNV.add(pnv);
			JPanel pnlLeftnv, pnlRightnv;
			pnv.add(pnlLeftnv = new JPanel());
			pnv.add(pnlRightnv = new JPanel());
			pnlLeftnv.add(new JLabel("Nhập Mã Cần Tìm : "));
			pnlLeftnv.add(txttimnv = new JTextField(10));
			pnlLeftnv.add(btttimnv = new JButton(new ImageIcon("hinh/tim.png")));
			pnlRightnv.add(bttthemnv = new JButton(new ImageIcon("hinh/them.png")));
			pnlRightnv.add(bttxoatrangnv = new JButton(new ImageIcon("hinh/xoatrang.png")));
			pnlRightnv.add(bttxoanv = new JButton(new ImageIcon("hinh/xoa.png")));
			pnlRightnv.add(bttsuanv = new JButton(new ImageIcon("hinh/sua.jpg")));
			pnlRightnv.add(bttluunv = new JButton(new ImageIcon("hinh/luu.png")));
			nhanvien.add(tongNV);
			btttimnv.addActionListener(this);
			bttthemnv.addActionListener(this);
			bttxoanv.addActionListener(this);
			bttsuanv.addActionListener(this);
			bttluunv.addActionListener(this);
			bttxoatrangnv.addActionListener(this);
			tablenv.addMouseListener(this);

			txtmanv.setEditable(false);
			txthonv.setEditable(false);
			txttennv.setEditable(false);
			txtTuoi.setEditable(false);
			txtTienLuong.setEditable(false);
		}

		public static void main(String[] args) throws SQLException {
			new JFrame_Quan_Li_Thuoc().setVisible(true);
		}

		private void DocDLTuDB() {
			ArrayList<NhanVien> list = nv_dao.getAllNhanVien();
			for (NhanVien nv : list) {
				String phai = "Nữ";
				if (nv.isPhai())
					phai = "Nam";
				Object[] row = { nv.getMaNV(), nv.getHoNV(), nv.getTenNV(), nv.getTuoi(), phai, nv.getLuong() };
				modelnv.addRow(row);
			}
		}
		
		public void mouseClicked(MouseEvent e) {
			Object obj = e.getSource();
			if (obj.equals(tablethuoc)) {
				int row = tablethuoc.getSelectedRow();
				txtmathuoc.setText(modelthuoc.getValueAt(row, 0).toString());
				txttenthuoc.setText(modelthuoc.getValueAt(row, 1).toString());
				txtDVQD.setText(modelthuoc.getValueAt(row, 2).toString());
				txtgianhap.setText(modelthuoc.getValueAt(row, 3).toString());
				txtgiaban.setText(modelthuoc.getValueAt(row, 4).toString());
				cbodonvitinh.setSelectedItem(modelthuoc.getValueAt(row, 5).toString());
				cboNhomThuoc.setSelectedItem(modelthuoc.getValueAt(row, 6).toString());
			}
			if (obj.equals(tListncc)) {
				int rownhacungcap = tListncc.getSelectedRow();
				txtMancc.setText(tListncc.getValueAt(rownhacungcap, 0).toString());
				txtTenncc.setText(tListncc.getValueAt(rownhacungcap, 1).toString());
				txtSDTncc.setText(tListncc.getValueAt(rownhacungcap, 2).toString());
				txtDCncc.setText(tListncc.getValueAt(rownhacungcap, 3).toString());
				txtTKncc.setText(tListncc.getValueAt(rownhacungcap, 4).toString());
				txtFaxncc.setText(tListncc.getValueAt(rownhacungcap, 5).toString());
			}
			if (obj.equals(tablenhomthuoc)) {
				int rownhomthuoc = tablenhomthuoc.getSelectedRow();
				txtnhomthuoc.setText(tablenhomthuoc.getValueAt(rownhomthuoc, 0).toString());
				txtMoTa.setText(tablenhomthuoc.getValueAt(rownhomthuoc, 1).toString());
			}
			if (obj.equals(tListdvt)) {
				int rowdvt = tListdvt.getSelectedRow();
				txtdvt.setText(tListdvt.getValueAt(rowdvt, 0).toString());
				txtmotadvt.setText(tListdvt.getValueAt(rowdvt, 1).toString());
			}
			if (obj.equals(tablenv)) {
				int rownv = tablenv.getSelectedRow();
				txtmanv.setText(modelnv.getValueAt(rownv, 0).toString());
				txthonv.setText(modelnv.getValueAt(rownv, 1).toString());
				txttennv.setText(modelnv.getValueAt(rownv, 2).toString());
				txtTuoi.setText(modelnv.getValueAt(rownv, 3).toString());
				chkNu.setSelected(modelnv.getValueAt(rownv, 4).toString() == "Nữ" ? true : false);
				txtTienLuong.setText(modelnv.getValueAt(rownv, 5).toString());
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		private void Xoahetdulieutrentablemodelbanhang() {
			DefaultTableModel dm = (DefaultTableModel) tablebh.getModel();
			dm.getDataVector().removeAllElements();
		}

		private void Xoahetdulieutrentablemodelnhaphang() {
			DefaultTableModel dm = (DefaultTableModel) table.getModel();
			dm.getDataVector().removeAllElements();
		}

		private void xoaRongTextFielsNV() {
			txthonv.setText("");
			txtmanv.setText("");
			txttennv.setText("");
			txtTuoi.setText("");
			txtTienLuong.setText("");
			chkNu.setSelected(false);
			txtmanv.requestFocus();
		}
		
		private void updataTable() {
			modelnv.setRowCount(0);
			for (NhanVien nv : nv_dao.getAllNhanVien()) {
				String p = "Nam";
				if (nv.isPhai())
					p = "Nữ";
				Object row[] = { nv.getMaNV(), nv.getHoNV(), nv.getTenNV(), nv.getTuoi(), p, nv.getLuong() };
				modelnv.addRow(row);
			}
		}

		private boolean validData() {
			String ma = txtmanv.getText().trim();
			String ho = txthonv.getText().trim();
			String ten = txttennv.getText().trim();
			String tuoi = txtTuoi.getText().trim();
			String tienLuong = txtTienLuong.getText().trim();
			if (!(ma.length() > 0 && ma.matches("\\d{8}"))) {
				JOptionPane.showMessageDialog(this, "Mã gồm 8 số");
				txtmanv.requestFocus();
				return false;
			}
			if (!(ho.length() > 0 && ho.matches("[A-z ]+"))) {
				JOptionPane.showMessageDialog(null, "Error: Họ sai mẫu");
				txthonv.requestFocus();
				return false;
			}
			if (!(ten.length() > 0 && ten.matches("[A-z ]+"))) {
				JOptionPane.showMessageDialog(null, "Error: Tên sai mẫu");
				txttennv.requestFocus();
				return false;
			}
			if (tuoi.length() > 0) {
				try {
					int x = Integer.parseInt(tuoi);
					if (x < 18 || x > 60) {
						JOptionPane.showMessageDialog(null, "Error: Tuổi phải từ 18 đến 60");
						txtTuoi.requestFocus();
						return false;
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Tuổi phải là số nguyên dương");
					txtTuoi.requestFocus();
					return false;
				}
			}
			if (tienLuong.length() > 0) {
				try {
					double y = Double.parseDouble(tienLuong);
					if (y < 0) {
						JOptionPane.showMessageDialog(null, "Error: Tiền Lương phải là số nguyên dương");
						txtTienLuong.requestFocus();
						return false;
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Tiền Lương phải là số nguyên dương");
					txtTienLuong.requestFocus();
					return false;
				}
			}
			return true;
		}
		public void suaNV() {
			int ma = Integer.parseInt(txtmanv.getText());
			String ho = txthonv.getText();
			String ten = txttennv.getText();
			int tuoi = Integer.parseInt(txtTuoi.getText());
			boolean phai = chkNu.isSelected();
			double luong = Double.parseDouble(txtTienLuong.getText());
			NhanVien nv = new NhanVien(ma, ho, ten, tuoi, phai, luong);
			nv_dao.updateNV(nv);
			updataTable();
			JOptionPane.showMessageDialog(null, "Sữa thành công!");
		}
		private int edit;
		@Override
		public void actionPerformed(ActionEvent e) {
			Object o = e.getSource();
//			--------------------------------------------------------------------------------- 
			if (o.equals(bttluunv)) {
				if(edit == 1 ) {
					if (validData()) {
						int ma = Integer.parseInt(txtmanv.getText());
						String ho = txthonv.getText();
						String ten = txttennv.getText();
						int tuoi = Integer.parseInt(txtTuoi.getText());
						boolean phai = chkNu.isSelected();
						double luong = Double.parseDouble(txtTienLuong.getText());
						NhanVien tim = nv_dao.getNhanVienTheoMa(ma);
						if (tim == null) {
							NhanVien nv = new NhanVien(ma, ho, ten, tuoi, phai, luong);
							nv_dao.createNV(nv);
							updataTable();
							JOptionPane.showMessageDialog(null, "Thêm thành công!");
						} else {
							JOptionPane.showMessageDialog(null, "Trùng mã nhân viên!");
						}

					} else {
						JOptionPane.showMessageDialog(null, "Error: Rỗng");
					}
				}else if( edit == 2 ) {
					suaNV();
				}

			}
			if (o.equals(bttxoanv)) {
				if (tablenv.getSelectedRow() != -1) {
					if (JOptionPane.showConfirmDialog(this, "Ban co muon xoa", "Canh Bao",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						int r = tablenv.getSelectedRow();
						modelnv.removeRow(r); // xóa trong table model
						nv_dao.deleteNV(Integer.parseInt(txtmanv.getText()));
						updataTable();
					}
				} else {
					JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên cần xóa");
				}
			}
			if (o.equals(bttxoatrangnv)) {
				xoaRongTextFielsNV();
			}
			if (o.equals(bttthemnv)) {
				txtmanv.setEditable(true);
				txthonv.setEditable(true);
				txttennv.setEditable(true);
				txtTuoi.setEditable(true);
				txtTienLuong.setEditable(true); 
				xoaRongTextFielsNV();
				edit = 1;
			}
			if (o.equals(btttimnv)) {
				int ma = Integer.parseInt(txttimnv.getText());
				if (txttimnv.getText().equals(""))
					JOptionPane.showMessageDialog(this, "Chưa nhập mã nhân viên cần tìm");
				else {
					try {
						NhanVien nv = nv_dao.getNhanVienTheoMa(ma);
						Object[] rowData = { nv.getMaNV(), nv.getHoNV(), nv.getTenNV(), nv.getTuoi(),
								nv.isPhai() ? "Nữ" : "Nam", nv.getLuong() };
						modelnv.setRowCount(0);
						modelnv.addRow(rowData);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(this, "Không có nhân viên này");
						DocDLTuDB();
					}

				}
			}
			if (o.equals(bttsuanv)) {
				if (tablenv.getSelectedRow() != -1) {
					txtmanv.setEditable(false);
					txthonv.setEditable(true);
					txttennv.setEditable(true);
					txtTuoi.setEditable(true);
					txtTienLuong.setEditable(true);
					edit = 2;
				} else {
					JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên cần cập nhật");
				}

			}

//			----------------------------------------------------------------------------------------------
			if (o.equals(btnluubanhang)) {
				int sbh = tablebh.getRowCount() - 1;
				while (sbh != 0) {
					modelbh.removeRow(sbh);
					sbh--;
				}
				modelbh.removeRow(0);
				tongtienhang = 0;
				tienhangtf.setText(tongtienhang + "");
				JOptionPane.showMessageDialog(this, "Lưu vào Khoảng Thu Thành Công");
			}
			if (o.equals(btnluunhaphang)) {
				int snh = table.getRowCount() - 1;
				while (snh != 0) {
					model.removeRow(snh);
					snh--;
				}
				model.removeRow(0);
				tongtienhangnhaphang = 0;
				tienhangtfnhaphang.setText(tongtienhangnhaphang + "");
				JOptionPane.showMessageDialog(this, "Lưu vào Khoảng Chi Thành Công");
			}
			if (o.equals(btndangnhap)) {
				if (btndangnhap.getText().equals("Đăng Nhập")) {
					if (tftaikhoan.getText().equals(Dangnhap.getTaikhoan())
							&& tfmatkhau.getText().equals(Dangnhap.getMatkhau())) {
						tabbedPane.addTab("Thuốc", iconthuoc, thuoc);
						tabbedPane.addTab("Nhóm Thuốc", iconnhomthuoc, nhomthuoc);
						tabbedPane.addTab("Đơn Vị Tính", icondonvitinh, donvitinh);
						tabbedPane.addTab("Nhà Cung Cấp", iconnhacungcap, nhacungcap);
						tabbedPane.addTab("Nhập Hàng", iconnhaphang, nhaphang);
						tabbedPane.addTab("Bán Hàng", iconbanhang, banhang);
						tabbedPane.addTab("Khoảng Thu", iconthongke, khoangthu);
						tabbedPane.addTab("Khoảng Chi", iconthongke, khoangchi);
						tabbedPane.addTab("Nhân viên", iconnhanvien, nhanvien);
						tfmatkhau.setText("Nhập Mật Khẩu Cần Đổi");
						lbldangnhap.setText("Đổi Mật Khẩu (Nếu Cần Sử Dụng)");
						btndangnhap.setText("Đổi Mật Khẩu");
						tftaikhoan.setEditable(false);
					}
				} else {
					if (Dangnhap_dao.doimatkhau(Dangnhap.getTaikhoan(), tfmatkhau.getText())) {
						JOptionPane.showMessageDialog(this, "Đổi Mật Khẩu Thành Công");
					} else {
						JOptionPane.showMessageDialog(this, "Đổi mất khẩu thất bại");
					}
				}
			}
			if (o.equals(bttthemthuoc)) {
				String ma = txtmathuoc.getText();
				String ten = txttenthuoc.getText();
				String dvqd = txtDVQD.getText();
				float giaN = Float.parseFloat(txtgianhap.getText());
				float giaB = Float.parseFloat(txtgiaban.getText());
				String donvitinh = cbodonvitinh.getSelectedItem().toString();
				DonViTinh dvt = new DonViTinh(donvitinh);
				String nhomThuoc = cboNhomThuoc.getSelectedItem().toString();
				NhomThuoc nt = new NhomThuoc(nhomThuoc);
				Thuoc t = new Thuoc(ma, ten, dvqd, giaN, giaB, dvt, nt);
				if (validDatathuoc()) {
					if (thuoc_dao.create(t)) {
						modelthuoc.addRow(new Object[] { txtmathuoc.getText(), txttenthuoc.getText(), txtDVQD.getText(),
								txtgianhap.getText(), txtgiaban.getText(), donvitinh, nhomThuoc });
						combomathuoccuabanthuoc.addItem(txtmathuoc.getText());
						combotenthuoccuabanthuoc.addItem(txttenthuoc.getText());
						maThuoccombochonhaphang.addItem(txtmathuoc.getText());
						tenThuoccombochonhaphang.addItem(txttenthuoc.getText());
					}
				}
			}
			if (o.equals(bttxoathuoc)) {
				int r = tablethuoc.getSelectedRow();
				String ma = tablethuoc.getValueAt(r, 0).toString();
				int hoiNhac = JOptionPane.showConfirmDialog(this, "Bạn chắc muốn xóa không", "chú ý",
						JOptionPane.YES_NO_OPTION);
				Thuoc t = new Thuoc(ma);
				if (hoiNhac == JOptionPane.YES_OPTION) {
					if (thuoc_dao.xoa(ma)) {
						combomathuoccuabanthuoc.removeItem(ma);
						combotenthuoccuabanthuoc.removeItem(tablethuoc.getValueAt(r, 1).toString());
						maThuoccombochonhaphang.removeItem(ma);
						tenThuoccombochonhaphang.removeItem(tablethuoc.getValueAt(r, 1).toString());
					} else {
						JOptionPane.showMessageDialog(this,
								"Không Thể Xóa Vì Danh Sách Bán Hàng Hoặc Danh Sách Nhập Hàng Đang Phụ Thuộc Vào Mã và Tên Thuốc Này");
					}
				}
			}
			if (o.equals(bttxoatrangthuoc)) {
				txtmathuoc.setText("");
				txttenthuoc.setText("");
				txtDVQD.setText("");
				txtgianhap.setText("");
				txtgiaban.setText("");
				txtmathuoc.requestFocus();
			}
			if (o.equals(btttimthuoc)) {
				ArrayList<Thuoc> list1 = thuoc_dao.getThuocTheoMaThuoc(txttimthuoc.getText());

				if (txttimthuoc.getText().equals("") && txttimthuoc.getText().length() == 0) {
					modelthuoc.getDataVector().removeAllElements();
					;
					docDuLieuVaoTableThuoc();
				} else {
					modelthuoc.getDataVector().removeAllElements();
					for (Thuoc t : list1) {
						modelthuoc
								.addRow(new Object[] { t.getMaThuoc(), t.getTenThuoc(), t.getDonViQuyDoi(), t.getGiaNhap(),
										t.getGiaBan(), t.getDonViTinh().getDonViTinh(), t.getNhomThuoc().getNhomThuoc() });
					}
				}
				tablethuoc.setModel(modelthuoc);
			}
			if (o.equals(bttsuathuoc)) {
				int row = tablethuoc.getSelectedRow();
				modelthuoc.removeRow(row);
				String ma = txtmathuoc.getText();
				String ten = txttenthuoc.getText();
				String dvqd = txtDVQD.getText();
				float giaN = Float.parseFloat(txtgianhap.getText());
				float giaB = Float.parseFloat(txtgiaban.getText());

				String donvitinh = cbodonvitinh.getSelectedItem().toString();
				DonViTinh dvt = new DonViTinh(donvitinh);

				String nhomThuoc = cboNhomThuoc.getSelectedItem().toString();
				NhomThuoc nt = new NhomThuoc(nhomThuoc);

				Thuoc t = new Thuoc(ma, ten, dvqd, giaN, giaB, dvt, nt);
				try {

					thuoc_dao.update(t);
					modelthuoc.addRow(new Object[] { t.getMaThuoc(), t.getTenThuoc(), t.getDonViQuyDoi(), t.getGiaNhap(),
							t.getGiaBan(), t.getDonViTinh().getDonViTinh(), t.getNhomThuoc().getNhomThuoc() });

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(this, "trung");
				}
			}
			if (o.equals(bttthemnhomthuoc)) {
				String nhomT = txtnhomthuoc.getText();
				String mota = txtMoTa.getText();
				NhomThuoc nt = new NhomThuoc(nhomT, mota);
				nt_dao.create(nt);
				modelnhomthuoc.addRow(new Object[] { nt.getNhomThuoc(), nt.getMoTa() });
			}
			if (o.equals(bttxoanhomthuoc)) {
				int r = tablenhomthuoc.getSelectedRow();
				String ma = tablenhomthuoc.getValueAt(r, 0).toString();
				int hoiNhac = JOptionPane.showConfirmDialog(this, "Bạn chắc muốn xóa không", "chú ý",
						JOptionPane.YES_NO_OPTION);
				NhomThuoc nt = new NhomThuoc(ma);
				if (hoiNhac == JOptionPane.YES_OPTION) {
					if (nt_dao.xoa(nt)) {
						modelnhomthuoc.removeRow(r);
					} else {
						System.out.println("KO");
					}
				}
			}
			if (o.equals(bttxoatrangnhomthuoc)) {
				txtnhomthuoc.setText("");
				txtMoTa.setText("");
				txttimnhomthuoc.setText("");
				txtnhomthuoc.requestFocus();
			}
			if (o.equals(btnThemdvt)) {
				DonViTinh x = new DonViTinh(txtdvt.getText(), txtmotadvt.getText());
				if (donViTinh_dao.create(x)) {
					tModedvt.addRow(new Object[] { x.getDonViTinh(), x.getMoTa() });
				}

			}
			if (o.equals(btnXoadvt)) {
				int row = tListdvt.getSelectedRow();
				String dvt = tListdvt.getValueAt(row, 0).toString();
				String mota = tListdvt.getValueAt(row, 1).toString();
				DonViTinh x = new DonViTinh(dvt, mota);
				if (donViTinh_dao.xoa(x)) {
					tModedvt.removeRow(row);
				}
			}
			if (o.equals(btnSuadvt)) {
				int row = tListdvt.getSelectedRow();
				DonViTinh x = new DonViTinh(txtdvt.getText(), txtmotadvt.getText());
				String a = tListdvt.getValueAt(row, 0).toString();
				int hoiNhac = JOptionPane.showConfirmDialog(this, "Bạn chắc muốn sửa không", "chú ý",
						JOptionPane.YES_NO_OPTION);
				if (hoiNhac == JOptionPane.YES_OPTION) {
					if (donViTinh_dao.update(x, a)) {
						tModedvt.removeRow(row);
						tModedvt.addRow(new Object[] { x.getDonViTinh(), x.getMoTa() });
					}

				}
			}
			if (o.equals(btnXoaRongdvt)) {
				txtdvt.setText("");
				txtmotadvt.setText("");
				txtdvt.requestFocus();
			}
			if (o.equals(btnThemncc)) {
				NhaCungCap x = new NhaCungCap(txtMancc.getText(), txtTenncc.getText(), txtSDTncc.getText(),
						txtDCncc.getText(), txtTKncc.getText(), txtFaxncc.getText());
				if (validDatanhacungcap()) {
					if (ncc_dao.createNCC(x)) {
						tModencc.addRow(new Object[] { txtMancc.getText(), txtTenncc.getText(), txtSDTncc.getText(),
								txtDCncc.getText(), txtTKncc.getText(), txtFaxncc.getText() });
						combomanhaccchonhaphang.addItem(txtMancc.getText());
						combotennhaccchonhaphang.addItem(txtTenncc.getText());
					}
				}

			}
			if (o.equals(btnXoaRongncc)) {
				txtMancc.setText("");
				txtTenncc.setText("");
				txtSDTncc.setText("");
				txtDCncc.setText("");
				txtTKncc.setText("");
				txtFaxncc.setText("");
				txtMancc.requestFocus();
			}
			if (o.equals(btnSuancc)) {
				int row = tListncc.getSelectedRow();
				NhaCungCap x = new NhaCungCap(txtMancc.getText(), txtTenncc.getText(), txtSDTncc.getText(),
						txtDCncc.getText(), txtTKncc.getText(), txtFaxncc.getText());
				int hoiNhac = JOptionPane.showConfirmDialog(this, "Bạn chắc muốn sửa không", "chú ý",
						JOptionPane.YES_NO_OPTION);
				if (hoiNhac == JOptionPane.YES_OPTION) {
					if (ncc_dao.updateNCC(x)) {
						tModencc.removeRow(row);
						tModencc.addRow(new Object[] { txtMancc.getText(), txtTenncc.getText(), txtSDTncc.getText(),
								txtDCncc.getText(), txtTKncc.getText(), txtFaxncc.getText() });
					}

				}
			}
			if (o.equals(btnXoancc)) {
				int row = tListncc.getSelectedRow();
				NhaCungCap x = new NhaCungCap(txtMancc.getText(), txtTenncc.getText(), txtSDTncc.getText(),
						txtDCncc.getText(), txtTKncc.getText(), txtFaxncc.getText());
				int hoiNhac = JOptionPane.showConfirmDialog(this, "Bạn chắc muốn xóa không", "chú ý",
						JOptionPane.YES_NO_OPTION);
				if (hoiNhac == JOptionPane.YES_OPTION) {
					if (ncc_dao.xoaNCC(x)) {
						tModencc.removeRow(row);
						combomanhaccchonhaphang.removeItem(txtMancc.getText());
						combotennhaccchonhaphang.removeItem(txtTenncc.getText());
					} else
						JOptionPane.showMessageDialog(this,
								"Không Thể Xóa Vì Danh Sách Nhập Hàng Đang Phụ Thuộc Vào Mã và Tên Nhà Cung Cấp Này");
				}
			}

			if (o.equals(btnthembh)) {
				float gianhap = 0, giaban = 0;
				int a;
				if (tablekhoangthu.getRowCount() == 0) {
					a = tablekhoangthu.getRowCount() + 1;
				} else {
					a = tablekhoangthu.getRowCount();
				}
				combomathuoccuabanthuoc.setSelectedIndex(combotenthuoccuabanthuoc.getSelectedIndex());
				Thuoc y = new Thuoc(combomathuoccuabanthuoc.getSelectedItem().toString(),
						combotenthuoccuabanthuoc.getSelectedItem().toString());
				BanHang x = new BanHang(maPhieutfbh.getText(), y, Integer.parseInt(soLuongtfbh.getText()));
				double tongcong = 0;
				if (validDatabanhang()) {
					if (bt_dao.create(x)) {
						for (Thuoc k : thuoc_dao.getAllDSThuoc()) {
							if (k.getMaThuoc().equals(y.getMaThuoc())) {
								gianhap = k.getGiaNhap();
								giaban = k.getGiaBan();
							}
						}
						double thanhtien1 = 0;
						double giaban1 = 0;
						for (Thuoc k : thuoc_dao.getAllDSThuoc()) {
							if (k.getMaThuoc().equals(x.getThuoc().getMaThuoc())) {
								giaban1 = k.getGiaBan();
								thanhtien1 = k.getGiaBan() * x.getSoLuong();
							}
						}
						modelbh.addRow(new Object[] { maPhieutfbh.getText(), x.getThuoc().getMaThuoc(),
								x.getThuoc().getTenThuoc(), giaban1, x.getSoLuong(), thanhtien1 + "" });
						// modelbh.addRow(new Object[]
						// {maPhieutfbh.getText(),combomathuoccuabanthuoc.getSelectedItem(),combotenthuoccuabanthuoc.getSelectedItem(),soLuongtfbh.getText()});
						tongcong = giaban * x.getSoLuong();
						modelkhoangthu.addRow(new Object[] { a + 1, maPhieutfbh.getText(),
								combomathuoccuabanthuoc.getSelectedItem(), combotenthuoccuabanthuoc.getSelectedItem(),
								gianhap + "", giaban + "", x.getSoLuong() + "", tongcong + "" });
						tongtienhang = tongtienhang + thanhtien1;
						tienhangtf.setText(tongtienhang + "");
					}
					tongcackhoangthu = tongcackhoangthu + tongcong;
					labletongkhoangthu.setText(df.format(tongcackhoangthu) + " VND");
				}
			}

			if (o.equals(btnxoatrangbh)) {
				maPhieutfbh.setText("");
				combomathuoccuabanthuoc.setSelectedIndex(0);
				combotenthuoccuabanthuoc.setSelectedIndex(0);
				soLuongtfbh.setText("");
			}
			if (o.equals(btnxoabh)) {
				int row = tablebh.getSelectedRow();
				Thuoc y = new Thuoc(tablebh.getValueAt(row, 1).toString().toString(),
						tablebh.getValueAt(row, 2).toString());
				BanHang x = new BanHang(tablebh.getValueAt(row, 0).toString(), y,
						Integer.parseInt(tablebh.getValueAt(row, 4).toString()));
				int hoiNhac = JOptionPane.showConfirmDialog(this, "Bạn chắc muốn xóa không", "chú ý",
						JOptionPane.YES_NO_OPTION);
				if (hoiNhac == JOptionPane.YES_OPTION) {
					if (bt_dao.xoa(x)) {
						modelbh.removeRow(row);
						modelkhoangthu.removeRow(modelkhoangthu.getRowCount() - modelbh.getRowCount() - 1);
					}
				}
				double thanhtien1 = 0;
				double giaban1 = 0;
				for (Thuoc k : thuoc_dao.getAllDSThuoc()) {
					if (k.getMaThuoc().equals(y.getMaThuoc())) {
						giaban1 = k.getGiaBan();
						thanhtien1 = k.getGiaBan() * x.getSoLuong();
					}
				}
				tongcackhoangthu = tongcackhoangthu - thanhtien1;
				labletongkhoangthu.setText(df.format(tongcackhoangthu) + " VND");
			}
			if (o.equals(btnthem)) {
				float gianhap = 0, giaban = 0;
				int a;
				if (tablekhoangchi.getRowCount() == 0) {
					a = tablekhoangchi.getRowCount();
				} else {
					a = tablekhoangchi.getRowCount();
				}
				maThuoccombochonhaphang.setSelectedIndex(tenThuoccombochonhaphang.getSelectedIndex());
				combomanhaccchonhaphang.setSelectedIndex(combotennhaccchonhaphang.getSelectedIndex());
				Thuoc y = new Thuoc(maThuoccombochonhaphang.getSelectedItem() + "",
						tenThuoccombochonhaphang.getSelectedItem() + "");
				NhaCungCap z = new NhaCungCap(combomanhaccchonhaphang.getSelectedItem() + "",
						combotennhaccchonhaphang.getSelectedItem() + "");
				NhapHang x = new NhapHang(maPhieutf.getText(), z, y, Integer.parseInt(soLuongtf.getText()));
				double tongcong = 0;
				if (validDataNhapHang()) {
					if (nhaphang_dao.create(x)) {
						for (Thuoc k : thuoc_dao.getAllDSThuoc()) {
							if (k.getMaThuoc().equals(y.getMaThuoc())) {
								gianhap = k.getGiaNhap();
								giaban = k.getGiaBan();
							}
						}
						model.addRow(new Object[] { maPhieutf.getText(), combomanhaccchonhaphang.getSelectedItem() + "",
								combotennhaccchonhaphang.getSelectedItem() + "",
								maThuoccombochonhaphang.getSelectedItem() + "",
								tenThuoccombochonhaphang.getSelectedItem() + "", soLuongtf.getText() });
						tongcong = Integer.parseInt(soLuongtf.getText()) * gianhap;
						modelkhoangchi.addRow(
								new Object[] { a + 1, maPhieutf.getText(), maThuoccombochonhaphang.getSelectedItem() + "",
										tenThuoccombochonhaphang.getSelectedItem() + "",
										combomanhaccchonhaphang.getSelectedItem() + "",
										combotennhaccchonhaphang.getSelectedItem() + "", gianhap + "", soLuongtf.getText(),
										tongcong });
						tongtienhangnhaphang = tongtienhangnhaphang + tongcong;
						tienhangtfnhaphang.setText(tongtienhangnhaphang + "");
					}
					tongcackhoangchi = tongcackhoangchi + tongcong;
					labletongkhoangchi.setText(df.format(tongcackhoangchi) + " VND");
				}
			}
			if (o.equals(btnxoatrang)) {
				maPhieutf.setText("");
				combomanhaccchonhaphang.setSelectedIndex(0);
				combotennhaccchonhaphang.setSelectedIndex(0);
				maThuoccombochonhaphang.setSelectedIndex(0);
				tenThuoccombochonhaphang.setSelectedIndex(0);
				soLuongtf.setText("");
				maPhieutf.requestFocus();
			}
			if (o.equals(btnxoa)) {
				int row = table.getSelectedRow();
				Thuoc y = new Thuoc(table.getValueAt(row, 3).toString(), table.getValueAt(row, 4).toString());
				NhaCungCap z = new NhaCungCap(table.getValueAt(row, 1).toString(), table.getValueAt(row, 2).toString());
				NhapHang x = new NhapHang(table.getValueAt(row, 0).toString(), z, y,
						Integer.parseInt(table.getValueAt(row, 5).toString()));
				int hoiNhac = JOptionPane.showConfirmDialog(this, "Bạn chắc muốn xóa không", "chú ý",
						JOptionPane.YES_NO_OPTION);
				if (hoiNhac == JOptionPane.YES_OPTION) {
					if (nhaphang_dao.remove(x)) {
						model.removeRow(row);
						modelkhoangchi.removeRow(row);
					}
				}
				double thanhtien1 = 0;
				double giaban1 = 0;
				for (Thuoc k : thuoc_dao.getAllDSThuoc()) {
					if (k.getMaThuoc().equals(y.getMaThuoc())) {
						giaban1 = k.getGiaBan();
						thanhtien1 = k.getGiaBan() * x.getSoLuong();
					}
				}
				tongcackhoangchi = tongcackhoangchi - thanhtien1;
				labletongkhoangchi.setText(df.format(tongcackhoangchi) + " VND");
			}
		}

		public void docDuLieuVaoTableThuoc() {
			listthuoc = thuoc_dao.getAllDSThuoc();
			for (Thuoc t : listthuoc) {
				modelthuoc.addRow(new Object[] { t.getMaThuoc(), t.getTenThuoc(), t.getDonViQuyDoi(), t.getGiaNhap(),
						t.getGiaBan(), t.getDonViTinh().getDonViTinh(), t.getNhomThuoc().getNhomThuoc() });
			}
		}

		public void docDuLieuVaoTableNhomThuoc() {
			listnhomthuoc = nt_dao.getAllDSNhomThuoc();
			for (NhomThuoc nt : listnhomthuoc) {
				modelnhomthuoc.addRow(new Object[] { nt.getNhomThuoc(), nt.getMoTa() });
			}
		}

		public void docDuLieuVaoTableDonViTinh() {
			listdonvitinh = donViTinh_dao.getAllDSDonViTinh();
			for (DonViTinh nt : listdonvitinh) {
				tModedvt.addRow(new Object[] { nt.getDonViTinh(), nt.getMoTa() });
			}
		}

		public void docDuLieuVaoTableNhaCungCap() {
			ArrayList<NhaCungCap> dsNCC = ncc_dao.getAllDSNhaCungCap();
			for (NhaCungCap ncc : dsNCC) {
				tModencc.addRow(new Object[] { ncc.getMaNhaCungCap(), ncc.getTenNhaCungCap(), ncc.getSdt(), ncc.getDiaChi(),
						ncc.getSTK(), ncc.getFax() });
			}
		}

		public void docDuLieuVaoTableNhapHang() {
			ArrayList<NhapHang> dsNH = nhaphang_dao.getAllDSNhapHang();
			for (NhapHang nh : dsNH) {
				model.addRow(new Object[] { nh.getMaPhieu(), nh.getNhacungcap().getMaNhaCungCap(),
						nh.getNhacungcap().getTenNhaCungCap(), nh.getThuoc().getMaThuoc(), nh.getThuoc().getTenThuoc(),
						nh.getSoLuong() });
			}
		}

		public void docDuLieuVaoTablekhoangchi() {
			float gianhap = 0, giaban = 0;
			ArrayList<NhapHang> dsNH = nhaphang_dao.getAllDSNhapHang();
			int i = 1;
			for (NhapHang nh : dsNH) {
				for (Thuoc k : thuoc_dao.getAllDSThuoc()) {
					if (k.getMaThuoc().equals(nh.getThuoc().getMaThuoc())) {
						gianhap = k.getGiaNhap();
						giaban = k.getGiaBan();
					}
				}
				int soluong = nh.getSoLuong();
				double thanhtien = gianhap * soluong;
				modelkhoangchi.addRow(new Object[] { i + "", nh.getMaPhieu(), nh.getThuoc().getMaThuoc(),
						nh.getThuoc().getTenThuoc(), nh.getNhacungcap().getMaNhaCungCap(),
						nh.getNhacungcap().getTenNhaCungCap(), gianhap, nh.getSoLuong(), thanhtien });
				i++;
			}
		}

		public void docDuLieuVaoTablekhoangthu() {
			int i = 1;
			float gianhap = 0, giaban = 0;
			ArrayList<BanHang> dsBH = bt_dao.getAllDSBanHang();
			for (BanHang bh : dsBH) {
				for (Thuoc k : thuoc_dao.getAllDSThuoc()) {
					if (k.getMaThuoc().equals(bh.getThuoc().getMaThuoc())) {
						gianhap = k.getGiaNhap();
						giaban = k.getGiaBan();
					}
				}
				int soluong = bh.getSoLuong();
				double thanhtien = giaban * soluong;
				modelkhoangthu.addRow(new Object[] { i + "", bh.getMaPhieu(), bh.getThuoc().getMaThuoc(),
						bh.getThuoc().getTenThuoc(), gianhap, giaban, bh.getSoLuong(), thanhtien });
				i++;
			}
		}

		private boolean validDatabanhang() {
			String maPhieu = maPhieutfbh.getText().trim();
			String soLuong = soLuongtfbh.getText().trim();
			int soluong = Integer.parseInt(soLuong);

			String mau1 = "^(MPBH)[0-9]{3}$";
			Pattern chuoi1 = Pattern.compile(mau1);
			Matcher m1 = chuoi1.matcher(maPhieu);
			if (m1.matches() == false) {
				JOptionPane.showMessageDialog(this, "Mã phiếu bán hàng phải bắt đầu bằng MPBH + 3 số ");
				return false;
			}
			// ------------------------------
			String mau12 = "[0-9]+";
			Pattern chuoi12 = Pattern.compile(mau12);
			Matcher m12 = chuoi1.matcher(soLuong);
			if (soluong <= 0) {
				JOptionPane.showMessageDialog(this, "Số Lượng Chỉ dùng số và lớn hơn 0");
				return false;
			}
			return true;
		}

		private boolean validDatanhacungcap() {
			String ma = txtMancc.getText().trim();
			String ten = txtTenncc.getText().trim();
			String sdt = txtSDTncc.getText().trim();
			String diachi = txtDCncc.getText().trim();
			String stk = txtTKncc.getText().trim();
			String fax = txtFaxncc.getText().trim();

			String mau1 = "^(NCC)[0-9]{2}$";
			Pattern chuoi1 = Pattern.compile(mau1);
			Matcher m1 = chuoi1.matcher(ma);
			if (m1.matches() == false) {
				JOptionPane.showMessageDialog(this, "Mã nhà cung cấp phải bắt đầu bằng NCC và 2 số ");
				return false;
			}
			// ------------------------------
			String mau2 = "(^[A-Z][a-z]+\s?)([A-Z][a-z]+\s?)+";
			Pattern chuoi2 = Pattern.compile(mau2);
			Matcher m2 = chuoi2.matcher(ten);
			if (m2.matches() == false) {
				JOptionPane.showMessageDialog(this, "Họ và tên viết hoa chữ cái đầu, không được dùng số ");
				return false;
			}
			// ------------------------------
			String mau3 = "(^(0)[0-9]{9})";
			Pattern chuoi3 = Pattern.compile(mau3);
			Matcher m3 = chuoi3.matcher(sdt);
			if (m3.matches() == false) {
				JOptionPane.showMessageDialog(this, "SĐT bắt đầu bằng 0 + 9 số phía sau và không dùng chữ ");
				return false;
			}
			// ------------------------------
			String mau4 = "(^[A-Z0-9].+)(\s{1}[A-Z0-9].+)+";
			Pattern chuoi4 = Pattern.compile(mau4);
			Matcher m4 = chuoi4.matcher(diachi);
			if (m4.matches() == false) {
				JOptionPane.showMessageDialog(this, "Địa Chỉ Viết Hoa Chữ Đầu Có thể dùng số");
				return false;
			}
			// ------------------------------
			String mau5 = "(^(0)[0-9]{12})";
			Pattern chuoi5 = Pattern.compile(mau5);
			Matcher m5 = chuoi5.matcher(stk);
			if (m5.matches() == false) {
				JOptionPane.showMessageDialog(this, "Số tài khoản bắt đầu bằng 0 + 12 số phía sau và không dùng chữ ");
				return false;
			}
			// ------------------------------
			String mau6 = "(^(.84)[0-9]{8})";
			Pattern chuoi6 = Pattern.compile(mau6);
			Matcher m6 = chuoi6.matcher(fax);
			if (m6.matches() == false) {
				JOptionPane.showMessageDialog(this, "Fax bắt đầu với (+84) và 8 số phía sau và không dùng chữ ");
				return false;
			}

			return true;
		}

		private boolean validDatathuoc() {
			String rbmaThuoc = txtmathuoc.getText().trim();
			String rbtenThuoc = txttenthuoc.getText().trim();
			String rbdonViQuyDoi = txtDVQD.getText().trim();
			String rbgiaNhap = txtgianhap.getText().trim();
			Float rbgianhap = Float.parseFloat(rbgiaNhap);
			String rbgiaBan = txtgiaban.getText().trim();
			Float rbgiaban = Float.parseFloat(rbgiaBan);

			String mau1 = "(^(MT)[0-9]{3}$)";
			Pattern chuoi1 = Pattern.compile(mau1);
			Matcher m1 = chuoi1.matcher(rbmaThuoc);
			if (m1.matches() == false) {
				JOptionPane.showMessageDialog(this, "Mã phiếu bán hàng phải bắt đầu bằng MT + 3 số ");
				return false;
			}
			String mau2 = "(^[A-Z][A-Z0-9]+)(/s{1}[A-Z0-9]+)*";
			Pattern chuoi2 = Pattern.compile(mau2);
			Matcher m2 = chuoi2.matcher(rbtenThuoc);
			if (m2.matches() == false) {
				JOptionPane.showMessageDialog(this, "Tên thuốc phải viết Hoa từ đầu đến cuối và có thể dùng số");
				return false;
			}
			String mau3 = "(Hop|Thung|Chiec)";
			Pattern chuoi3 = Pattern.compile(mau3);
			Matcher m3 = chuoi3.matcher(rbdonViQuyDoi);
			if (m3.matches() == false) {
				JOptionPane.showMessageDialog(this, "Đơn vị quy đổi chỉ dùng Hop hoặc Thung hoặc Chiec!!! ");
				return false;
			}

			if (rbgianhap <= 0) {
				JOptionPane.showMessageDialog(this, "Giá Nhập Chỉ dùng số và lớn hơn 0");
				return false;
			}
			if (rbgiaban <= 0 || rbgiaban < rbgianhap) {
				JOptionPane.showMessageDialog(this, "Giá Bán Chỉ dùng số lớn hơn 0 và lớn hơn giá nhập");
				return false;
			}
			return true;
		}

		private boolean validDatanhomthuoc() {
			String rbnhomThuoc = txtnhomthuoc.getText().trim();
			String rbmoTa = txtMoTa.getText().trim();

			String mau1 = "^(NT)[0-9]{1-3}$";
			Pattern chuoi1 = Pattern.compile(mau1);
			Matcher m1 = chuoi1.matcher(rbnhomThuoc);
			if (m1.matches() == false) {
				JOptionPane.showMessageDialog(this, "Nhóm thuốc phải bắt đầu bằng NT + từ 1 - 3 số bất kì ");
				return false;
			}
			String mau2 = "(^[A-Z][a-z]+)(\s{1}[A-Za-z0-9]*)*";
			Pattern chuoi2 = Pattern.compile(mau2);
			Matcher m2 = chuoi2.matcher(rbmoTa);
			if (m2.matches() == false) {
				JOptionPane.showMessageDialog(this, "Viết hoa chữ cái đầu tiên ");
				return false;
			}
			return true;
		}

		private boolean validDataDonViTinh() {
			String rbmoTa = txtmotadvt.getText().trim();
			String mau1 = "(^[A-Z][a-z]+)(\s{1}[A-Za-z0-9]*)*";
			Pattern chuoi1 = Pattern.compile(mau1);
			Matcher m1 = chuoi1.matcher(rbmoTa);
			if (m1.matches() == false) {
				JOptionPane.showMessageDialog(this, "Viết hoa chữ cái đầu tiên ");
				return false;
			}
			return true;
		}

		private boolean validDataNhapHang() {
			String rbmaPhieu = maPhieutf.getText().trim();
			String soLuong = soLuongtf.getText().trim();
			int soluong = Integer.parseInt(soLuong);
			String mau1 = "^(MPNH)[0-9]{3}$";
			Pattern chuoi1 = Pattern.compile(mau1);
			Matcher m1 = chuoi1.matcher(rbmaPhieu);
			if (m1.matches() == false) {
				JOptionPane.showMessageDialog(this, "Mã phiếu nhập hàng phải bắt đầu bằng MPNH + 3 số ");
				return false;
			}

			if (soluong <= 0) {
				JOptionPane.showMessageDialog(this, "Số Lượng Chỉ dùng số và lớn hơn 0");
				return false;
			}
			return true;
		}
	

}
*/