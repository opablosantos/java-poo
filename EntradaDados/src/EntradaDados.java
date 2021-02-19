import java.util.Scanner;
import javax.swing.JOptionPane;


public class EntradaDados {

	public static void main(String[] args) {
		/*Scanner meuScanner = new Scanner(System.in); //Cria um objeto Scanner
		
		System.out.println("Entre com seu nome: ");
		String nome = meuScanner.nextLine();		//Lê os dados digitados
		
		System.out.println("Entre com sua idade: ");
		int idade = meuScanner.nextInt();		//Lê os dados digitados
		
		System.out.println("Olá, " + nome + "!\nVocê tem " + idade + " anos.");	//Imprime o nome
		*/
		
		String nome;
		int idade;
		
		nome = JOptionPane.showInputDialog("Entre com seu nome: ");
		idade = Integer.valueOf(JOptionPane.showInputDialog("Entre com sua idade: "));
		JOptionPane.showMessageDialog(null, "Olá "+nome+"!!!\nSua idade é: "+idade+"anos.");
	}

}





