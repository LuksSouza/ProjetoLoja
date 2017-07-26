package br.com.projetoloja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetoloja.daos.MarcaDAO;
import br.com.projetoloja.models.Marca;

@Controller
@RequestMapping("/marcas")
public class MarcaController {

	@Autowired
	private MarcaDAO dao;
	
	@RequestMapping("/formMarca")
	public String formMarcas() {
		System.out.println("Atendendo requisição da chamada '/marcas/formMarca'");
		System.out.println("Retornando a view 'cadastrarMarca' para o container...");
		
		return "marcas/formMarca";
	}
	
	@RequestMapping("/cadastrarMarca")
	public ModelAndView gravar(Marca marca, RedirectAttributes attributes) {
		System.out.println("Atendendo requisição da chamada '/cadastrarMarca'");
				
		System.out.println("Salvando no banco...");
		dao.gravar(marca);
		
		System.out.println("Redirecionando para a requisição listarMarcas...");
		attributes.addFlashAttribute("sucesso", "Marca " + marca.getDescricao() + " adicionada com sucesso!");
		
		return new ModelAndView("redirect:listarMarcas");
	}
	
	@RequestMapping("/listarMarcas")
	public ModelAndView listar() {
		List<Marca> marcas = dao.listar();
		
		ModelAndView view = new ModelAndView("marcas/lista");
		view.addObject("marcas", marcas);
		
		return view;
	}
}
