package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVController implements ActionListener{
	private QLSVView qlsvView;

	public QLSVController(QLSVView qlsvView) {
		this.qlsvView = qlsvView;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		JOptionPane.showMessageDialog(qlsvView, "Bạn vừa nhấn vào: " + command);
		if(command.equals("Insert")) {
			this.qlsvView.xoaForm();
			this.qlsvView.model.setLuaChon("Insert");
		}else if(command.equals("Save")) {
			try {
//				get du lieu
				int maThiSinh = Integer.valueOf(this.qlsvView.textField_id.getText());
				String tenThiSinh = this.qlsvView.textField_ten.getText();
				int queQuan = this.qlsvView.comboBox_queQuanThongTin.getSelectedIndex() - 1;// có -1 vì trong comboBox_queQuanThongTin lúc đầu có add thêm 1 "" trước danh sách
				Tinh tinh = Tinh.getTinhById(queQuan);
				Date ngaySinh = ThiSinh.inputNgaySinh(this.qlsvView.textField_ngaySinh.getText());
				boolean gioiTinh = true;
				if(this.qlsvView.jRadioButton_nam.isSelected()) {
					gioiTinh = true;
				}else if(this.qlsvView.jRadioButton_nu.isSelected()) {
					gioiTinh = false;
				}
				float diemMon1 = Float.valueOf(this.qlsvView.textField_mon1.getText());
				float diemMon2 = Float.valueOf(this.qlsvView.textField_mon2.getText());
				float diemMon3 = Float.valueOf(this.qlsvView.textField_mon3.getText());

				
				ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
				this.qlsvView.themHoacCapNhapThiSinh(ts);
				
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(command.equals("Update")) {
			this.qlsvView.hienThiThongTinThiSinhDaChon();
		}
	}
	
}
