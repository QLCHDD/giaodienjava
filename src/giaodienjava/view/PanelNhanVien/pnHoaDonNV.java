/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodienjava.view.PanelNhanVien;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author RanRan
 */
public class pnHoaDonNV extends JPanel{

    private JTable tableCTHD;
    private JTextField tfSoDT;
    private JTextField tfHoTen;
    private JTextField textField_1;
    private JComboBox cbbTimHang;
    private JComboBox cbbTimTenSP;
    private JTextField tfTongTien;
    private JTextField tfGiamGia;
    private JButton btnTimSP;
    private JLabel lblHASP;
    private JLabel lblLoadMaSP;
    private JLabel lblLoadHang;
    private JLabel lblLoadTHoiGianBaoHanh;
    private JLabel lblLoadTheNho;
    private JLabel lblLoadTenSP;
    private JLabel lblLoadXuatXu;
    private JLabel lblLoadMau;
    private JLabel lblLoadKichThuoc;
    private JLabel lblLoadNamSX;
    private JButton btnThemSPBan;
    private Object pnCTHD;
    private JTextField tfThanhTien;
    private JButton btnXoa;
    private JButton btnReset;
    private JScrollPane scrollPaneTableCTHD;
    private JTextField tfSoCMND;
    private JTextField tfDiaChi;
    private JTextField tfSoDTKH;
    private JTextField tfEmail;
    private JLabel lblLoadSoLuongSanCo;

    
    public pnHoaDonNV(){
        initComponent();
    }

