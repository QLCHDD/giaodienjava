/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodienjava.view.PanelNhanVien.PanelBaoHanh;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JTextArea;

/**
 *
 * @author RanRan
 */
public class pnTraBaoHanh extends JPanel{

    private JTextField tfMaPhieuBH;
    private JButton btnKiemTraMaPBH;
    private JTextField tfTenKHTraBH;
    private JTextField tfSoCMNDKH;
    private JTextField tfTenSPTraBH;
    private JTextField tfSerialTraBH;
    private JTextArea taYeuCauTraBH;
    private JTextField tfNgayNhanTraBH;
    private JTextField tfNgayTraBH;
    private JTextField tfTinhTrangTraBH;
    private JButton btnXacNhanTraBH;
    private JButton btnHuyTraBH;
    public pnTraBaoHanh(){
        initComponent();
    }

    private void initComponent() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeTraBH = new JPanel();
		add(pnTieuDeTraBH, BorderLayout.NORTH);
		
		JLabel lblTieuDeTraBH = new JLabel("TRẢ BẢO HÀNH");
		lblTieuDeTraBH.setForeground(new Color(0, 51, 51));
		lblTieuDeTraBH.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeTraBH.add(lblTieuDeTraBH);
		
		JPanel panel_20 = new JPanel();
		add(panel_20, BorderLayout.CENTER);
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
		
		btnKiemTraMaPBH = new JButton("Kiểm tra");
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
		
		taYeuCauTraBH = new JTextArea();
		taYeuCauTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		taYeuCauTraBH.setEditable(false);
		taYeuCauTraBH.setRows(2);
		taYeuCauTraBH.setColumns(30);
		pnYeuCauTraBH.add(taYeuCauTraBH);
		
		JPanel pnNgayNhan_TraBH = new JPanel();
		FlowLayout flowLayout_21 = (FlowLayout) pnNgayNhan_TraBH.getLayout();
		flowLayout_21.setVgap(10);
		flowLayout_21.setHgap(10);
		flowLayout_21.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnNgayNhan_TraBH);
		
		JLabel lblNgayNhan_TraBH = new JLabel("Ngày nhận: ");
		lblNgayNhan_TraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayNhan_TraBH.add(lblNgayNhan_TraBH);
		
		tfNgayNhanTraBH = new JTextField();
		tfNgayNhanTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayNhanTraBH.setEditable(false);
		tfNgayNhanTraBH.setColumns(20);
		pnNgayNhan_TraBH.add(tfNgayNhanTraBH);
		
		JPanel pnTinhTrang_TraBH = new JPanel();
		FlowLayout flowLayout_22 = (FlowLayout) pnTinhTrang_TraBH.getLayout();
		flowLayout_22.setVgap(10);
		flowLayout_22.setHgap(10);
		flowLayout_22.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnTinhTrang_TraBH);
		
		JLabel lblTinhTrang_TraBH = new JLabel("Tình trạng:  ");
		lblTinhTrang_TraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTinhTrang_TraBH.add(lblTinhTrang_TraBH);
		
		tfTinhTrangTraBH = new JTextField();
		tfTinhTrangTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTinhTrangTraBH.setEditable(false);
		tfTinhTrangTraBH.setColumns(20);
		pnTinhTrang_TraBH.add(tfTinhTrangTraBH);
		
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
		
		btnXacNhanTraBH = new JButton("Xác nhận");
		btnXacNhanTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonTraBH.add(btnXacNhanTraBH);
		
		btnHuyTraBH = new JButton("Hủy");
		btnHuyTraBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonTraBH.add(btnHuyTraBH);
		
		JPanel panel_22 = new JPanel();
		panel_20.add(panel_22);
    }
    
}
