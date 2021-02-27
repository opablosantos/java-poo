import javax.swing.JOptionPane;

public class LaçoDoWhile {

	public static void main(String[] args) {
		int num, i=0;
		do {
			num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um número:"));
		} while (num<1 || num>100);
		for(i=0; i<=10; i++) {
			System.out.println(num+" X "+i+" = "+(num * i));
		}
	}

}