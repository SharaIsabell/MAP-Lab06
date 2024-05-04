package figuras.triangulo;

public class Triangulo {
	private static Triangulo[] instancias = new Triangulo[TipoTriangulo.values().length];
	private TipoTriangulo tipo;
	private double lado1, lado2, lado3;
	
	private Triangulo(double lado1, double lado2, double lado3, TipoTriangulo tipo) throws TrianguloException {
		if(!trianguloValido()) {
			throw new TrianguloException("Um dos lados do triângulo é maior do que o outro. Logo, o triângulo não é válido");
		}
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.tipo = tipo;
	}
	
	public static Triangulo getInstancia(double lado1, double lado2, double lado3) throws TrianguloException {
		TipoTriangulo tipo = calcularTipo(lado1, lado2, lado3);
		if (instancias[tipo.ordinal()] == null) {
            instancias[tipo.ordinal()] = new Triangulo(lado1, lado2, lado3, tipo);
        }
        return instancias[tipo.ordinal()];
	}

	private boolean trianguloValido() {
		return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1); 
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
