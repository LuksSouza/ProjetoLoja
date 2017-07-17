package br.com.projetoloja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.projetoloja.models.Funcionario;

@Repository
@Transactional
public class FuncionarioDAO {

	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Funcionario funcionario) {
		this.manager.persist(funcionario);
	}
}
