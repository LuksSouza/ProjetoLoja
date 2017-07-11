package br.com.projetoloja.models;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Compra {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal valor_total;
	
	@Temporal(TemporalType.DATE)
	private Calendar data_hora;
	
	@ManyToOne
	private Funcionario funcionario;
	
	@ManyToOne
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValor_total() {
		return valor_total;
	}

	public void setValor_total(BigDecimal valor_total) {
		this.valor_total = valor_total;
	}

	public Calendar getData_hora() {
		return data_hora;
	}

	public void setData_hora(Calendar data_hora) {
		this.data_hora = data_hora;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Compra [valor_total=" + valor_total + ", data_hora=" + data_hora + ", funcionario=" + funcionario
				+ ", cliente=" + cliente + "]";
	}

}
