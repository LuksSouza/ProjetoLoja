package br.com.projetoloja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompraController {

	@RequestMapping("/compras/formCompra")
	public String formCompra() {
		System.out.println("Atendendo requisição da chamada '/compras/formCompra'");
		System.out.println("Retornando a view 'formCompra' para o container...");
		
		return "compras/formCompra";
	}
	
	@RequestMapping("/cadastrarCompra")
	public String gravar(String valor_total, String data_hora, String cliente, String funcionario) {
		System.out.println("Atendendo requisição da chamada '/cadastrarCompra'");
		System.out.println("Retornando a view 'sucesso' para o container...");
		
		System.out.println(valor_total);
		System.out.println(data_hora);
		System.out.println(cliente);
		System.out.println(funcionario);
		
		return "sucesso";
	}
}
