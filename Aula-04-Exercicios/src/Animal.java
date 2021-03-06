import javax.swing.JOptionPane;

public class Animal {
	//Atributos
	String nome;
	String classe;
	String familia;
	int idade;
	int caloria;
	int forca;
	boolean estado;
	
	Animal() {
		this.nascer();
	}
	
	public void nascer() {
		nome = JOptionPane.showInputDialog("Nome: ");
		classe = JOptionPane.showInputDialog("Classe: ");
		familia = JOptionPane.showInputDialog("Família: ");
		idade = 0;
		caloria = 10;
		forca = 10;
		estado = true;
	}
	
	public void morrer() {
		
	}
	
	public void comer() {
		
	}
	
	public void correr() {
		
	}
	
	public void dormir() {
		
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", classe=" + classe + ", familia=" + familia + ", idade=" + idade
				+ ", caloria=" + caloria + ", forca=" + forca + ", estado=" + estado + "]";
	}
	
	
	
}
