package PrimeiroPacote;

import javax.swing.JOptionPane;

public class PrimeiroProjeto {

	public static void main(String[] args) {
	
		System.out.println("Hello word!");
		
		JOptionPane.showMessageDialog(null, "Hello word!");
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
		JOptionPane.showMessageDialog(null, "Seu nome: "+nome);
		
		
	}
	
}
