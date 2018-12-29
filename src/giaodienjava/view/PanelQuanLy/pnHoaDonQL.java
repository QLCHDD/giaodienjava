/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodienjava.view.PanelQuanLy;

import giaodienjava.view.PanelQuanLy.HoaDon.pnHDBanHang;
import giaodienjava.view.PanelQuanLy.HoaDon.pnHDNhapHang;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

/**
 *
 * @author RanRan
 */
public class pnHoaDonQL extends JPanel{

    private JLabel lblHoaDonBan;
    private JLabel lblHoaDonMua;
    private pnHDBanHang pnhdBanHang;
    private pnHDNhapHang pnhdNhapHang;
    
    public pnHoaDonQL(){
        initComponent();
    }

    private void initComponent() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnMenuQLHD = new JPanel();
		pnMenuQLHD.setBackground(new Color(51, 102, 102));
		FlowLayout flowLayout_46 = (FlowLayout) pnMenuQLHD.getLayout();
		flowLayout_46.setVgap(10);
		flowLayout_46.setHgap(10);
		flowLayout_46.setAlignment(FlowLayout.LEFT);
		add(pnMenuQLHD, BorderLayout.NORTH);
		
		lblHoaDonBan = new JLabel("BÁN HÀNG");
		lblHoaDonBan.setForeground(Color.WHITE);
		lblHoaDonBan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pnMenuQLHD.add(lblHoaDonBan);
		
		lblHoaDonMua = new JLabel("NHẬP HÀNG");
		lblHoaDonMua.setForeground(Color.WHITE);
		lblHoaDonMua.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pnMenuQLHD.add(lblHoaDonMua);
		
		JPanel pnCardLayout = new JPanel();
		add(pnCardLayout, BorderLayout.CENTER);
		pnCardLayout.setLayout(new CardLayout(0, 0));
                
                pnCardLayout.add(pnhdBanHang);
                pnCardLayout.add(pnhdNhapHang);
    }
    
}
