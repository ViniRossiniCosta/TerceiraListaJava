package Lists.lista1.lista3;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ex03 {
	/*
	 * Faça um programa que a partir do valor de uma compra, 
	 * faça o calculo de um desconto para o usuário. 
	 * O programa deve solicitar o valor total da compra por 
	 * meio de um metodo, que deverá retorná-lo. 
	 * Um metodo deve ser criado para receber 
	 * o valor da compra e mostrar o valor final 
	 * com desconto, considerando:
	 * Ate R$100 - sem desconto, o valor permanece o mesmo
	 * De R$100,01 a R$200 - desconto de 20%
	 * Acima de R$200 - desconto de 30%
	 */
	public static void main(String[] args) {
		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua compra: "));
		while(valorCompra < 0){
			valorCompra = Integer.parseInt(JOptionPane.showInputDialog("Valores abaixo de 0 não são aceitos"));
		}
		desconto(valorCompra);
	}

	private static void desconto(double valorCompra) {
		DecimalFormat df = new DecimalFormat("##,###.##");
		
		double desconto = 0;
		
		if(valorCompra <= 100){
			JOptionPane.showMessageDialog(null, "Sem desconto, o valor permanece com: " + df.format(valorCompra));
		}else if(valorCompra > 100.01 && valorCompra < 200){
			desconto = valorCompra - (valorCompra * 0.20);
			JOptionPane.showMessageDialog(null, "O preço de "+ valorCompra +" com o desconto de 20% �: " + df.format(desconto));
		}else{
			desconto = valorCompra - (valorCompra * 0.30);
			JOptionPane.showMessageDialog(null, "O preço de "+ valorCompra +" com o desconto de 30% �: " + df.format(desconto));
		}
	}
}
