package NutritionApp.services;

import java.util.List;

public class Food {
	
	private String food_name;
	
	private String brand_name;
	
	private Float serving_qty;
	
	private String serving_unit;
	
	private Float serving_weight_grams;
	
	private Float nf_calories;
	
	private Float nf_total_fat;
	
	private Float nf_saturated_fat;
	
	private Float nf_cholesterol;
	
	private Float nf_sodium;
	
	private Float nf_total_carbohydrate;
	
	private Float nf_dietary_fiber;
	
	private Float nf_sugars;
	
	private Float nf_protein;
	
	private Float nf_potassium;
	
	private Float nf_p;
	
	private List<FullNutrients> full_nutrients;
	
	private String nix_item_id;
	
	private String upc;
	
	private List<Tag> tags;
	
	private List<AltMeasure> alt_measures;
	
	private Integer meal_type;
	
	private List<Photo> photo;
	

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public Float getServing_qty() {
		return serving_qty;
	}

	public void setServing_qty(Float serving_qty) {
		this.serving_qty = serving_qty;
	}

	public String getServing_unit() {
		return serving_unit;
	}

	public void setServing_unit(String serving_unit) {
		this.serving_unit = serving_unit;
	}

	public Float getServing_weight_grams() {
		return serving_weight_grams;
	}

	public void setServing_weight_grams(Float serving_weight_grams) {
		this.serving_weight_grams = serving_weight_grams;
	}

	public Float getNf_calories() {
		return nf_calories;
	}

	public void setNf_calories(Float nf_calories) {
		this.nf_calories = nf_calories;
	}

	public Float getNf_total_fat() {
		return nf_total_fat;
	}

	public void setNf_total_fat(Float nf_total_fat) {
		this.nf_total_fat = nf_total_fat;
	}

	public Float getNf_saturated_fat() {
		return nf_saturated_fat;
	}

	public void setNf_saturated_fat(Float nf_saturated_fat) {
		this.nf_saturated_fat = nf_saturated_fat;
	}

	public Float getNf_cholesterol() {
		return nf_cholesterol;
	}

	public void setNf_cholesterol(Float nf_cholesterol) {
		this.nf_cholesterol = nf_cholesterol;
	}

	public Float getNf_sodium() {
		return nf_sodium;
	}

	public void setNf_sodium(Float nf_sodium) {
		this.nf_sodium = nf_sodium;
	}

	public Float getNf_total_carbohydrate() {
		return nf_total_carbohydrate;
	}

	public void setNf_total_carbohydrate(Float nf_total_carbohydrate) {
		this.nf_total_carbohydrate = nf_total_carbohydrate;
	}

	public Float getNf_dietary_fiber() {
		return nf_dietary_fiber;
	}

	public void setNf_dietary_fiber(Float nf_dietary_fiber) {
		this.nf_dietary_fiber = nf_dietary_fiber;
	}

	public Float getNf_sugars() {
		return nf_sugars;
	}

	public void setNf_sugars(Float nf_sugars) {
		this.nf_sugars = nf_sugars;
	}

	public Float getNf_protein() {
		return nf_protein;
	}

	public void setNf_protein(Float nf_protein) {
		this.nf_protein = nf_protein;
	}

	public Float getNf_potassium() {
		return nf_potassium;
	}

	public void setNf_potassium(Float nf_potassium) {
		this.nf_potassium = nf_potassium;
	}

	public Float getNf_p() {
		return nf_p;
	}

	public void setNf_p(Float nf_p) {
		this.nf_p = nf_p;
	}

	public List<FullNutrients> getFull_nutrients() {
		return full_nutrients;
	}

	public void setFull_nutrients(List<FullNutrients> full_nutrients) {
		this.full_nutrients = full_nutrients;
	}
	
	public String getNix_item_id() {
		return nix_item_id;
	}

	public void setNix_item_id(String nix_item_id) {
		this.nix_item_id = nix_item_id;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<AltMeasure> getAlt_measures() {
		return alt_measures;
	}

	public void setAlt_measures(List<AltMeasure> alt_measures) {
		this.alt_measures = alt_measures;
	}

	public Integer getMeal_type() {
		return meal_type;
	}

	public void setMeal_type(Integer meal_type) {
		this.meal_type = meal_type;
	}

	public List<Photo> getPhoto() {
		return photo;
	}

	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}

	public Food(String food_name, String brand_name, Float serving_qty, String serving_unit, Float serving_weight_grams,
			Float nf_calories, Float nf_total_fat, Float nf_saturated_fat, Float nf_cholesterol, Float nf_sodium,
			Float nf_total_carbohydrate, Float nf_dietary_fiber, Float nf_sugars, Float nf_protein, Float nf_potassium,
			Float nf_p, List<FullNutrients> full_nutrients, String nix_item_id, String upc, List<Tag> tags,
			List<AltMeasure> alt_measures, Integer meal_type, List<Photo> photo) {
		super();
		this.food_name = food_name;
		this.brand_name = brand_name;
		this.serving_qty = serving_qty;
		this.serving_unit = serving_unit;
		this.serving_weight_grams = serving_weight_grams;
		this.nf_calories = nf_calories;
		this.nf_total_fat = nf_total_fat;
		this.nf_saturated_fat = nf_saturated_fat;
		this.nf_cholesterol = nf_cholesterol;
		this.nf_sodium = nf_sodium;
		this.nf_total_carbohydrate = nf_total_carbohydrate;
		this.nf_dietary_fiber = nf_dietary_fiber;
		this.nf_sugars = nf_sugars;
		this.nf_protein = nf_protein;
		this.nf_potassium = nf_potassium;
		this.nf_p = nf_p;
		this.full_nutrients = full_nutrients;
		this.nix_item_id = nix_item_id;
		this.upc = upc;
		this.tags = tags;
		this.alt_measures = alt_measures;
		this.meal_type = meal_type;
		this.photo = photo;
	}

	public Food() {
		super();
	}

	

}
