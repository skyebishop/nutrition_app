package NutritionApp.services;

public class Common {
	
	private String food_name;
	
	private String image;
	
	private Integer tag_id;
	
	private String tag_name;

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getTag_id() {
		return tag_id;
	}

	public void setTag_id(Integer tag_id) {
		this.tag_id = tag_id;
	}

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	public Common(String food_name, String image, Integer tag_id, String tag_name) {
		super();
		this.food_name = food_name;
		this.image = image;
		this.tag_id = tag_id;
		this.tag_name = tag_name;
	}
	
	public Common() {
		
	}

}
