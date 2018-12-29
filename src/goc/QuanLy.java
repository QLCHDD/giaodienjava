import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class QuanLy extends JFrame {

	private JPanel contentPane;
	private JTextField tfTenNV;
	private JTextField tfNgaySinh;
	private JTextField tfSoCMND;
	private JTextField tfDiaChi;
	private JTextField tfNgayVaoLam;
	private JTextField tfLuongCoBan;
	private JTextField textField;
	private JTable tableNhanVien;
	private JTable tableSanPham;
	private JTextField tfTenSP;
	private JTextField tfXuatXu;
	private JTextField tfMauSac;
	private JTextField textField_1;
	private JTextField tfDonGia;
	private JTextField tfTheNho;
	private JTextField tfKichThuoc;
	private JTextField tfNamSX;
	private JTextField tfGiaBanRa;
	private JTextField textField_2;
	private JTextField tfTenKH;
	private JTextField tfNgaySinhKH;
	private JTextField tfSoCMNDKH;
	private JTextField tfDiaChiKH;
	private JTextField tfSoDTKH;
	private JTextField tfEmailKH;
	private JTable tableKH;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable tableNCC;
	private JTextField tfTenNSX;
	private JTextField tfThongTinNSX;
	private JTable tableNSX;
	private JTextField tfSoHD_BH;
	private JTextField tfTenSP_BH;
	private JTextField tfSerial;
	private JTextField textField_6;
	private JTextField tfNgayNhanBH;
	private JTextField tfNgayTraBH;
	private JTable tableBH;
	private JTable tableHDBanHang;
	private JTable tableCTHDBanHang;
	private JTextField tfNgayBan;
	private JTextField tfNVBan;
	private JTextField tfKH;
	private JTextField tfTongTienBan;
	private JTextField tfSPBan;
	private JTextField tfSLBan;
	private JTextField tfKMBan;
	private JTextField tfGiaGocSPBan;
	private JTextField tfTienGiamSPBan;
	private JTextField tfThanhTienSPBan;
	private JTextField tfNgayNhap;
	private JTextField tfNVNhap;
	private JTextField textField_9;
	private JTextField tfTongTienNhap;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField tfDonGiaNhap;
	private JTextField tfThanhTienNhap;
	private JTable tableHDNhap;
	private JTable tableCTHDNhap;
	private JTextField tfTenKM;
	private JTextField textField_8;
	private JTextField tfNgayBDKM;
	private JTextField tfNgayKTKM;
	private JTable tableKM;
	private JTextField tfNVNhanBH;
	private JTextField tfNVTraBH;
	private JTable tableCTKM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLy frame = new QuanLy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuanLy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1379, 866);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnTop = new JPanel();
		pnTop.setBackground(new Color(0, 51, 51));
		contentPane.add(pnTop, BorderLayout.NORTH);
		pnTop.setLayout(new FlowLayout(FlowLayout.RIGHT, 2, 5));
		
		JButton btnMini = new JButton("New button");
		btnMini.setHorizontalAlignment(SwingConstants.RIGHT);
		pnTop.add(btnMini);
		
		JButton btnClose = new JButton("New button");
		pnTop.add(btnClose);
		
		JPanel pnCenter = new JPanel();
		contentPane.add(pnCenter, BorderLayout.CENTER);
		pnCenter.setLayout(null);
		
		JPanel pnMenu = new JPanel();
		pnMenu.setBackground(new Color(51, 102, 102));
		pnMenu.setBounds(0, 0, 135, 774);
		pnCenter.add(pnMenu);
		pnMenu.setLayout(null);
		
		JLabel lblNhanVien = new JLabel("NHÂN VIÊN");
		lblNhanVien.setHorizontalAlignment(SwingConstants.CENTER);
		lblNhanVien.setForeground(Color.WHITE);
		lblNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNhanVien.setBackground(new Color(0, 51, 51));
		lblNhanVien.setBounds(0, 0, 135, 45);
		pnMenu.add(lblNhanVien);
		
		JLabel lblSanPham = new JLabel("SẢN PHẨM");
		lblSanPham.setHorizontalAlignment(SwingConstants.CENTER);
		lblSanPham.setForeground(Color.WHITE);
		lblSanPham.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSanPham.setBackground(new Color(0, 51, 51));
		lblSanPham.setBounds(0, 46, 135, 45);
		pnMenu.add(lblSanPham);
		
		JLabel lblQLXuatXu = new JLabel("XUẤT XỨ");
		lblQLXuatXu.setHorizontalAlignment(SwingConstants.CENTER);
		lblQLXuatXu.setForeground(Color.WHITE);
		lblQLXuatXu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQLXuatXu.setBackground(new Color(0, 51, 51));
		lblQLXuatXu.setBounds(0, 92, 135, 45);
		pnMenu.add(lblQLXuatXu);
		
		JLabel lblKhachHang = new JLabel("KHÁCH HÀNG");
		lblKhachHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang.setForeground(Color.WHITE);
		lblKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblKhachHang.setBackground(new Color(0, 51, 51));
		lblKhachHang.setBounds(0, 138, 135, 45);
		pnMenu.add(lblKhachHang);
		
		JLabel lblKhuyenMai = new JLabel("KHUYẾN MÃI");
		lblKhuyenMai.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhuyenMai.setForeground(Color.WHITE);
		lblKhuyenMai.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblKhuyenMai.setBackground(new Color(0, 51, 51));
		lblKhuyenMai.setBounds(0, 184, 135, 45);
		pnMenu.add(lblKhuyenMai);
		
		JLabel lblBaoHanh = new JLabel("BẢO HÀNH");
		lblBaoHanh.setHorizontalAlignment(SwingConstants.CENTER);
		lblBaoHanh.setForeground(Color.WHITE);
		lblBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBaoHanh.setBackground(new Color(0, 51, 51));
		lblBaoHanh.setBounds(0, 230, 135, 45);
		pnMenu.add(lblBaoHanh);
		
		JLabel lblHoaDon = new JLabel("HÓA ĐƠN");
		lblHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoaDon.setForeground(Color.WHITE);
		lblHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHoaDon.setBackground(new Color(0, 51, 51));
		lblHoaDon.setBounds(0, 276, 135, 45);
		pnMenu.add(lblHoaDon);
		
		JLabel lblThongKe = new JLabel("THỐNG KÊ");
		lblThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		lblThongKe.setForeground(Color.WHITE);
		lblThongKe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblThongKe.setBackground(new Color(0, 51, 51));
		lblThongKe.setBounds(0, 321, 135, 45);
		pnMenu.add(lblThongKe);
		
		JPanel pnThongTin = new JPanel();
		pnThongTin.setBounds(134, 0, 1217, 774);
		pnCenter.add(pnThongTin);
		pnThongTin.setLayout(new CardLayout(0, 0));
		
		JPanel pnQLNV = new JPanel();
		pnThongTin.add(pnQLNV, "name_435206017784739");
		pnQLNV.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeQLNV = new JPanel();
		pnQLNV.add(pnTieuDeQLNV, BorderLayout.NORTH);
		
		JLabel lblTieuDeQLNV = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lblTieuDeQLNV.setForeground(new Color(0, 51, 51));
		lblTieuDeQLNV.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeQLNV.add(lblTieuDeQLNV);
		
		JPanel pnChinhQLNV = new JPanel();
		pnQLNV.add(pnChinhQLNV, BorderLayout.CENTER);
		pnChinhQLNV.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		pnChinhQLNV.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnMaNV = new JPanel();
		FlowLayout fl_pnMaNV = (FlowLayout) pnMaNV.getLayout();
		fl_pnMaNV.setAlignment(FlowLayout.LEFT);
		fl_pnMaNV.setVgap(10);
		fl_pnMaNV.setHgap(10);
		panel_2.add(pnMaNV);
		
		JLabel lblMaNV = new JLabel("Mã nhân viên: ");
		lblMaNV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaNV.add(lblMaNV);
		
		JComboBox cbbMaNV = new JComboBox();
		pnMaNV.add(cbbMaNV);
		
		JButton btnThemNV = new JButton("Thêm nhân viên");
		btnThemNV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnThemNV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaNV.add(btnThemNV);
		
		JPanel pnTenNV = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pnTenNV.getLayout();
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_2.add(pnTenNV);
		
		JLabel lblTenNV = new JLabel("Tên nhân viên:");
		lblTenNV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenNV.add(lblTenNV);
		
		tfTenNV = new JTextField();
		tfTenNV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenNV.setColumns(20);
		pnTenNV.add(tfTenNV);
		
		JPanel pnNgaySinh = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) pnNgaySinh.getLayout();
		flowLayout_2.setVgap(10);
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_2.add(pnNgaySinh);
		
		JLabel lblNgaySinh = new JLabel("Ngày sinh:      ");
		lblNgaySinh.setHorizontalAlignment(SwingConstants.LEFT);
		lblNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgaySinh.add(lblNgaySinh);
		
		tfNgaySinh = new JTextField();
		tfNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgaySinh.setColumns(20);
		pnNgaySinh.add(tfNgaySinh);
		
		JPanel pnGioiTinh = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnGioiTinh.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(10);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_2.add(pnGioiTinh);
		
		JLabel label = new JLabel("Giới tính:         ");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnGioiTinh.add(label);
		
		JRadioButton radioButton = new JRadioButton("Nam           ");
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnGioiTinh.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Nữ");
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnGioiTinh.add(radioButton_1);
		
		JPanel pnSoCMND = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) pnSoCMND.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		flowLayout_3.setVgap(10);
		flowLayout_3.setHgap(10);
		panel_2.add(pnSoCMND);
		
		JLabel lblSoCMND = new JLabel("Số CMND:      ");
		lblSoCMND.setHorizontalAlignment(SwingConstants.LEFT);
		lblSoCMND.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoCMND.add(lblSoCMND);
		
		tfSoCMND = new JTextField();
		tfSoCMND.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSoCMND.setColumns(20);
		pnSoCMND.add(tfSoCMND);
		
		JPanel pnDiaChi = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) pnDiaChi.getLayout();
		flowLayout_4.setVgap(10);
		flowLayout_4.setHgap(10);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_2.add(pnDiaChi);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ:          ");
		lblDiaChi.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnDiaChi.add(lblDiaChi);
		
		tfDiaChi = new JTextField();
		tfDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfDiaChi.setColumns(20);
		pnDiaChi.add(tfDiaChi);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnNgayVaoLam = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) pnNgayVaoLam.getLayout();
		flowLayout_5.setVgap(10);
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_3.add(pnNgayVaoLam);
		
		JLabel lblNgayVaoLam = new JLabel("Ngày vào làm:");
		lblNgayVaoLam.setHorizontalAlignment(SwingConstants.LEFT);
		lblNgayVaoLam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayVaoLam.add(lblNgayVaoLam);
		
		tfNgayVaoLam = new JTextField();
		tfNgayVaoLam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayVaoLam.setColumns(20);
		pnNgayVaoLam.add(tfNgayVaoLam);
		
		JPanel pnLuongCoBan = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) pnLuongCoBan.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		flowLayout_6.setVgap(10);
		flowLayout_6.setHgap(10);
		panel_3.add(pnLuongCoBan);
		
		JLabel lblLuongCoBan = new JLabel("Lương cơ bản:");
		lblLuongCoBan.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuongCoBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnLuongCoBan.add(lblLuongCoBan);
		
		tfLuongCoBan = new JTextField();
		tfLuongCoBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfLuongCoBan.setColumns(20);
		pnLuongCoBan.add(tfLuongCoBan);
		
		JPanel pnTaiKhoan = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) pnTaiKhoan.getLayout();
		flowLayout_7.setVgap(10);
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_3.add(pnTaiKhoan);
		
		JLabel lblTaiKhoan = new JLabel("Tài khoản:     ");
		lblTaiKhoan.setHorizontalAlignment(SwingConstants.LEFT);
		lblTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTaiKhoan.add(lblTaiKhoan);
		
		JComboBox cbbTaiKhoan = new JComboBox();
		pnTaiKhoan.add(cbbTaiKhoan);
		
		JButton btnThemTaiKhoan = new JButton("Thêm tài khoản");
		btnThemTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTaiKhoan.add(btnThemTaiKhoan);
		
		JPanel pnSoDT = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) pnSoDT.getLayout();
		flowLayout_8.setVgap(10);
		flowLayout_8.setHgap(10);
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_3.add(pnSoDT);
		
		JLabel label_1 = new JLabel("Số điện thoại:  ");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoDT.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(20);
		pnSoDT.add(textField);
		
		JPanel pnTinhTrang = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) pnTinhTrang.getLayout();
		flowLayout_9.setVgap(10);
		flowLayout_9.setHgap(10);
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		panel_3.add(pnTinhTrang);
		
		JLabel lblTinhTrang = new JLabel("Tình trạng:     ");
		lblTinhTrang.setHorizontalAlignment(SwingConstants.LEFT);
		lblTinhTrang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTinhTrang.add(lblTinhTrang);
		
		JComboBox cbbTinhTrang = new JComboBox();
		pnTinhTrang.add(cbbTinhTrang);
		
		JPanel pnButton = new JPanel();
		FlowLayout flowLayout_10 = (FlowLayout) pnButton.getLayout();
		flowLayout_10.setVgap(10);
		flowLayout_10.setHgap(10);
		flowLayout_10.setAlignment(FlowLayout.RIGHT);
		panel_3.add(pnButton);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButton.add(btnTimKiem);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButton.add(btnCapNhat);
		
		JPanel pnTableNhanVien = new JPanel();
		pnChinhQLNV.add(pnTableNhanVien);
		pnTableNhanVien.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableNV = new JScrollPane();
		pnTableNhanVien.add(scrollPaneTableNV, BorderLayout.CENTER);
		
		tableNhanVien = new JTable();
		scrollPaneTableNV.setViewportView(tableNhanVien);
		
		JPanel pnQLSP = new JPanel();
		pnThongTin.add(pnQLSP, "name_469307323154635");
		pnQLSP.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeQLSP = new JPanel();
		pnQLSP.add(pnTieuDeQLSP, BorderLayout.NORTH);
		
		JLabel lblTieuDeQLSP = new JLabel("QUẢN LÝ SẢN PHẨM");
		lblTieuDeQLSP.setForeground(new Color(0, 51, 51));
		lblTieuDeQLSP.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeQLSP.add(lblTieuDeQLSP);
		
		JPanel pnChinhQLSP = new JPanel();
		pnQLSP.add(pnChinhQLSP, BorderLayout.CENTER);
		pnChinhQLSP.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		pnChinhQLSP.add(panel);
		panel.setLayout(new GridLayout(13, 1, 0, 0));
		
		JPanel pnMaSP = new JPanel();
		FlowLayout flowLayout_12 = (FlowLayout) pnMaSP.getLayout();
		flowLayout_12.setVgap(10);
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel.add(pnMaSP);
		
		JLabel lblMaSP = new JLabel("Mã sản phẩm:");
		lblMaSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaSP.add(lblMaSP);
		
		JComboBox comboBox = new JComboBox();
		pnMaSP.add(comboBox);
		
		JPanel pnTenSP = new JPanel();
		FlowLayout flowLayout_11 = (FlowLayout) pnTenSP.getLayout();
		flowLayout_11.setVgap(10);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		flowLayout_11.setHgap(10);
		panel.add(pnTenSP);
		
		JLabel lblTenSP = new JLabel("Tên sản phẩm:");
		lblTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenSP.add(lblTenSP);
		
		tfTenSP = new JTextField();
		tfTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenSP.setColumns(20);
		pnTenSP.add(tfTenSP);
		
		JPanel pnHang = new JPanel();
		FlowLayout flowLayout_13 = (FlowLayout) pnHang.getLayout();
		flowLayout_13.setVgap(10);
		flowLayout_13.setHgap(10);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel.add(pnHang);
		
		JLabel lblHang = new JLabel("Hãng:             ");
		lblHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnHang.add(lblHang);
		
		JComboBox cbbHang = new JComboBox();
		cbbHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnHang.add(cbbHang);
		
		JButton btnThemHang = new JButton("Thêm mới");
		btnThemHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnHang.add(btnThemHang);
		
		JPanel pnXuatXu = new JPanel();
		FlowLayout flowLayout_14 = (FlowLayout) pnXuatXu.getLayout();
		flowLayout_14.setVgap(10);
		flowLayout_14.setHgap(10);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel.add(pnXuatXu);
		
		JLabel lblXuatXu = new JLabel("Xuất xứ:         ");
		lblXuatXu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnXuatXu.add(lblXuatXu);
		
		tfXuatXu = new JTextField();
		tfXuatXu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfXuatXu.setColumns(20);
		pnXuatXu.add(tfXuatXu);
		
		JPanel pnMauSac = new JPanel();
		FlowLayout flowLayout_15 = (FlowLayout) pnMauSac.getLayout();
		flowLayout_15.setVgap(10);
		flowLayout_15.setHgap(10);
		flowLayout_15.setAlignment(FlowLayout.LEFT);
		panel.add(pnMauSac);
		
		JLabel lblMauSac = new JLabel("Màu sắc:        ");
		lblMauSac.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMauSac.add(lblMauSac);
		
		tfMauSac = new JTextField();
		tfMauSac.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfMauSac.setColumns(20);
		pnMauSac.add(tfMauSac);
		
		JPanel pnBaoHanh = new JPanel();
		FlowLayout flowLayout_16 = (FlowLayout) pnBaoHanh.getLayout();
		flowLayout_16.setVgap(10);
		flowLayout_16.setHgap(10);
		flowLayout_16.setAlignment(FlowLayout.LEFT);
		panel.add(pnBaoHanh);
		
		JLabel label_2 = new JLabel("Bảo hành:       ");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnBaoHanh.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(20);
		pnBaoHanh.add(textField_1);
		
		JPanel pnDonGia = new JPanel();
		FlowLayout flowLayout_17 = (FlowLayout) pnDonGia.getLayout();
		flowLayout_17.setVgap(10);
		flowLayout_17.setHgap(10);
		flowLayout_17.setAlignment(FlowLayout.LEFT);
		panel.add(pnDonGia);
		
		JLabel lblDonGia = new JLabel("Đơn giá:         ");
		lblDonGia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnDonGia.add(lblDonGia);
		
		tfDonGia = new JTextField();
		tfDonGia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfDonGia.setColumns(20);
		pnDonGia.add(tfDonGia);
		
		JPanel pnTheNho = new JPanel();
		FlowLayout flowLayout_18 = (FlowLayout) pnTheNho.getLayout();
		flowLayout_18.setVgap(10);
		flowLayout_18.setHgap(10);
		flowLayout_18.setAlignment(FlowLayout.LEFT);
		panel.add(pnTheNho);
		
		JLabel lblTheNho = new JLabel("Thẻ nhớ:        ");
		lblTheNho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTheNho.add(lblTheNho);
		
		tfTheNho = new JTextField();
		tfTheNho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTheNho.setColumns(20);
		pnTheNho.add(tfTheNho);
		
		JPanel pnKichThuoc = new JPanel();
		FlowLayout flowLayout_19 = (FlowLayout) pnKichThuoc.getLayout();
		flowLayout_19.setHgap(10);
		flowLayout_19.setAlignment(FlowLayout.LEFT);
		panel.add(pnKichThuoc);
		
		JLabel lblKichThuoc = new JLabel("Kích thước:      ");
		lblKichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnKichThuoc.add(lblKichThuoc);
		
		tfKichThuoc = new JTextField();
		tfKichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfKichThuoc.setColumns(20);
		pnKichThuoc.add(tfKichThuoc);
		
		JPanel pnNamSX = new JPanel();
		FlowLayout fl_pnNamSX = (FlowLayout) pnNamSX.getLayout();
		fl_pnNamSX.setAlignment(FlowLayout.LEFT);
		fl_pnNamSX.setHgap(10);
		panel.add(pnNamSX);
		
		JLabel lblNamSX = new JLabel("Năm sản xuất: ");
		lblNamSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNamSX.add(lblNamSX);
		
		tfNamSX = new JTextField();
		tfNamSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNamSX.setColumns(20);
		pnNamSX.add(tfNamSX);
		
		JPanel pnTinhTrangSP = new JPanel();
		FlowLayout flowLayout_20 = (FlowLayout) pnTinhTrangSP.getLayout();
		flowLayout_20.setVgap(10);
		flowLayout_20.setAlignment(FlowLayout.LEFT);
		panel.add(pnTinhTrangSP);
		
		JLabel lblTinhTrangSP = new JLabel("Tình trạng:        ");
		lblTinhTrangSP.setHorizontalAlignment(SwingConstants.LEFT);
		lblTinhTrangSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTinhTrangSP.add(lblTinhTrangSP);
		
		JComboBox cbbTinhTrangSP = new JComboBox();
		pnTinhTrangSP.add(cbbTinhTrangSP);
		
		JPanel pnGiaBanRa = new JPanel();
		FlowLayout flowLayout_21 = (FlowLayout) pnGiaBanRa.getLayout();
		flowLayout_21.setVgap(10);
		flowLayout_21.setAlignment(FlowLayout.LEFT);
		panel.add(pnGiaBanRa);
		
		JLabel lblGiaBanRa = new JLabel("Giá bán ra:        ");
		lblGiaBanRa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnGiaBanRa.add(lblGiaBanRa);
		
		tfGiaBanRa = new JTextField();
		tfGiaBanRa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfGiaBanRa.setColumns(20);
		pnGiaBanRa.add(tfGiaBanRa);
		
		JPanel pnButtonQLSP = new JPanel();
		FlowLayout flowLayout_22 = (FlowLayout) pnButtonQLSP.getLayout();
		flowLayout_22.setHgap(10);
		flowLayout_22.setVgap(10);
		flowLayout_22.setAlignment(FlowLayout.RIGHT);
		panel.add(pnButtonQLSP);
		
		JButton btnTimKiemSP = new JButton("Tìm kiếm");
		btnTimKiemSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonQLSP.add(btnTimKiemSP);
		
		JButton btnCapNhatSP = new JButton("Cập nhật");
		btnCapNhatSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonQLSP.add(btnCapNhatSP);
		
		JPanel panel_4 = new JPanel();
		pnChinhQLSP.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel pnHinhAnhSP = new JPanel();
		panel_4.add(pnHinhAnhSP);
		pnHinhAnhSP.setLayout(null);
		
		JLabel lblLoadHinhAnh = new JLabel("Hình ảnh");
		lblLoadHinhAnh.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoadHinhAnh.setBounds(163, 13, 312, 283);
		pnHinhAnhSP.add(lblLoadHinhAnh);
		
		JLabel lblHinhAnh = new JLabel("Link hình ảnh:");
		lblHinhAnh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHinhAnh.setBounds(78, 318, 101, 19);
		pnHinhAnhSP.add(lblHinhAnh);
		
		textField_2 = new JTextField();
		textField_2.setBounds(191, 317, 256, 22);
		pnHinhAnhSP.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(473, 316, 45, 25);
		pnHinhAnhSP.add(btnNewButton);
		
		JPanel pnTableSanPham = new JPanel();
		panel_4.add(pnTableSanPham);
		pnTableSanPham.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableSanPham = new JScrollPane();
		pnTableSanPham.add(scrollPaneTableSanPham, BorderLayout.CENTER);
		
		tableSanPham = new JTable();
		scrollPaneTableSanPham.setViewportView(tableSanPham);
		
		JPanel pnQLXX = new JPanel();
		pnThongTin.add(pnQLXX, "name_469980573129568");
		pnQLXX.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 51, 51), 2));
		pnQLXX.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeQLNCC = new JPanel();
		panel_5.add(pnTieuDeQLNCC, BorderLayout.NORTH);
		
		JLabel lblTieuDeQLNCC = new JLabel("QUẢN LÝ NHÀ CUNG CẤP");
		lblTieuDeQLNCC.setForeground(new Color(0, 51, 51));
		lblTieuDeQLNCC.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeQLNCC.add(lblTieuDeQLNCC);
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9);
		panel_9.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel pnMaNCC = new JPanel();
		FlowLayout flowLayout_30 = (FlowLayout) pnMaNCC.getLayout();
		flowLayout_30.setVgap(10);
		flowLayout_30.setHgap(10);
		flowLayout_30.setAlignment(FlowLayout.LEFT);
		panel_9.add(pnMaNCC);
		
		JLabel lblMNhCung = new JLabel("Mã nhà cung cấp: ");
		lblMNhCung.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaNCC.add(lblMNhCung);
		
		JComboBox comboBox_1 = new JComboBox();
		pnMaNCC.add(comboBox_1);
		
		JButton button = new JButton("Thêm mới");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaNCC.add(button);
		
		JPanel pnTenNCC = new JPanel();
		FlowLayout flowLayout_31 = (FlowLayout) pnTenNCC.getLayout();
		flowLayout_31.setVgap(10);
		flowLayout_31.setHgap(10);
		flowLayout_31.setAlignment(FlowLayout.LEFT);
		panel_9.add(pnTenNCC);
		
		JLabel label_4 = new JLabel("Tên nhà cung cấp:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenNCC.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(20);
		pnTenNCC.add(textField_3);
		
		JPanel pnDiaChiNCC = new JPanel();
		FlowLayout flowLayout_32 = (FlowLayout) pnDiaChiNCC.getLayout();
		flowLayout_32.setVgap(10);
		flowLayout_32.setHgap(10);
		flowLayout_32.setAlignment(FlowLayout.LEFT);
		panel_9.add(pnDiaChiNCC);
		
		JLabel lblaCh = new JLabel("Địa chỉ:                ");
		lblaCh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnDiaChiNCC.add(lblaCh);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(20);
		pnDiaChiNCC.add(textField_4);
		
		JPanel pnSoDTNCC = new JPanel();
		FlowLayout flowLayout_33 = (FlowLayout) pnSoDTNCC.getLayout();
		flowLayout_33.setVgap(10);
		flowLayout_33.setHgap(10);
		flowLayout_33.setAlignment(FlowLayout.LEFT);
		panel_9.add(pnSoDTNCC);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại:       ");
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoDTNCC.add(lblSinThoi);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setColumns(20);
		pnSoDTNCC.add(textField_5);
		
		JPanel pnButtonQLNCC = new JPanel();
		FlowLayout flowLayout_34 = (FlowLayout) pnButtonQLNCC.getLayout();
		flowLayout_34.setVgap(10);
		flowLayout_34.setHgap(10);
		flowLayout_34.setAlignment(FlowLayout.RIGHT);
		panel_9.add(pnButtonQLNCC);
		
		JButton btnTimKiemNCC = new JButton("Tìm kiếm");
		btnTimKiemNCC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonQLNCC.add(btnTimKiemNCC);
		
		JButton btnCapNhatNCC = new JButton("Cập nhật");
		btnCapNhatNCC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonQLNCC.add(btnCapNhatNCC);
		
		JPanel pnTableNCC = new JPanel();
		panel_8.add(pnTableNCC);
		pnTableNCC.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableNCC = new JScrollPane();
		pnTableNCC.add(scrollPaneTableNCC, BorderLayout.CENTER);
		
		tableNCC = new JTable();
		scrollPaneTableNCC.setViewportView(tableNCC);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 51, 51), 2));
		pnQLXX.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeQLNSX = new JPanel();
		panel_6.add(pnTieuDeQLNSX, BorderLayout.NORTH);
		
		JLabel lblTieuDeQLNSX = new JLabel("QUẢN LÝ NHÀ SẢN XUẤT");
		lblTieuDeQLNSX.setForeground(new Color(0, 51, 51));
		lblTieuDeQLNSX.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeQLNSX.add(lblTieuDeQLNSX);
		
		JPanel panel_10 = new JPanel();
		panel_6.add(panel_10);
		panel_10.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_10.add(panel_11);
		panel_11.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel pnMaNSX = new JPanel();
		FlowLayout flowLayout_35 = (FlowLayout) pnMaNSX.getLayout();
		flowLayout_35.setVgap(10);
		flowLayout_35.setHgap(10);
		flowLayout_35.setAlignment(FlowLayout.LEFT);
		panel_11.add(pnMaNSX);
		
		JLabel lblMaNSX = new JLabel("Mã nhà sản xuất:");
		lblMaNSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaNSX.add(lblMaNSX);
		
		JComboBox cbbMaNSX = new JComboBox();
		pnMaNSX.add(cbbMaNSX);
		
		JButton btnThemNSX = new JButton("Thêm mới");
		btnThemNSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaNSX.add(btnThemNSX);
		
		JPanel pnTenNSX = new JPanel();
		FlowLayout flowLayout_36 = (FlowLayout) pnTenNSX.getLayout();
		flowLayout_36.setVgap(10);
		flowLayout_36.setHgap(10);
		flowLayout_36.setAlignment(FlowLayout.LEFT);
		panel_11.add(pnTenNSX);
		
		JLabel lblTenNSX = new JLabel("Tên nhà sản xuất:");
		lblTenNSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenNSX.add(lblTenNSX);
		
		tfTenNSX = new JTextField();
		tfTenNSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenNSX.setColumns(20);
		pnTenNSX.add(tfTenNSX);
		
		JPanel pnThongTinNSX = new JPanel();
		FlowLayout flowLayout_37 = (FlowLayout) pnThongTinNSX.getLayout();
		flowLayout_37.setVgap(10);
		flowLayout_37.setHgap(10);
		flowLayout_37.setAlignment(FlowLayout.LEFT);
		panel_11.add(pnThongTinNSX);
		
		JLabel lblThongTinNSX = new JLabel("Thông tin:           ");
		lblThongTinNSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThongTinNSX.add(lblThongTinNSX);
		
		tfThongTinNSX = new JTextField();
		tfThongTinNSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfThongTinNSX.setColumns(20);
		pnThongTinNSX.add(tfThongTinNSX);
		
		JPanel pnButtonQLNSX = new JPanel();
		FlowLayout flowLayout_38 = (FlowLayout) pnButtonQLNSX.getLayout();
		flowLayout_38.setVgap(10);
		flowLayout_38.setHgap(10);
		flowLayout_38.setAlignment(FlowLayout.RIGHT);
		panel_11.add(pnButtonQLNSX);
		
		JButton button_2 = new JButton("Tìm kiếm");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonQLNSX.add(button_2);
		
		JButton button_3 = new JButton("Cập nhật");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonQLNSX.add(button_3);
		
		JPanel panel_7 = new JPanel();
		panel_11.add(panel_7);
		
		JPanel pnTableNSX = new JPanel();
		panel_10.add(pnTableNSX);
		pnTableNSX.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableNSX = new JScrollPane();
		pnTableNSX.add(scrollPaneTableNSX, BorderLayout.CENTER);
		
		tableNSX = new JTable();
		scrollPaneTableNSX.setViewportView(tableNSX);
		
		JPanel pnQLKH = new JPanel();
		pnThongTin.add(pnQLKH, "name_624411489115951");
		pnQLKH.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeQLKH = new JPanel();
		pnQLKH.add(pnTieuDeQLKH, BorderLayout.NORTH);
		
		JLabel lblTieuDeQLKH = new JLabel("QUẢN LÝ KHÁCH HÀNG");
		lblTieuDeQLKH.setForeground(new Color(0, 51, 51));
		lblTieuDeQLKH.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeQLKH.add(lblTieuDeQLKH);
		
		JPanel pnChinhQLKH = new JPanel();
		pnQLKH.add(pnChinhQLKH, BorderLayout.CENTER);
		pnChinhQLKH.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_14 = new JPanel();
		pnChinhQLKH.add(panel_14);
		panel_14.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnMaKH = new JPanel();
		FlowLayout flowLayout_23 = (FlowLayout) pnMaKH.getLayout();
		flowLayout_23.setVgap(10);
		flowLayout_23.setHgap(10);
		flowLayout_23.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnMaKH);
		
		JLabel lblMaKH = new JLabel("Mã khách hàng: ");
		lblMaKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaKH.add(lblMaKH);
		
		JComboBox cbbMaKH = new JComboBox();
		pnMaKH.add(cbbMaKH);
		
		JPanel pnTenKH = new JPanel();
		FlowLayout fl_pnTenKH = (FlowLayout) pnTenKH.getLayout();
		fl_pnTenKH.setVgap(10);
		fl_pnTenKH.setHgap(10);
		fl_pnTenKH.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnTenKH);
		
		JLabel lblTenKH = new JLabel("Tên khách hàng:");
		lblTenKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenKH.add(lblTenKH);
		
		tfTenKH = new JTextField();
		tfTenKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenKH.setColumns(20);
		pnTenKH.add(tfTenKH);
		
		JPanel pnNgaySinhKH = new JPanel();
		FlowLayout flowLayout_24 = (FlowLayout) pnNgaySinhKH.getLayout();
		flowLayout_24.setVgap(10);
		flowLayout_24.setHgap(10);
		flowLayout_24.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnNgaySinhKH);
		
		JLabel lblNgaySinhKH = new JLabel("Ngày sinh:        ");
		lblNgaySinhKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgaySinhKH.add(lblNgaySinhKH);
		
		tfNgaySinhKH = new JTextField();
		tfNgaySinhKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgaySinhKH.setColumns(20);
		pnNgaySinhKH.add(tfNgaySinhKH);
		
		JPanel pnSoCMNDKH = new JPanel();
		FlowLayout flowLayout_25 = (FlowLayout) pnSoCMNDKH.getLayout();
		flowLayout_25.setVgap(10);
		flowLayout_25.setHgap(10);
		flowLayout_25.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnSoCMNDKH);
		
		JLabel lblSoCMNDKH = new JLabel("Số CMND:         ");
		lblSoCMNDKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoCMNDKH.add(lblSoCMNDKH);
		
		tfSoCMNDKH = new JTextField();
		tfSoCMNDKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSoCMNDKH.setColumns(20);
		pnSoCMNDKH.add(tfSoCMNDKH);
		
		JPanel pnDiaChiKH = new JPanel();
		FlowLayout flowLayout_26 = (FlowLayout) pnDiaChiKH.getLayout();
		flowLayout_26.setVgap(10);
		flowLayout_26.setHgap(10);
		flowLayout_26.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnDiaChiKH);
		
		JLabel lblDiaChiKH = new JLabel("Địa chỉ:             ");
		lblDiaChiKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnDiaChiKH.add(lblDiaChiKH);
		
		tfDiaChiKH = new JTextField();
		tfDiaChiKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfDiaChiKH.setColumns(20);
		pnDiaChiKH.add(tfDiaChiKH);
		
		JPanel pnSoDTKH = new JPanel();
		FlowLayout flowLayout_27 = (FlowLayout) pnSoDTKH.getLayout();
		flowLayout_27.setVgap(10);
		flowLayout_27.setHgap(10);
		flowLayout_27.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnSoDTKH);
		
		JLabel lblSoDTKH = new JLabel("Số điện thoại:     ");
		lblSoDTKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoDTKH.add(lblSoDTKH);
		
		tfSoDTKH = new JTextField();
		tfSoDTKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSoDTKH.setColumns(20);
		pnSoDTKH.add(tfSoDTKH);
		
		JPanel pnEmailKH = new JPanel();
		FlowLayout flowLayout_28 = (FlowLayout) pnEmailKH.getLayout();
		flowLayout_28.setVgap(10);
		flowLayout_28.setHgap(10);
		flowLayout_28.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnEmailKH);
		
		JLabel lblEmailKH = new JLabel("Email:               ");
		lblEmailKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnEmailKH.add(lblEmailKH);
		
		tfEmailKH = new JTextField();
		tfEmailKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfEmailKH.setColumns(20);
		pnEmailKH.add(tfEmailKH);
		
		JPanel pnButtonQLKH = new JPanel();
		FlowLayout flowLayout_29 = (FlowLayout) pnButtonQLKH.getLayout();
		flowLayout_29.setVgap(10);
		flowLayout_29.setHgap(10);
		flowLayout_29.setAlignment(FlowLayout.RIGHT);
		panel_14.add(pnButtonQLKH);
		
		JButton btnTimKiemKH = new JButton("Tìm kiếm");
		btnTimKiemKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonQLKH.add(btnTimKiemKH);
		
		JButton btnCapNhatKH = new JButton("Cập nhật");
		btnCapNhatKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonQLKH.add(btnCapNhatKH);
		
		JPanel panel_24 = new JPanel();
		panel_14.add(panel_24);
		
		JPanel panel_25 = new JPanel();
		panel_14.add(panel_25);
		
		JPanel pnTableKH = new JPanel();
		pnChinhQLKH.add(pnTableKH);
		pnTableKH.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableKH = new JScrollPane();
		pnTableKH.add(scrollPaneTableKH, BorderLayout.CENTER);
		
		tableKH = new JTable();
		scrollPaneTableKH.setViewportView(tableKH);
		
		JPanel pnQLKM = new JPanel();
		pnThongTin.add(pnQLKM, "name_626491915870755");
		pnQLKM.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeQLKM = new JPanel();
		pnQLKM.add(pnTieuDeQLKM, BorderLayout.NORTH);
		
		JLabel lblTieuDeQLKM = new JLabel("QUẢN LÝ KHUYẾN MÃI");
		lblTieuDeQLKM.setForeground(new Color(0, 51, 51));
		lblTieuDeQLKM.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeQLKM.add(lblTieuDeQLKM);
		
		JPanel panel_18 = new JPanel();
		pnQLKM.add(panel_18, BorderLayout.CENTER);
		panel_18.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "Khuy\u1EBFn m\u00E3i", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_18.add(panel_20);
		panel_20.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_20.add(panel_28);
		panel_28.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnMaKM = new JPanel();
		FlowLayout flowLayout_67 = (FlowLayout) pnMaKM.getLayout();
		flowLayout_67.setVgap(10);
		flowLayout_67.setHgap(10);
		flowLayout_67.setAlignment(FlowLayout.LEFT);
		panel_28.add(pnMaKM);
		
		JLabel lblMaKM = new JLabel("Mã khuyến mãi:");
		lblMaKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaKM.add(lblMaKM);
		
		JComboBox cbbMaKM = new JComboBox();
		pnMaKM.add(cbbMaKM);
		
		JPanel pnTenKM = new JPanel();
		FlowLayout flowLayout_68 = (FlowLayout) pnTenKM.getLayout();
		flowLayout_68.setVgap(10);
		flowLayout_68.setHgap(10);
		flowLayout_68.setAlignment(FlowLayout.LEFT);
		panel_28.add(pnTenKM);
		
		JLabel lblTenKM = new JLabel("Tên khuyến mãi:");
		lblTenKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenKM.add(lblTenKM);
		
		tfTenKM = new JTextField();
		tfTenKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenKM.setColumns(20);
		pnTenKM.add(tfTenKM);
		
		JPanel pnHeSoKM = new JPanel();
		FlowLayout flowLayout_69 = (FlowLayout) pnHeSoKM.getLayout();
		flowLayout_69.setVgap(10);
		flowLayout_69.setHgap(10);
		flowLayout_69.setAlignment(FlowLayout.LEFT);
		panel_28.add(pnHeSoKM);
		
		JLabel lblHeSoKM = new JLabel("Hệ số khuyến mãi:");
		lblHeSoKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnHeSoKM.add(lblHeSoKM);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_8.setColumns(20);
		pnHeSoKM.add(textField_8);
		
		JPanel pnNgayBDKM = new JPanel();
		FlowLayout flowLayout_70 = (FlowLayout) pnNgayBDKM.getLayout();
		flowLayout_70.setVgap(10);
		flowLayout_70.setHgap(10);
		flowLayout_70.setAlignment(FlowLayout.LEFT);
		panel_28.add(pnNgayBDKM);
		
		JLabel lblNgayBDKM = new JLabel("Ngày bắt đầu:");
		lblNgayBDKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayBDKM.add(lblNgayBDKM);
		
		tfNgayBDKM = new JTextField();
		tfNgayBDKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayBDKM.setColumns(20);
		pnNgayBDKM.add(tfNgayBDKM);
		
		JPanel pnNgayKTKM = new JPanel();
		FlowLayout flowLayout_71 = (FlowLayout) pnNgayKTKM.getLayout();
		flowLayout_71.setVgap(10);
		flowLayout_71.setHgap(10);
		flowLayout_71.setAlignment(FlowLayout.LEFT);
		panel_28.add(pnNgayKTKM);
		
		JLabel lblNgaYKTKM = new JLabel("Ngày kết thúc:");
		lblNgaYKTKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayKTKM.add(lblNgaYKTKM);
		
		tfNgayKTKM = new JTextField();
		tfNgayKTKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayKTKM.setColumns(20);
		pnNgayKTKM.add(tfNgayKTKM);
		
		JPanel pnButtonTimKiemKM = new JPanel();
		FlowLayout flowLayout_72 = (FlowLayout) pnButtonTimKiemKM.getLayout();
		flowLayout_72.setAlignment(FlowLayout.RIGHT);
		flowLayout_72.setVgap(10);
		flowLayout_72.setHgap(10);
		panel_28.add(pnButtonTimKiemKM);
		
		JButton btnTimKiemKM = new JButton("Tìm kiếm");
		btnTimKiemKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonTimKiemKM.add(btnTimKiemKM);
		
		JButton btnCapNhatKM = new JButton("Cập nhật");
		btnCapNhatKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonTimKiemKM.add(btnCapNhatKM);
		
		JButton btnXoaKM = new JButton("Xóa");
		btnXoaKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonTimKiemKM.add(btnXoaKM);
		
		JPanel pnTableKM = new JPanel();
		panel_20.add(pnTableKM);
		pnTableKM.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableKM = new JScrollPane();
		pnTableKM.add(scrollPaneTableKM, BorderLayout.CENTER);
		
		tableKM = new JTable();
		scrollPaneTableKM.setViewportView(tableKM);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "Chi ti\u1EBFt khuy\u1EBFn m\u00E3i", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_18.add(panel_38);
		panel_38.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_29 = new JPanel();
		FlowLayout flowLayout_73 = (FlowLayout) panel_29.getLayout();
		flowLayout_73.setVgap(10);
		flowLayout_73.setHgap(10);
		flowLayout_73.setAlignment(FlowLayout.LEFT);
		panel_38.add(panel_29, BorderLayout.NORTH);
		
		JRadioButton rdbtnTatCaSPKM = new JRadioButton("Tất cả sản phẩm");
		rdbtnTatCaSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_29.add(rdbtnTatCaSPKM);
		
		JPanel panel_30 = new JPanel();
		panel_38.add(panel_30, BorderLayout.CENTER);
		panel_30.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_31 = new JPanel();
		FlowLayout flowLayout_74 = (FlowLayout) panel_31.getLayout();
		flowLayout_74.setVgap(10);
		flowLayout_74.setHgap(10);
		flowLayout_74.setAlignment(FlowLayout.LEFT);
		panel_30.add(panel_31, BorderLayout.NORTH);
		
		JRadioButton rdbtnTuyChonSPKM = new JRadioButton("Tùy chọn sản phẩm");
		rdbtnTuyChonSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_31.add(rdbtnTuyChonSPKM);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51)), "Ch\u1ECDn s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_30.add(panel_32, BorderLayout.CENTER);
		panel_32.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_33 = new JPanel();
		FlowLayout flowLayout_75 = (FlowLayout) panel_33.getLayout();
		flowLayout_75.setVgap(10);
		flowLayout_75.setHgap(10);
		flowLayout_75.setAlignment(FlowLayout.LEFT);
		panel_32.add(panel_33, BorderLayout.NORTH);
		
		JLabel lblTimHangSPKM = new JLabel("Hãng:");
		lblTimHangSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_33.add(lblTimHangSPKM);
		
		JComboBox cbbTimHangSPKM = new JComboBox();
		panel_33.add(cbbTimHangSPKM);
		
		JLabel lblTimTenSPKM = new JLabel("Tên sản phẩm:");
		lblTimTenSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_33.add(lblTimTenSPKM);
		
		JComboBox cbbTimTenSPKM = new JComboBox();
		panel_33.add(cbbTimTenSPKM);
		
		JButton btnTimKiemSPKM = new JButton("Tìm kiếm");
		btnTimKiemSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_33.add(btnTimKiemSPKM);
		
		JPanel panel_34 = new JPanel();
		panel_32.add(panel_34, BorderLayout.CENTER);
		panel_34.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_37 = new JPanel();
		panel_34.add(panel_37, BorderLayout.NORTH);
		panel_37.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnMaSPKM = new JPanel();
		FlowLayout flowLayout_76 = (FlowLayout) pnMaSPKM.getLayout();
		flowLayout_76.setAlignment(FlowLayout.LEFT);
		flowLayout_76.setVgap(10);
		flowLayout_76.setHgap(10);
		panel_37.add(pnMaSPKM);
		
		JLabel lblMaSPKM = new JLabel("Mã sản phẩm:");
		lblMaSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaSPKM.add(lblMaSPKM);
		
		JLabel lblLoadMaSPKM = new JLabel("SP001");
		lblLoadMaSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaSPKM.add(lblLoadMaSPKM);
		
		JPanel pnTenSPKM = new JPanel();
		FlowLayout fl_pnTenSPKM = (FlowLayout) pnTenSPKM.getLayout();
		fl_pnTenSPKM.setVgap(10);
		fl_pnTenSPKM.setHgap(10);
		fl_pnTenSPKM.setAlignment(FlowLayout.LEFT);
		panel_37.add(pnTenSPKM);
		
		JLabel lblTenSPKM = new JLabel("Tên sản phẩm:");
		lblTenSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenSPKM.add(lblTenSPKM);
		
		JLabel lblLoadTenSPKM = new JLabel("Nokia 1080");
		lblLoadTenSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenSPKM.add(lblLoadTenSPKM);
		
		JPanel panel_39 = new JPanel();
		panel_34.add(panel_39, BorderLayout.CENTER);
		panel_39.setLayout(new BorderLayout(0, 0));
		
		JPanel pnButtonTuyChonSPKM = new JPanel();
		FlowLayout flowLayout_79 = (FlowLayout) pnButtonTuyChonSPKM.getLayout();
		flowLayout_79.setVgap(10);
		flowLayout_79.setHgap(10);
		flowLayout_79.setAlignment(FlowLayout.RIGHT);
		panel_39.add(pnButtonTuyChonSPKM, BorderLayout.NORTH);
		
		JButton btnThemSPKM = new JButton("Thêm");
		btnThemSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonTuyChonSPKM.add(btnThemSPKM);
		
		JButton btnXoaSPKM = new JButton("Xóa");
		btnXoaSPKM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonTuyChonSPKM.add(btnXoaSPKM);
		
		JPanel pnTableCTKM = new JPanel();
		panel_39.add(pnTableCTKM, BorderLayout.CENTER);
		pnTableCTKM.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableCTKM = new JScrollPane();
		pnTableCTKM.add(scrollPaneTableCTKM, BorderLayout.CENTER);
		
		tableCTKM = new JTable();
		scrollPaneTableCTKM.setViewportView(tableCTKM);
		
		JPanel pnQLBH = new JPanel();
		pnThongTin.add(pnQLBH, "name_626503065559438");
		pnQLBH.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeQLBH = new JPanel();
		pnQLBH.add(pnTieuDeQLBH, BorderLayout.NORTH);
		
		JLabel lblTieuDeQLBH = new JLabel("QUẢN LÝ BẢO HÀNH");
		lblTieuDeQLBH.setForeground(new Color(0, 51, 51));
		lblTieuDeQLBH.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeQLBH.add(lblTieuDeQLBH);
		
		JPanel pnChinhQLBH = new JPanel();
		pnQLBH.add(pnChinhQLBH, BorderLayout.CENTER);
		pnChinhQLBH.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_13 = new JPanel();
		pnChinhQLBH.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_13.add(panel_15);
		panel_15.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnMaBH = new JPanel();
		FlowLayout flowLayout_39 = (FlowLayout) pnMaBH.getLayout();
		flowLayout_39.setVgap(10);
		flowLayout_39.setHgap(10);
		flowLayout_39.setAlignment(FlowLayout.LEFT);
		panel_15.add(pnMaBH);
		
		JLabel lblMaBH = new JLabel("Mã bảo hành:   ");
		lblMaBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaBH.add(lblMaBH);
		
		JComboBox comboBox_2 = new JComboBox();
		pnMaBH.add(comboBox_2);
		
		JPanel pnSoHD_BH = new JPanel();
		FlowLayout flowLayout_40 = (FlowLayout) pnSoHD_BH.getLayout();
		flowLayout_40.setVgap(10);
		flowLayout_40.setHgap(10);
		flowLayout_40.setAlignment(FlowLayout.LEFT);
		panel_15.add(pnSoHD_BH);
		
		JLabel lblSoHD_BH = new JLabel("Số hóa đơn:     ");
		lblSoHD_BH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoHD_BH.add(lblSoHD_BH);
		
		tfSoHD_BH = new JTextField();
		tfSoHD_BH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSoHD_BH.setColumns(20);
		pnSoHD_BH.add(tfSoHD_BH);
		
		JPanel pnTenSP_BH = new JPanel();
		FlowLayout fl_pnTenSP_BH = (FlowLayout) pnTenSP_BH.getLayout();
		fl_pnTenSP_BH.setVgap(10);
		fl_pnTenSP_BH.setHgap(10);
		fl_pnTenSP_BH.setAlignment(FlowLayout.LEFT);
		panel_15.add(pnTenSP_BH);
		
		JLabel lblTenSP_BH = new JLabel("Tên sản phẩm: ");
		lblTenSP_BH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenSP_BH.add(lblTenSP_BH);
		
		tfTenSP_BH = new JTextField();
		tfTenSP_BH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenSP_BH.setColumns(20);
		pnTenSP_BH.add(tfTenSP_BH);
		
		JPanel pnSerial = new JPanel();
		FlowLayout flowLayout_41 = (FlowLayout) pnSerial.getLayout();
		flowLayout_41.setVgap(10);
		flowLayout_41.setHgap(10);
		flowLayout_41.setAlignment(FlowLayout.LEFT);
		panel_15.add(pnSerial);
		
		JLabel lblSerial = new JLabel("Serial sản phẩm:");
		lblSerial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSerial.add(lblSerial);
		
		tfSerial = new JTextField();
		tfSerial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSerial.setColumns(20);
		pnSerial.add(tfSerial);
		
		JPanel pnNVNhanBH = new JPanel();
		FlowLayout flowLayout_77 = (FlowLayout) pnNVNhanBH.getLayout();
		flowLayout_77.setVgap(10);
		flowLayout_77.setHgap(10);
		flowLayout_77.setAlignment(FlowLayout.LEFT);
		panel_15.add(pnNVNhanBH);
		
		JLabel lblNVNhanBH = new JLabel("Nhân viên nhận:");
		lblNVNhanBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNVNhanBH.add(lblNVNhanBH);
		
		tfNVNhanBH = new JTextField();
		tfNVNhanBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNVNhanBH.setColumns(20);
		pnNVNhanBH.add(tfNVNhanBH);
		
		JPanel panel_40 = new JPanel();
		panel_15.add(panel_40);
		
		JPanel panel_16 = new JPanel();
		panel_13.add(panel_16);
		panel_16.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel pnYeuCauBH = new JPanel();
		FlowLayout flowLayout_42 = (FlowLayout) pnYeuCauBH.getLayout();
		flowLayout_42.setVgap(10);
		flowLayout_42.setHgap(10);
		flowLayout_42.setAlignment(FlowLayout.LEFT);
		panel_16.add(pnYeuCauBH);
		
		JLabel lblYeuCauBH = new JLabel("Yêu cầu bào hành:");
		lblYeuCauBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnYeuCauBH.add(lblYeuCauBH);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setColumns(20);
		pnYeuCauBH.add(textField_6);
		
		JPanel pnNgayNhanBH = new JPanel();
		FlowLayout fl_pnNgayNhanBH = (FlowLayout) pnNgayNhanBH.getLayout();
		fl_pnNgayNhanBH.setVgap(10);
		fl_pnNgayNhanBH.setHgap(10);
		fl_pnNgayNhanBH.setAlignment(FlowLayout.LEFT);
		panel_16.add(pnNgayNhanBH);
		
		JLabel lblNgayNhanBH = new JLabel("Ngày nhận:          ");
		lblNgayNhanBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayNhanBH.add(lblNgayNhanBH);
		
		tfNgayNhanBH = new JTextField();
		tfNgayNhanBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayNhanBH.setColumns(20);
		pnNgayNhanBH.add(tfNgayNhanBH);
		
		JPanel pnNgayTraBH = new JPanel();
		FlowLayout flowLayout_43 = (FlowLayout) pnNgayTraBH.getLayout();
		flowLayout_43.setVgap(10);
		flowLayout_43.setHgap(10);
		flowLayout_43.setAlignment(FlowLayout.LEFT);
		panel_16.add(pnNgayTraBH);
		
		JLabel lblNgayTraBH = new JLabel("Ngày trả:             ");
		lblNgayTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayTraBH.add(lblNgayTraBH);
		
		tfNgayTraBH = new JTextField();
		tfNgayTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayTraBH.setColumns(20);
		pnNgayTraBH.add(tfNgayTraBH);
		
		JPanel pnTinhTrangBH = new JPanel();
		FlowLayout flowLayout_44 = (FlowLayout) pnTinhTrangBH.getLayout();
		flowLayout_44.setVgap(10);
		flowLayout_44.setHgap(10);
		flowLayout_44.setAlignment(FlowLayout.LEFT);
		panel_16.add(pnTinhTrangBH);
		
		JLabel lblTinhTrangBH = new JLabel("Tình trạng:           ");
		lblTinhTrangBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTinhTrangBH.add(lblTinhTrangBH);
		
		JComboBox cbbTinhTrangBH = new JComboBox();
		pnTinhTrangBH.add(cbbTinhTrangBH);
		
		JPanel pnNVTraBH = new JPanel();
		FlowLayout flowLayout_78 = (FlowLayout) pnNVTraBH.getLayout();
		flowLayout_78.setVgap(10);
		flowLayout_78.setHgap(10);
		flowLayout_78.setAlignment(FlowLayout.LEFT);
		panel_16.add(pnNVTraBH);
		
		JLabel lblNVTraBH = new JLabel("Nhân viên trả:       ");
		lblNVTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNVTraBH.add(lblNVTraBH);
		
		tfNVTraBH = new JTextField();
		tfNVTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNVTraBH.setColumns(20);
		pnNVTraBH.add(tfNVTraBH);
		
		JPanel pnButtonQLBH = new JPanel();
		FlowLayout flowLayout_45 = (FlowLayout) pnButtonQLBH.getLayout();
		flowLayout_45.setVgap(10);
		flowLayout_45.setHgap(10);
		flowLayout_45.setAlignment(FlowLayout.RIGHT);
		panel_16.add(pnButtonQLBH);
		
		JButton btnTimKiemBH = new JButton("Tìm kiếm");
		btnTimKiemBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonQLBH.add(btnTimKiemBH);
		
		JButton btnCapNhatBH = new JButton("Cập nhật");
		btnCapNhatBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonQLBH.add(btnCapNhatBH);
		
		JPanel pnTableBH = new JPanel();
		pnChinhQLBH.add(pnTableBH);
		pnTableBH.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableBH = new JScrollPane();
		pnTableBH.add(scrollPaneTableBH, BorderLayout.CENTER);
		
		tableBH = new JTable();
		scrollPaneTableBH.setViewportView(tableBH);
		
		JPanel pnQLHD = new JPanel();
		pnThongTin.add(pnQLHD, "name_626508986122245");
		pnQLHD.setLayout(new BorderLayout(0, 0));
		
		JPanel pnMenuQLHD = new JPanel();
		pnMenuQLHD.setBackground(new Color(51, 102, 102));
		FlowLayout flowLayout_46 = (FlowLayout) pnMenuQLHD.getLayout();
		flowLayout_46.setVgap(10);
		flowLayout_46.setHgap(10);
		flowLayout_46.setAlignment(FlowLayout.LEFT);
		pnQLHD.add(pnMenuQLHD, BorderLayout.NORTH);
		
		JLabel lblHoaDonBan = new JLabel("BÁN HÀNG");
		lblHoaDonBan.setForeground(Color.WHITE);
		lblHoaDonBan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pnMenuQLHD.add(lblHoaDonBan);
		
		JLabel lblHoaDonMua = new JLabel("NHẬP HÀNG");
		lblHoaDonMua.setForeground(Color.WHITE);
		lblHoaDonMua.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pnMenuQLHD.add(lblHoaDonMua);
		
		JPanel panel_12 = new JPanel();
		pnQLHD.add(panel_12, BorderLayout.CENTER);
		panel_12.setLayout(new CardLayout(0, 0));
		
		JPanel pnHDBanHang = new JPanel();
		panel_12.add(pnHDBanHang, "name_727741367207950");
		pnHDBanHang.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "H\u00F3a \u0111\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnHDBanHang.add(panel_19);
		panel_19.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_22 = new JPanel();
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnMaHDBan = new JPanel();
		FlowLayout flowLayout_47 = (FlowLayout) pnMaHDBan.getLayout();
		flowLayout_47.setVgap(10);
		flowLayout_47.setHgap(10);
		flowLayout_47.setAlignment(FlowLayout.LEFT);
		panel_22.add(pnMaHDBan);
		
		JLabel lblMaHDBan = new JLabel("Mã hóa đơn:");
		lblMaHDBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaHDBan.add(lblMaHDBan);
		
		JComboBox cbbMaHDBan = new JComboBox();
		pnMaHDBan.add(cbbMaHDBan);
		
		JPanel pnNgayBan = new JPanel();
		FlowLayout flowLayout_48 = (FlowLayout) pnNgayBan.getLayout();
		flowLayout_48.setVgap(10);
		flowLayout_48.setHgap(10);
		flowLayout_48.setAlignment(FlowLayout.LEFT);
		panel_22.add(pnNgayBan);
		
		JLabel lblNgayBan = new JLabel("Ngày bán:   ");
		lblNgayBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayBan.add(lblNgayBan);
		
		tfNgayBan = new JTextField();
		tfNgayBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayBan.setColumns(20);
		pnNgayBan.add(tfNgayBan);
		
		JPanel pnNVBan = new JPanel();
		FlowLayout flowLayout_49 = (FlowLayout) pnNVBan.getLayout();
		flowLayout_49.setVgap(10);
		flowLayout_49.setHgap(10);
		flowLayout_49.setAlignment(FlowLayout.LEFT);
		panel_22.add(pnNVBan);
		
		JLabel lblNVBan = new JLabel("Nhân viên:   ");
		lblNVBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNVBan.add(lblNVBan);
		
		tfNVBan = new JTextField();
		tfNVBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNVBan.setColumns(20);
		pnNVBan.add(tfNVBan);
		
		JPanel pnKH = new JPanel();
		FlowLayout flowLayout_50 = (FlowLayout) pnKH.getLayout();
		flowLayout_50.setVgap(10);
		flowLayout_50.setHgap(10);
		flowLayout_50.setAlignment(FlowLayout.LEFT);
		panel_22.add(pnKH);
		
		JLabel lblKH = new JLabel("Khách hàng: ");
		lblKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnKH.add(lblKH);
		
		tfKH = new JTextField();
		tfKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfKH.setColumns(20);
		pnKH.add(tfKH);
		
		JPanel pnTongTienBan = new JPanel();
		FlowLayout flowLayout_51 = (FlowLayout) pnTongTienBan.getLayout();
		flowLayout_51.setVgap(10);
		flowLayout_51.setHgap(10);
		flowLayout_51.setAlignment(FlowLayout.LEFT);
		panel_22.add(pnTongTienBan);
		
		JLabel lblTongTienBan = new JLabel("Tổng tiền:    ");
		lblTongTienBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTongTienBan.add(lblTongTienBan);
		
		tfTongTienBan = new JTextField();
		tfTongTienBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTongTienBan.setColumns(20);
		pnTongTienBan.add(tfTongTienBan);
		
		JPanel pnButtonHDBan = new JPanel();
		FlowLayout flowLayout_52 = (FlowLayout) pnButtonHDBan.getLayout();
		flowLayout_52.setVgap(10);
		flowLayout_52.setHgap(10);
		flowLayout_52.setAlignment(FlowLayout.RIGHT);
		panel_22.add(pnButtonHDBan);
		
		JButton btnTimKiemHDBan = new JButton("Tìm kiếm");
		btnTimKiemHDBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonHDBan.add(btnTimKiemHDBan);
		
		JPanel pnTableHHBanHang = new JPanel();
		panel_19.add(pnTableHHBanHang);
		pnTableHHBanHang.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableHDBanHang = new JScrollPane();
		pnTableHHBanHang.add(scrollPaneTableHDBanHang, BorderLayout.CENTER);
		
		tableHDBanHang = new JTable();
		scrollPaneTableHDBanHang.setViewportView(tableHDBanHang);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "Chi ti\u1EBFt h\u00F3a \u0111\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnHDBanHang.add(panel_17);
		panel_17.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_23 = new JPanel();
		panel_17.add(panel_23);
		panel_23.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnSPBan = new JPanel();
		FlowLayout flowLayout_53 = (FlowLayout) pnSPBan.getLayout();
		flowLayout_53.setVgap(10);
		flowLayout_53.setHgap(10);
		flowLayout_53.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnSPBan);
		
		JLabel lblSPBan = new JLabel("Sản phẩm:  ");
		lblSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSPBan.add(lblSPBan);
		
		tfSPBan = new JTextField();
		tfSPBan.setEditable(false);
		tfSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSPBan.setColumns(20);
		pnSPBan.add(tfSPBan);
		
		JPanel pnSLBan = new JPanel();
		FlowLayout flowLayout_54 = (FlowLayout) pnSLBan.getLayout();
		flowLayout_54.setVgap(10);
		flowLayout_54.setHgap(10);
		flowLayout_54.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnSLBan);
		
		JLabel lblSLBan = new JLabel("Số lượng:    ");
		lblSLBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSLBan.add(lblSLBan);
		
		tfSLBan = new JTextField();
		tfSLBan.setEditable(false);
		tfSLBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSLBan.setColumns(20);
		pnSLBan.add(tfSLBan);
		
		JPanel pnKMBan = new JPanel();
		FlowLayout fl_pnKMBan = (FlowLayout) pnKMBan.getLayout();
		fl_pnKMBan.setVgap(10);
		fl_pnKMBan.setHgap(10);
		fl_pnKMBan.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnKMBan);
		
		JLabel lblKMBan = new JLabel("Khuyến mãi:");
		lblKMBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnKMBan.add(lblKMBan);
		
		tfKMBan = new JTextField();
		tfKMBan.setEditable(false);
		tfKMBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfKMBan.setColumns(20);
		pnKMBan.add(tfKMBan);
		
		JPanel pnGiaGocSPBan = new JPanel();
		FlowLayout fl_pnGiaGocSPBan = (FlowLayout) pnGiaGocSPBan.getLayout();
		fl_pnGiaGocSPBan.setVgap(10);
		fl_pnGiaGocSPBan.setHgap(10);
		fl_pnGiaGocSPBan.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnGiaGocSPBan);
		
		JLabel lblGiaGocSPBan = new JLabel("Giá gốc:      ");
		lblGiaGocSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnGiaGocSPBan.add(lblGiaGocSPBan);
		
		tfGiaGocSPBan = new JTextField();
		tfGiaGocSPBan.setEditable(false);
		tfGiaGocSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfGiaGocSPBan.setColumns(20);
		pnGiaGocSPBan.add(tfGiaGocSPBan);
		
		JPanel pnTienGiamSPBan = new JPanel();
		FlowLayout flowLayout_55 = (FlowLayout) pnTienGiamSPBan.getLayout();
		flowLayout_55.setVgap(10);
		flowLayout_55.setHgap(10);
		flowLayout_55.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnTienGiamSPBan);
		
		JLabel lblTienGiamSPBan = new JLabel("Tiền giảm:   ");
		lblTienGiamSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTienGiamSPBan.add(lblTienGiamSPBan);
		
		tfTienGiamSPBan = new JTextField();
		tfTienGiamSPBan.setEditable(false);
		tfTienGiamSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTienGiamSPBan.setColumns(20);
		pnTienGiamSPBan.add(tfTienGiamSPBan);
		
		JPanel pnThanhTienSPBan = new JPanel();
		FlowLayout flowLayout_56 = (FlowLayout) pnThanhTienSPBan.getLayout();
		flowLayout_56.setVgap(10);
		flowLayout_56.setHgap(10);
		flowLayout_56.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnThanhTienSPBan);
		
		JLabel lblThanhTienSPBan = new JLabel("Thành tiền:  ");
		lblThanhTienSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThanhTienSPBan.add(lblThanhTienSPBan);
		
		tfThanhTienSPBan = new JTextField();
		tfThanhTienSPBan.setEditable(false);
		tfThanhTienSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfThanhTienSPBan.setColumns(20);
		pnThanhTienSPBan.add(tfThanhTienSPBan);
		
		JPanel pnCTHDBanHang = new JPanel();
		panel_17.add(pnCTHDBanHang);
		pnCTHDBanHang.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneCTHDBanHang = new JScrollPane();
		pnCTHDBanHang.add(scrollPaneCTHDBanHang, BorderLayout.CENTER);
		
		tableCTHDBanHang = new JTable();
		scrollPaneCTHDBanHang.setViewportView(tableCTHDBanHang);
		
		JPanel pnHDNhapHang = new JPanel();
		panel_12.add(pnHDNhapHang, "name_736047529546014");
		pnHDNhapHang.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "H\u00F3a \u0111\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnHDNhapHang.add(panel_26);
		panel_26.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_27 = new JPanel();
		panel_26.add(panel_27);
		panel_27.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnMaHDNhap = new JPanel();
		FlowLayout flowLayout_57 = (FlowLayout) pnMaHDNhap.getLayout();
		flowLayout_57.setVgap(10);
		flowLayout_57.setHgap(10);
		flowLayout_57.setAlignment(FlowLayout.LEFT);
		panel_27.add(pnMaHDNhap);
		
		JLabel lblMaHDNhap = new JLabel("Mã hóa đơn:  ");
		lblMaHDNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaHDNhap.add(lblMaHDNhap);
		
		JComboBox cbbMaHDNhap = new JComboBox();
		pnMaHDNhap.add(cbbMaHDNhap);
		
		JPanel pnNgayNhap = new JPanel();
		FlowLayout flowLayout_58 = (FlowLayout) pnNgayNhap.getLayout();
		flowLayout_58.setVgap(10);
		flowLayout_58.setHgap(10);
		flowLayout_58.setAlignment(FlowLayout.LEFT);
		panel_27.add(pnNgayNhap);
		
		JLabel lblNgayNhap = new JLabel("Ngày nhập:    ");
		lblNgayNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayNhap.add(lblNgayNhap);
		
		tfNgayNhap = new JTextField();
		tfNgayNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayNhap.setColumns(20);
		pnNgayNhap.add(tfNgayNhap);
		
		JPanel pnNVNhap = new JPanel();
		FlowLayout flowLayout_59 = (FlowLayout) pnNVNhap.getLayout();
		flowLayout_59.setVgap(10);
		flowLayout_59.setHgap(10);
		flowLayout_59.setAlignment(FlowLayout.LEFT);
		panel_27.add(pnNVNhap);
		
		JLabel lblNVNhap = new JLabel("Nhân viên:     ");
		lblNVNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNVNhap.add(lblNVNhap);
		
		tfNVNhap = new JTextField();
		tfNVNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNVNhap.setColumns(20);
		pnNVNhap.add(tfNVNhap);
		
		JPanel pnNCC = new JPanel();
		FlowLayout flowLayout_60 = (FlowLayout) pnNCC.getLayout();
		flowLayout_60.setAlignment(FlowLayout.LEFT);
		flowLayout_60.setVgap(10);
		flowLayout_60.setHgap(10);
		panel_27.add(pnNCC);
		
		JLabel lblNCC = new JLabel("Nhà cung cấp:");
		lblNCC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNCC.add(lblNCC);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_9.setColumns(20);
		pnNCC.add(textField_9);
		
		JPanel pnTongTienNhap = new JPanel();
		FlowLayout flowLayout_61 = (FlowLayout) pnTongTienNhap.getLayout();
		flowLayout_61.setVgap(10);
		flowLayout_61.setHgap(10);
		flowLayout_61.setAlignment(FlowLayout.LEFT);
		panel_27.add(pnTongTienNhap);
		
		JLabel lblTongTienNhap = new JLabel("Tổng tiền:      ");
		lblTongTienNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTongTienNhap.add(lblTongTienNhap);
		
		tfTongTienNhap = new JTextField();
		tfTongTienNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTongTienNhap.setColumns(20);
		pnTongTienNhap.add(tfTongTienNhap);
		
		JPanel pnButtonTim = new JPanel();
		FlowLayout flowLayout_62 = (FlowLayout) pnButtonTim.getLayout();
		flowLayout_62.setVgap(10);
		flowLayout_62.setHgap(10);
		flowLayout_62.setAlignment(FlowLayout.RIGHT);
		panel_27.add(pnButtonTim);
		
		JButton btnTimKiemHDNhap = new JButton("Tìm kiếm");
		btnTimKiemHDNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonTim.add(btnTimKiemHDNhap);
		
		JPanel pnTableHDNhap = new JPanel();
		panel_26.add(pnTableHDNhap);
		pnTableHDNhap.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableHDNhap = new JScrollPane();
		pnTableHDNhap.add(scrollPaneTableHDNhap, BorderLayout.CENTER);
		
		tableHDNhap = new JTable();
		scrollPaneTableHDNhap.setViewportView(tableHDNhap);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "Chi ti\u1EBFt h\u00F3a \u0111\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnHDNhapHang.add(panel_35);
		panel_35.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_36 = new JPanel();
		panel_35.add(panel_36);
		panel_36.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnSPNhap = new JPanel();
		FlowLayout flowLayout_63 = (FlowLayout) pnSPNhap.getLayout();
		flowLayout_63.setVgap(10);
		flowLayout_63.setHgap(10);
		flowLayout_63.setAlignment(FlowLayout.LEFT);
		panel_36.add(pnSPNhap);
		
		JLabel label_9 = new JLabel("Sản phẩm:  ");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSPNhap.add(label_9);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_11.setEditable(false);
		textField_11.setColumns(20);
		pnSPNhap.add(textField_11);
		
		JPanel pnSLNhap = new JPanel();
		FlowLayout flowLayout_64 = (FlowLayout) pnSLNhap.getLayout();
		flowLayout_64.setVgap(10);
		flowLayout_64.setHgap(10);
		flowLayout_64.setAlignment(FlowLayout.LEFT);
		panel_36.add(pnSLNhap);
		
		JLabel label_10 = new JLabel("Số lượng:    ");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSLNhap.add(label_10);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_12.setEditable(false);
		textField_12.setColumns(20);
		pnSLNhap.add(textField_12);
		
		JPanel pnDonGiaNhap = new JPanel();
		FlowLayout flowLayout_65 = (FlowLayout) pnDonGiaNhap.getLayout();
		flowLayout_65.setVgap(10);
		flowLayout_65.setAlignment(FlowLayout.LEFT);
		flowLayout_65.setHgap(10);
		panel_36.add(pnDonGiaNhap);
		
		JLabel lblDonGiaNhap = new JLabel("Đơn giá:      ");
		lblDonGiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnDonGiaNhap.add(lblDonGiaNhap);
		
		tfDonGiaNhap = new JTextField();
		tfDonGiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfDonGiaNhap.setEditable(false);
		tfDonGiaNhap.setColumns(20);
		pnDonGiaNhap.add(tfDonGiaNhap);
		
		JPanel pnThanhTienNhap = new JPanel();
		FlowLayout flowLayout_66 = (FlowLayout) pnThanhTienNhap.getLayout();
		flowLayout_66.setVgap(10);
		flowLayout_66.setHgap(10);
		flowLayout_66.setAlignment(FlowLayout.LEFT);
		panel_36.add(pnThanhTienNhap);
		
		JLabel lblThanhTienNhap = new JLabel("Thành tiền:  ");
		lblThanhTienNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThanhTienNhap.add(lblThanhTienNhap);
		
		tfThanhTienNhap = new JTextField();
		tfThanhTienNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfThanhTienNhap.setEditable(false);
		tfThanhTienNhap.setColumns(20);
		pnThanhTienNhap.add(tfThanhTienNhap);
		
		JPanel pnTableCTHDNhap = new JPanel();
		panel_35.add(pnTableCTHDNhap);
		pnTableCTHDNhap.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneCTHDNhap = new JScrollPane();
		pnTableCTHDNhap.add(scrollPaneCTHDNhap, BorderLayout.CENTER);
		
		tableCTHDNhap = new JTable();
		scrollPaneCTHDNhap.setViewportView(tableCTHDNhap);
		
		JPanel pnThongKe = new JPanel();
		pnThongTin.add(pnThongKe, "name_772944630098931");
		pnThongKe.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeThongKe = new JPanel();
		pnThongKe.add(pnTieuDeThongKe, BorderLayout.NORTH);
		
		JLabel lblTieuDeThongKe = new JLabel("THỐNG KÊ");
		lblTieuDeThongKe.setForeground(new Color(0, 51, 51));
		lblTieuDeThongKe.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeThongKe.add(lblTieuDeThongKe);
		
		JPanel panel_21 = new JPanel();
		pnThongKe.add(panel_21, BorderLayout.CENTER);
	}
}
