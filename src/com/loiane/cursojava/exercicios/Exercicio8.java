package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculadora de salário. Quanto você ganha por hora?");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês?");
		double horas = scan.nextDouble();
		
		System.out.println("Seu salário esse mês será de: " + (ganhoHora * horas));


	}

}
