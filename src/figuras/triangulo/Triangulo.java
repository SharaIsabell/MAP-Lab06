package figuras.triangulo;

public class Triangulo {
	private static Triangulo[] instancias = new Triangulo[TipoTriangulo.values().length];
	private TipoTriangulo tipo;
	private double lado1, lado2, lado3;
	
	private Triangulo(double lado1, double lado2, double lado3, TipoTriangulo tipo) throws TrianguloException {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.tipo = tipo;
		
		if(trianguloNaoValido()) {
			throw new TrianguloException("Um dos lados do triângulo é maior do que o outro. Logo, o triângulo não é válido");
		}
	}
	
	public static Triangulo getInstancia(double lado1, double lado2, double lado3) throws TrianguloException {
		TipoTriangulo tipo = calcularTipo(lado1, lado2, lado3);
		if (instancias[tipo.ordinal()] == null) {
            
			instancias[tipo.ordinal()] = new Triangulo(lado1, lado2, lado3, tipo);
        }
        return instancias[tipo.ordinal()];
	}

	private boolean trianguloNaoValido() {
		return ((lado1 + lado2 < lado3) || (lado1 + lado3 < lado2) || (lado2 + lado3 < lado1));
	}
	
	private static TipoTriangulo calcularTipo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return TipoTriangulo.EQUILATERO;
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return TipoTriangulo.ISOSCELES;
        } else {
            return TipoTriangulo.RETANGULO;
        }
    }
	
	public double area() { // Usando a fórmula de Heron para calcular a área
	    double semiPerimetro = (lado1 + lado2 + lado3) / 2;
	    double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
	    return area;
    }

    public double perimetro() {
    	return lado1 + lado2 + lado3;
    }
	
    @Override
    public String toString() {
        return "Triângulo tipo: " + tipo + ", Lados: [" + lado1 + ", " + lado2 + ", " + lado3 + "]";
    }
    
    //Getters

	public TipoTriangulo getTipo() {
		return tipo;
	}
	
	public double[] getLados() {
		return new double[] {lado1, lado2, lado3};
	}
    
}
