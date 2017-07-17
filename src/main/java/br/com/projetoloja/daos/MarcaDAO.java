package br.com.projetoloja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.projetoloja.models.Marca;

@Repository
@Transactional
public class MarcaDAO {

	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Marca marca) {
		this.manager.persist(marca);
	}
}
