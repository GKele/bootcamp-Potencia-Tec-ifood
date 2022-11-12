package me.digitalInovation.OO;

import java.util.Scanner;

/*
Uma busca sequencial se caracteriza por percorrermos todos os  elementos
de uma estrutura em busca do elemento “X” desejado.
Neste desafio, dada uma estrutura de vetor A [a1, a2...an],
percorra todo o vetor fazendo as comparações de A[N] = X.
Caso a condição seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso. 

Considere um array de 10 elementos do tipo inteiro: 

Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}. 

● Carregue esses elementos em um array.  

● Implementação da busca sequencial: 

● Crie um método  que realiza uma busca sequencial.  

● Se o valor constar no array, retorne um texto contendo o valor e 
sua respectiva posição no array. Caso contrario retorne um texto 
dizendo que o número não foi encontrado.
*/

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		int numero;
		int posicaoDoElemento = -1;
		int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; //Array de inteiros
	
		System.out.print("Digite o valor para buscar: ");
		numero = leitor.nextInt();
	
		posicaoDoElemento = posicao(numero, elementos);
	
		if(posicaoDoElemento == -1) {
			System.out.print("Numero " + numero + " nao encontrado!");
		}else {
			System.out.print("Achei " + numero + " na posicao " + posicaoDoElemento);
		}	
	}	
	
	//Método para localizar a posição do número
	private static int posicao(int numero, int[] elementos) {
		int pos = -1;
		for(int i = 0; i <elementos.length; i++) {
			if(numero == elementos[i]) {
				pos = i;
			}
		}
		return pos;
	}
}
