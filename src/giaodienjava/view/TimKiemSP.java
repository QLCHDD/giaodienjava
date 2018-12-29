import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class TimKiemSP extends JFrame {

	private JPanel contentPane;
	private JTextField tfTenSP;
	private JTable tableKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimKiemSP frame = new TimKiemSP();
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
	public TimKiemSP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnTop = new JPanel();
		pnTop.setBackground(new Color(0, 51, 51));
		FlowLayout flowLayout = (FlowLayout) pnTop.getLayout();
		flowLayout.setHgap(2);
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(pnTop, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New button");
		pnTop.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		pnTop.add(btnNewButton_1);
		
		JPanel pnCenter = new JPanel();
		contentPane.add(pnCenter, BorderLayout.CENTER);
		pnCenter.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDe = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pnTieuDe.getLayout();
		flowLayout_1.setVgap(10);
		pnCenter.add(pnTieuDe, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("TÌM KIẾM SẢN PHẨM");
		lblNewLabel.setForeground(new Color(0, 51, 51));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDe.add(lblNewLabel);
		
		JPanel pnChinhTimKiem = new JPanel();
		pnCenter.add(pnChinhTimKiem, BorderLayout.CENTER);
		pnChinhTimKiem.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnTimKiem = new JPanel();
		pnChinhTimKiem.add(pnTimKiem);
		pnTimKiem.setLayout(null);
		
		JPanel pnTimKiemCoBan = new JPanel();
		pnTimKiemCoBan.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "T\u00ECm ki\u1EBFm c\u01A1 b\u1EA3n:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnTimKiemCoBan.setBounds(12, 5, 412, 97);
		pnTimKiem.add(pnTimKiemCoBan);
		pnTimKiemCoBan.setLayout(null);
		
		JLabel lblTenSP = new JLabel("Tên sản phẩm:");
		lblTenSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTenSP.setBounds(12, 40, 108, 20);
		pnTimKiemCoBan.add(lblTenSP);
		
		tfTenSP = new JTextField();
		tfTenSP.setBounds(145, 40, 123, 22);
		pnTimKiemCoBan.add(tfTenSP);
		tfTenSP.setColumns(10);
		
		JButton btnTimKiemCoBan = new JButton("Tìm kiếm");
		btnTimKiemCoBan.setForeground(new Color(255, 255, 255));
		btnTimKiemCoBan.setBackground(new Color(0, 51, 51));
		btnTimKiemCoBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTimKiemCoBan.setBounds(303, 39, 97, 25);
		pnTimKiemCoBan.add(btnTimKiemCoBan);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "T\u00ECm ki\u1EBFm n\u00E2ng cao:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 132, 412, 265);
		pnTimKiem.add(panel);
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel pnXuatXu = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) pnXuatXu.getLayout();
		flowLayout_2.setVgap(10);
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel.add(pnXuatXu);
		
		JRadioButton rdbtnXuatXu = new JRadioButton("Xuất xứ:");
		rdbtnXuatXu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnXuatXu.add(rdbtnXuatXu);
		
		JComboBox cbbXuatXu = new JComboBox();
		pnXuatXu.add(cbbXuatXu);
		
		JPanel pnHang = new JPanel();
		FlowLayout fl_pnHang = (FlowLayout) pnHang.getLayout();
		fl_pnHang.setAlignment(FlowLayout.LEFT);
		fl_pnHang.setVgap(10);
		fl_pnHang.setHgap(10);
		panel.add(pnHang);
		
		JRadioButton rdbtnHang = new JRadioButton("Hãng:");
		rdbtnHang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnHang.add(rdbtnHang);
		
		JComboBox comboBox = new JComboBox();
		pnHang.add(comboBox);
		
		JPanel pnMau = new JPanel();
		FlowLayout fl_pnMau = (FlowLayout) pnMau.getLayout();
		fl_pnMau.setAlignment(FlowLayout.LEFT);
		fl_pnMau.setVgap(10);
		fl_pnMau.setHgap(10);
		panel.add(pnMau);
		
		JRadioButton rdbtnMau = new JRadioButton("Màu sắc:");
		rdbtnMau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMau.add(rdbtnMau);
		
		JComboBox comboBox_1 = new JComboBox();
		pnMau.add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_1.getLayout();
		flowLayout_5.setAlignment(FlowLayout.RIGHT);
		flowLayout_5.setVgap(10);
		flowLayout_5.setHgap(10);
		panel.add(panel_1);
		
		JButton btnTimKiemNangCao = new JButton("Tìm kiếm");
		btnTimKiemNangCao.setBackground(new Color(0, 51, 51));
		btnTimKiemNangCao.setForeground(new Color(255, 255, 255));
		btnTimKiemNangCao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(btnTimKiemNangCao);
		
		JPanel pnKetQua = new JPanel();
		pnChinhTimKiem.add(pnKetQua);
		pnKetQua.setLayout(null);
		
		JPanel pnTableKetQua = new JPanel();
		pnTableKetQua.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "K\u1EBFt qu\u1EA3 t\u00ECm ki\u1EBFm:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnTableKetQua.setBounds(12, 25, 412, 369);
		pnKetQua.add(pnTableKetQua);
		pnTableKetQua.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneKetQua = new JScrollPane();
		pnTableKetQua.add(scrollPaneKetQua, BorderLayout.CENTER);
		
		tableKetQua = new JTable();
		scrollPaneKetQua.setViewportView(tableKetQua);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setForeground(new Color(255, 255, 255));
		btnHuy.setBackground(new Color(0, 51, 51));
		btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHuy.setBounds(327, 419, 97, 25);
		pnKetQua.add(btnHuy);
		
		JButton btnDongY = new JButton("Đồng ý");
		btnDongY.setForeground(new Color(255, 255, 255));
		btnDongY.setBackground(new Color(0, 51, 51));
		btnDongY.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDongY.setBounds(186, 419, 97, 25);
		pnKetQua.add(btnDongY);
	}
}
