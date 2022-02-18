package com.loiane.cursojava.exercicios02;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a seguir o valor da hora de trabalho");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite agora a carga horária mensal");
		double cargaHoraria = scan.nextDouble();
		
		double salarioBruto = cargaHoraria*valorHora;
		
		int percentualIR = 0;
		
		if (900 < salarioBruto && salarioBruto <= 1500) {			
			percentualIR = 5;
		}else if (1500 < salarioBruto && salarioBruto <= 2500) {
			percentualIR = 10;
		}else if (salarioBruto > 2500){
			percentualIR = 20;
		}
		double ir = (salarioBruto/100) * percentualIR;
		
		double sindicato = salarioBruto*0.03;
		
		double inss = salarioBruto*0.1;
		
		double fgts = salarioBruto*0.11;
		
		double descontos = sindicato + inss + ir;
		
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salário Bruto: R$" + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%): R$" + ir);
		System.out.println("(-) INSS (10%): R$" + inss);
		System.out.println("(-) Sindicato (3%): R$" + sindicato);
		System.out.println("FGTS (11%): R$" + fgts);
		System.out.println("Total de descontos: R$" + descontos);
		System.out.println("Salário Líquido: R$" + salarioLiquido);
	}

}
