package TestesCondicinais;

import javax.swing.JOptionPane;

public class exercicio8 {

	public static void main(String[] args) {
		
		int quantidade = 0;
		double precoFinal;
		quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de macas: "));
		
		if (quantidade >= 12) {
			precoFinal = quantidade * 0.25;
			JOptionPane.showMessageDialog(null, "O valor total das macas foi: "+precoFinal);
		} else {
			precoFinal = quantidade * 0.30;
			JOptionPane.showMessageDialog(null, "O valor total das macas foi: "+precoFinal);
		}
		
	}
	
}
