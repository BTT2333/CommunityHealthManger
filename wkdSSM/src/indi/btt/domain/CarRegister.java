package indi.btt.domain;

import java.sql.Date;


/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月28日 下午5:29:28 
* explain:
*/
public class CarRegister {

	private int u_id;
	private Date c_date;
	private int c_hour;
	private String c_reason;
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public Date getC_date() {
		return c_date;
	}
	public void setC_date(Date c_date) {
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
	@Override
	public String toString() {
		return "CarRegister [u_id=" + u_id + ", c_date=" + c_date + ", c_hour=" + c_hour + ", c_reason=" + c_reason
				+ "]";
	}
	public CarRegister(int u_id, Date c_date, int c_hour, String c_reason) {
		super();
		this.u_id = u_id;
		this.c_date = c_date;
		this.c_hour = c_hour;
		this.c_reason = c_reason;
	}
	public CarRegister() {
		super();
	}
	
	
}
