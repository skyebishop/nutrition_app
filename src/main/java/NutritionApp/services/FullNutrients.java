package NutritionApp.services;

public class FullNutrients {
	
	private Integer attr_id;
	
	private Float value;

	public Integer getAttr_id() {
		return attr_id;
	}

	public void setAttr_id(Integer attr_id) {
		this.attr_id = attr_id;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public FullNutrients(Integer attr_id, Float value) {
		super();
		this.attr_id = attr_id;
		this.value = value;
	}

	public FullNutrients() {
		super();
	}
	
	

}
