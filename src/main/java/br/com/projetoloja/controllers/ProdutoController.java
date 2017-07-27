package br.com.projetoloja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.projetoloja.daos.MarcaDAO;
import br.com.projetoloja.models.Marca;
import br.com.projetoloja.models.Produto;

@Controller
public class ProdutoController {

	@Autowired
	MarcaDAO dao;
	
	@RequestMapping("/produtos/formProduto")
	public ModelAndView formProduto() {
		System.out.println("Atendendo requisição da chamada '/produtos/formProduto'");
		System.out.println("Retornando a view 'formProduto' para o container com a lista de Marcas existente no banco...");
		
		List<Marca> marcas = dao.listar();
		
		ModelAndView view = new ModelAndView("produtos/formProduto");
		view.addObject("marcas", marcas);
		
		return view;
	}
	
	@RequestMapping("/cadastrarProduto")
	public String gravar(Produto produto) {
		System.out.println("Atendendo requisição da chamada '/cadastrarProduto'");
		System.out.println("Retornando a view 'sucesso' para o container...");
		
		System.out.println(produto.getNome());
		System.out.println(produto.getMarca().getDescricao());
		
		return "sucesso";
	}
}
