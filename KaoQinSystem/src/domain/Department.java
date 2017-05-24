package domain;

public class Department {
	int udepartid;
	@Override
	public String toString() {
		return "Department [udepartid=" + udepartid + ", udepartname=" + udepartname + ", duty=" + duty + ", boss="
				+ boss + ", tel=" + tel + "]";
	}
	public int getUdepartid() {
		return udepartid;
	}
	public void setUdepartid(int udepartid) {
		this.udepartid = udepartid;
	}
	public String getUdepartname() {
		return udepartname;
	}
	public void setUdepartname(String udepartname) {
		this.udepartname = udepartname;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	String udepartname;
	String duty;
	String boss;
	String tel;
}
