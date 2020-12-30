package NutritionApp.services;

public class Branded {

	private String food_name;
	
	private String image;
	
	private String serving_unit;
	
	private String nix_brand_id;
	
	private String brand_name_item_name;
	
	private Float serving_qty;
	
	private Float nf_calories;
	
	private String brand_name;
	
	private Integer brand_type;
	
	private String nix_item_id;

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

	public String getServing_unit() {
		return serving_unit;
	}

	public void setServing_unit(String serving_unit) {
		this.serving_unit = serving_unit;
	}

	public String getNix_brand_id() {
		return nix_brand_id;
	}

	public void setNix_brand_id(String nix_brand_id) {
		this.nix_brand_id = nix_brand_id;
	}

	public String getBrand_name_item_name() {
		return brand_name_item_name;
	}

	public void setBrand_name_item_name(String brand_name_item_name) {
		this.brand_name_item_name = brand_name_item_name;
	}

	public Float getServing_qty() {
		return serving_qty;
	}

	public void setServing_qty(Float serving_qty) {
		this.serving_qty = serving_qty;
	}

	public Float getNf_calories() {
		return nf_calories;
	}

	public void setNf_calories(Float nf_calories) {
		this.nf_calories = nf_calories;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public Integer getBrand_type() {
		return brand_type;
	}

	public void setBrand_type(Integer brand_type) {
		this.brand_type = brand_type;
	}

	public String getNix_item_id() {
		return nix_item_id;
	}

	public void setNix_item_id(String nix_item_id) {
		this.nix_item_id = nix_item_id;
	}

	public Branded(String food_name, String image, String serving_unit, String nix_brand_id,
			String brand_name_item_name, Float serving_qty, Float nf_calories, String brand_name, Integer brand_type,
			String nix_item_id) {
		super();
		this.food_name = food_name;
		this.image = image;
		this.serving_unit = serving_unit;
		this.nix_brand_id = nix_brand_id;
		this.brand_name_item_name = brand_name_item_name;
		this.serving_qty = serving_qty;
		this.nf_calories = nf_calories;
		this.brand_name = brand_name;
		this.brand_type = brand_type;
		this.nix_item_id = nix_item_id;
	}
	
	public Branded() {
		
	}
	
}
