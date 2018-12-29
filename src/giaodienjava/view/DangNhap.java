package giaodienjava.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class DangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnMini;
	private JButton btnClose;
	private JButton btnDangNhap;
	private JButton btnHuy;

	public DangNhap() {
            initComponent();
	}

    private void initComponent() {
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 51));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 2, 5));
		
		btnMini = new JButton("New button");
		btnMini.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(btnMini);
		
		btnClose = new JButton("New button");
		panel.add(btnClose);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		
		JLabel label = new JLabel("Tài khoản:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_6.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(15);
		panel_6.add(textField);
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7);
		
		JLabel label_1 = new JLabel("Mật khẩu: ");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_7.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setColumns(15);
		panel_7.add(passwordField);
		
		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_8.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(10);
		panel_4.add(panel_8);
		
		btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_8.add(btnDangNhap);
		
		btnHuy = new JButton("Hủy");
		btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_8.add(btnHuy);
    }

}
