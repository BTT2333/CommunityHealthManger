package indi.btt.domain;


/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月30日 下午3:58:56 
* explain:
*/
public class CarRegisterResult {

	private int u_id;
	private String c_date;
	private int c_hour;
	private String c_reason;
	private String u_name;
	private String u_phone;
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getC_date() {
		return c_date;
	}
	public void setC_date(String c_date) {
		this.c_date = c_date;
	}
	public int getC_hour() {
		return c_hour;
	}
	public void setC_hour(int c_hour) {
		this.c_hour = c_hour;
	}
	public String getC_reason() {
		return c_reason;
	}
	public void setC_reason(String c_reason) {
		this.c_reason = c_reason;
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
	@Override
	public String toString() {
		return "CarRegisterResult [u_id=" + u_id + ", c_date=" + c_date + ", c_hour=" + c_hour + ", c_reason="
				+ c_reason + ", u_name=" + u_name + ", u_phone=" + u_phone + "]";
	}
	public CarRegisterResult(int u_id, String c_date, int c_hour, String c_reason, String u_name, String u_phone) {
		super();
		this.u_id = u_id;
		this.c_date = c_date;
		this.c_hour = c_hour;
		this.c_reason = c_reason;
		this.u_name = u_name;
		this.u_phone = u_phone;
	}
	public CarRegisterResult() {
		super();
	}
	
	
}
