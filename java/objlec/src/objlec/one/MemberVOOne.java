package objlec.one;

import java.util.Date;

public class MemberVOOne {
	public String memId;
	public String pwd;
	public Date	birth;
	public boolean gender;
	private int age;

	
	public MemberVOOne(String memId, String pwd, Date birth, boolean gender, int age) {
		super();
		this.memId = memId;
		this.pwd = pwd;
		this.birth = birth;
		this.gender = gender;
		this.age = age;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String infoPrint() {
		return this.memId + "\t" + this.pwd + "\t" + this.birth + "\t" + this.gender + "\t" + this.age;
	}


	@Override
	public String toString() {
		return "MemberVOOne [memId=" + memId + ", pwd=" + pwd + ", birth=" + birth + ", gender=" + gender + ", age="
				+ age + "]";
	}
	
}
