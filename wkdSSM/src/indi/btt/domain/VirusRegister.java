package indi.btt.domain;


/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月28日 下午2:48:23 
* explain:
*/
public class VirusRegister {
	
	 private int u_id;
	 private String s_name;
	 private String s_phone;
	 private String s_hospital;
	 private String s_date;
	 private String s_other;
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_phone() {
		return s_phone;
	}
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	public String getS_hospital() {
		return s_hospital;
	}
	public void setS_hospital(String s_hospital) {
		this.s_hospital = s_hospital;
	}
	public String getS_date() {
		return s_date;
	}
	public void setS_date(String s_date) {
		this.s_date = s_date;
	}
	public String getS_other() {
		return s_other;
	}
	public void setS_other(String s_other) {
		this.s_other = s_other;
	}
	@Override
	public String toString() {
		return "VirusRegister [u_id=" + u_id + ", s_name=" + s_name + ", s_phone=" + s_phone + ", s_hospital="
				+ s_hospital + ", s_date=" + s_date + ", s_other=" + s_other + "]";
	}
	public VirusRegister(int u_id, String s_name, String s_phone, String s_hospital, String s_date, String s_other) {
		super();
		this.u_id = u_id;
		this.s_name = s_name;
		this.s_phone = s_phone;
		this.s_hospital = s_hospital;
		this.s_date = s_date;
		this.s_other = s_other;
	}
	public VirusRegister() {
		super();
	}
	 
	 
}
