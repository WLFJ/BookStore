package fun.wlfj.wyw1813004316jsp.entity;

public class Book {
	// 我们应该在老师提供的基础上创新, 现在先这样写.
	private Integer wyw1813004316id;
	private String wyw1813004316name;
	private Double wyw1813004316price;
	private String wyw1813004316img;
	public Integer getId() {
		return wyw1813004316id;
	}
	public void setId(int id) {
		this.wyw1813004316id = id;
	}
	public String getName() {
		return wyw1813004316name;
	}
	public void setName(String name) {
		this.wyw1813004316name = name;
	}
	public String getImg() {
		return wyw1813004316img;
	}
	public void setImg(String img) {
		this.wyw1813004316img = img;
	}
	public Double getPrice() {
		return wyw1813004316price;
	}
	public void setPrice(double price) {
		this.wyw1813004316price = price;
	}
	public Book(int id, String name, String img, double price) {
		super();
		this.wyw1813004316id = id;
		this.wyw1813004316name = name;
		this.wyw1813004316img = img;
		this.wyw1813004316price = price;
	}
	public Book(String id, String name, String img, double price) {
		this(Integer.parseInt(id), name, img, price);
	}
	
}
