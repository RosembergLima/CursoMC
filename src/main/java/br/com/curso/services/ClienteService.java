package br.com.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.domain.Cliente;
import br.com.curso.repositories.ClienteRepository;
import br.com.curso.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> cat = repo.findById(id);
		return cat.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+id+ ", Tipo:  "+ Cliente.class.getName()));
	}

}