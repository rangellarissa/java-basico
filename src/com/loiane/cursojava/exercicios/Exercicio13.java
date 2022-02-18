package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês?");
		double horas = scan.nextDouble();
		
		double bruto = ganhoHora * horas;
		double inss = bruto * 0.08;
		double sindicato = bruto * 0.05;
		double impostoRenda = bruto * 0.11;
		double liquido = bruto - (inss + sindicato + impostoRenda);
		
		System.out.println("Salário bruto: R$" + bruto + " - IR(11%): R$" + impostoRenda + " - INSS(8%): R$" + inss
				+ " - Sindicato(5%): R$" + sindicato + " - Salário Líquido = R$" + liquido);


	}

}
