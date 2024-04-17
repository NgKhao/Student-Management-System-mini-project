package model;

import java.util.ArrayList;

public class QLSVmodel {
	private ArrayList<ThiSinh> dsThiSinh;
	private String luaChon;

	public QLSVmodel() {
		this.dsThiSinh = new ArrayList<ThiSinh>();
		this.luaChon = "";
	}

	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
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

// lấy mssv làm khóa, check xem có thí sinh nào trùng nhằm cập nhận lại in4
	public boolean kiemTraTonTai(ThiSinh ts) {
		for(ThiSinh thiSinh : dsThiSinh) {
			return thiSinh.getMaThiSinh() == ts.getMaThiSinh();
		}
		return false;
	}


	
}
