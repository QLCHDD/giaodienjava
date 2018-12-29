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
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;

/**
 *
 * @author RanRan
 */
public class pnGuiBaoHanh extends JPanel{

    private JTextField tfMaHD;
    private JComboBox cbbMaSPGuiBH;
    private JButton btnKiemTraGuiBH;
    private JTextField tfTenKHGuiBH;
    private JTextField tfCMNDGuiBH;
    private JTextField tfTenSPGuiBH;
    private JTextField tfThoiGianBHSP;
    private JTextField tfNgayMuaSPBH;
    private JTextField tfSerialSPBH;
    private JTextField tfNgayNhanBH;
    private JTextArea taYeuCauGuiBH;
    private JButton btnXacNhanGuiBH;
    private JButton btnHuyGuiBH;
    public pnGuiBaoHanh(){
        initComponent();
    }

    private void initComponent() {

		setLayout(new BorderLayout(0, 0));
		
		JPanel pnTieuDeGuiBH = new JPanel();
		add(pnTieuDeGuiBH, BorderLayout.NORTH);
		
		JLabel lblTieuDeGuiBH = new JLabel("GỬI BẢO HÀNH");
		lblTieuDeGuiBH.setForeground(new Color(0, 51, 51));
		lblTieuDeGuiBH.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnTieuDeGuiBH.add(lblTieuDeGuiBH);
		
		JPanel pnCenterGuiBH = new JPanel();
		add(pnCenterGuiBH, BorderLayout.CENTER);
		pnCenterGuiBH.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "Ki\u1EC3m tra th\u00F4ng tin:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnCenterGuiBH.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JPanel pnThongTinKiemTra = new JPanel();
		FlowLayout fl_pnThongTinKiemTra = (FlowLayout) pnThongTinKiemTra.getLayout();
		fl_pnThongTinKiemTra.setVgap(10);
		fl_pnThongTinKiemTra.setHgap(10);
		fl_pnThongTinKiemTra.setAlignment(FlowLayout.LEFT);
		panel_12.add(pnThongTinKiemTra, BorderLayout.NORTH);
		
		JLabel lblMaHD = new JLabel("Mã hóa đơn:");
		lblMaHD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThongTinKiemTra.add(lblMaHD);
		
		tfMaHD = new JTextField();
		tfMaHD.setColumns(10);
		pnThongTinKiemTra.add(tfMaHD);
		
		JLabel lblMaSPGuiBH = new JLabel("Mã sản phẩm:");
		lblMaSPGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThongTinKiemTra.add(lblMaSPGuiBH);
		
		cbbMaSPGuiBH = new JComboBox();
		pnThongTinKiemTra.add(cbbMaSPGuiBH);
		
		btnKiemTraGuiBH = new JButton("Kiểm tra");
		btnKiemTraGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThongTinKiemTra.add(btnKiemTraGuiBH);
		
		JPanel panel_14 = new JPanel();
		panel_12.add(panel_14, BorderLayout.CENTER);
		panel_14.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnTenKHGuiBH = new JPanel();
		FlowLayout fl_pnTenKHGuiBH = (FlowLayout) pnTenKHGuiBH.getLayout();
		fl_pnTenKHGuiBH.setVgap(10);
		fl_pnTenKHGuiBH.setHgap(10);
		fl_pnTenKHGuiBH.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnTenKHGuiBH);
		
		JLabel lblTenKHGuiBH = new JLabel("Tên khách hàng:");
		lblTenKHGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenKHGuiBH.add(lblTenKHGuiBH);
		
		tfTenKHGuiBH = new JTextField();
		tfTenKHGuiBH.setEditable(false);
		tfTenKHGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenKHGuiBH.setColumns(20);
		pnTenKHGuiBH.add(tfTenKHGuiBH);
		
