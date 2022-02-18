package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para encontrar o dobro a área de um quadrado, digite seu lado:");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("O dobro da área do quadrado é: " + (area * 2));

	}

}
