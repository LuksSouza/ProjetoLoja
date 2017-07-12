package br.com.projetoloja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Controller - Define para o Spring que essa classe será um Controller
 * 
 * @RequestMapping - Define qual endereço URI será mapeado por esse método para atender as requisições
 * 
 * @author estudo
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Chegou no controlador do Sprinv MVC!");
		return "home";
	}
	
}
