package figuras.circulo;

public class Circulo {
	private static Circulo instancia = null;
	private double raio;
	
	private Circulo(double raio) throws CirculoException {
		if(raio <= 0) {
			throw new CirculoException("Círculo não pode ter raio igual ou inferior a zero");
		}
		this.raio = raio;
	}
	
	public synchronized static Circulo getInstacia(double raio) throws CirculoException {
		if(instancia == null) {
			instancia = new Circulo(raio);
		}
		return instancia;
	}
	
	@Override
	public String toString() {
		return "O círculo criado tem raio de tamanho " + raio;
	}

	//Getter
	
	public double getRaio() {
		return raio;
	}
	
}
