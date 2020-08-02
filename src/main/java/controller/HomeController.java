package controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import io.javabrains.coronavirustracker.CoronavirusDataService;

@RestController
@RequestMapping("")
public class HomeController {
//	@Autowired
//	CoronavirusDataService coronavirusDataService;
	
	
public String home()
{
return "asd";
}
}