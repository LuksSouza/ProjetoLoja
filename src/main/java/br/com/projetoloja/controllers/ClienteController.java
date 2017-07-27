package br.com.projetoloja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetoloja.daos.ClienteDAO;
import br.com.projetoloja.models.Cliente;
import br.com.projetoloja.validation.ClienteValidation;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteDAO dao;
	
	@InitBinder
	private void binde(WebDataBinder binder) {
		binder.addValidators(new ClienteValidation());
	}
	
	@RequestMapping("/formCliente")
	public String formCliente() {
		System.out.println("Atendendo requisição da chamada '/clientes/formCliente'");
		System.out.println("Retornando a view 'formCliente' para o container...");
		
		return "clientes/formCliente";
	}
	
	@RequestMapping("/cadastrarCliente")
	public ModelAndView gravar(@Valid Cliente cliente, BindingResult result, RedirectAttributes attributes) {
		System.out.println("Atendendo requisição da chamada '/cadastrarCliente'");
				
		if (result.hasErrors()) {
			System.out.println("\nRedirecionando cliente para a requisição 'clientes/formCliente'...");
			return new ModelAndView("clientes/formCliente");
		}
		
		System.out.println("Salvando no banco...\n");
		dao.gravar(cliente);
		
		System.out.println("\nRedirecionando cliente para a requisição listarCliente...");
		attributes.addFlashAttribute("sucesso", "Cliente " + cliente.getNome() + " cadastrado com sucesso!");
				
		return new ModelAndView("redirect:listarCliente");
	}
	
	@RequestMapping("listarCliente")
	public ModelAndView listar() {
		System.out.println("Atendendo requisição da chamada '/listarClientes'");
				
		List<Cliente> clientes = dao.listar();
		
		ModelAndView view = new ModelAndView("clientes/lista");
		view.addObject("clientes", clientes);
		
		System.out.println("Retornando a view 'lista' para o container...");
		
		return view;
	}
}
