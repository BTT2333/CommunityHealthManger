package indi.btt.domain;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年4月2日 下午3:11:05 explain:
 */
public class DailyHealthResult {
	private int u_id;
	private String u_name;
	private String u_phone;
	private String date;
	private int isContact;
	private float temperature;
	private String healthStatus;
	private String otherRemarks;
	private int u_address;
	private String u_doorplate;

	@Override
	public String toString() {
		return "DailyHealthResult [u_id=" + u_id + ", u_name=" + u_name + ", u_phone=" + u_phone + ", date=" + date
				+ ", isContact=" + isContact + ", temperature=" + temperature + ", healthStatus=" + healthStatus
				+ ", otherRemarks=" + otherRemarks + ", u_address=" + u_address + ", u_doorplate=" + u_doorplate + "]";
	}

	public DailyHealthResult() {
		super();
	}

	public DailyHealthResult(int u_id, String u_name, String u_phone, String date, int isContact, float temperature,
			String healthStatus, String otherRemarks, int u_address, String u_doorplate) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_phone = u_phone;
		this.date = date;
		this.isContact = isContact;
		this.temperature = temperature;
		this.healthStatus = healthStatus;
		this.otherRemarks = otherRemarks;
		this.u_address = u_address;
		this.u_doorplate = u_doorplate;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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


}
