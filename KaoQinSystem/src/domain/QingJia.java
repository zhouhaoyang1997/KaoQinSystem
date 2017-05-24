package domain;

import java.sql.Date;
import java.sql.Timestamp;

public class QingJia {
	@Override
	public String toString() {
		return "QingJia [uid=" + uid + ", starttime=" + starttime + ", agreetime=" + agreetime + ", endtime=" + endtime
				+ ", reasontype=" + reasontype + ", reason=" + reason + ", state=" + state + "]";
	}
	String uname;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	int uid;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getReasontype() {
		return reasontype;
	}
	public void setReasontype(String reasontype) {
		this.reasontype = reasontype;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	Date starttime;
	public Date getStarttime() {
		return starttime;
	}
	public Date getAgreetime() {
		return agreetime;
	}
	public Date getEndtime() {
		return endtime;
	}
	Date agreetime;
	Date endtime;
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public void setAgreetime(Date agreetime) {
		this.agreetime = agreetime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	String reasontype;
	String reason;
	public String getUdepartname() {
		return udepartname;
	}
	public void setUdepartname(String udepartname) {
		this.udepartname = udepartname;
	}
	String udepartname;
	int state;
}
