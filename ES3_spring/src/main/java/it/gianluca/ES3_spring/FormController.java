package it.gianluca.ES3_spring;

import java.util.Map;
import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class FormController{
	String ciao = new String("");
    private static Pattern p = Pattern.compile("[0-9]+");

	@RequestMapping("/form")
	public String welcome(Map<String, Object> model) {
		
		model.put("ciao", this.ciao);
			
		return "Form";
	}
	
	
	@RequestMapping(value="/dati", method=RequestMethod.POST)
	public String savePersonPost(@ModelAttribute Dati dati) {
		 boolean isNumeric = (dati.getNum1() != null && p.matcher(dati.getNum1()).find());
	        System.out.println("IsNumeric: " + isNumeric);
	     if(isNumeric) {   
	     isNumeric = (dati.getNum2() != null && p.matcher(dati.getNum2()).find());
	        System.out.println("IsNumeric: " + isNumeric);
	     }
	        
	    if(!isNumeric) {
	    	return "errore";
	    }else {
	        
		System.out.println(dati.getNum1() + " + " + dati.getNum2() + " = "+ Integer.parseInt(dati.getNum1())+ Integer.parseInt(dati.getNum2()));
		return "Dati";
	    }
	}
    
}