package Lists.lista1.lista3;
import javax.swing.JOptionPane;

public class ex01 {
	/*
	 * Faça um programa que solicite o ano de nascimento 
	 * de um usuário e seja mostrada a sua idade em 2021.
	 * Não é necessario considerar se o usuario já fez 
	 * ou não aniversário. Um método deve ser criado para 
	 * solicitar o ano de nascimento ao usuario e retorna-lo,
	 * e outro metodo deve ser criado para receber o ano de nascimento,
	 * calcular a idade atual e mostra-la.
	 */
	public static void main(String[] args) {
		int nascimento = 0;
		nascimento(nascimento);
	}

	private static void nascimento(int nascimento2) {
		int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite sua data de nascimento"));
		calIdadeAtual(nascimento);
	}

	private static void calIdadeAtual(int nascimento) {
		int calIdadeAtual = 2021 - nascimento;
		JOptionPane.showMessageDialog(null, "Sua Idade atual é de: " + calIdadeAtual);
		return;
	}
}
