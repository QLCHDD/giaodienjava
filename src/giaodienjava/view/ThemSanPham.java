import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class ThemSanPham extends JFrame {

	private JPanel contentPane;
	private JTextField tfTenSP;
	private JTextField tfXuatXu;
	private JTextField tfMauSac;
	private JTextField tfBaoHanh;
	private JTextField tfDonGia;
	private JTextField tfTheNho;
	private JTextField tfKichThuoc;
	private JTextField tfNamSX;
	private JTextField tfLinkHA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemSanPham frame = new ThemSanPham();
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
	public ThemSanPham() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 749);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnTop = new JPanel();
		pnTop.setBackground(new Color(0, 51, 51));
		contentPane.add(pnTop, BorderLayout.NORTH);
		pnTop.setLayout(new FlowLayout(FlowLayout.RIGHT, 2, 5));
		
		JButton btnMini = new JButton("Mini");
		pnTop.add(btnMini);
		
		JButton btnClose = new JButton("Close");
		pnTop.add(btnClose);
		
		JPanel pnCenter = new JPanel();
		contentPane.add(pnCenter, BorderLayout.CENTER);
		pnCenter.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDe = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnTieuDe.getLayout();
		flowLayout.setVgap(10);
		pnCenter.add(pnTieuDe, BorderLayout.NORTH);
		
		JLabel lblTieuDe = new JLabel("THÊM SẢN PHẨM MỚI");
		lblTieuDe.setForeground(new Color(0, 51, 51));
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDe.add(lblTieuDe);
		
		JPanel pnThongTin = new JPanel();
		pnCenter.add(pnThongTin, BorderLayout.CENTER);
		pnThongTin.setLayout(null);
		
		JPanel pnThongTinSP = new JPanel();
		pnThongTinSP.setBounds(0, 0, 447, 557);
		pnThongTin.add(pnThongTinSP);
		pnThongTinSP.setLayout(new GridLayout(9, 1, 0, 0));
		
		JPanel pnTenSP = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pnTenSP.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setVgap(10);
		flowLayout_1.setHgap(10);
		pnThongTinSP.add(pnTenSP);
		
		JLabel lblTenSP = new JLabel("Tên sản phẩm:");
		lblTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenSP.add(lblTenSP);
		
		tfTenSP = new JTextField();
		tfTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenSP.add(tfTenSP);
		tfTenSP.setColumns(20);
		
		JPanel pnHang = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) pnHang.getLayout();
		flowLayout_2.setVgap(10);
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		pnThongTinSP.add(pnHang);
		
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
		FlowLayout flowLayout_3 = (FlowLayout) pnXuatXu.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		flowLayout_3.setVgap(10);
		flowLayout_3.setHgap(10);
		pnThongTinSP.add(pnXuatXu);
		
		JLabel lblXuatXu = new JLabel("Xuất xứ:         ");
		lblXuatXu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnXuatXu.add(lblXuatXu);
		
		tfXuatXu = new JTextField();
		tfXuatXu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnXuatXu.add(tfXuatXu);
		tfXuatXu.setColumns(20);
		
		JPanel pnMauSac = new JPanel();
		FlowLayout fl_pnMauSac = (FlowLayout) pnMauSac.getLayout();
		fl_pnMauSac.setVgap(10);
		fl_pnMauSac.setHgap(10);
		fl_pnMauSac.setAlignment(FlowLayout.LEFT);
		pnThongTinSP.add(pnMauSac);
		
		JLabel lblMauSac = new JLabel("Màu sắc:        ");
		lblMauSac.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMauSac.add(lblMauSac);
		
		tfMauSac = new JTextField();
		tfMauSac.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMauSac.add(tfMauSac);
		tfMauSac.setColumns(20);
		
		JPanel pnBaoHanh = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) pnBaoHanh.getLayout();
		flowLayout_5.setVgap(10);
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		pnThongTinSP.add(pnBaoHanh);
		
		JLabel lblBaoHanh = new JLabel("Bảo hành:       ");
		lblBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnBaoHanh.add(lblBaoHanh);
		
		tfBaoHanh = new JTextField();
		tfBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnBaoHanh.add(tfBaoHanh);
		tfBaoHanh.setColumns(20);
		
		JPanel pnDonGia = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) pnDonGia.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		flowLayout_4.setVgap(10);
		flowLayout_4.setHgap(10);
		pnThongTinSP.add(pnDonGia);
		
		JLabel lblDonGia = new JLabel("Đơn giá:         ");
		lblDonGia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnDonGia.add(lblDonGia);
		
		tfDonGia = new JTextField();
		tfDonGia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnDonGia.add(tfDonGia);
		tfDonGia.setColumns(20);
		
		JPanel pnTheNho = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) pnTheNho.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		flowLayout_6.setVgap(10);
		flowLayout_6.setHgap(10);
		pnThongTinSP.add(pnTheNho);
		
		JLabel lblTheNho = new JLabel("Thẻ nhớ:        ");
		lblTheNho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTheNho.add(lblTheNho);
		
		tfTheNho = new JTextField();
		tfTheNho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTheNho.add(tfTheNho);
		tfTheNho.setColumns(20);
		
		JPanel pnKichThuoc = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) pnKichThuoc.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		flowLayout_7.setVgap(10);
		flowLayout_7.setHgap(10);
		pnThongTinSP.add(pnKichThuoc);
		
		JLabel lblKichThuoc = new JLabel("Kích thước:      ");
		lblKichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnKichThuoc.add(lblKichThuoc);
		
		tfKichThuoc = new JTextField();
		tfKichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnKichThuoc.add(tfKichThuoc);
		tfKichThuoc.setColumns(20);
		
		JPanel pnNamSX = new JPanel();
		FlowLayout fl_pnNamSX = (FlowLayout) pnNamSX.getLayout();
		fl_pnNamSX.setAlignment(FlowLayout.LEFT);
		fl_pnNamSX.setVgap(10);
		fl_pnNamSX.setHgap(10);
		pnThongTinSP.add(pnNamSX);
		
		JLabel lblNamSX = new JLabel("Năm sản xuất:");
		lblNamSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNamSX.add(lblNamSX);
		
		tfNamSX = new JTextField();
		tfNamSX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNamSX.add(tfNamSX);
		tfNamSX.setColumns(20);
		
		JPanel pnThemHinhAnh = new JPanel();
		pnThemHinhAnh.setBounds(448, 0, 358, 606);
		pnThongTin.add(pnThemHinhAnh);
		pnThemHinhAnh.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel pnHinhAnh = new JPanel();
		pnThemHinhAnh.add(pnHinhAnh);
		pnHinhAnh.setLayout(null);
		
		JLabel lblHinhAnh = new JLabel("Hình Ảnh");
		lblHinhAnh.setHorizontalAlignment(SwingConstants.CENTER);
		lblHinhAnh.setBounds(73, 13, 211, 250);
		pnHinhAnh.add(lblHinhAnh);
		
		JPanel pnLinkButton = new JPanel();
		pnThemHinhAnh.add(pnLinkButton);
		pnLinkButton.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel pnLinkHinhAnh = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) pnLinkHinhAnh.getLayout();
		flowLayout_9.setVgap(10);
		flowLayout_9.setHgap(10);
		pnLinkButton.add(pnLinkHinhAnh);
		
		JLabel lblLinkHA = new JLabel("Link hình ảnh:");
		lblLinkHA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnLinkHinhAnh.add(lblLinkHA);
		
		tfLinkHA = new JTextField();
		tfLinkHA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnLinkHinhAnh.add(tfLinkHA);
		tfLinkHA.setColumns(13);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnLinkHinhAnh.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		pnLinkButton.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		pnLinkButton.add(panel_3);
		
		JPanel panel_1 = new JPanel();
		pnLinkButton.add(panel_1);
		
		JPanel pnButton = new JPanel();
		FlowLayout flowLayout_10 = (FlowLayout) pnButton.getLayout();
		flowLayout_10.setVgap(10);
		flowLayout_10.setHgap(20);
		flowLayout_10.setAlignment(FlowLayout.RIGHT);
		pnLinkButton.add(pnButton);
		
		JButton btnThem = new JButton("Thêm sản phẩm");
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButton.add(btnThem);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButton.add(btnHuy);
	}

}
