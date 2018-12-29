import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;

public class NhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField tfSoCMND;
	private JTextField tfHoTen;
	private JTextField tfSoDTKH;
	private JTextField tfEmail;
	private JTextField tfTongTien;
	private JTextField tfGiamGia;
	private JTextField tfThanhTien;
	private JTable tableCTHD;
	private JTextField tfDiaChi;
	private JTextField tfMaPhieuNhap;
	private JTextField tfNgayNhapHang;
	private JTextField tfSoLuongNhap;
	private JTextField tfDonGiaNhap;
	private JTable tableChiTietNhap;
	private JTextField tfMaHD;
	private JTextField tfTenKHGuiBH;
	private JTextField tfCMNDGuiBH;
	private JTextField tfTenSPGuiBH;
	private JTextField tfThoiGianBHSP;
	private JTextField tfNgayMuaSPBH;
	private JTextField tfSerialSPBH;
	private JTextField tfNgayNhanBH;
	private JTextField tfMaPhieuBH;
	private JTextField tfTenKHTraBH;
	private JTextField tfSoCMNDKH;
	private JTextField tfTenSPTraBH;
	private JTextField tfSerialTraBH;
	private JTextField tfNgayNhan_TraBH;
	private JTextField tfTinhTrang_TraBH;
	private JTextField tfNgayTraBH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NhanVien frame = new NhanVien();
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
	public NhanVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1379, 866);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnTop = new JPanel();
		pnTop.setBackground(new Color(0, 51, 51));
		contentPane.add(pnTop, BorderLayout.NORTH);
		pnTop.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 5));
		
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
		
		JLabel lblHoaDon = new JLabel("LẬP HÓA ĐƠN");
		lblHoaDon.setForeground(Color.WHITE);
		lblHoaDon.setBackground(new Color(0, 51, 51));
		lblHoaDon.setBounds(0, 0, 135, 45);
		lblHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		pnMenu.add(lblHoaDon);
		
		JLabel lblBaoHanh = new JLabel("BẢO HÀNH");
		lblBaoHanh.setForeground(Color.WHITE);
		lblBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBaoHanh.setBounds(0, 45, 135, 45);
		lblBaoHanh.setHorizontalAlignment(SwingConstants.CENTER);
		pnMenu.add(lblBaoHanh);
		
		JLabel lblNhapHang = new JLabel("NHẬP HÀNG");
		lblNhapHang.setForeground(Color.WHITE);
		lblNhapHang.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNhapHang.setBounds(0, 90, 135, 45);
		lblNhapHang.setHorizontalAlignment(SwingConstants.CENTER);
		pnMenu.add(lblNhapHang);
		
		JPanel pnInfo = new JPanel();
		pnInfo.setBounds(134, 0, 1217, 774);
		pnCenter.add(pnInfo);
		pnInfo.setLayout(new CardLayout(0, 0));
		
