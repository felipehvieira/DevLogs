package br.hackathon.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.hackathon.projeto.model.Pessoa;
import br.hackathon.projeto.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	private PessoaRepository pRepository;
	@Autowired
	private BCryptPasswordEncoder passEncoder;

	@Override
	public void salvar(Pessoa pessoa) {
		pessoa.setPass(passEncoder.encode(pessoa.getPass()));
		pRepository.save(pessoa);

	}

}
