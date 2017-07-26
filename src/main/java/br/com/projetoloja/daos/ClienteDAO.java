package br.com.projetoloja.daos;

import java.util.List;

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

	public List<Cliente> listar() {
		return manager.createQuery("SELECT c FROM Cliente c").getResultList();
	}

}
