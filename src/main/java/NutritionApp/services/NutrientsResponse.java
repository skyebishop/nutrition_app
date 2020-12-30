package NutritionApp.services;

import java.util.List;

public class NutrientsResponse {
	
	private List<Food> foods;

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public NutrientsResponse(List<Food> foods) {
		super();
		this.foods = foods;
	}
	
	public NutrientsResponse() {
	
	} 

}
