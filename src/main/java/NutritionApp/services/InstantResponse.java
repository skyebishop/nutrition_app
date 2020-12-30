package NutritionApp.services;

import java.util.List;

public class InstantResponse {

	private List<Branded> branded;
	private List<Self> self;
	private List<Common> common;
	
	public List<Branded> getBranded() {
		return branded;
	}
	
	public void setBranded(List<Branded> branded) {
		this.branded = branded;
	}
	
	public List<Self> getSelf() {
		return self;
	}
	
	public void setSelf(List<Self> self) {
		this.self = self;
	}
	
	public List<Common> getCommon() {
		return common;
	}
	
	public void setCommon(List<Common> common) {
		this.common = common;
	}

	public InstantResponse(List<Branded> branded, List<Self> self, List<Common> common) {
		super();
		this.branded = branded;
		this.self = self;
		this.common = common;
	}
	
	public InstantResponse() {
		
	}
	
}