    private void initComponent() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnTopHD = new JPanel();
		add(pnTopHD, BorderLayout.NORTH);
		pnTopHD.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));
		
		JLabel lblTimHang = new JLabel("Hãng:");
		lblTimHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTopHD.add(lblTimHang);
		
		cbbTimHang = new JComboBox();
		pnTopHD.add(cbbTimHang);
		
		JLabel lblTimTenSP = new JLabel("Tên sản phẩm:");
		lblTimTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTopHD.add(lblTimTenSP);
		
		cbbTimTenSP = new JComboBox();
		pnTopHD.add(cbbTimTenSP);
		
		btnTimSP = new JButton("Tìm kiếm sản phẩm");
		btnTimSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTopHD.add(btnTimSP);
		
		JPanel pnCenterHD = new JPanel();
		add(pnCenterHD, BorderLayout.CENTER);
		pnCenterHD.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel pnThongTinSP = new JPanel();
		pnCenterHD.add(pnThongTinSP);
		pnThongTinSP.setLayout(null);
		
		JPanel pnThongTin = new JPanel();
		pnThongTin.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Th\u00F4ng tin chi ti\u1EBFt s\u1EA3n ph\u1EA9m:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnThongTin.setBounds(12, 13, 584, 466);
		pnThongTinSP.add(pnThongTin);
		pnThongTin.setLayout(null);
		
		lblHASP = new JLabel("Hình Ảnh");
		lblHASP.setHorizontalAlignment(SwingConstants.CENTER);
		lblHASP.setBounds(180, 23, 200, 200);
		pnThongTin.add(lblHASP);
		
		JLabel lblMaSP = new JLabel("Mã sản phẩm:");
		lblMaSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaSP.setBounds(12, 263, 95, 20);
		pnThongTin.add(lblMaSP);
		
		lblLoadMaSP = new JLabel("SP001");
		lblLoadMaSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadMaSP.setBounds(160, 265, 56, 19);
		pnThongTin.add(lblLoadMaSP);
		
		JLabel lblHang = new JLabel("Hãng: ");
		lblHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHang.setBounds(12, 296, 56, 20);
		pnThongTin.add(lblHang);
		
		lblLoadHang = new JLabel("Nokia");
		lblLoadHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadHang.setBounds(160, 299, 73, 17);
		pnThongTin.add(lblLoadHang);
		
		JLabel lblThoiGianBaoHanh = new JLabel("Bảo hành:");
		lblThoiGianBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblThoiGianBaoHanh.setBounds(12, 335, 73, 20);
		pnThongTin.add(lblThoiGianBaoHanh);
		
		lblLoadTHoiGianBaoHanh = new JLabel("2 năm");
		lblLoadTHoiGianBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadTHoiGianBaoHanh.setBounds(160, 338, 56, 17);
		pnThongTin.add(lblLoadTHoiGianBaoHanh);
		
		JLabel lblTheNho = new JLabel("Thẻ nhớ:");
		lblTheNho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTheNho.setBounds(12, 368, 73, 20);
		pnThongTin.add(lblTheNho);
		
		lblLoadTheNho = new JLabel("2GB");
		lblLoadTheNho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadTheNho.setBounds(160, 371, 56, 17);
		pnThongTin.add(lblLoadTheNho);
		
		JLabel lblSoLuongSanCo = new JLabel("Số lượng sẵn có:");
		lblSoLuongSanCo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoLuongSanCo.setBounds(12, 404, 118, 20);
		pnThongTin.add(lblSoLuongSanCo);
		
		lblLoadSoLuongSanCo = new JLabel("20");
		lblLoadSoLuongSanCo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadSoLuongSanCo.setBounds(160, 408, 56, 16);
		pnThongTin.add(lblLoadSoLuongSanCo);
		
		JLabel lblTenSP = new JLabel("Tên sản phẩm:");
		lblTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTenSP.setBounds(283, 266, 108, 17);
		pnThongTin.add(lblTenSP);
		
		lblLoadTenSP = new JLabel("Nokia 1280");
		lblLoadTenSP.setEnabled(true);
		lblLoadTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadTenSP.setBounds(415, 263, 84, 20);
		pnThongTin.add(lblLoadTenSP);
		
		JLabel lblXuatXu = new JLabel("Xuất xứ:");
		lblXuatXu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblXuatXu.setBounds(283, 296, 85, 20);
		pnThongTin.add(lblXuatXu);
		
		lblLoadXuatXu = new JLabel("Trung Quốc");
		lblLoadXuatXu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadXuatXu.setBounds(415, 299, 84, 20);
		pnThongTin.add(lblLoadXuatXu);
		
		JLabel lblMau = new JLabel("Màu:");
		lblMau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMau.setBounds(283, 336, 56, 20);
		pnThongTin.add(lblMau);
		
		lblLoadMau = new JLabel("Hồng");
		lblLoadMau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadMau.setBounds(415, 336, 56, 20);
		pnThongTin.add(lblLoadMau);
		
		JLabel lblKichThuoc = new JLabel("Kích thước:");
		lblKichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKichThuoc.setBounds(283, 371, 73, 17);
		pnThongTin.add(lblKichThuoc);
		
		lblLoadKichThuoc = new JLabel("200X200");
		lblLoadKichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoadKichThuoc.setBounds(415, 368, 67, 20);
		pnThongTin.add(lblLoadKichThuoc);
		
		JLabel lblNamSX = new JLabel("Năm sản xuất:");
		lblNamSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNamSX.setBounds(283, 404, 108, 20);
		pnThongTin.add(lblNamSX);
		
		lblLoadNamSX = new JLabel("2000");
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
		
		btnThemSPBan = new JButton("Thêm sản phẩm");
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
		
		btnXoa = new JButton("Xóa");
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa.setBounds(383, 515, 97, 25);
		pnCTHD.add(btnXoa);
		
		btnReset = new JButton("Đặt lại");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setBounds(503, 515, 97, 25);
		pnCTHD.add(btnReset);
		
		JPanel pntableCTHD = new JPanel();
		pntableCTHD.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Chi ti\u1EBFt h\u00F3a \u0111\u01A1n:", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pntableCTHD.setBounds(12, 13, 588, 425);
		pnCTHD.add(pntableCTHD);
		pntableCTHD.setLayout(new BorderLayout(0, 0));
		
		scrollPaneTableCTHD = new JScrollPane();
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
		add(pnBottomHD, BorderLayout.SOUTH);
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
    }
    
}
