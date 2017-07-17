package br.com.projetoloja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoloja.daos.FuncionarioDAO;
import br.com.projetoloja.models.Funcionario;

@Controller
public class FuncionarioController {

	@Autowired
	private FuncionarioDAO dao;
	
	@RequestMapping("/funcionarios/formFuncionario")
	public String formFuncionario() {
		System.out.println("Atendendo requisição da chamada '/funcionarios/formFuncionario'");
		System.out.println("Retornando a view 'formFuncionario' para o container...");
		
		return "funcionarios/formFuncionario";
	}
	
	@RequestMapping("/cadastrarFuncionario")
	public String gravarFuncionario(Funcionario funcionario) {
		System.out.println("Atendendo requisição da chamada '/cadastrarFuncionario'");
		System.out.println("Retornando a view 'sucesso' para o container...");
		
		System.out.println("Salvando no banco...");
		dao.gravar(funcionario);
		
		System.out.println(funcionario.toString());
		
		return "sucesso";
	}
}