//Tab Hóa đơn
		
		JPanel pnHoaDon = new JPanel();
		pnInfo.add(pnHoaDon);
		pnHoaDon.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTopHD = new JPanel();
		pnHoaDon.add(pnTopHD, BorderLayout.NORTH);
		pnTopHD.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));
		
		JLabel lblTimHang = new JLabel("Hãng:");
		lblTimHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTopHD.add(lblTimHang);
		
		JComboBox cbbTimHang = new JComboBox();
		pnTopHD.add(cbbTimHang);
		
		JLabel lblTimTenSP = new JLabel("Tên sản phẩm:");
		lblTimTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTopHD.add(lblTimTenSP);
		
		JComboBox cbbTimTenSP = new JComboBox();
		pnTopHD.add(cbbTimTenSP);
		
		JButton btnTimSP = new JButton("Tìm kiếm sản phẩm");
		btnTimSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTopHD.add(btnTimSP);
		
		JPanel pnCenterHD = new JPanel();
		pnHoaDon.add(pnCenterHD, BorderLayout.CENTER);
		pnCenterHD.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel pnThongTinSP = new JPanel();
		pnCenterHD.add(pnThongTinSP);
		pnThongTinSP.setLayout(null);
		
		JPanel pnThongTin = new JPanel();
		pnThongTin.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u00F4ng tin chi ti\u1EBFt s\u1EA3n ph\u1EA9m:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnThongTin.setBounds(12, 13, 584, 466);
		pnThongTinSP.add(pnThongTin);
		pnThongTin.setLayout(null);
		
		JLabel lblHASP = new JLabel("Hình Ảnh");
		lblHASP.setHorizontalAlignment(SwingConstants.CENTER);
		lblHASP.setBounds(180, 23, 200, 200);
		pnThongTin.add(lblHASP);
		
		JLabel lblMaSP = new JLabel("Mã sản phẩm:");
		lblMaSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaSP.setBounds(12, 263, 95, 20);
		pnThongTin.add(lblMaSP);
		
		JLabel lblLoadMaSP = new JLabel("SP001");
		lblLoadMaSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadMaSP.setBounds(160, 265, 56, 19);
		pnThongTin.add(lblLoadMaSP);
		
		JLabel lblHang = new JLabel("Hãng: ");
		lblHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHang.setBounds(12, 296, 56, 20);
		pnThongTin.add(lblHang);
		
		JLabel lblLoadHang = new JLabel("Nokia");
		lblLoadHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadHang.setBounds(160, 299, 73, 17);
		pnThongTin.add(lblLoadHang);
		
		JLabel lblThoiGianBaoHanh = new JLabel("Bảo hành:");
		lblThoiGianBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblThoiGianBaoHanh.setBounds(12, 335, 73, 20);
		pnThongTin.add(lblThoiGianBaoHanh);
		
		JLabel lblLoadTHoiGianBaoHanh = new JLabel("2 năm");
		lblLoadTHoiGianBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadTHoiGianBaoHanh.setBounds(160, 338, 56, 17);
		pnThongTin.add(lblLoadTHoiGianBaoHanh);
		
		JLabel lblTheNho = new JLabel("Thẻ nhớ:");
		lblTheNho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTheNho.setBounds(12, 368, 73, 20);
		pnThongTin.add(lblTheNho);
		
		JLabel lblLoadTheNho = new JLabel("2GB");
		lblLoadTheNho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadTheNho.setBounds(160, 371, 56, 17);
		pnThongTin.add(lblLoadTheNho);
		
		JLabel lblSoLuongSanCo = new JLabel("Số lượng sẵn có:");
		lblSoLuongSanCo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoLuongSanCo.setBounds(12, 404, 118, 20);
		pnThongTin.add(lblSoLuongSanCo);
		
		JLabel lblLoadSoLuongSanCo = new JLabel("20");
		lblLoadSoLuongSanCo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadSoLuongSanCo.setBounds(160, 408, 56, 16);
		pnThongTin.add(lblLoadSoLuongSanCo);
		
		JLabel lblTenSP = new JLabel("Tên sản phẩm:");
		lblTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTenSP.setBounds(283, 266, 108, 17);
		pnThongTin.add(lblTenSP);
		
		JLabel lblLoadTenSP = new JLabel("Nokia 1280");
		lblLoadTenSP.setEnabled(true);
		lblLoadTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadTenSP.setBounds(415, 263, 84, 20);
		pnThongTin.add(lblLoadTenSP);
		
		JLabel lblXuatXu = new JLabel("Xuất xứ:");
		lblXuatXu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblXuatXu.setBounds(283, 296, 85, 20);
		pnThongTin.add(lblXuatXu);
		
		JLabel lblLoadXuatXu = new JLabel("Trung Quốc");
		lblLoadXuatXu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadXuatXu.setBounds(415, 299, 84, 20);
		pnThongTin.add(lblLoadXuatXu);
		
		JLabel lblMau = new JLabel("Màu:");
		lblMau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMau.setBounds(283, 336, 56, 20);
		pnThongTin.add(lblMau);
		
		JLabel lblLoadMau = new JLabel("Hồng");
		lblLoadMau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadMau.setBounds(415, 336, 56, 20);
		pnThongTin.add(lblLoadMau);
		
		JLabel lblKichThuoc = new JLabel("Kích thước:");
		lblKichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKichThuoc.setBounds(283, 371, 73, 17);
		pnThongTin.add(lblKichThuoc);
		
		JLabel lblLoadKichThuoc = new JLabel("200X200");
		lblLoadKichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadKichThuoc.setBounds(415, 368, 67, 20);
		pnThongTin.add(lblLoadKichThuoc);
		
		JLabel lblNamSX = new JLabel("Năm sản xuất:");
		lblNamSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNamSX.setBounds(283, 404, 108, 20);
		pnThongTin.add(lblNamSX);
		
		JLabel lblLoadNamSX = new JLabel("2000");
		lblLoadNamSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadNamSX.setBounds(415, 404, 56, 20);
		pnThongTin.add(lblLoadNamSX);
		
		JLabel lblSLng = new JLabel("Số lượng:");
		lblSLng.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSLng.setBounds(244, 508, 74, 20);
		pnThongTinSP.add(lblSLng);
		
		JSpinner spinnerSoLuong = new JSpinner();
		spinnerSoLuong.setBounds(330, 505, 41, 29);
		pnThongTinSP.add(spinnerSoLuong);
		
		JButton btnThemSPBan = new JButton("Thêm sản phẩm");
		btnThemSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnThemSPBan.setBounds(427, 506, 158, 27);
		pnThongTinSP.add(btnThemSPBan);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 51, 51));
		separator_2.setForeground(new Color(0, 51, 51));
		separator_2.setBounds(35, 559, 573, 20);
		pnThongTinSP.add(separator_2);
		
		JPanel pnCTHD = new JPanel();
		pnCenterHD.add(pnCTHD);
		pnCTHD.setLayout(null);
		
		JLabel lblTongTien = new JLabel("Tổng tiền:");
		lblTongTien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTongTien.setBounds(12, 462, 74, 26);
		pnCTHD.add(lblTongTien);
		
		tfTongTien = new JTextField();
		tfTongTien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTongTien.setBounds(90, 465, 99, 22);
		pnCTHD.add(tfTongTien);
		tfTongTien.setColumns(10);
		
		JLabel lblGiamGia = new JLabel("Giảm giá:");
		lblGiamGia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGiamGia.setBounds(213, 465, 61, 21);
		pnCTHD.add(lblGiamGia);
		
		tfGiamGia = new JTextField();
		tfGiamGia.setText("");
		tfGiamGia.setBounds(286, 465, 99, 22);
		pnCTHD.add(tfGiamGia);
		tfGiamGia.setColumns(10);
		
		JLabel lblThanhTien = new JLabel("Thành Tiền:");
		lblThanhTien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblThanhTien.setBounds(410, 465, 90, 20);
		pnCTHD.add(lblThanhTien);
		
		tfThanhTien = new JTextField();
		tfThanhTien.setBounds(501, 465, 99, 22);
		pnCTHD.add(tfThanhTien);
		tfThanhTien.setColumns(10);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa.setBounds(383, 515, 97, 25);
		pnCTHD.add(btnXoa);
		
		JButton btnReset = new JButton("Đặt lại");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setBounds(503, 515, 97, 25);
		pnCTHD.add(btnReset);
		
		JPanel pntableCTHD = new JPanel();
		pntableCTHD.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Chi ti\u1EBFt h\u00F3a \u0111\u01A1n:", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pntableCTHD.setBounds(12, 13, 588, 425);
		pnCTHD.add(pntableCTHD);
		pntableCTHD.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTableCTHD = new JScrollPane();
		pntableCTHD.add(scrollPaneTableCTHD);
		
		tableCTHD = new JTable();
		scrollPaneTableCTHD.setViewportView(tableCTHD);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 13, 16, 523);
		pnCTHD.add(separator);
		separator.setBackground(new Color(0, 51, 51));
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 51, 51));
		separator_1.setBackground(new Color(0, 51, 51));
		separator_1.setBounds(0, 559, 561, 22);
		pnCTHD.add(separator_1);
		
		JPanel pnBottomHD = new JPanel();
		pnHoaDon.add(pnBottomHD, BorderLayout.SOUTH);
		pnBottomHD.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnThongTinKhachHang = new JPanel();
		pnBottomHD.add(pnThongTinKhachHang);
		pnThongTinKhachHang.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnThongTinKH1 = new JPanel();
		pnThongTinKhachHang.add(pnThongTinKH1);
		pnThongTinKH1.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel pnSoCMND = new JPanel();
		pnThongTinKH1.add(pnSoCMND);
		pnSoCMND.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));
		
		JLabel lblSoCMND = new JLabel("Số CMND:");
		lblSoCMND.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoCMND.add(lblSoCMND);
		
		tfSoCMND = new JTextField();
		pnSoCMND.add(tfSoCMND);
		tfSoCMND.setColumns(30);
		
		JButton btnKiemTraKH = new JButton("Kiểm tra");
		btnKiemTraKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoCMND.add(btnKiemTraKH);
		
		JPanel pnHoTen = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnHoTen.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setHgap(15);
		pnThongTinKH1.add(pnHoTen);
		
		JLabel lblNewLabel = new JLabel("Họ tên:   ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnHoTen.add(lblNewLabel);
		
		tfHoTen = new JTextField();
		pnHoTen.add(tfHoTen);
		tfHoTen.setColumns(30);
		
		JPanel panel_1 = new JPanel();
		pnThongTinKH1.add(panel_1);
		
		JPanel pnButtonThanhToan = new JPanel();
		pnThongTinKH1.add(pnButtonThanhToan);
		pnButtonThanhToan.setLayout(new FlowLayout(FlowLayout.RIGHT, 15, 5));
		
		JButton btnThanhToan = new JButton("Thanh Toán");
		btnThanhToan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonThanhToan.add(btnThanhToan);
		
		JPanel pnThongTinKH2 = new JPanel();
		pnThongTinKhachHang.add(pnThongTinKH2);
		pnThongTinKH2.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel.getLayout();
		flowLayout_5.setVgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		flowLayout_5.setHgap(15);
		pnThongTinKH2.add(panel);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ:        ");
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblDiaChi);
		
		tfDiaChi = new JTextField();
		tfDiaChi.setColumns(30);
		panel.add(tfDiaChi);
		
		JPanel pnSoDT = new JPanel();
		FlowLayout fl_pnSoDT = (FlowLayout) pnSoDT.getLayout();
		fl_pnSoDT.setAlignment(FlowLayout.LEFT);
		fl_pnSoDT.setHgap(15);
		pnThongTinKH2.add(pnSoDT);
		
		JLabel lblSoDTKH = new JLabel("Số điện thoại:");
		lblSoDTKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoDT.add(lblSoDTKH);
		
		tfSoDTKH = new JTextField();
		pnSoDT.add(tfSoDTKH);
		tfSoDTKH.setColumns(30);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		flowLayout_2.setHgap(15);
		pnThongTinKH2.add(panel_2);
		
		JLabel lblEmail = new JLabel("Email:          ");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblEmail);
		
		tfEmail = new JTextField();
		panel_2.add(tfEmail);
		tfEmail.setColumns(30);
		
		JPanel pnButtonCapNhat = new JPanel();
		pnThongTinKH2.add(pnButtonCapNhat);
		pnButtonCapNhat.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel pnButtonHuy = new JPanel();
		pnButtonCapNhat.add(pnButtonHuy);
		pnButtonHuy.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));
		
		JButton bthHuyBanHang = new JButton("Hủy");
		bthHuyBanHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonHuy.add(bthHuyBanHang);
		
		JPanel pnButtonCapNhatThongTinKH = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) pnButtonCapNhatThongTinKH.getLayout();
		flowLayout_3.setAlignment(FlowLayout.RIGHT);
		flowLayout_3.setHgap(15);
		pnButtonCapNhat.add(pnButtonCapNhatThongTinKH);
		
		JButton btnCapNhatThongTinKH = new JButton("Cập nhật thông tin");
		btnCapNhatThongTinKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonCapNhatThongTinKH.add(btnCapNhatThongTinKH);
		
