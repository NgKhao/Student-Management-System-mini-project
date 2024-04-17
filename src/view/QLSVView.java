package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVmodel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;

public class QLSVView extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final Object SimpleDateFormat = null;
	private JPanel contentPane;
	public QLSVmodel model;
	private JTextField textField_MSV;
	public JTable table_1;
	public JTextField textField_ten;
	public JTextField textField_mon1;
	public JTextField textField_mon2;
	public JTextField textField_mon3;
	public JTextField textField_id;
	public JTextField textField_ngaySinh;
	public JComboBox comboBox_queQuanThongTin;
	public ButtonGroup buttonGroup_gioiTinh;
	public JRadioButton jRadioButton_nam;
	public JRadioButton jRadioButton_nu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
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
	public QLSVView() {
		this.model = new QLSVmodel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 492);
		
		ActionListener actionListener = new QLSVController(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("Close");
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("About Me");
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlable_queQuan = new JLabel("Quê quán");
		jlable_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jlable_queQuan.setBounds(10, 11, 70, 20);
		contentPane.add(jlable_queQuan);
		
		JLabel jlable_thiSinh = new JLabel("Mã sinh viên");
		jlable_thiSinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jlable_thiSinh.setBounds(303, 11, 89, 20);
		contentPane.add(jlable_thiSinh);
		
		textField_MSV = new JTextField();
		textField_MSV.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_MSV.setBounds(398, 11, 146, 26);
		contentPane.add(textField_MSV);
		textField_MSV.setColumns(10);
		
		JComboBox comboBox_queQuanTimKiem = new JComboBox();
		comboBox_queQuanTimKiem.addItem("");
		for (Tinh tinh : Tinh.getDSTinh()) {
			comboBox_queQuanTimKiem.addItem(tinh.getTenTinh());
		} 
		comboBox_queQuanTimKiem.setBounds(90, 12, 146, 22);
		contentPane.add(comboBox_queQuanTimKiem);
		
		Box verticalBox_list = Box.createVerticalBox();
		verticalBox_list.setBorder(new TitledBorder(null, "List Student", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		verticalBox_list.setBounds(0, 48, 699, 225);
		contentPane.add(verticalBox_list);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã thí sinh", "Họ và tên","Ngày sinh", "Qu\u00EA qu\u00E1n", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table_1);
		verticalBox_list.add(scrollPane);
		
		JLabel jLabel_ten = new JLabel("Họ và tên");
		jLabel_ten.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jLabel_ten.setBounds(30, 311, 70, 20);
		contentPane.add(jLabel_ten);
		
		JLabel jLabel_queQuan = new JLabel("Quê quán");
		jLabel_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jLabel_queQuan.setBounds(30, 335, 70, 20);
		contentPane.add(jLabel_queQuan);
		
		JLabel jLabel_ngaySinh = new JLabel("Ngày sinh");
		jLabel_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jLabel_ngaySinh.setBounds(30, 358, 70, 20);
		contentPane.add(jLabel_ngaySinh);
		
		comboBox_queQuanThongTin = new JComboBox();
		comboBox_queQuanThongTin.addItem("");
		for (Tinh tinh : Tinh.getDSTinh()) {
			comboBox_queQuanThongTin.addItem(tinh.getTenTinh());
		} 
		comboBox_queQuanThongTin.setBounds(107, 335, 131, 20);
		contentPane.add(comboBox_queQuanThongTin);
		
		textField_ten = new JTextField();
		textField_ten.setColumns(10);
		textField_ten.setBounds(107, 312, 131, 20);
		contentPane.add(textField_ten);
		
		textField_ngaySinh = new JTextField();
		textField_ngaySinh.setColumns(10);
		textField_ngaySinh.setBounds(107, 358, 131, 20);
		contentPane.add(textField_ngaySinh);
		
		JLabel jLabel_gioiTinh = new JLabel("Giới tính");
		jLabel_gioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jLabel_gioiTinh.setBounds(383, 292, 70, 20);
		contentPane.add(jLabel_gioiTinh);
		
		jRadioButton_nam = new JRadioButton("Nam");
		jRadioButton_nam.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jRadioButton_nam.setBounds(473, 291, 59, 23);
		contentPane.add(jRadioButton_nam);
		
		jRadioButton_nu = new JRadioButton("Nữ");
		jRadioButton_nu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jRadioButton_nu.setBounds(534, 291, 56, 23);
		contentPane.add(jRadioButton_nu);
		
		buttonGroup_gioiTinh = new ButtonGroup();
		buttonGroup_gioiTinh.add(jRadioButton_nam);
		buttonGroup_gioiTinh.add(jRadioButton_nu);
		
		JLabel jLabel_mon1 = new JLabel("Môn 1");
		jLabel_mon1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jLabel_mon1.setBounds(383, 315, 70, 20);
		contentPane.add(jLabel_mon1);
		
		JLabel jLabel_mon2 = new JLabel("Môn 2");
		jLabel_mon2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jLabel_mon2.setBounds(383, 339, 70, 20);
		contentPane.add(jLabel_mon2);
		
		JLabel jLabel_mon3 = new JLabel("Môn 3");
		jLabel_mon3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jLabel_mon3.setBounds(383, 362, 70, 20);
		contentPane.add(jLabel_mon3);
		
		textField_mon1 = new JTextField();
		textField_mon1.setColumns(10);
		textField_mon1.setBounds(473, 312, 131, 20);
		contentPane.add(textField_mon1);
		
		textField_mon2 = new JTextField();
		textField_mon2.setColumns(10);
		textField_mon2.setBounds(473, 336, 131, 20);
		contentPane.add(textField_mon2);
		
		textField_mon3 = new JTextField();
		textField_mon3.setColumns(10);
		textField_mon3.setBounds(473, 359, 131, 20);
		contentPane.add(textField_mon3);
		
		JButton jButton_insert = new JButton("Insert");
		jButton_insert.addActionListener(actionListener);
		jButton_insert.setBounds(40, 392, 80, 23);
		contentPane.add(jButton_insert);
		
		JButton jButton_delete = new JButton("Delete");
		jButton_delete.addActionListener(actionListener);
		jButton_delete.setBounds(162, 392, 80, 23);
		contentPane.add(jButton_delete);
		
		JButton jButton_update = new JButton("Update");
		jButton_update.addActionListener(actionListener);
		jButton_update.setBounds(290, 392, 80, 23);
		contentPane.add(jButton_update);
		
		JButton jButton_save = new JButton("Save");
		jButton_save.addActionListener(actionListener);
		jButton_save.setBounds(412, 392, 80, 23);
		contentPane.add(jButton_save);
		
		JButton jButton_cancel = new JButton("Cancel");
		jButton_cancel.addActionListener(actionListener);
		jButton_cancel.setBounds(534, 390, 80, 23);
		contentPane.add(jButton_cancel);
		
		JLabel jLabel_id = new JLabel("ID");
		jLabel_id.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jLabel_id.setBounds(32, 291, 48, 14);
		contentPane.add(jLabel_id);
		
		JButton jButton_Tim = new JButton("Tìm");
		jButton_Tim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton_Tim.setBounds(575, 12, 89, 23);
		contentPane.add(jButton_Tim);
		
		Box verticalBox_Filter = Box.createVerticalBox();
		verticalBox_Filter.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Student Filter", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		verticalBox_Filter.setBounds(0, 0, 689, 45);
		contentPane.add(verticalBox_Filter);
		
		textField_id = new JTextField();
		textField_id.setBounds(107, 289, 131, 20);
		contentPane.add(textField_id);
		textField_id.setColumns(10);
		
		Box verticalBox_infor = Box.createVerticalBox();
		verticalBox_infor.setBorder(new TitledBorder(null, "Student Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		verticalBox_infor.setBounds(0, 275, 698, 151);
		contentPane.add(verticalBox_infor);
		

		this.setVisible(true);
	}

	public void xoaForm() {
		// TODO Auto-generated method stub
		textField_id.setText("");
		textField_ten.setText("");
		textField_ngaySinh.setText("");
		textField_mon1.setText("");
		textField_mon2.setText("");
		textField_mon3.setText("");
		comboBox_queQuanThongTin.setSelectedIndex(-1);
		buttonGroup_gioiTinh.clearSelection();
	}

	public void themHoacCapNhapThiSinh(ThiSinh ts) {
		// TODO Auto-generated method stub
		DefaultTableModel model_table = (DefaultTableModel) table_1.getModel();
		if(!this.model.kiemTraTonTai(ts)) { //nếu tồn tại thì thêm, 
			this.model.insert(ts);
//			thêm dữ liệu vào bảng
			model_table.addRow(new Object[] {
					ts.getMaThiSinh() + "",
					ts.getTenThiSinh(),
					new SimpleDateFormat("dd/MM/yyyy").format(ts.getNgaySinh()),
					ts.getQueQuan().getTenTinh(),
					(ts.isGioiTinh() ? "Nam" : "Nữ"),
					ts.getDiemMon1() + "",
					ts.getDiemMon2() + "",
					ts.getDiemMon3() + ""
					});
		}else {//ngc lai sẽ cập nhập
			this.model.update(ts);
			int soLuongDong = model_table.getRowCount(); 
			for(int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if(id.equals(ts.getMaThiSinh()+ "")) {
					model_table.setValueAt(ts.getMaThiSinh() + "", i, 0);
					model_table.setValueAt(ts.getTenThiSinh() + "", i, 1);
					model_table.setValueAt(new SimpleDateFormat("dd/MM/yyyy").format(ts.getNgaySinh()), i, 2);
					model_table.setValueAt(ts.getQueQuan().getTenTinh(), i, 3);
					model_table.setValueAt((ts.isGioiTinh() ? "Nam" : "Nữ"), i, 4);
					model_table.setValueAt(ts.getDiemMon1() + "", i, 5);
					model_table.setValueAt(ts.getDiemMon2() + "", i, 6);
					model_table.setValueAt(ts.getDiemMon3() + "", i, 7);
				}
			}
		}
	}

	public void hienThiThongTinThiSinhDaChon() {
		// TODO Auto-generated method stub
		DefaultTableModel model_table = (DefaultTableModel) table_1.getModel();
		int i_row = table_1.getSelectedRow();
		
		String maThiSinh = model_table.getValueAt(i_row, 0) + "";
//		int maThiSinh = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
		String tenThiSinh = model_table.getValueAt(i_row, 1) + "";
		Tinh tinh = Tinh.getTingByTen(model_table.getValueAt(i_row, 3) + "");
		Date ngaySinh = ThiSinh.inputNgaySinh(model_table.getValueAt(i_row, 2) + "");
		String textGioiTinh = model_table.getValueAt(i_row, 4) + "";
		boolean gioiTinh = textGioiTinh.equals("Nam");
		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5) + "");
		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6) + "");
		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 7) + "");
		
		this.textField_id.setText(maThiSinh);
		this.textField_ten.setText(tenThiSinh);
		this.comboBox_queQuanThongTin.setSelectedItem(tinh.getTenTinh());
		this.textField_ngaySinh.setText(new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + "");
		if(gioiTinh) {
			jRadioButton_nam.setSelected(true);
		}else {
			jRadioButton_nu.setSelected(true);
		}
		this.buttonGroup_gioiTinh.setSelected(null, gioiTinh);
		this.textField_mon1.setText(diemMon1 + "");
		this.textField_mon2.setText(diemMon2 + "");
		this.textField_mon3.setText(diemMon3 + "");
	}
}
