package br.com.projetoloja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetoloja.daos.FuncionarioDAO;
import br.com.projetoloja.models.Funcionario;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioDAO dao;
	
	@RequestMapping("/formFuncionario")
	public String formFuncionario() {
		System.out.println("Atendendo requisição da chamada '/funcionarios/formFuncionario'");
		System.out.println("Retornando a view 'formFuncionario' para o container...");
		
		return "funcionarios/formFuncionario";
	}
	
	@RequestMapping("/cadastrarFuncionario")
	public ModelAndView gravarFuncionario(Funcionario funcionario, RedirectAttributes attributes) {
		System.out.println("Atendendo requisição da chamada '/cadastrarFuncionario'");
				
		System.out.println("Salvando no banco...");
		dao.gravar(funcionario);
		
		System.out.println("Redirecionando para a requisição listarFuncionarios...");
		
		attributes.addFlashAttribute("sucesso", "Funcionario " + funcionario.getNome() + " foi adicionado com sucesso!");
		
		return new ModelAndView("redirect:listarFuncionarios");
	}
	
	@RequestMapping("/listarFuncionarios")
	public ModelAndView listar() {
		List<Funcionario> funcionarios = dao.listar();
		
		ModelAndView view = new  ModelAndView("funcionarios/lista");
		view.addObject("funcionarios", funcionarios);
		
		return view;
	}
}
