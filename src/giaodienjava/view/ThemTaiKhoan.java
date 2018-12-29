package giaodienjava.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class ThemTaiKhoan extends JFrame {
    
        private JPanel contentPane;
	private JTextField tfTaiKhoan;
	private JButton btnMini;
	private JButton btnClose;
	private JComboBox cbbPhanQuyen;
	private JButton btnDongY;
	private JButton btnHuy;
        	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemTaiKhoan frame = new ThemTaiKhoan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ThemTaiKhoan() {
		initComponent();
	}

    private void initComponent() {
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnTop = new JPanel();
		pnTop.setBackground(new Color(0, 51, 51));
		contentPane.add(pnTop, BorderLayout.NORTH);
		pnTop.setLayout(new FlowLayout(FlowLayout.RIGHT, 2, 5));
		
		btnMini = new JButton("Mini");
		pnTop.add(btnMini);
		
		btnClose = new JButton("Close");
		pnTop.add(btnClose);
		
		JPanel pnCenter = new JPanel();
		contentPane.add(pnCenter, BorderLayout.CENTER);
		pnCenter.setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDe = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnTieuDe.getLayout();
		flowLayout.setVgap(10);
		pnCenter.add(pnTieuDe, BorderLayout.NORTH);
		
		JLabel lblTieuDe = new JLabel("THÊM TÀI KHOẢN");
		lblTieuDe.setForeground(new Color(0, 51, 51));
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDe.add(lblTieuDe);
		
		JPanel pnThongTin = new JPanel();
		pnCenter.add(pnThongTin, BorderLayout.CENTER);
		pnThongTin.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel pnTenTaiKhoan = new JPanel();
		FlowLayout fl_pnTenTaiKhoan = (FlowLayout) pnTenTaiKhoan.getLayout();
		fl_pnTenTaiKhoan.setHgap(10);
		fl_pnTenTaiKhoan.setAlignment(FlowLayout.LEFT);
		fl_pnTenTaiKhoan.setVgap(10);
		pnThongTin.add(pnTenTaiKhoan);
		
		JLabel lblTaiKhoan = new JLabel("Tài khoản:  ");
		lblTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenTaiKhoan.add(lblTaiKhoan);
		
		tfTaiKhoan = new JTextField();
		tfTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTaiKhoan.setColumns(15);
		pnTenTaiKhoan.add(tfTaiKhoan);
		tfTaiKhoan.setColumns(20);
		
		JPanel pnPhanQuyen = new JPanel();
		FlowLayout fl_pnPhanQuyen = (FlowLayout) pnPhanQuyen.getLayout();
		fl_pnPhanQuyen.setHgap(10);
		fl_pnPhanQuyen.setAlignment(FlowLayout.LEFT);
		fl_pnPhanQuyen.setVgap(10);
		pnThongTin.add(pnPhanQuyen);
		
		JLabel lblPhanQuyen = new JLabel("Phân quyền:");
		lblPhanQuyen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnPhanQuyen.add(lblPhanQuyen);
	
		
		cbbPhanQuyen = new JComboBox();
		pnPhanQuyen.add(cbbPhanQuyen);
		
		JPanel pnButton = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) pnButton.getLayout();
		flowLayout_4.setAlignment(FlowLayout.RIGHT);
		flowLayout_4.setHgap(15);
		flowLayout_4.setVgap(10);
		pnThongTin.add(pnButton);
		
		btnDongY = new JButton("Đồng ý");
		btnDongY.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButton.add(btnDongY);
		
		btnHuy = new JButton("Hủy");
		btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButton.add(btnHuy);
    }

}
