package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Converta metros para centímetros:");
		int medidaMetros = scan.nextInt();
		System.out.println(medidaMetros + " metros equivale à " + (medidaMetros*100) + " centímetros.");

	}

}
