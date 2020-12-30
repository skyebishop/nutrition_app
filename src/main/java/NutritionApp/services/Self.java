package NutritionApp.services;

public class Self {
	
	private String food_name;
	
	private String serving_unit;
	
	private String nix_brand_id;
	
	private Float serving_qty;
	 
	private Float nf_calories;
	
	private String brand_name;
	
	private String uuid;
	
	private String nix_item_id;

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
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

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getNix_item_id() {
		return nix_item_id;
	}

	public void setNix_item_id(String nix_item_id) {
		this.nix_item_id = nix_item_id;
	}

	public Self(String food_name, String serving_unit, String nix_brand_id, Float serving_qty, Float nf_calories,
			String brand_name, String uuid, String nix_item_id) {
		super();
		this.food_name = food_name;
		this.serving_unit = serving_unit;
		this.nix_brand_id = nix_brand_id;
		this.serving_qty = serving_qty;
		this.nf_calories = nf_calories;
		this.brand_name = brand_name;
		this.uuid = uuid;
		this.nix_item_id = nix_item_id;
	}
	
	public Self() {
		
	}

}
