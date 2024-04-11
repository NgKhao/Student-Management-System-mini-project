package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVmodel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.Box;
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
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QLSVView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private QLSVmodel model;
	private JTextField textField_MSV;
	private JTable table;
	private JTable table_1;
	private JTextField textField_ten;
	private JTextField textField_mon1;
	private JTextField textField_mon2;
	private JTextField textField_mon3;

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
		
		JComboBox comboBox_queQuan = new JComboBox();
		comboBox_queQuan.setBounds(90, 12, 146, 22);
		contentPane.add(comboBox_queQuan);
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setBorder(new TitledBorder(null, "List Student", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		verticalBox_1.setBounds(0, 48, 699, 225);
		contentPane.add(verticalBox_1);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "M\u00E3 th\u00ED sinh", "Qu\u00EA qu\u00E1n", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table_1);
		verticalBox_1.add(scrollPane);
		
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
		
		JComboBox comboBox_queQuan1 = new JComboBox();
		comboBox_queQuan1.setBounds(107, 335, 131, 20);
		contentPane.add(comboBox_queQuan1);
		
		textField_ten = new JTextField();
		textField_ten.setColumns(10);
		textField_ten.setBounds(107, 312, 131, 20);
		contentPane.add(textField_ten);
		
		JTextField textField_ngaySinh = new JTextField();
		textField_ngaySinh.setColumns(10);
		textField_ngaySinh.setBounds(107, 358, 131, 20);
		contentPane.add(textField_ngaySinh);
		
		JLabel jLabel_gioiTinh = new JLabel("Giới tính");
		jLabel_gioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jLabel_gioiTinh.setBounds(383, 292, 70, 20);
		contentPane.add(jLabel_gioiTinh);
		
		JRadioButton jRadioButton_nam = new JRadioButton("Nam");
		jRadioButton_nam.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jRadioButton_nam.setBounds(473, 291, 59, 23);
		contentPane.add(jRadioButton_nam);
		
		JRadioButton jRadioButton_nu = new JRadioButton("Nữ");
		jRadioButton_nu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jRadioButton_nu.setBounds(534, 291, 56, 23);
		contentPane.add(jRadioButton_nu);
		
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
		jButton_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton_insert.setBounds(40, 392, 80, 23);
		contentPane.add(jButton_insert);
		
		JButton jButton_delete = new JButton("Delete");
		jButton_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton_delete.setBounds(162, 392, 80, 23);
		contentPane.add(jButton_delete);
		
		JButton jButton_update = new JButton("Update");
		jButton_update.setBounds(290, 392, 80, 23);
		contentPane.add(jButton_update);
		
		JButton jButton_save = new JButton("save");
		jButton_save.setBounds(412, 392, 80, 23);
		contentPane.add(jButton_save);
		
		JButton jButton_cancel = new JButton("cancel");
		jButton_cancel.setBounds(534, 390, 80, 23);
		contentPane.add(jButton_cancel);
		
		JLabel jLabel_id = new JLabel("ID");
		jLabel_id.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jLabel_id.setBounds(32, 291, 48, 14);
		contentPane.add(jLabel_id);
		
		Box verticalBox_2 = Box.createVerticalBox();
		verticalBox_2.setBorder(new TitledBorder(null, "Student Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		verticalBox_2.setBounds(0, 272, 689, 154);
		contentPane.add(verticalBox_2);
		
		JButton jButton_Tim = new JButton("Tìm");
		jButton_Tim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton_Tim.setBounds(575, 12, 89, 23);
		contentPane.add(jButton_Tim);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new TitledBorder(null, "StudentFilter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		verticalBox.setBounds(0, 0, 689, 45);
		contentPane.add(verticalBox);
		

				

		
		this.setVisible(true);
	}
}
