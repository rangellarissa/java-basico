package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		
		System.out.println("Digite suas 4 notas bimestrais:");
		int nota1 = scan1.nextInt();
		int nota2 = scan2.nextInt();
		int nota3 = scan3.nextInt();
		int nota4 = scan4.nextInt();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Sua média bimestral é: " + media);
		

	}

}
