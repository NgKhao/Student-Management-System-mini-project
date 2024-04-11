package model;

import java.util.ArrayList;

public class QLSVmodel {
	private ArrayList<ThiSinh> dsThiSinh;

	public QLSVmodel() {
		this.dsThiSinh = new ArrayList<ThiSinh>();
	}

	public QLSVmodel(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}

	public ArrayList<ThiSinh> getDsThiSinh() {
		return dsThiSinh;
	}

	public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}
	
	public void insert(ThiSinh other) {
		this.dsThiSinh.add(other);
	}
	
	public void delete(ThiSinh other) {
		this.dsThiSinh.remove(other);
	}
	
	public void update(ThiSinh other) {
//		xóa thằng cũ đi và cập nhập thằng mới lại
		this.dsThiSinh.remove(other);
		this.dsThiSinh.add(other);
	}
	
}
