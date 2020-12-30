package NutritionApp.services;

public class AltMeasure {
	
	private Float serving_weight;
	
	private String measure;
	
	private Integer seq;
	
	private Float qty;

	public Float getServing_weight() {
		return serving_weight;
	}

	public void setServing_weight(Float serving_weight) {
		this.serving_weight = serving_weight;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Float getQty() {
		return qty;
	}

	public void setQty(Float qty) {
		this.qty = qty;
	}

	public AltMeasure(Float serving_weight, String measure, Integer seq, Float qty) {
		super();
		this.serving_weight = serving_weight;
		this.measure = measure;
		this.seq = seq;
		this.qty = qty;
	}

	public AltMeasure() {
		super();
	}
	
	

}
