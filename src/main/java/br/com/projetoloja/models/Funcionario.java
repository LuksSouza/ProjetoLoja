package br.com.projetoloja.models;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Calendar data_nasscimento;
	private BigDecimal salario;
	private String cpf;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getData_nasscimento() {
		return data_nasscimento;
	}

	public void setData_nasscimento(Calendar data_nasscimento) {
		this.data_nasscimento = data_nasscimento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", data_nasscimento=" + data_nasscimento + ", salario=" + salario
				+ ", cpf=" + cpf + "]";
	}

}
