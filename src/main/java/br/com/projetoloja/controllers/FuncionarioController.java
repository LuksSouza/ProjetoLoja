package br.com.projetoloja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FuncionarioController {

	@RequestMapping("/funcionarios/formFuncionario")
	public String formFuncionario() {
		System.out.println("Atendendo requisição da chamada '/funcionarios/formFuncionario'");
		System.out.println("Retornando a view 'formFuncionario' para o container...");
		
		return "funcionarios/formFuncionario";
	}
	
	@RequestMapping("/cadastrarFuncionario")
	public String gravarFuncionario(String nome, String data_nascimento, String salario, String cpf) {
		System.out.println("Atendendo requisição da chamada '/cadastrarFuncionario'");
		System.out.println("Retornando a view 'sucesso' para o container...");
		
		System.out.println(nome);
		System.out.println(data_nascimento);
		System.out.println(salario);
		System.out.println(cpf);
		
		return "sucesso";
	}
}
