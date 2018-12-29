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
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThemNhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField tfTenNV;
	private JTextField tfNgaySinh;
	private JTextField tfSoCMND;
	private JTextField tfSoDT;
	private JTextField tfDiaChi;
	private JTextField tfNgayVaoLam;
	private JTextField tfLuongCoBan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemNhanVien frame = new ThemNhanVien();
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
	public ThemNhanVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 471);
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
		
		JLabel lblTieuDe = new JLabel("THÊM NHÂN VIÊN MỚI");
		lblTieuDe.setForeground(new Color(0, 51, 51));
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDe.add(lblTieuDe);
		
		JPanel pnChinhThemNV = new JPanel();
		pnCenter.add(pnChinhThemNV, BorderLayout.CENTER);
		pnChinhThemNV.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		pnChinhThemNV.add(panel);
		panel.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnHoTen = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pnHoTen.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setVgap(10);
		flowLayout_1.setHgap(10);
		panel.add(pnHoTen);
		
		JLabel lblTenNV = new JLabel("Tên nhân viên:");
		lblTenNV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnHoTen.add(lblTenNV);
		
		tfTenNV = new JTextField();
		tfTenNV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenNV.setColumns(20);
		pnHoTen.add(tfTenNV);
		
		JPanel pnNgaySinh = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) pnNgaySinh.getLayout();
		flowLayout_2.setVgap(10);
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel.add(pnNgaySinh);
		
		JLabel lblNgaySinh = new JLabel("Ngày sinh:      ");
		lblNgaySinh.setHorizontalAlignment(SwingConstants.LEFT);
		lblNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgaySinh.add(lblNgaySinh);
		
		tfNgaySinh = new JTextField();
		tfNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgaySinh.setColumns(20);
		pnNgaySinh.add(tfNgaySinh);
		
		JPanel pnGioiTinh = new JPanel();
		FlowLayout fl_pnGioiTinh = (FlowLayout) pnGioiTinh.getLayout();
		fl_pnGioiTinh.setVgap(10);
		fl_pnGioiTinh.setHgap(10);
		fl_pnGioiTinh.setAlignment(FlowLayout.LEFT);
		panel.add(pnGioiTinh);
		
		JLabel lblGioiTinh = new JLabel("Giới tính:         ");
		lblGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnGioiTinh.add(lblGioiTinh);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam           ");
		rdbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnGioiTinh.add(rdbtnNam);
		
		JRadioButton rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnGioiTinh.add(rdbtnNu);
		
		JPanel pnCMND = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) pnCMND.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		flowLayout_3.setVgap(10);
		flowLayout_3.setHgap(10);
		panel.add(pnCMND);
		
		JLabel lblSoCMND = new JLabel("Số CMND:      ");
		lblSoCMND.setHorizontalAlignment(SwingConstants.LEFT);
		lblSoCMND.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnCMND.add(lblSoCMND);
		
		tfSoCMND = new JTextField();
		tfSoCMND.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSoCMND.setColumns(20);
		pnCMND.add(tfSoCMND);
		
		JPanel pnSoDT = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) pnSoDT.getLayout();
		flowLayout_4.setVgap(10);
		flowLayout_4.setHgap(10);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel.add(pnSoDT);
		
		JLabel lblSoDT = new JLabel("Số điện thoại:  ");
		lblSoDT.setHorizontalAlignment(SwingConstants.LEFT);
		lblSoDT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSoDT.add(lblSoDT);
		
		tfSoDT = new JTextField();
		tfSoDT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSoDT.setColumns(20);
		pnSoDT.add(tfSoDT);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JPanel panel_1 = new JPanel();
		pnChinhThemNV.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnDiaChi = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) pnDiaChi.getLayout();
		flowLayout_5.setVgap(10);
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_1.add(pnDiaChi);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ:         ");
		lblDiaChi.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnDiaChi.add(lblDiaChi);
		
		tfDiaChi = new JTextField();
		tfDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfDiaChi.setColumns(20);
		pnDiaChi.add(tfDiaChi);
		
		JPanel pnNgayVaoLam = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) pnNgayVaoLam.getLayout();
		flowLayout_6.setVgap(10);
		flowLayout_6.setHgap(10);
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		panel_1.add(pnNgayVaoLam);
		
		JLabel lblNgayVaoLam = new JLabel("Ngày vào làm:");
		lblNgayVaoLam.setHorizontalAlignment(SwingConstants.LEFT);
		lblNgayVaoLam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayVaoLam.add(lblNgayVaoLam);
		
		tfNgayVaoLam = new JTextField();
		tfNgayVaoLam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayVaoLam.setColumns(20);
		pnNgayVaoLam.add(tfNgayVaoLam);
		
		JPanel pnLuongCoBan = new JPanel();
		FlowLayout fl_pnLuongCoBan = (FlowLayout) pnLuongCoBan.getLayout();
		fl_pnLuongCoBan.setAlignment(FlowLayout.LEFT);
		fl_pnLuongCoBan.setVgap(10);
		fl_pnLuongCoBan.setHgap(10);
		panel_1.add(pnLuongCoBan);
		
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
		panel_1.add(pnTaiKhoan);
		
		JLabel lblTaiKhoan = new JLabel("Tài khoản:     ");
		lblTaiKhoan.setHorizontalAlignment(SwingConstants.LEFT);
		lblTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTaiKhoan.add(lblTaiKhoan);
		
		JComboBox cbbTaiKhoan = new JComboBox();
		pnTaiKhoan.add(cbbTaiKhoan);
		
		JButton btnThemTaiKhoan = new JButton("Thêm tài khoản");
		btnThemTaiKhoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThemTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTaiKhoan.add(btnThemTaiKhoan);
		
		JPanel panel_8 = new JPanel();
		panel_1.add(panel_8);
		
		JPanel pnButton = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) pnButton.getLayout();
		flowLayout_8.setVgap(10);
		flowLayout_8.setHgap(10);
		flowLayout_8.setAlignment(FlowLayout.RIGHT);
		panel_1.add(pnButton);
		
		JButton btnThem = new JButton("Đồng ý");
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButton.add(btnThem);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButton.add(btnHuy);
	}

}
