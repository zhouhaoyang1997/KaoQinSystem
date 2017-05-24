package domain;

import java.sql.Date;

public class User {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uaddr == null) ? 0 : uaddr.hashCode());
		result = prime * result + ((ubirth == null) ? 0 : ubirth.hashCode());
		result = prime * result + ((uboss == null) ? 0 : uboss.hashCode());
		result = prime * result + ((udepartid == null) ? 0 : udepartid.hashCode());
		result = prime * result + ((udepartname == null) ? 0 : udepartname.hashCode());
		result = prime * result + ((uentrytime == null) ? 0 : uentrytime.hashCode());
		result = prime * result + uid;
		result = prime * result + ((umail == null) ? 0 : umail.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		result = prime * result + ((upwd == null) ? 0 : upwd.hashCode());
		result = prime * result + ((urole == null) ? 0 : urole.hashCode());
		result = prime * result + ((usex == null) ? 0 : usex.hashCode());
		result = prime * result + ((utel == null) ? 0 : utel.hashCode());
		result = prime * result + ((uwork == null) ? 0 : uwork.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (uaddr == null) {
			if (other.uaddr != null)
				return false;
		} else if (!uaddr.equals(other.uaddr))
			return false;
		if (ubirth == null) {
			if (other.ubirth != null)
				return false;
		} else if (!ubirth.equals(other.ubirth))
			return false;
		if (uboss == null) {
			if (other.uboss != null)
				return false;
		} else if (!uboss.equals(other.uboss))
			return false;
		if (udepartid == null) {
			if (other.udepartid != null)
				return false;
		} else if (!udepartid.equals(other.udepartid))
			return false;
		if (udepartname == null) {
			if (other.udepartname != null)
				return false;
		} else if (!udepartname.equals(other.udepartname))
			return false;
		if (uentrytime == null) {
			if (other.uentrytime != null)
				return false;
		} else if (!uentrytime.equals(other.uentrytime))
			return false;
		if (uid != other.uid)
			return false;
		if (umail == null) {
			if (other.umail != null)
				return false;
		} else if (!umail.equals(other.umail))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		if (upwd == null) {
			if (other.upwd != null)
				return false;
		} else if (!upwd.equals(other.upwd))
			return false;
		if (urole == null) {
			if (other.urole != null)
				return false;
		} else if (!urole.equals(other.urole))
			return false;
		if (usex == null) {
			if (other.usex != null)
				return false;
		} else if (!usex.equals(other.usex))
			return false;
		if (utel == null) {
			if (other.utel != null)
				return false;
		} else if (!utel.equals(other.utel))
			return false;
		if (uwork == null) {
			if (other.uwork != null)
				return false;
		} else if (!uwork.equals(other.uwork))
			return false;
		return true;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", usex=" + usex + ", uwork=" + uwork
				+ ", udepartid=" + udepartid + ", udepartname=" + udepartname + ", utel=" + utel + ", umail=" + umail
				+ ", uboss=" + uboss + ", uaddr=" + uaddr + ", uentrytime=" + uentrytime + ", ubirth=" + ubirth
				+ ", urole=" + urole + "]";
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getUwork() {
		return uwork;
	}
	public void setUwork(String uwork) {
		this.uwork = uwork;
	}
	public String getUdepartid() {
		return udepartid;
	}
	public void setUdepartid(String udepartid) {
		this.udepartid = udepartid;
	}
	public String getUdepartname() {
		return udepartname;
	}
	public void setUdepartname(String udepartname) {
		this.udepartname = udepartname;
	}
	public String getUtel() {
		return utel;
	}
	public void setUtel(String utel) {
		this.utel = utel;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	public String getUboss() {
		return uboss;
	}
	public void setUboss(String uboss) {
		this.uboss = uboss;
	}
	public String getUaddr() {
		return uaddr;
	}
	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}
	public Date getUentrytime() {
		return uentrytime;
	}
	public void setUentrytime(Date uentrytime) {
		this.uentrytime = uentrytime;
	}
	public Date getUbirth() {
		return ubirth;
	}
	public void setUbirth(Date ubirth) {
		this.ubirth = ubirth;
	}
	public String getUrole() {
		return urole;
	}
	public void setUrole(String urole) {
		this.urole = urole;
	}
	int uid;
	String uname;
	String upwd;
	String usex;
	String uwork;
	String udepartid;
	String udepartname;
	String utel;
	String umail;
	String uboss;
	String uaddr;
	Date uentrytime;
	Date ubirth;
	String urole;
	
}
