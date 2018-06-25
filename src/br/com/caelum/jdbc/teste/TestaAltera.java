package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Caelum JAVA");
		contato.setEmail("contato@caelumjava.com.br");
		contato.setEndereco("Av. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long)1);
		
		ContatoDao dao = new ContatoDao();
		
		dao.altera(contato);
		System.out.println("Gravado!");
	}
}