		JPanel pnCMNDGuiBH = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) pnCMNDGuiBH.getLayout();
		flowLayout_4.setVgap(10);
		flowLayout_4.setHgap(10);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnCMNDGuiBH);
		
		JLabel lblCMNDGuiBH = new JLabel("Số CMND:         ");
		lblCMNDGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnCMNDGuiBH.add(lblCMNDGuiBH);
		
		tfCMNDGuiBH = new JTextField();
		tfCMNDGuiBH.setEditable(false);
		tfCMNDGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfCMNDGuiBH.setColumns(20);
		pnCMNDGuiBH.add(tfCMNDGuiBH);
		
		JPanel pnTenSPGuiBH = new JPanel();
		FlowLayout flowLayout_12 = (FlowLayout) pnTenSPGuiBH.getLayout();
		flowLayout_12.setVgap(10);
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnTenSPGuiBH);
		
		JLabel lblTenSPGuiBH = new JLabel("Tên sản phẩm:  ");
		lblTenSPGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnTenSPGuiBH.add(lblTenSPGuiBH);
		
		tfTenSPGuiBH = new JTextField();
		tfTenSPGuiBH.setEditable(false);
		tfTenSPGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTenSPGuiBH.setColumns(20);
		pnTenSPGuiBH.add(tfTenSPGuiBH);
		
		JPanel pnThoiGianBHSP = new JPanel();
		FlowLayout flowLayout_13 = (FlowLayout) pnThoiGianBHSP.getLayout();
		flowLayout_13.setVgap(10);
		flowLayout_13.setHgap(10);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnThoiGianBHSP);
		
		JLabel lblThoiGianBHSP = new JLabel("Bảo hành:         ");
		lblThoiGianBHSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThoiGianBHSP.add(lblThoiGianBHSP);
		
		tfThoiGianBHSP = new JTextField();
		tfThoiGianBHSP.setEditable(false);
		tfThoiGianBHSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfThoiGianBHSP.setColumns(20);
		pnThoiGianBHSP.add(tfThoiGianBHSP);
		
		JPanel pnNgayMuaSPBH = new JPanel();
		FlowLayout fl_pnNgayMuaSPBH = (FlowLayout) pnNgayMuaSPBH.getLayout();
		fl_pnNgayMuaSPBH.setVgap(10);
		fl_pnNgayMuaSPBH.setHgap(10);
		fl_pnNgayMuaSPBH.setAlignment(FlowLayout.LEFT);
		panel_14.add(pnNgayMuaSPBH);
		
		JLabel lblNgayMuaSPBH = new JLabel("Ngày mua:        ");
		lblNgayMuaSPBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayMuaSPBH.add(lblNgayMuaSPBH);
		
		tfNgayMuaSPBH = new JTextField();
		tfNgayMuaSPBH.setEditable(false);
		tfNgayMuaSPBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayMuaSPBH.setColumns(20);
		pnNgayMuaSPBH.add(tfNgayMuaSPBH);
		
		JPanel pnThongBao = new JPanel();
		panel_14.add(pnThongBao);
		
		JLabel lblNewLabel_4 = new JLabel("Còn/Hết thời hạn bảo hành!");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnThongBao.add(lblNewLabel_4);
		
		JPanel panel_15 = new JPanel();
		panel_14.add(panel_15);
		
		JPanel panel_13 = new JPanel();
		panel_14.add(panel_13);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(new LineBorder(new Color(0, 51, 51), 2), "Th\u00F4ng tin b\u1EA3o h\u00E0nh:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnCenterGuiBH.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JPanel pn = new JPanel();
		FlowLayout fl_pn = (FlowLayout) pn.getLayout();
		fl_pn.setVgap(10);
		fl_pn.setHgap(10);
		fl_pn.setAlignment(FlowLayout.LEFT);
		panel_8.add(pn, BorderLayout.NORTH);
		
		JLabel lblSerialSPBH = new JLabel("Serial sản phẩm:");
		lblSerialSPBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pn.add(lblSerialSPBH);
		
		tfSerialSPBH = new JTextField();
		tfSerialSPBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfSerialSPBH.setColumns(20);
		pn.add(tfSerialSPBH);
		
		JPanel panel_16 = new JPanel();
		panel_8.add(panel_16, BorderLayout.CENTER);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JPanel pnNgayNhanBH = new JPanel();
		FlowLayout fl_pnNgayNhanBH = (FlowLayout) pnNgayNhanBH.getLayout();
		fl_pnNgayNhanBH.setVgap(10);
		fl_pnNgayNhanBH.setHgap(10);
		fl_pnNgayNhanBH.setAlignment(FlowLayout.LEFT);
		panel_16.add(pnNgayNhanBH, BorderLayout.NORTH);
		
		JLabel lblNgayNhanBH = new JLabel("Ngày nhận:      ");
		lblNgayNhanBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNgayNhanBH.add(lblNgayNhanBH);
		
		tfNgayNhanBH = new JTextField();
		tfNgayNhanBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNgayNhanBH.setColumns(20);
		pnNgayNhanBH.add(tfNgayNhanBH);
		
		JPanel panel_17 = new JPanel();
		panel_16.add(panel_17, BorderLayout.CENTER);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JPanel pnYeuCauGuiBH = new JPanel();
		FlowLayout fl_pnYeuCauGuiBH = (FlowLayout) pnYeuCauGuiBH.getLayout();
		fl_pnYeuCauGuiBH.setVgap(10);
		fl_pnYeuCauGuiBH.setHgap(10);
		fl_pnYeuCauGuiBH.setAlignment(FlowLayout.LEFT);
		panel_17.add(pnYeuCauGuiBH, BorderLayout.NORTH);
		
		JLabel lblYeuCauGuiBH = new JLabel("Yêu cầu BH:     ");
		lblYeuCauGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnYeuCauGuiBH.add(lblYeuCauGuiBH);
		
		taYeuCauGuiBH = new JTextArea();
		taYeuCauGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		taYeuCauGuiBH.setLineWrap(true);
		taYeuCauGuiBH.setRows(3);
		taYeuCauGuiBH.setColumns(30);
		pnYeuCauGuiBH.add(taYeuCauGuiBH);
		
		JPanel panel_18 = new JPanel();
		panel_17.add(panel_18, BorderLayout.CENTER);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_19 = new JPanel();
		FlowLayout flowLayout_16 = (FlowLayout) panel_19.getLayout();
		flowLayout_16.setVgap(10);
		flowLayout_16.setHgap(10);
		flowLayout_16.setAlignment(FlowLayout.RIGHT);
		panel_18.add(panel_19, BorderLayout.NORTH);
		
		btnXacNhanGuiBH = new JButton("Xác nhận");
		btnXacNhanGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_19.add(btnXacNhanGuiBH);
		
		btnHuyGuiBH = new JButton("Hủy");
		btnHuyGuiBH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_19.add(btnHuyGuiBH);
    }
}
