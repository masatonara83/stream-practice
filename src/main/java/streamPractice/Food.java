package streamPractice;

public class Food {

	private String name;
	private Integer price;
	private String group;

	public Food(String name, Integer price, String group) {
		super();
		this.name = name;
		this.price = price;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
