package indi.btt.domain;

/**
 * @author baotiantian E-mail:791010113@qq.com
 * @version date：2020年3月12日 下午6:35:39 explain:微信小程序图片类
 */
public class WXImg {

	private int img_id;
	private String img_url;
	private String upload_time;
	private int genre;
	private String describes;

	public WXImg() {
		super();
	}

	public WXImg(int img_id, String img_url, String upload_time, int genre, String describes) {
		super();
		this.img_id = img_id;
		this.img_url = img_url;
		this.upload_time = upload_time;
		this.genre = genre;
		this.describes = describes;
	}

	public int getImg_id() {
		return img_id;
	}

	public void setImg_id(int img_id) {
		this.img_id = img_id;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getUpload_time() {
		return upload_time;
	}

	public void setUpload_time(String upload_time) {
		this.upload_time = upload_time;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	@Override
	public String toString() {
		return "WXImg [img_id=" + img_id + ", img_url=" + img_url + ", upload_time=" + upload_time + ", genre=" + genre
				+ ", describes=" + describes + "]";
	}

}
