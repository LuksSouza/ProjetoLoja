package br.com.projetoloja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoloja.daos.MarcaDAO;
import br.com.projetoloja.models.Marca;

@Controller
public class MarcaController {

	@Autowired
	private MarcaDAO dao;
	
	@RequestMapping("/marcas/formMarca")
	public String formMarcas() {
		System.out.println("Atendendo requisição da chamada '/marcas/cadastrarMarca'");
		System.out.println("Retornando a view 'cadastrarMarca' para o container...");
		
		return "marcas/formMarca";
	}
	
	@RequestMapping("/cadastrarMarca")
	public String gravar(Marca marca) {
		System.out.println("Atendendo requisição da chamada '/clientes'");
		System.out.println("Retornando a view 'sucesso' para o container...");
		
		System.out.println("Salvando no banco...");
		dao.gravar(marca);
		
		System.out.println(marca.toString());
		
		return "sucesso";
	}
}
