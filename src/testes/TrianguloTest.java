package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import figuras.triangulo.TipoTriangulo;
import figuras.triangulo.Triangulo;
import figuras.triangulo.TrianguloException;

public class TrianguloTest {

	static Triangulo triangulo1;
	static Triangulo triangulo2;
	static Triangulo triangulo3;
	
	@BeforeClass
	public static void criaObjetos() throws TrianguloException {
		triangulo1 = Triangulo.getInstancia(1, 1, 1);
		triangulo2 = Triangulo.getInstancia(2, 2, 2);
		triangulo3 = Triangulo.getInstancia(4, 4, 5);
	}
	
	@Test
	public void getInstanciaTest() { // Testando a instância do triângulo equilátero
		assertEquals(triangulo1.hashCode(), triangulo2.hashCode());
	}
	
	@Test
	public void areaTest() {
		assertEquals(0.43, triangulo2.area(), 2);
	}
	
	@Test
	public void perimetroTest() {
		assertEquals(13, triangulo3.perimetro(), 0);
	}
	
	@Test
	public void tipoTest() {
		assertEquals(TipoTriangulo.ISOSCELES, triangulo3.getTipo());
	}
	
	@Test
	public void tipoDiferenteTest() {
		assertNotEquals(triangulo3.getTipo(), triangulo1.getTipo());
	}

}
