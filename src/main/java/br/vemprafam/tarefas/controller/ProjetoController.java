package br.vemprafam.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.vemprafam.dao.DaoProduto;
import br.vemprafam.pojo.Produto;

@Controller
public class ProjetoController {
	@RequestMapping("menu")
	public String menu() {
		return "menu";
	}
	
	@RequestMapping("/olaMundoSpring")
	public String execute() {
		System.out.println("Executando	a	lógica	com	Spring	MVC");
		return "ok";
	}
	
	@RequestMapping("removerProduto")
	public String removerProduto(Produto produto) {
		DaoProduto dao = new DaoProduto();
		dao.delete(produto);
		return "excluido";
	}
	@RequestMapping("exclusao") 
	public String exclusao() {
		return "exclusao";
 	}
	@RequestMapping("cadastrarProduto") 
	public String cadastrarProduto(Produto produto) {
		DaoProduto dao = new DaoProduto();
		dao.insert(produto);
		return "cadastrado";
	}
	@RequestMapping("cadastro") 
	public String cadastro() {
		return "cadastro";
	}
	@RequestMapping("lista")
	public String lista(Model model) {
		DaoProduto dao = new DaoProduto();
		model.addAttribute("produtos",dao.getLista());
		return "listaTaglib";
	}
	@RequestMapping("busca") 
	public String busca() {
		return "busca";
	}
	@RequestMapping("buscaProduto")
	public String buscaProduto(Produto produto, Model model) {
		DaoProduto dao = new DaoProduto();
		Produto produtoNovo = dao.buscarPeloCodigo(produto.getCodigo());
		model.addAttribute("produto", produtoNovo);
		return "alteracao";
	}
	@RequestMapping("alterarProduto")
	public String alterarProduto(Produto produto) {
		DaoProduto dao = new DaoProduto();
		dao.update(produto);
		return "alterado";
	}
	
}
