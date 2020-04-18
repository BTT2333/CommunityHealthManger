package indi.btt.domain;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月12日 上午11:31:25 explain:
 */
public class User {
	private int u_id;
	private String u_name;
	private String u_phone;
	private String u_age;
	private String u_sex;
	private int u_address;
	private String u_doorplate;
	private String u_pwd;

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_phone=" + u_phone + ", u_age=" + u_age + ", u_sex="
				+ u_sex + ", u_address=" + u_address + ", u_doorplate=" + u_doorplate + ", u_pwd=" + u_pwd + "]";
	}

	public User() {
		super();
	}

	public User(String u_name, String u_phone, String u_age, String u_sex, int u_address, String u_doorplate,
			String u_pwd) {
		super();
		this.u_name = u_name;
		this.u_phone = u_phone;
		this.u_age = u_age;
		this.u_sex = u_sex;
		this.u_address = u_address;
		this.u_doorplate = u_doorplate;
		this.u_pwd = u_pwd;
	}

	public User(int u_id, String u_name, String u_phone, String u_age, String u_sex, int u_address, String u_doorplate,
			String u_pwd) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_phone = u_phone;
		this.u_age = u_age;
		this.u_sex = u_sex;
		this.u_address = u_address;
		this.u_doorplate = u_doorplate;
		this.u_pwd = u_pwd;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_phone() {
		return u_phone;
	}

	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}

	public String getU_age() {
		return u_age;
	}

	public void setU_age(String u_age) {
		this.u_age = u_age;
	}

	public String getU_sex() {
		return u_sex;
	}

	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}

	public int getU_address() {
		return u_address;
	}

	public void setU_address(int u_address) {
		this.u_address = u_address;
	}

	public String getU_doorplate() {
		return u_doorplate;
	}

	public void setU_doorplate(String u_doorplate) {
		this.u_doorplate = u_doorplate;
	}

	public String getU_pwd() {
		return u_pwd;
	}

	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}

}
