package figuras.circulo;

import excecoes.FiguraException;

public class Circulo {
	private static Circulo instancia = null;
	private double raio;
	
	private Circulo(double raio) {
		if(raio <= 0) {
			throw new FiguraException("Círculo não pode ter raio igual ou inferior a zero");
		}
		this.raio = raio;
	}
	
	public static Circulo getInstacia(double raio) {
		if(instancia == null) {
			instancia = new Circulo(raio);
		}
		return instancia;
	}
	
	

}
