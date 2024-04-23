package refone.realexam.vo;

import java.util.Objects;

public class MemberVO {
	private String memid;
	private String password;
	private String iname;
	private String address;
	private String phone;
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVO(String memid, String password, String iname) {
		super();
		this.memid = memid;
		this.password = password;
		this.iname = iname;
	}
	public MemberVO(String memid, String password, String iname, String address, String phone) {
		super();
		this.memid = memid;
		this.password = password;
		this.iname = iname;
		this.address = address;
		this.phone = phone;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, iname, memid, password, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(address, other.address) && Objects.equals(iname, other.iname)
				&& Objects.equals(memid, other.memid) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone);
	}
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
}
