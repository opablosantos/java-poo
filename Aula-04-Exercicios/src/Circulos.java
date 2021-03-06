
public class Circulos {
	//Atributos
	float x;
	float y;
	float raio;
	
	Circulos() {
		
	}
	
	Circulos(float x, float y, float r) {
		this.x = x;
		this.y = y;
		this.raio = r;
	}
	
	public void move(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void resize(float r) {
		this.raio = r;
	}
	
	public void print() {
		System.out.println("Classe ["
							+"Raio: "+raio
							+", x: "+x
							+", y: "+y
							+", Área: "+calcArea()
							+"]");
	}
	
	public float calcArea() {
		return (float)(Math.PI * Math.pow(raio, 2));
	}

}
