package br.com.projetoloja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoloja.daos.ClienteDAO;
import br.com.projetoloja.models.Cliente;

@Controller
public class ClienteController {

	@Autowired
	ClienteDAO dao;
	
	@RequestMapping("/clientes/formCliente")
	public String formCliente() {
		System.out.println("Atendendo requisição da chamada '/clientes/cadastrarCliente'");
		System.out.println("Retornando a view 'formCliente' para o container...");
		
		return "clientes/formCliente";
	}
	
	@RequestMapping("/cadastrarCliente")
	public String gravar(Cliente cliente) {
		System.out.println("Atendendo requisição da chamada '/clientes'");
		System.out.println("Retornando a view 'sucesso' para o container...");
		
		System.out.println("Salvando no banco...");
		dao.gravar(cliente);
		
		System.out.println(cliente.toString());
				
		return "sucesso";
	}
}
