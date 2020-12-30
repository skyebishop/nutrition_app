package NutritionApp.services;

public class Photo {
	
	private String thumb;
	
	private String highres;

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getHighres() {
		return highres;
	}

	public void setHighres(String highres) {
		this.highres = highres;
	}

	public Photo(String thumb, String highres) {
		super();
		this.thumb = thumb;
		this.highres = highres;
	}

	public Photo() {
		super();
	}
	
	

}
