package br.com.projetoloja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemCompraController {

	@RequestMapping("/itens_compras/formItemCompra")
	public String formItemCompra() {
		System.out.println("Atendendo requisição da chamada '/itens_compras/formItemCompra'");
		System.out.println("Retornando a view 'formItemCompra' para o container...");
		
		return "itens_compras/formItemCompra";
	}
	
	@RequestMapping("/cadastrarItemCompra")
	public String gravar(String quantidade, String preco, String produto, String compra) {
		System.out.println("Atendendo requisição da chamada '/cadastrarItemCompra'");
		System.out.println("Retornando a view 'sucesso' para o container...");
		                                                                       
		System.out.println(quantidade);
		System.out.println(preco);
		System.out.println(produto);
		System.out.println(compra);
		
		return "sucesso";		
	}
}
