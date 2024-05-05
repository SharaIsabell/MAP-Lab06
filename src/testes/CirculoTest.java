package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import figuras.circulo.Circulo;
import figuras.circulo.CirculoException;

public class CirculoTest {
	
	static Circulo circulo1;
	static Circulo circulo2;
	static Circulo circulo3;
	
	@BeforeClass
	public static void criarObjetos() throws CirculoException {
		circulo1 = Circulo.getInstacia(4);
		circulo2 = Circulo.getInstacia(6);
	}
	
	@Test
	public void areaTest() {
		assertEquals(16 * Circulo.PI, circulo1.area(), 0);
	}
	
	@Test
	public void perimetroTest() {
		assertEquals(8 * Circulo.PI, circulo1.perimetro(), 0);
	}
	
	@Test
	public void getInstanciaTest() {
		assertEquals(circulo1.hashCode(), circulo2.hashCode());
	}

}
