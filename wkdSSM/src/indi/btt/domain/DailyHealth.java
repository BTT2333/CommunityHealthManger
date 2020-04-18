package indi.btt.domain;

import java.sql.Date;

/** 
* @author baotiantian E-mail:791010113@qq.com 
* @version date：2020年3月20日 下午5:41:09 
* explain:
*/
public class DailyHealth {
	private int u_id;
	private Date date;
	private int isContact;
	private float temperature;
	private String healthStatus;
	private String otherRemarks;
	
	
	@Override
	public String toString() {
		return "DailyHealth [u_id=" + u_id + ", date=" + date + ", isContact=" + isContact + ", temperature="
				+ temperature + ", healthStatus=" + healthStatus + ", otherRemarks=" + otherRemarks + "]";
	}
	public DailyHealth() {
		super();
	}
	public DailyHealth(int u_id, Date date, int isContact, float temperature, String healthStatus,
			String otherRemarks) {
		super();
		this.u_id = u_id;
		this.date = date;
		this.isContact = isContact;
		this.temperature = temperature;
		this.healthStatus = healthStatus;
		this.otherRemarks = otherRemarks;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getIsContact() {
		return isContact;
	}
	public void setIsContact(int isContact) {
		this.isContact = isContact;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public String getHealthStatus() {
		return healthStatus;
	}
	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}
	public String getOtherRemarks() {
		return otherRemarks;
	}
	public void setOtherRemarks(String otherRemarks) {
		this.otherRemarks = otherRemarks;
	}
	
	

}
