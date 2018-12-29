/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodienjava.view;

import giaodienjava.view.PanelNhanVien.pnBaoHanhNV;
import giaodienjava.view.PanelNhanVien.pnHoaDonNV;
import giaodienjava.view.PanelNhanVien.pnNhapHang;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author RanRan
 */
public class NhanVien extends JFrame{

    private JPanel contentPane;
    private pnBaoHanhNV pnbaoHanh;
    private pnHoaDonNV pnhoaDon;
    private pnNhapHang pnnhapHang;
    public NhanVien(){
        initComponent();
    }

    private void initComponent() {
        
        pnbaoHanh = new pnBaoHanhNV();
        pnhoaDon = new pnHoaDonNV();
        pnnhapHang = new pnNhapHang();
        
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
		
		JPanel pnCardLayout = new JPanel();
		pnCardLayout.setBounds(134, 0, 1217, 774);
		pnCenter.add(pnCardLayout);
		pnCardLayout.setLayout(new CardLayout(0, 0));
                
                pnCardLayout.add(pnbaoHanh);
                pnCardLayout.add(pnhoaDon);
                pnCardLayout.add(pnnhapHang);
    }
}
