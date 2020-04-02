package br.com.soft;

public class CalculadoraPontuacaoBoliche {

	public int pontuacaoDoJogo(int[] jogadas) { 
		int soma = 0;
		int proximoIndice = 0; 
		
		for(int rodada = 1; rodada <= 10; rodada++) {
			if(jogadas[proximoIndice] == 10) {
				soma += jogadas[proximoIndice] + jogadas[proximoIndice+1] + jogadas[proximoIndice+2];
				proximoIndice++;
			}else if((jogadas[proximoIndice] + jogadas[proximoIndice+1]) == 10) {
				soma += jogadas[proximoIndice] + jogadas[proximoIndice+1] + jogadas[proximoIndice+2];
				proximoIndice+=2;
			}else {
				soma += jogadas[proximoIndice] + jogadas[proximoIndice+1];
				proximoIndice+=2;
			}
		}
		
		return soma; 
	}
}
