package indi.btt.domain;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月29日 下午2:05:09 explain:
 */
public class PropertyRepair {

	private int p_id;
	private int u_id;
	private String p_name;
	private String p_address;
	private String p_phone;
	private String p_type;
	private String p_question;
	private int p_isCompleted;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_address() {
		return p_address;
	}

	public void setP_address(String p_address) {
		this.p_address = p_address;
	}

	public String getP_phone() {
		return p_phone;
	}

	public void setP_phone(String p_phone) {
		this.p_phone = p_phone;
	}

	public String getP_type() {
		return p_type;
	}

	public void setP_type(String p_type) {
		this.p_type = p_type;
	}

	public String getP_question() {
		return p_question;
	}

	public void setP_question(String p_question) {
		this.p_question = p_question;
	}

	public int getP_isCompleted() {
		return p_isCompleted;
	}

	public void setP_isCompleted(int p_isCompleted) {
		this.p_isCompleted = p_isCompleted;
	}

	@Override
	public String toString() {
		return "PropertyRepair [p_id=" + p_id + ", u_id=" + u_id + ", p_name=" + p_name + ", p_address=" + p_address
				+ ", p_phone=" + p_phone + ", p_type=" + p_type + ", p_question=" + p_question + ", p_isCompleted="
				+ p_isCompleted + "]";
	}

	public PropertyRepair(int p_id, int u_id, String p_name, String p_address, String p_phone, String p_type,
			String p_question, int p_isCompleted) {
		super();
		this.p_id = p_id;
		this.u_id = u_id;
		this.p_name = p_name;
		this.p_address = p_address;
		this.p_phone = p_phone;
		this.p_type = p_type;
		this.p_question = p_question;
		this.p_isCompleted = p_isCompleted;
	}

	public PropertyRepair(int u_id, String p_name, String p_address, String p_phone, String p_type, String p_question,
			int p_isCompleted) {
		super();
		this.u_id = u_id;
		this.p_name = p_name;
		this.p_address = p_address;
		this.p_phone = p_phone;
		this.p_type = p_type;
		this.p_question = p_question;
		this.p_isCompleted = p_isCompleted;
	}

	public PropertyRepair() {
		super();
	}

}
