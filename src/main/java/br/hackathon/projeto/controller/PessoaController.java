package br.hackathon.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.hackathon.projeto.model.Pessoa;
import br.hackathon.projeto.model.Usuario;
import br.hackathon.projeto.service.PessoaServiceImpl;

@Controller
@RequestMapping("/usuario")
public class PessoaController {

	@Autowired
	private PessoaServiceImpl pImpl;
	
	@RequestMapping("/cadastrarPessoa")
	public ModelAndView cadastrarPessoa(Pessoa pessoa){
		ModelAndView mv = new ModelAndView("/user/novo");
		return mv;
	}
	@RequestMapping("/salvarPessoa")
	public Usuario salvarPessoa(Pessoa pessoa){
		pImpl.salvar(pessoa);
		return null;
	}
}
