package mx.com.personal.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class IndexController {

	@Value("${application.controllers.mensaje}")
	private String mensaje;
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("mensaje",mensaje);
		return "index";
	}
}
