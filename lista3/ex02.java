package Lists.lista1.lista3;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ex02 {
	/*
	 * Faca um programa que receba as tres notas de um aluno e pergunte ao professor
	 * qual media ele deseja calcular: aritmetica ou ponderada. Se for a media
	 * ponderada, os pesos de cada nota devem ser informados. Cada media devera ser
	 * calculada por um metodo; Os dois metodos devem receber como parametros as
	 * notas; No caso do metodo da media ponderada, alem das notas, o metodo devera
	 * receber tambam os pesos, que devem ser previamente solicitados ao usuario; Os
	 * dois metodos devem retornar a media; Um metodo deve ser criado para receber a
	 * media final e mostrar se o aluno esta aprovado ou reprovado, considerando que
	 * a media minima para aprovacao a 7.
	 */
	public static void main(String[] args) {
		int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		int nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(
				"Escolha o tipo de caculo pra media" + "\n1 - média aritimética" + "\n2 - média ponderada"));
		switch (escolha) {
		case 1: {
			calMediaAritimetica(nota1, nota2, nota3);
			break;
		}
		case 2:{
			calMediaPonderada(nota1, nota2, nota3);
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Esta opção não EXISTE: " + escolha);
		}
	}

	private static void calMediaPonderada(int nota1, int nota2, int nota3) {
		DecimalFormat df = new DecimalFormat("##,###.##");
		
		int[] pesoNota = new int[3];
		
		double somaPeso = 0;
		double somaTudo = 0;
		double calMediaPonderada = 0;
		
		for(int c = 0; c < 3; c ++){
			pesoNota[c] = Integer.parseInt(JOptionPane.showInputDialog("Quanto pesa a " + (c + 1) + " nota"));
			if(pesoNota[c] > 10) {
				pesoNota[c] = Integer.parseInt(JOptionPane.showInputDialog("Pesos acima de 10 são ilogicos"));
			}
			somaPeso += pesoNota[c];
		}
		somaTudo += nota1 * pesoNota[0] + nota2 * pesoNota[1] + nota3 * pesoNota[2];
		
		calMediaPonderada = somaTudo / somaPeso;
		
		validaNota(calMediaPonderada, calMediaPonderada);
		JOptionPane.showMessageDialog(null, df.format(calMediaPonderada));
		return ;
	}

	private static void calMediaAritimetica(int nota1, int nota2, int nota3) {
		DecimalFormat df = new DecimalFormat("##,###.##");
		
		double somaNotas = 0;
		double calMediaAritimetica = 0;
		
		somaNotas = nota1 + nota2 + nota3;
		calMediaAritimetica = somaNotas / 3;
		
		validaNota(calMediaAritimetica, calMediaAritimetica);
		JOptionPane.showMessageDialog(null, df.format(calMediaAritimetica));
	
	}

	private static void validaNota(double calMediaAritimetica, double calMediaPonderada) {
		if(calMediaAritimetica > 7 || calMediaPonderada >  7){
			JOptionPane.showMessageDialog(null, "Aprovado");
		}
		else {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
	}
}

