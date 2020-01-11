package br.com.curso.domain;

import javax.persistence.Entity;

import br.com.curso.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {

	private static final long serialVersionUID = 1L;
	private Integer numerosParcelas;

	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroParcelas) {
		super(id, estado, pedido);
		this.numerosParcelas = numeroParcelas;
	}

	public Integer getNumerosParcelas() {
		return numerosParcelas;
	}

	public void setNumerosParcelas(Integer numerosParcelas) {
		this.numerosParcelas = numerosParcelas;
	}

}
