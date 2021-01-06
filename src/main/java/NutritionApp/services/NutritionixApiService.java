package NutritionApp.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NutritionixApiService {
	
	private RestTemplate rt = new RestTemplate();
	private HttpHeaders headers = new HttpHeaders();
	
	public void nutritionixTestCall() {
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("src/main/resources/config/apikeys"));
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		  headers.add("x-user-jwt", "0"); 
		  headers.add("x-app-id", prop.getProperty("appid"));
		  headers.add("x-app-key", prop.getProperty("appkey"));
		  
		  HttpEntity<String> entity = new HttpEntity<String>(headers);
		  
		  String url ="https://trackapi.nutritionix.com/v2/search/instant?query=grilled";
		  ResponseEntity<String> json = rt.exchange(url, HttpMethod.GET, entity, String.class); 
		  System.out.println("JSON RESPONSE:");
		  System.out.println(json.getBody());
		 
	}
	
	public InstantResponse instantSearch (String search) {
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("src/main/resources/config/apikeys"));
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		  headers.add("x-user-jwt", "0"); 
		  headers.add("x-app-id", prop.getProperty("appid"));
		  headers.add("x-app-key", prop.getProperty("appkey"));
		
		  HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		  String url ="https://trackapi.nutritionix.com/v2/search/instant?query=" + search;
		  return rt.exchange(url, HttpMethod.GET, entity, InstantResponse.class).getBody();
	}




}
