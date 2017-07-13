package br.com.projetoloja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MarcaController {

	@RequestMapping("/marcas/formMarca")
	public String formMarcas() {
		System.out.println("Atendendo requisição da chamada '/marcas/cadastrarMarca'");
		System.out.println("Retornando a view 'cadastrarMarca' para o container...");
		
		return "marcas/formMarca";
	}
	
	@RequestMapping("/cadastrarMarca")
	public String gravar(String marca) {
		System.out.println("Atendendo requisição da chamada '/clientes'");
		System.out.println("Retornando a view 'sucesso' para o container...");
		
		System.out.println(marca);
		return "sucesso";
	}
}
