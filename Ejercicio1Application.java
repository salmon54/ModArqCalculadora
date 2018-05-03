package com.modelado.ejercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication 
public class Ejercicio1Application {
	
	@RequestMapping(value="/api/v1/calculator/add/{num1}/{num2}", method=RequestMethod.GET)
    @ResponseBody
    String suma(@PathVariable 	Integer num1, @PathVariable Integer num2) {
        return "resultado suma: " + num1 + " + " + num2 + " = " + (num1+num2);
    }
	
	@RequestMapping(value="/api/v1/calculator/subs/{num1}/{num2}", method=RequestMethod.GET)
    @ResponseBody
    String resta(@PathVariable 	Integer num1, @PathVariable Integer num2) {
        return "resultado resta: " + num1 + " - " + num2 + " = " + (num1-num2);
    }

	@RequestMapping(value="/api/v1/calculator/mult/{num1}/{num2}", method=RequestMethod.GET)
    @ResponseBody
    String multi(@PathVariable Integer num1, @PathVariable Integer num2) {
        return "resultado multiplicacion: " + num1 + " * " + num2 + " = " + (num1*num2);
    }

	@RequestMapping(value="/api/v1/calculator/div/{num1}/{num2}", method=RequestMethod.GET)
    @ResponseBody
    String divis(@PathVariable Integer num1, @PathVariable Integer num2) {
        return "resultado division: " + num1 + " / " + num2 + " = " + (num1/num2);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}
}
