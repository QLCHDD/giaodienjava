/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodienjava.view.PanelQuanLy.HoaDon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author RanRan
 */
public class pnHDBanHang extends JPanel {

    private JComboBox cbbMaHDBan;
    private JTextField tfNgayBan;
    private JTextField tfNVBan;
    private JTextField tfKH;
    private JTextField tfTongTienBan;
    private JButton btnTimKiemHDBan;
    private JScrollPane scrollPaneTableHDBanHang;
    private JTable tableHDBanHang;
    private JTextField tfSPBan;
    private JTextField tfSLBan;
    private JTextField tfKMBan;
    private JTextField tfGiaGocSPBan;
    private JTextField tfTienGiamSPBan;
    private JTextField tfThanhTienSPBan;
    private JScrollPane scrollPaneCTHDBanHang;
    private JTable tableCTHDBanHang;
    public pnHDBanHang(){
        initComponent();
    }

    private void initComponent() {

		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "H\u00F3a \u0111\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(panel_19);
		panel_19.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_22 = new JPanel();
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnMaHDBan = new JPanel();
		FlowLayout flowLayout_47 = (FlowLayout) pnMaHDBan.getLayout();
		flowLayout_47.setVgap(10);
		flowLayout_47.setHgap(10);
		flowLayout_47.setAlignment(FlowLayout.LEFT);
		panel_22.add(pnMaHDBan);
		
		JLabel lblMaHDBan = new JLabel("Mã hóa đơn:");
		lblMaHDBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnMaHDBan.add(lblMaHDBan);
		
		cbbMaHDBan = new JComboBox();
		pnMaHDBan.add(cbbMaHDBan);
		
		JPanel pnNgayBan = new JPanel();
		FlowLayout flowLayout_48 = (FlowLayout) pnNgayBan.getLayout();
		flowLayout_48.setVgap(10);
		flowLayout_48.setHgap(10);
		flowLayout_48.setAlignment(FlowLayout.LEFT);
		panel_22.add(pnNgayBan);
		
		JLabel lblNgayBan = new JLabel("Ngày bán:   ");
		lblNgayBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayBan.add(lblNgayBan);
		
		tfNgayBan = new JTextField();
		tfNgayBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayBan.setColumns(20);
		pnNgayBan.add(tfNgayBan);
		
		JPanel pnNVBan = new JPanel();
		FlowLayout flowLayout_49 = (FlowLayout) pnNVBan.getLayout();
		flowLayout_49.setVgap(10);
		flowLayout_49.setHgap(10);
		flowLayout_49.setAlignment(FlowLayout.LEFT);
		panel_22.add(pnNVBan);
		
		JLabel lblNVBan = new JLabel("Nhân viên:   ");
		lblNVBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNVBan.add(lblNVBan);
		
		tfNVBan = new JTextField();
		tfNVBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNVBan.setColumns(20);
		pnNVBan.add(tfNVBan);
		
		JPanel pnKH = new JPanel();
		FlowLayout flowLayout_50 = (FlowLayout) pnKH.getLayout();
		flowLayout_50.setVgap(10);
		flowLayout_50.setHgap(10);
		flowLayout_50.setAlignment(FlowLayout.LEFT);
		panel_22.add(pnKH);
		
		JLabel lblKH = new JLabel("Khách hàng: ");
		lblKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnKH.add(lblKH);
		
		tfKH = new JTextField();
		tfKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfKH.setColumns(20);
		pnKH.add(tfKH);
		
		JPanel pnTongTienBan = new JPanel();
		FlowLayout flowLayout_51 = (FlowLayout) pnTongTienBan.getLayout();
		flowLayout_51.setVgap(10);
		flowLayout_51.setHgap(10);
		flowLayout_51.setAlignment(FlowLayout.LEFT);
		panel_22.add(pnTongTienBan);
		
		JLabel lblTongTienBan = new JLabel("Tổng tiền:    ");
		lblTongTienBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTongTienBan.add(lblTongTienBan);
		
		tfTongTienBan = new JTextField();
		tfTongTienBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTongTienBan.setColumns(20);
		pnTongTienBan.add(tfTongTienBan);
		
		JPanel pnButtonHDBan = new JPanel();
		FlowLayout flowLayout_52 = (FlowLayout) pnButtonHDBan.getLayout();
		flowLayout_52.setVgap(10);
		flowLayout_52.setHgap(10);
		flowLayout_52.setAlignment(FlowLayout.RIGHT);
		panel_22.add(pnButtonHDBan);
		
		btnTimKiemHDBan = new JButton("Tìm kiếm");
		btnTimKiemHDBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnButtonHDBan.add(btnTimKiemHDBan);
		
		JPanel pnTableHHBanHang = new JPanel();
		panel_19.add(pnTableHHBanHang);
		pnTableHHBanHang.setLayout(new BorderLayout(0, 0));
		
		scrollPaneTableHDBanHang = new JScrollPane();
		pnTableHHBanHang.add(scrollPaneTableHDBanHang, BorderLayout.CENTER);
		
		tableHDBanHang = new JTable();
		scrollPaneTableHDBanHang.setViewportView(tableHDBanHang);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "Chi ti\u1EBFt h\u00F3a \u0111\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_17);
		panel_17.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_23 = new JPanel();
		panel_17.add(panel_23);
		panel_23.setLayout(new GridLayout(6, 6, 0, 0));
		
		JPanel pnSPBan = new JPanel();
		FlowLayout flowLayout_53 = (FlowLayout) pnSPBan.getLayout();
		flowLayout_53.setVgap(10);
		flowLayout_53.setHgap(10);
		flowLayout_53.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnSPBan);
		
