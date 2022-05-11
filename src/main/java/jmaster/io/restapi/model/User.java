package jmaster.io.restapi.model;

public class User {
	private int id;
	private int maSV;
	private String tenSV;
	private String Lop;
	private double Diem;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	public double getDiem() {
		return Diem;
	}
	public void setDiem(double diem) {
		Diem = diem;
	}
	
	
}
