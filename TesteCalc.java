package br.com.soft;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TesteCalc {
	
	CalculadoraPontuacaoBoliche calculaPontuacao = new CalculadoraPontuacaoBoliche();

	@Test
	public void test1() {
		int [] jogadas = {1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 1, 7, 3, 6, 4, 10, 2, 8, 6};
		System.out.println(calculaPontuacao.pontuacaoDoJogo(jogadas));
	}
	
	@Test
	public void test2() {
		int [] jogadas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 2, 3, 0, 0};
		System.out.println(calculaPontuacao.pontuacaoDoJogo(jogadas));
	}
	
	@Test
	public void test3() {
		int [] jogadas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 8, 2, 3, 0,0};
		System.out.println(calculaPontuacao.pontuacaoDoJogo(jogadas));
	}
	
	@Test
	public void test4() {
		int [] jogadas = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		System.out.println(calculaPontuacao.pontuacaoDoJogo(jogadas));
	}

}