		JLabel lblSPBan = new JLabel("Sản phẩm:  ");
		lblSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSPBan.add(lblSPBan);
		
		tfSPBan = new JTextField();
		tfSPBan.setEditable(false);
		tfSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSPBan.setColumns(20);
		pnSPBan.add(tfSPBan);
		
		JPanel pnSLBan = new JPanel();
		FlowLayout flowLayout_54 = (FlowLayout) pnSLBan.getLayout();
		flowLayout_54.setVgap(10);
		flowLayout_54.setHgap(10);
		flowLayout_54.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnSLBan);
		
		JLabel lblSLBan = new JLabel("Số lượng:    ");
		lblSLBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSLBan.add(lblSLBan);
		
		tfSLBan = new JTextField();
		tfSLBan.setEditable(false);
		tfSLBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSLBan.setColumns(20);
		pnSLBan.add(tfSLBan);
		
		JPanel pnKMBan = new JPanel();
		FlowLayout fl_pnKMBan = (FlowLayout) pnKMBan.getLayout();
		fl_pnKMBan.setVgap(10);
		fl_pnKMBan.setHgap(10);
		fl_pnKMBan.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnKMBan);
		
		JLabel lblKMBan = new JLabel("Khuyến mãi:");
		lblKMBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnKMBan.add(lblKMBan);
		
		tfKMBan = new JTextField();
		tfKMBan.setEditable(false);
		tfKMBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfKMBan.setColumns(20);
		pnKMBan.add(tfKMBan);
		
		JPanel pnGiaGocSPBan = new JPanel();
		FlowLayout fl_pnGiaGocSPBan = (FlowLayout) pnGiaGocSPBan.getLayout();
		fl_pnGiaGocSPBan.setVgap(10);
		fl_pnGiaGocSPBan.setHgap(10);
		fl_pnGiaGocSPBan.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnGiaGocSPBan);
		
		JLabel lblGiaGocSPBan = new JLabel("Giá gốc:      ");
		lblGiaGocSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnGiaGocSPBan.add(lblGiaGocSPBan);
		
		tfGiaGocSPBan = new JTextField();
		tfGiaGocSPBan.setEditable(false);
		tfGiaGocSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfGiaGocSPBan.setColumns(20);
		pnGiaGocSPBan.add(tfGiaGocSPBan);
		
		JPanel pnTienGiamSPBan = new JPanel();
		FlowLayout flowLayout_55 = (FlowLayout) pnTienGiamSPBan.getLayout();
		flowLayout_55.setVgap(10);
		flowLayout_55.setHgap(10);
		flowLayout_55.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnTienGiamSPBan);
		
		JLabel lblTienGiamSPBan = new JLabel("Tiền giảm:   ");
		lblTienGiamSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTienGiamSPBan.add(lblTienGiamSPBan);
		
		tfTienGiamSPBan = new JTextField();
		tfTienGiamSPBan.setEditable(false);
		tfTienGiamSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTienGiamSPBan.setColumns(20);
		pnTienGiamSPBan.add(tfTienGiamSPBan);
		
		JPanel pnThanhTienSPBan = new JPanel();
		FlowLayout flowLayout_56 = (FlowLayout) pnThanhTienSPBan.getLayout();
		flowLayout_56.setVgap(10);
		flowLayout_56.setHgap(10);
		flowLayout_56.setAlignment(FlowLayout.LEFT);
		panel_23.add(pnThanhTienSPBan);
		
		JLabel lblThanhTienSPBan = new JLabel("Thành tiền:  ");
		lblThanhTienSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThanhTienSPBan.add(lblThanhTienSPBan);
		
		tfThanhTienSPBan = new JTextField();
		tfThanhTienSPBan.setEditable(false);
		tfThanhTienSPBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfThanhTienSPBan.setColumns(20);
		pnThanhTienSPBan.add(tfThanhTienSPBan);
		
		JPanel pnCTHDBanHang = new JPanel();
		panel_17.add(pnCTHDBanHang);
		pnCTHDBanHang.setLayout(new BorderLayout(0, 0));
		
		scrollPaneCTHDBanHang = new JScrollPane();
		pnCTHDBanHang.add(scrollPaneCTHDBanHang, BorderLayout.CENTER);
		
		tableCTHDBanHang = new JTable();
		scrollPaneCTHDBanHang.setViewportView(tableCTHDBanHang);
    }
    
}
