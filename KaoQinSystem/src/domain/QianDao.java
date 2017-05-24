package domain;

import java.sql.Timestamp;

public class QianDao {
	int uid;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Timestamp getStarttime() {
		return starttime;
	}
	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}
	public Timestamp getEndtime() {
		return endtime;
	}
	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}
	String uname;

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "Signin [uid=" + uid + ", starttime=" + starttime + ", endtime=" + endtime + ", addr=" + addr + "]";
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	Timestamp starttime;
	Timestamp endtime;
	Timestamp starttime1;
	Timestamp endtime1;
	Timestamp starttime2;
	Timestamp endtime2;
	public Timestamp getStarttime1() {
		return starttime1;
	}
	public void setStarttime1(Timestamp starttime1) {
		this.starttime1 = starttime1;
	}
	public Timestamp getEndtime1() {
		return endtime1;
	}
	public void setEndtime1(Timestamp endtime1) {
		this.endtime1 = endtime1;
	}
	public Timestamp getStarttime2() {
		return starttime2;
	}
	public void setStarttime2(Timestamp starttime2) {
		this.starttime2 = starttime2;
	}
	public Timestamp getEndtime2() {
		return endtime2;
	}
	public void setEndtime2(Timestamp endtime2) {
		this.endtime2 = endtime2;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	String addr;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	String description;
	int state;
	public int getstate() {
		return state;
	}
	public void setstate(int state) {
		this.state = state;
	}
}
