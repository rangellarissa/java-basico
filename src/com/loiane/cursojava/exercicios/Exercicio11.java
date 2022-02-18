package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite outro número inteiro:");
		int numero2 = scan.nextInt();
		
		System.out.println("Digite um número real:");
		double numero3 = scan.nextDouble();
		
		double result1 = (numero1 * 2) * (numero2/2);
		double result2 = (numero1 * 3) + numero3;
		double result3 = (numero3 * numero3 * numero3);
		
		System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + result1);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + result2);
		System.out.println("O terceiro elevado ao cubo é: " + result3);
		


	}

}
