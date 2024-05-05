package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import figuras.quadrado.Quadrado;
import figuras.quadrado.QuadradoException;


public class QuadradoTest {

	static Quadrado quadrado;
	
	@BeforeClass
	public static void criarObjetos() throws QuadradoException {
		quadrado = new Quadrado(5);
	}
	
	@Test(expected = QuadradoException.class)
	public void quadradoTest() throws QuadradoException { // Testa a exceção
		quadrado = new Quadrado(0);
	}
	
	@Test
	public void areaTest() {
		assertEquals(25, quadrado.area(), 0);
	}
	
	@Test
	public void perimetroTest() {
		assertEquals(20, quadrado.perimetro(), 0);
	}

}
