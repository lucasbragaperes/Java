package Ex03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Controller {
	
	@GetMapping("/reverter/{palavra}")
	public String reverter(@PathVariable("palavra") String palavra, Model model) {
		String Invertida = "";
		
		for(int i= palavra.length() - 1; i >= 0; i--){  
			Invertida += palavra.charAt(i); 
	    }  
		
		model.addAttribute("reverter", Invertida);
		return "reverter";
	}
}