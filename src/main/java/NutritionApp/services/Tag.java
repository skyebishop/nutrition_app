package NutritionApp.services;

public class Tag {
	
	private String item;
	
	private String measure;
	
	private Float quantity;
	
	private Integer tag_id;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public Integer getTag_id() {
		return tag_id;
	}

	public void setTag_id(Integer tag_id) {
		this.tag_id = tag_id;
	}

	public Tag(String item, String measure, Float quantity, Integer tag_id) {
		super();
		this.item = item;
		this.measure = measure;
		this.quantity = quantity;
		this.tag_id = tag_id;
	}

	public Tag() {
		super();
	}
	
	

}
