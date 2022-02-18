package com.loiane.cursojava.exercicios02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");		
		double num1 = scan.nextDouble();
		
		System.out.println("Digite outro numero");		
		double num2 = scan.nextDouble();
		
		System.out.println("Digite um terceiro numero");		
		double num3 = scan.nextDouble();
		
		if (num1 > num2 & num1 > num3 & num2 > num3) {
			System.out.println("O maior numero é " + num1 + " e o menor é " + num3);
		}else if (num1 > num2 & num1 > num3 & num3 > num2) {
			System.out.println("O maior numero é " + num1 + " e o menor é " + num2);
		}else if (num2 > num1 & num2 > num3 & num1 > num3) {
			System.out.println("O maior numero é " + num2 + " e o menor é " + num3);
		}else if (num1 > num2 & num1 > num3 & num3 > num2) {
			System.out.println("O maior numero é " + num2 + " e o menor é " + num1);
		}else if (num3 > num1 & num3 > num2 & num1 > num2) {
			System.out.println("O maior numero é " + num3 + " e o menor é " + num2);
		}else {
			System.out.println("O maior numero é " + num3 + " e o menor é " + num1);
		}
		
	}
}