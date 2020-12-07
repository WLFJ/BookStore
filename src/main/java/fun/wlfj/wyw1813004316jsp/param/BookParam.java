package fun.wlfj.wyw1813004316jsp.param;

import java.util.Date;

/**
 * 查询参数封装类
 * 不知道只提供全参是否能够构造对象呢？
 * @author yves
 *
 */
public class BookParam {
	private Long id;
	private String name;
	private Double price;
	private String img;
	private String detail;
	private Date date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public BookParam(Long id, String name, Double price, String img, String detail, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.img = img;
		this.detail = detail;
		this.date = date;
	}
}
