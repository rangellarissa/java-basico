package com.loiane.cursojava.exercicios;

import java.util.Scanner;
import java.lang.Math. *;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para encontrar a área de um círculo, digite seu raio:");
		double raio = scan.nextDouble();
		
		double area = Math.PI * raio * raio;
		
		System.out.println("A área do círculo é: " + area);

	}

}
