package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Vetor;
import br.com.caelum.ed.Aluno;

public class TesteAdicionaNoFim {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		System.out.println(lista);
	}
}
