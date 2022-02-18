package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Conversor Celsius x Farenheit. Digite a temperatura em graus Celsius:");
		double celsius = scan.nextDouble();
		double farenheit = ((celsius * 9) / 5 + 32);
		
		System.out.println(celsius + " equivale a " + farenheit + " graus Farenheit");


	}

}
