package figuras.circulo;

import figuras.Figura;

public class Circulo implements Figura{
	private static Circulo instancia = null;
	private double raio;
	public static final double PI = 3.14;
	
	private Circulo(double raio) throws CirculoException {
		this.raio = raio;
		
		if(raio <= 0) {
			throw new CirculoException("Círculo não pode ter raio igual ou inferior a zero");
		}
	}
	
	public synchronized static Circulo getInstacia(double raio) throws CirculoException {
		if(instancia == null) {
			instancia = new Circulo(raio);
		}
		return instancia;
	}
	
	public double area() {
		return PI * Math.pow(raio, 2);
	}
	
	public double perimetro() { 
		return 2 * PI * raio;
	}
	
	@Override
	public String toString() {
		return "O círculo criado tem raio de tamanho " + raio;
	}

	// Getter e Setter
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}
