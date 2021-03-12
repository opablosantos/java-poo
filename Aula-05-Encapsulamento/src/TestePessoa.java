
public class TestePessoa {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa("12345643", "João da Silva", 73.2f, 1.74f);
		System.out.println(joao);
		joao.setAltura(1.72f);
		joao.setPeso(70f);
		System.out.println("Nova Altura: "+joao.getAltura());
		System.out.println("Novo Peso: "+joao.getPeso());
		
	}

}
