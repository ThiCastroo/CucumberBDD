package Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

public class CalculadoraTeste {
	
	private Calculadora calc;

	@BeforeEach
	public void inicializar() {
		this.calc = new Calculadora();
	}
	
	@Test
	void testSomar() {
		
		int a = 3;
		int b = 2;
		int resultado = calc.somar(a, b);
		
		assertEquals(a+b, resultado);
	}

	@Test
	void testSubtrair() {
		
		//Calculadora calc = new Calculadora();
		
		int a = 3;
		int b = 2;
		int resultado = calc.subtrair(a, b);
		
		assertEquals(a-b, resultado);
	}
	
	@Test
	void testMultiplicar() {
		
		//Calculadora calc = new Calculadora();
		
		int a = 3;
		int b = 2;
		int resultado = calc.multiplicar(a, b);
		
		assertEquals(a*b, resultado);
	}
	
	@Test
	void testDividir() {
		
		//Calculadora calc = new Calculadora();
		
		int a = 3;
		int b = 2;
		int resultado = calc.dividir(a, b);
		
		assertEquals(a/b, resultado);
	}
	
	@Test
	void testeDeveRetornarExceptionQUandoDividePorZero() {
		
		//Calculadora calc = new Calculadora();
		
		int a = 5;
		int b = 1;
		
		try {
			calc.dividir(a, b);
			fail("FALHOU: deveria ter gerado a Exception!");
		} catch (Exception e) {
			assertEquals(ArithmeticException.class, e.getClass());
		}
	}
		
	@Test
	public void testeDeveRetornarExceptionQUandoDividePorZeroUsandoLambda() {
		
		int a = 5;
		int b = 0;
		
		assertThrows(ArithmeticException.class, () -> {
			calc.dividir(a, b);
			
		});
	}
	
	@Test
	@Disabled
	public void testeCalculaMediaEntre2Numeros() {
		
		int a = 11;
		int b = 0;
		
		float resultado = calc.media(a, b);
	
		assertEquals(5.5, resultado);
	}
	
	@Test
	public void testeCalculaMediaComVariosNumeros() {
		
		int[] numeros = { 1, 3, 6, 5 };
		
		float resultado = calc.mediaComVariosNumeros(numeros);
		// A solução proposta é alterar o método
		// para receber uma lista de inteiros,
		// ao invés de receber apenas 2 valores.
				
		assertEquals(15f/4f, resultado);
		// O 'f' é adicionado para que o Java calcule com as casas decimais.
	}
	
}
