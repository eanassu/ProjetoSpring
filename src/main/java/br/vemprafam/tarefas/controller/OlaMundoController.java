package br.vemprafam.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.vemprafam.dao.DaoProduto;
import br.vemprafam.pojo.Produto;

@Controller
public class OlaMundoController {
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
	public String execute(Produto produto) {
		DaoProduto dao = new DaoProduto();
		dao.delete(produto);
		return "excluido";
	}
}
