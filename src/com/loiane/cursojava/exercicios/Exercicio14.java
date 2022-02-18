package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB:");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Digite a velocidade do link em Mbps:");
		double velocidade = scan.nextDouble();
		
		double tempo = (tamanhoArquivo/velocidade)/60;

		System.out.println("O download será concluído em " + tempo + " minutos.");	

	}

}
