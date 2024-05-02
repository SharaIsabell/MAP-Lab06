package figuras.quadrado;

import excecoes.FiguraException;

public class Quadrado {
	private double lado;

	public Quadrado(double lado) {
		if(lado <= 0) {
			throw new FiguraException("Quadrado não pode ter lado igual ou inferior a zero");
		}
		this.lado = lado;
	}
	
	public double area() {
		return lado * lado;
	}
	
	public double perimetro() {
		return 4 * lado;
	}
	
	@Override
	public String toString() {
		return "O quadrado criado tem lados de tamanho " + lado;
	}

	// Getter e Setter
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
}
