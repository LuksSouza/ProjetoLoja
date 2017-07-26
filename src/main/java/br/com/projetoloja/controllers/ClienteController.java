package br.com.projetoloja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetoloja.daos.ClienteDAO;
import br.com.projetoloja.models.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteDAO dao;
	
	@RequestMapping("/formCliente")
	public String formCliente() {
		System.out.println("Atendendo requisição da chamada '/clientes/formCliente'");
		System.out.println("Retornando a view 'formCliente' para o container...");
		
		return "clientes/formCliente";
	}
	
	@RequestMapping("/cadastrarCliente")
	public ModelAndView gravar(Cliente cliente, RedirectAttributes attributes) {
		System.out.println("Atendendo requisição da chamada '/cadastrarCliente'");
				
		System.out.println("Salvando no banco...\n");
		dao.gravar(cliente);
		
		System.out.println(cliente.toString());
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
