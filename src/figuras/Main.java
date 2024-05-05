package figuras;

import figuras.circulo.Circulo;
import figuras.circulo.CirculoException;
import figuras.quadrado.Quadrado;
import figuras.quadrado.QuadradoException;
import figuras.triangulo.Triangulo;
import figuras.triangulo.TrianguloException;

public class Main{
	public static void main(String[] args) throws QuadradoException, CirculoException, TrianguloException {
		System.out.println("Quadrados:");
		Quadrado quadrado1 = new Quadrado(5);
		Quadrado quadrado2 = new Quadrado(10);
		
		System.out.println(quadrado1);
		System.out.println(quadrado2);
		System.out.println();
		
		System.out.println("Círculos:");
		Circulo circulo1 = Circulo.getInstacia(3);
		Circulo circulo2 = Circulo.getInstacia(6);
		
		System.out.println(circulo1);
		System.out.println(circulo2);
		System.out.println();

		System.out.println("Triângulos:");
		Triangulo triangulo1 = Triangulo.getInstancia(1, 1, 1);
		Triangulo triangulo2 = Triangulo.getInstancia(2, 2, 2);
		Triangulo triangulo3 = Triangulo.getInstancia(4, 4, 5);
		Triangulo triangulo4 = Triangulo.getInstancia(5, 5, 6);
		Triangulo triangulo5 = Triangulo.getInstancia(9, 8, 7);
		Triangulo triangulo6 = Triangulo.getInstancia(10, 9, 8);

		System.out.println(triangulo1);
		System.out.println(triangulo2);
		System.out.println(triangulo3);
		System.out.println(triangulo4);
		System.out.println(triangulo5);
		System.out.println(triangulo6);
	}
}
