package APIlabs.consume_api_lab;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import APIlabs.consume_api_lab.model.CompletePeople;
import APIlabs.consume_api_lab.model.TinyPeople;

@Controller
public class ApiController {

	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		List<TinyPeople> tinyPeople = apiService.getTiny();
		Collections.sort(tinyPeople);
		return new ModelAndView("index", "tiny", tinyPeople);
	}
	
	@RequestMapping("/complete")
	public ModelAndView complete() {
		List<CompletePeople> completePeople = apiService.getComplete();
		Collections.sort(completePeople);
		return new ModelAndView("complete", "complete", completePeople);
	}
}
