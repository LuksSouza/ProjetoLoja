package br.com.projetoloja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutoController {

	@RequestMapping("/produtos/formProduto")
	public String formProduto() {
		System.out.println("Atendendo requisição da chamada '/produtos/formProduto'");
		System.out.println("Retornando a view 'formProduto' para o container...");
		
		return "produtos/formProduto";
	}
	
	@RequestMapping("/cadastrarProduto")
	public String gravar(String nome_produto, String preco, String marca) {
		System.out.println("Atendendo requisição da chamada '/cadastrarProduto'");
		System.out.println("Retornando a view 'sucesso' para o container...");
		
		System.out.println(nome_produto);
		System.out.println(preco);
		System.out.println(marca);
		
		return "sucesso";
	}
}
