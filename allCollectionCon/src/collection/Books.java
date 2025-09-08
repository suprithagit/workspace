package collection;

public class Books {

	private Integer id;
	private String name;
	private String author;
	private Integer price;
	
	
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	public Books(Integer id, String name, String author, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

}
