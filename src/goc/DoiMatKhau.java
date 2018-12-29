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

public class DoiMatKhau extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwfMatKhauCu;
	private JPasswordField pwfMatKhauMoi;
	private JPasswordField pwfXacNhanMK;
	private JButton btnMini;
	private JButton btnClose;
	private JButton btnDoiMK;
	private JButton btnHuy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoiMatKhau frame = new DoiMatKhau();
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
	public DoiMatKhau() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 300);
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
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnMatKhauCu = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnMatKhauCu.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(10);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.add(pnMatKhauCu);
		
		JLabel lblMatKhauCu = new JLabel("Mật khẩu cũ:       ");
		lblMatKhauCu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMatKhauCu.add(lblMatKhauCu);
		
		pwfMatKhauCu = new JPasswordField();
		pwfMatKhauCu.setColumns(15);
		pnMatKhauCu.add(pwfMatKhauCu);
		
		JPanel pnMatKhauMoi = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pnMatKhauMoi.getLayout();
		flowLayout_1.setVgap(10);
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_1.add(pnMatKhauMoi);
		
		JLabel lblMatKhauMoi = new JLabel("Mật khẩu mới:      ");
		lblMatKhauMoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMatKhauMoi.add(lblMatKhauMoi);
		
		pwfMatKhauMoi = new JPasswordField();
		pwfMatKhauMoi.setColumns(15);
		pnMatKhauMoi.add(pwfMatKhauMoi);
		
		JPanel pnXacNhanMK = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) pnXacNhanMK.getLayout();
		flowLayout_2.setVgap(10);
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_1.add(pnXacNhanMK);
		
		JLabel lblXacNhanMK = new JLabel("Nhập lại mật khẩu:");
		lblXacNhanMK.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnXacNhanMK.add(lblXacNhanMK);
		
		pwfXacNhanMK = new JPasswordField();
		pwfXacNhanMK.setColumns(15);
		pnXacNhanMK.add(pwfXacNhanMK);
		
		JPanel pnButton = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) pnButton.getLayout();
		flowLayout_3.setVgap(10);
		flowLayout_3.setHgap(10);
		panel_1.add(pnButton);
		
		btnDoiMK = new JButton("Đổi mật khẩu");
		btnDoiMK.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButton.add(btnDoiMK);
		
		btnHuy = new JButton("Hủy");
		btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButton.add(btnHuy);
	}

}
