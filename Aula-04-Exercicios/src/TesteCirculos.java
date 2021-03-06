
public class TesteCirculos {

	public static void main(String[] args) {
		//Criando objeto Círculo - c1
		Circulos c1 = new Circulos();
		c1.raio = 5;
		c1.x = 3.2f;
		c1.y = 5.32f;
		c1.print();
		//Criando objeto Círculo - c2
		Circulos c2 = new Circulos();
		c2.raio = 7.5f;
		c2.x = 2.1f;
		c2.y = 1.92f;
		c2.print();
		//Criando objeto Círculo - c3
		Circulos c3 = new Circulos(2, 3, 5.2f);
		c3.print();
	}

}