//Tab Bảo hành
		JPanel pnBaoHanh = new JPanel();
		pnInfo.add(pnBaoHanh, "name_7088051573399");
		pnBaoHanh.setLayout(new BorderLayout(0, 0));
		
		JPanel pnMenuBaoHanh = new JPanel();
		pnMenuBaoHanh.setBackground(new Color(51, 102, 102));
		pnBaoHanh.add(pnMenuBaoHanh, BorderLayout.NORTH);
		pnMenuBaoHanh.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		JLabel lblGuiBaoHanh = new JLabel("GỬI BẢO HÀNH");
		lblGuiBaoHanh.setForeground(new Color(255, 255, 255));
		lblGuiBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pnMenuBaoHanh.add(lblGuiBaoHanh);
		
		JLabel lblTraBaoHanh = new JLabel("TRẢ BẢO HÀNH");
		lblTraBaoHanh.setForeground(new Color(255, 255, 255));
		lblTraBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pnMenuBaoHanh.add(lblTraBaoHanh);
		
		JPanel pnBaoHanhCenter = new JPanel();
		pnBaoHanh.add(pnBaoHanhCenter, BorderLayout.CENTER);
		pnBaoHanhCenter.setLayout(new CardLayout(0, 0));
		
		JPanel pnGuiBaoHanh = new JPanel();
		pnBaoHanhCenter.add(pnGuiBaoHanh, "name_361704931446671");
		pnGuiBaoHanh.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeGuiBH = new JPanel();
		pnGuiBaoHanh.add(pnTieuDeGuiBH, BorderLayout.NORTH);
		
		JLabel lblTieuDeGuiBH = new JLabel("GỬI BẢO HÀNH");
		lblTieuDeGuiBH.setForeground(new Color(0, 51, 51));
		lblTieuDeGuiBH.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeGuiBH.add(lblTieuDeGuiBH);
		
		JPanel pnCenterGuiBH = new JPanel();
		pnGuiBaoHanh.add(pnCenterGuiBH, BorderLayout.CENTER);
		pnCenterGuiBH.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "Ki\u1EC3m tra th\u00F4ng tin:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnCenterGuiBH.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JPanel pnThongTinKiemTra = new JPanel();
		FlowLayout fl_pnThongTinKiemTra = (FlowLayout) pnThongTinKiemTra.getLayout();
		fl_pnThongTinKiemTra.setVgap(10);
		fl_pnThongTinKiemTra.setHgap(10);
		fl_pnThongTinKiemTra.setAlignment(FlowLayout.LEFT);
		panel_12.add(pnThongTinKiemTra, BorderLayout.NORTH);
		
		JLabel lblMaHD = new JLabel("Mã hóa đơn:");
		lblMaHD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThongTinKiemTra.add(lblMaHD);
		
		tfMaHD = new JTextField();
		tfMaHD.setColumns(10);
		pnThongTinKiemTra.add(tfMaHD);
		
		JLabel lblMaSPGuiBH = new JLabel("Mã sản phẩm:");
		lblMaSPGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThongTinKiemTra.add(lblMaSPGuiBH);
		
		JComboBox cbbMaSPGuiBH = new JComboBox();
		pnThongTinKiemTra.add(cbbMaSPGuiBH);
		
		JButton btnKiemTraGuiBH = new JButton("Kiểm tra");
		btnKiemTraGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThongTinKiemTra.add(btnKiemTraGuiBH);
		
		JPanel panel_14 = new JPanel();
		panel_12.add(panel_14, BorderLayout.CENTER);
		panel_14.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnTenKHGuiBH = new JPanel();
		FlowLayout fl_pnTenKHGuiBH = (FlowLayout) pnTenKHGuiBH.getLayout();
		fl_pnTenKHGuiBH.setVgap(10);
		fl_pnTenKHGuiBH.setHgap(10);
		fl_pnTenKHGuiBH.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnTenKHGuiBH);
		
		JLabel lblTenKHGuiBH = new JLabel("Tên khách hàng:");
		lblTenKHGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenKHGuiBH.add(lblTenKHGuiBH);
		
		tfTenKHGuiBH = new JTextField();
		tfTenKHGuiBH.setEditable(false);
		tfTenKHGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenKHGuiBH.setColumns(20);
		pnTenKHGuiBH.add(tfTenKHGuiBH);
		
		JPanel pnCMNDGuiBH = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) pnCMNDGuiBH.getLayout();
		flowLayout_4.setVgap(10);
		flowLayout_4.setHgap(10);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnCMNDGuiBH);
		
		JLabel lblCMNDGuiBH = new JLabel("Số CMND:         ");
		lblCMNDGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnCMNDGuiBH.add(lblCMNDGuiBH);
		
		tfCMNDGuiBH = new JTextField();
		tfCMNDGuiBH.setEditable(false);
		tfCMNDGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfCMNDGuiBH.setColumns(20);
		pnCMNDGuiBH.add(tfCMNDGuiBH);
		
		JPanel pnTenSPGuiBH = new JPanel();
		FlowLayout flowLayout_12 = (FlowLayout) pnTenSPGuiBH.getLayout();
		flowLayout_12.setVgap(10);
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnTenSPGuiBH);
		
		JLabel lblTenSPGuiBH = new JLabel("Tên sản phẩm:  ");
		lblTenSPGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenSPGuiBH.add(lblTenSPGuiBH);
		
		tfTenSPGuiBH = new JTextField();
		tfTenSPGuiBH.setEditable(false);
		tfTenSPGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenSPGuiBH.setColumns(20);
		pnTenSPGuiBH.add(tfTenSPGuiBH);
		
		JPanel pnThoiGianBHSP = new JPanel();
		FlowLayout flowLayout_13 = (FlowLayout) pnThoiGianBHSP.getLayout();
		flowLayout_13.setVgap(10);
		flowLayout_13.setHgap(10);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnThoiGianBHSP);
		
		JLabel lblThoiGianBHSP = new JLabel("Bảo hành:         ");
		lblThoiGianBHSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThoiGianBHSP.add(lblThoiGianBHSP);
		
		tfThoiGianBHSP = new JTextField();
		tfThoiGianBHSP.setEditable(false);
		tfThoiGianBHSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfThoiGianBHSP.setColumns(20);
		pnThoiGianBHSP.add(tfThoiGianBHSP);
		
		JPanel pnNgayMuaSPBH = new JPanel();
		FlowLayout fl_pnNgayMuaSPBH = (FlowLayout) pnNgayMuaSPBH.getLayout();
		fl_pnNgayMuaSPBH.setVgap(10);
		fl_pnNgayMuaSPBH.setHgap(10);
		fl_pnNgayMuaSPBH.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnNgayMuaSPBH);
		
		JLabel lblNgayMuaSPBH = new JLabel("Ngày mua:        ");
		lblNgayMuaSPBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayMuaSPBH.add(lblNgayMuaSPBH);
		
		tfNgayMuaSPBH = new JTextField();
		tfNgayMuaSPBH.setEditable(false);
		tfNgayMuaSPBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayMuaSPBH.setColumns(20);
		pnNgayMuaSPBH.add(tfNgayMuaSPBH);
		
		JPanel pnThongBao = new JPanel();
		panel_14.add(pnThongBao);
		
		JLabel lblNewLabel_4 = new JLabel("Còn/Hết thời hạn bảo hành!");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnThongBao.add(lblNewLabel_4);
		
		JPanel panel_15 = new JPanel();
		panel_14.add(panel_15);
		
		JPanel panel_13 = new JPanel();
		panel_14.add(panel_13);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "Th\u00F4ng tin b\u1EA3o h\u00E0nh:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnCenterGuiBH.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JPanel pn = new JPanel();
		FlowLayout fl_pn = (FlowLayout) pn.getLayout();
		fl_pn.setVgap(10);
		fl_pn.setHgap(10);
		fl_pn.setAlignment(FlowLayout.LEFT);
		panel_8.add(pn, BorderLayout.NORTH);
		
		JLabel lblSerialSPBH = new JLabel("Serial sản phẩm:");
		lblSerialSPBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pn.add(lblSerialSPBH);
		
		tfSerialSPBH = new JTextField();
		tfSerialSPBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSerialSPBH.setColumns(20);
		pn.add(tfSerialSPBH);
		
		JPanel panel_16 = new JPanel();
		panel_8.add(panel_16, BorderLayout.CENTER);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JPanel pnNgayNhanBH = new JPanel();
		FlowLayout fl_pnNgayNhanBH = (FlowLayout) pnNgayNhanBH.getLayout();
		fl_pnNgayNhanBH.setVgap(10);
		fl_pnNgayNhanBH.setHgap(10);
		fl_pnNgayNhanBH.setAlignment(FlowLayout.LEFT);
		panel_16.add(pnNgayNhanBH, BorderLayout.NORTH);
		
		JLabel lblNgayNhanBH = new JLabel("Ngày nhận:      ");
		lblNgayNhanBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayNhanBH.add(lblNgayNhanBH);
		
		tfNgayNhanBH = new JTextField();
		tfNgayNhanBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayNhanBH.setColumns(20);
		pnNgayNhanBH.add(tfNgayNhanBH);
		
		JPanel panel_17 = new JPanel();
		panel_16.add(panel_17, BorderLayout.CENTER);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JPanel pnYeuCauGuiBH = new JPanel();
		FlowLayout fl_pnYeuCauGuiBH = (FlowLayout) pnYeuCauGuiBH.getLayout();
		fl_pnYeuCauGuiBH.setVgap(10);
		fl_pnYeuCauGuiBH.setHgap(10);
		fl_pnYeuCauGuiBH.setAlignment(FlowLayout.LEFT);
		panel_17.add(pnYeuCauGuiBH, BorderLayout.NORTH);
		
		JLabel lblYeuCauGuiBH = new JLabel("Yêu cầu BH:     ");
		lblYeuCauGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnYeuCauGuiBH.add(lblYeuCauGuiBH);
		
		JTextArea taYeuCauGuiBH = new JTextArea();
		taYeuCauGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		taYeuCauGuiBH.setLineWrap(true);
		taYeuCauGuiBH.setRows(3);
		taYeuCauGuiBH.setColumns(30);
		pnYeuCauGuiBH.add(taYeuCauGuiBH);
		
		JPanel panel_18 = new JPanel();
		panel_17.add(panel_18, BorderLayout.CENTER);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_19 = new JPanel();
		FlowLayout flowLayout_16 = (FlowLayout) panel_19.getLayout();
		flowLayout_16.setVgap(10);
		flowLayout_16.setHgap(10);
		flowLayout_16.setAlignment(FlowLayout.RIGHT);
		panel_18.add(panel_19, BorderLayout.NORTH);
		
		JButton btnXacNhanGuiBH = new JButton("Xác nhận");
		btnXacNhanGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_19.add(btnXacNhanGuiBH);
		
		JButton btnHuyGuiBH = new JButton("Hủy");
		btnHuyGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_19.add(btnHuyGuiBH);
		
		JPanel pnTraBaoHanh = new JPanel();
		pnBaoHanhCenter.add(pnTraBaoHanh, "name_361723476521406");
		pnTraBaoHanh.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeTraBH = new JPanel();
		pnTraBaoHanh.add(pnTieuDeTraBH, BorderLayout.NORTH);
		
		JLabel lblTieuDeTraBH = new JLabel("TRẢ BẢO HÀNH");
		lblTieuDeTraBH.setForeground(new Color(0, 51, 51));
		lblTieuDeTraBH.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeTraBH.add(lblTieuDeTraBH);
		
		JPanel panel_20 = new JPanel();
		pnTraBaoHanh.add(panel_20, BorderLayout.CENTER);
		panel_20.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_21 = new JPanel();
		panel_20.add(panel_21);
		panel_21.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_24 = new JPanel();
		panel_21.add(panel_24);
		panel_24.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel pnMaPhieuBH = new JPanel();
		FlowLayout flowLayout_14 = (FlowLayout) pnMaPhieuBH.getLayout();
		flowLayout_14.setVgap(10);
		flowLayout_14.setHgap(10);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_24.add(pnMaPhieuBH);
		
		JLabel lblMaPhieuBH = new JLabel("Mã phiếu bảo hành:");
		lblMaPhieuBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaPhieuBH.add(lblMaPhieuBH);
		
		tfMaPhieuBH = new JTextField();
		tfMaPhieuBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfMaPhieuBH.setColumns(20);
		pnMaPhieuBH.add(tfMaPhieuBH);
		
		JButton btnKiemTraMaPBH = new JButton("Kiểm tra");
		btnKiemTraMaPBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaPhieuBH.add(btnKiemTraMaPBH);
		
		JPanel pnTenKHTraBH = new JPanel();
		FlowLayout flowLayout_17 = (FlowLayout) pnTenKHTraBH.getLayout();
		flowLayout_17.setVgap(10);
		flowLayout_17.setHgap(10);
		flowLayout_17.setAlignment(FlowLayout.LEFT);
		panel_24.add(pnTenKHTraBH);
		
		JLabel lblTenKHTraBH = new JLabel("Tên khách hàng:");
		lblTenKHTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenKHTraBH.add(lblTenKHTraBH);
		
		tfTenKHTraBH = new JTextField();
		tfTenKHTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenKHTraBH.setEditable(false);
		tfTenKHTraBH.setColumns(20);
		pnTenKHTraBH.add(tfTenKHTraBH);
		
		JPanel pnSoCMNDKH = new JPanel();
		FlowLayout flowLayout_18 = (FlowLayout) pnSoCMNDKH.getLayout();
		flowLayout_18.setVgap(10);
		flowLayout_18.setHgap(10);
		flowLayout_18.setAlignment(FlowLayout.LEFT);
		panel_24.add(pnSoCMNDKH);
		
		JLabel lblSoCMNDKH = new JLabel("Số CMND:         ");
		lblSoCMNDKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoCMNDKH.add(lblSoCMNDKH);
		
		tfSoCMNDKH = new JTextField();
		tfSoCMNDKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSoCMNDKH.setEditable(false);
		tfSoCMNDKH.setColumns(20);
		pnSoCMNDKH.add(tfSoCMNDKH);
		
		JPanel pnTenSPTraBH = new JPanel();
		FlowLayout flowLayout_19 = (FlowLayout) pnTenSPTraBH.getLayout();
		flowLayout_19.setVgap(10);
		flowLayout_19.setHgap(10);
		flowLayout_19.setAlignment(FlowLayout.LEFT);
		panel_24.add(pnTenSPTraBH);
		
		JLabel lblTenSPTraBH = new JLabel("Tên sản phẩm:  ");
		lblTenSPTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenSPTraBH.add(lblTenSPTraBH);
		
		tfTenSPTraBH = new JTextField();
		tfTenSPTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenSPTraBH.setEditable(false);
		tfTenSPTraBH.setColumns(20);
		pnTenSPTraBH.add(tfTenSPTraBH);
		
		JPanel pnSerialTraBH = new JPanel();
		FlowLayout flowLayout_20 = (FlowLayout) pnSerialTraBH.getLayout();
		flowLayout_20.setVgap(10);
		flowLayout_20.setHgap(10);
		flowLayout_20.setAlignment(FlowLayout.LEFT);
		panel_24.add(pnSerialTraBH);
		
		JLabel lblSerialTraBH = new JLabel("Serial sản phẩm: ");
		lblSerialTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSerialTraBH.add(lblSerialTraBH);
		
		tfSerialTraBH = new JTextField();
		tfSerialTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSerialTraBH.setEditable(false);
		tfSerialTraBH.setColumns(20);
		pnSerialTraBH.add(tfSerialTraBH);
		
		JPanel panel_32 = new JPanel();
		panel_24.add(panel_32);
		
		JPanel panel_23 = new JPanel();
		panel_21.add(panel_23);
		panel_23.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel panel_34 = new JPanel();
		panel_23.add(panel_34);
		
		JPanel pnYeuCauTraBH = new JPanel();
		panel_23.add(pnYeuCauTraBH);
		FlowLayout flowLayout_15 = (FlowLayout) pnYeuCauTraBH.getLayout();
		flowLayout_15.setVgap(10);
		flowLayout_15.setHgap(10);
		flowLayout_15.setAlignment(FlowLayout.LEFT);
		
		JLabel lblYeuCauTraBH = new JLabel("Yêu cầu BH:");
		lblYeuCauTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnYeuCauTraBH.add(lblYeuCauTraBH);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textArea.setEditable(false);
		textArea.setRows(2);
		textArea.setColumns(30);
		pnYeuCauTraBH.add(textArea);
		
		JPanel pnNgayNhan_TraBH = new JPanel();
		FlowLayout flowLayout_21 = (FlowLayout) pnNgayNhan_TraBH.getLayout();
		flowLayout_21.setVgap(10);
		flowLayout_21.setHgap(10);
		flowLayout_21.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnNgayNhan_TraBH);
		
		JLabel lblNgayNhan_TraBH = new JLabel("Ngày nhận: ");
		lblNgayNhan_TraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayNhan_TraBH.add(lblNgayNhan_TraBH);
		
		tfNgayNhan_TraBH = new JTextField();
		tfNgayNhan_TraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayNhan_TraBH.setEditable(false);
		tfNgayNhan_TraBH.setColumns(20);
		pnNgayNhan_TraBH.add(tfNgayNhan_TraBH);
		
		JPanel pnTinhTrang_TraBH = new JPanel();
		FlowLayout flowLayout_22 = (FlowLayout) pnTinhTrang_TraBH.getLayout();
		flowLayout_22.setVgap(10);
		flowLayout_22.setHgap(10);
		flowLayout_22.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnTinhTrang_TraBH);
		
		JLabel lblTinhTrang_TraBH = new JLabel("Tình trạng:  ");
		lblTinhTrang_TraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTinhTrang_TraBH.add(lblTinhTrang_TraBH);
		
		tfTinhTrang_TraBH = new JTextField();
		tfTinhTrang_TraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTinhTrang_TraBH.setEditable(false);
		tfTinhTrang_TraBH.setColumns(20);
		pnTinhTrang_TraBH.add(tfTinhTrang_TraBH);
		
		JPanel pnNgayTraBH = new JPanel();
		FlowLayout flowLayout_23 = (FlowLayout) pnNgayTraBH.getLayout();
		flowLayout_23.setVgap(10);
		flowLayout_23.setHgap(10);
		flowLayout_23.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnNgayTraBH);
		
		JLabel lblNgayTraBH = new JLabel("Ngày trả:    ");
		lblNgayTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayTraBH.add(lblNgayTraBH);
		
		tfNgayTraBH = new JTextField();
		tfNgayTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayTraBH.setColumns(20);
		pnNgayTraBH.add(tfNgayTraBH);
		
		JPanel pnButtonTraBH = new JPanel();
		FlowLayout flowLayout_24 = (FlowLayout) pnButtonTraBH.getLayout();
		flowLayout_24.setVgap(10);
		flowLayout_24.setHgap(10);
		flowLayout_24.setAlignment(FlowLayout.RIGHT);
		panel_23.add(pnButtonTraBH);
		
		JButton btnXacNhanTraBH = new JButton("Xác nhận");
		btnXacNhanTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonTraBH.add(btnXacNhanTraBH);
		
		JButton btnHuyTraBH = new JButton("Hủy");
		btnHuyTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonTraBH.add(btnHuyTraBH);
		
		JPanel panel_22 = new JPanel();
		panel_20.add(panel_22);
		
