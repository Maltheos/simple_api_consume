package APIlabs.consume_api_lab;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import APIlabs.consume_api_lab.model.CompletePeople;
import APIlabs.consume_api_lab.model.CompleteResponse;
import APIlabs.consume_api_lab.model.TinyPeople;
import APIlabs.consume_api_lab.model.TinyResponse;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();
	
	public List<TinyPeople> getTiny(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		TinyResponse response = restTemplate.getForObject(url, TinyResponse.class);
		return response.getTiny();
	}
	
	public List<CompletePeople> getComplete(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		CompleteResponse response = restTemplate.getForObject(url, CompleteResponse.class);
		return response.getComplete();
	}
}
