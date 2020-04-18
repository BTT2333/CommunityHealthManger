package indi.btt.domain;

import java.sql.Date;
import java.sql.Time;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月23日 下午4:35:15 explain:
 */
public class OutRegister {
	private int u_id;
	private String date;
	private String time;
	private String name;
	private String phone;
	private int outTime;
	private String reason;
	private int isFriend;

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getOutTime() {
		return outTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getIsFriend() {
		return isFriend;
	}

	public void setIsFriend(int isFriend) {
		this.isFriend = isFriend;
	}

	public OutRegister(int u_id, String date, String time, String name, String phone, int outTime, String reason,
			int isFriend) {
		super();
		this.u_id = u_id;
		this.date = date;
		this.time = time;
		this.name = name;
		this.phone = phone;
		this.outTime = outTime;
		this.reason = reason;
		this.isFriend = isFriend;
	}

	public OutRegister() {
		super();
	}

	@Override
	public String toString() {
		return "OutRegister [u_id=" + u_id + ", date=" + date + ", time=" + time + ", name=" + name + ", phone=" + phone
				+ ", outTime=" + outTime + ", reason=" + reason + ", isFriend=" + isFriend + "]";
	}

}
