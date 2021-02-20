import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// Faça um programa que receba três notas e seus respectivos pesos, 
		// calcule e mostre a média ponderada.
		float n1, n2, n3, media;
		n1 = Float.valueOf(JOptionPane.showInputDialog("Nota 1: "));
		n2 = Float.valueOf(JOptionPane.showInputDialog("Nota 2: "));
		n3 = Float.valueOf(JOptionPane.showInputDialog("Nota 3: "));
		media = (n1 + n2 + n3)/3;
		JOptionPane.showMessageDialog(null, "Sua média é: " + media);

	}

}
