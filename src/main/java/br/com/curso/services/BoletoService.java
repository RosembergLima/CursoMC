package br.com.curso.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.curso.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto obj, Date instantePagto) {
		Calendar c = Calendar.getInstance();
		c.setTime(instantePagto);
		c.add(Calendar.DAY_OF_MONTH, 7);
		obj.setDataVencimento(c.getTime());
	}

}
