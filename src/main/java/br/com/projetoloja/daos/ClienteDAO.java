package br.com.projetoloja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.projetoloja.models.Cliente;

@Repository
@Transactional
public class ClienteDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Cliente cliente) {
		this.manager.persist(cliente);
	}

}
