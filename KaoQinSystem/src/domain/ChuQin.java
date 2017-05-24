package domain;

public class ChuQin {
	String uname;
	int uid;
	long chuchaiday = 0;
	long qingjiaday = 0;
	int shangbanday = 0;
	int sum;
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	String description ;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public long getChuchaiday() {
		return chuchaiday;
	}
	public void setChuchaiday(long l) {
		this.chuchaiday = l;
	}
	public long getQingjiaday() {
		return qingjiaday;
	}
	public void setQingjiaday(long l) {
		this.qingjiaday = l;
	}
	public int getShangbanday() {
		return shangbanday;
	}
	public void setShangbanday(int shangbanday) {
		this.shangbanday = shangbanday;
	}
	@Override
	public String toString() {
		return "ChuQin [uname=" + uname + ", uid=" + uid + ", chuchaiday=" + chuchaiday + ", qingjiaday=" + qingjiaday
				+ ", shangbanday=" + shangbanday + "]";
	}
	
}
