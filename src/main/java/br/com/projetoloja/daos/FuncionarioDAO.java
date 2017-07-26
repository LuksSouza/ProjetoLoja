package br.com.projetoloja.daos;

import java.util.List;

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

	public List<Funcionario> listar() {
		return manager.createQuery("SELECT f FROM Funcionario f").getResultList();
	}
}
