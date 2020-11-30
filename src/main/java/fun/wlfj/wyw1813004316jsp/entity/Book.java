package fun.wlfj.wyw1813004316jsp.entity;

import java.util.Date;

public class Book {
	private Long id;
	private String name;
	private Double price;
	private String img;
	private String detail;
	private Date date;

	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Book(long id, String name, double price, String img, String detail, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.price = price;
		this.date = date;
		this.detail = detail;
	}
	public Book(String id, String name, String img, double price, String detail, Date date) {
		this(Long.parseLong(id), name, price, img, detail, date);
	}
	public Book(long id, String name, String img, double price, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.price = price;
		this.detail = detail;
	}
	
}
