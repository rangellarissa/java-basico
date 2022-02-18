package com.loiane.cursojava.exercicios02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual turno você estuda: M - matutino, V - vespertino ou N - noturno?");
		
		String turno = scan.next();
		
		if (turno.length()>1) {
			System.out.println("Não é uma opção válida.");
		}else {
			switch(turno) {
				case "M": System.out.println("Você estuda no turno matutino."); break;
				case "m": System.out.println("Você estuda no turno matutino."); break;
				case "V": System.out.println("Você estuda no turno vespertino."); break;
				case "v": System.out.println("Você estuda no turno vespertino."); break;
				case "N": System.out.println("Você estuda no turno noturno."); break;
				case "n": System.out.println("Você estuda no turno noturno."); break;
				default: System.out.println("Digite uma opção válida.");
			}

		}

	}

}
