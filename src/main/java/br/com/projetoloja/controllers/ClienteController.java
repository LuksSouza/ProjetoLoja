package br.com.projetoloja.controllers;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {

	@RequestMapping("/clientes/formCliente")
	public String formCliente() {
		System.out.println("Atendendo requisição da chamada '/clientes/cadastrarCliente'");
		System.out.println("Retornando a view 'formCliente' para o container...");
		
		return "clientes/formCliente";
	}
	
	@RequestMapping("/cadastrarCliente")
	public String gravar(String nome, String cpf, String data_nascimento) {
		System.out.println("Atendendo requisição da chamada '/clientes'");
		System.out.println("Retornando a view 'sucesso' para o container...");
		
		System.out.println(nome);
		System.out.println(cpf);
		System.out.println(data_nascimento);
		
		return "sucesso";
	}
}