//Tab Nhập hàng
		
		JPanel pnNhapHang = new JPanel();
		pnInfo.add(pnNhapHang, "name_7091090895049");
		pnNhapHang.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeNhapHang = new JPanel();
		pnNhapHang.add(pnTieuDeNhapHang, BorderLayout.NORTH);
		
		JLabel lblPhiuNhpHng = new JLabel("PHIẾU NHẬP HÀNG");
		lblPhiuNhpHng.setForeground(new Color(0, 51, 51));
		lblPhiuNhpHng.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeNhapHang.add(lblPhiuNhpHng);
		
		JPanel pnCenterNhapHang = new JPanel();
		pnNhapHang.add(pnCenterNhapHang);
		pnCenterNhapHang.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "T\u1EA1o phi\u1EBFu nh\u1EADp:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnCenterNhapHang.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnMaPhieuNhap = new JPanel();
		FlowLayout fl_pnMaPhieuNhap = (FlowLayout) pnMaPhieuNhap.getLayout();
		fl_pnMaPhieuNhap.setVgap(10);
		fl_pnMaPhieuNhap.setHgap(10);
		fl_pnMaPhieuNhap.setAlignment(FlowLayout.LEFT);
		panel_6.add(pnMaPhieuNhap);
		
		JLabel lblMaPhieuNhap = new JLabel("Mã phiếu nhập:");
		lblMaPhieuNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaPhieuNhap.add(lblMaPhieuNhap);
		
		tfMaPhieuNhap = new JTextField();
		tfMaPhieuNhap.setEditable(false);
		tfMaPhieuNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfMaPhieuNhap.setColumns(20);
		pnMaPhieuNhap.add(tfMaPhieuNhap);
		
		JPanel pnNhaCungCap = new JPanel();
		FlowLayout fl_pnNhaCungCap = (FlowLayout) pnNhaCungCap.getLayout();
		fl_pnNhaCungCap.setVgap(10);
		fl_pnNhaCungCap.setHgap(10);
		fl_pnNhaCungCap.setAlignment(FlowLayout.LEFT);
		panel_6.add(pnNhaCungCap);
		
		JLabel lblNhaCungCap = new JLabel("Nhà cung cấp:");
		lblNhaCungCap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNhaCungCap.add(lblNhaCungCap);
		
		JComboBox cbbNhaCungCap = new JComboBox();
		pnNhaCungCap.add(cbbNhaCungCap);
		
		JButton btnThemNhaCungCap = new JButton("Thêm mới");
		btnThemNhaCungCap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNhaCungCap.add(btnThemNhaCungCap);
		
		JPanel pnNgayNhapHang = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) pnNgayNhapHang.getLayout();
		flowLayout_6.setVgap(10);
		flowLayout_6.setHgap(10);
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		panel_6.add(pnNgayNhapHang);
		
		JLabel lblNgayNhapHang = new JLabel("Ngày nhập:");
		lblNgayNhapHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayNhapHang.add(lblNgayNhapHang);
		
		tfNgayNhapHang = new JTextField();
		tfNgayNhapHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayNhapHang.setColumns(20);
		pnNgayNhapHang.add(tfNgayNhapHang);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_11 = (FlowLayout) panel_7.getLayout();
		flowLayout_11.setVgap(10);
		flowLayout_11.setHgap(20);
		panel_6.add(panel_7);
		
		JButton btnXacNhanNhap = new JButton("Xác nhận");
		btnXacNhanNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_7.add(btnXacNhanNhap);
		
		JButton btnHuyNhap = new JButton("Hủy");
		btnHuyNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_7.add(btnHuyNhap);
		
		JPanel panel_11 = new JPanel();
		panel_6.add(panel_11);
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Hình EXID");
		panel_5.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "Chi ti\u1EBFt nh\u1EADp h\u00E0ng:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnCenterNhapHang.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9);
		panel_9.setLayout(new GridLayout(5, 5, 0, 0));
		
		JPanel pnSanPhamNhap = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) pnSanPhamNhap.getLayout();
		flowLayout_7.setVgap(10);
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_9.add(pnSanPhamNhap);
		
		JLabel lblSanPhamNhap = new JLabel("Sản phẩm:");
		lblSanPhamNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSanPhamNhap.add(lblSanPhamNhap);
		
		JComboBox cbbSanPhamNhap = new JComboBox();
		pnSanPhamNhap.add(cbbSanPhamNhap);
		
		JButton btnThemSanPham = new JButton("Thêm mới");
		btnThemSanPham.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSanPhamNhap.add(btnThemSanPham);
		
		JButton btnTimSPNhap = new JButton("Tìm kiếm");
		btnTimSPNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSanPhamNhap.add(btnTimSPNhap);
		
		JPanel pnDonGiaNhap = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) pnDonGiaNhap.getLayout();
		flowLayout_9.setVgap(10);
		flowLayout_9.setHgap(10);
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		panel_9.add(pnDonGiaNhap);
		
		JLabel lblDonGiaNhap = new JLabel("Đơn giá:");
		lblDonGiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnDonGiaNhap.add(lblDonGiaNhap);
		
		tfDonGiaNhap = new JTextField();
		tfDonGiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfDonGiaNhap.setColumns(20);
		pnDonGiaNhap.add(tfDonGiaNhap);
		
		JPanel pnSoLuongNhap = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) pnSoLuongNhap.getLayout();
		flowLayout_8.setVgap(10);
		flowLayout_8.setHgap(10);
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_9.add(pnSoLuongNhap);
		
		JLabel lblSoLuongNhap = new JLabel("Số lượng:");
		lblSoLuongNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoLuongNhap.add(lblSoLuongNhap);
		
		tfSoLuongNhap = new JTextField();
		tfSoLuongNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSoLuongNhap.setColumns(20);
		pnSoLuongNhap.add(tfSoLuongNhap);
		
		JPanel pnButtonThemSPNhap = new JPanel();
		FlowLayout flowLayout_10 = (FlowLayout) pnButtonThemSPNhap.getLayout();
		flowLayout_10.setVgap(10);
		flowLayout_10.setHgap(10);
		flowLayout_10.setAlignment(FlowLayout.RIGHT);
		panel_9.add(pnButtonThemSPNhap);
		
		JButton btnThemSPNhap = new JButton("Thêm sản phẩm");
		btnThemSPNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonThemSPNhap.add(btnThemSPNhap);
		
		JButton btnCapNhatSPNhap = new JButton("Cập nhật");
		btnCapNhatSPNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonThemSPNhap.add(btnCapNhatSPNhap);
		
		JButton btnXoaSPNhap = new JButton("Xóa sản phẩm");
		btnXoaSPNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonThemSPNhap.add(btnXoaSPNhap);
		
		JPanel panel_10 = new JPanel();
		panel_9.add(panel_10);
		
		JPanel pnTableChiTietNhap = new JPanel();
		panel_4.add(pnTableChiTietNhap);
		pnTableChiTietNhap.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneChiTietNhap = new JScrollPane();
		pnTableChiTietNhap.add(scrollPaneChiTietNhap, BorderLayout.CENTER);
		
		tableChiTietNhap = new JTable();
		scrollPaneChiTietNhap.setViewportView(tableChiTietNhap);
	}
}
