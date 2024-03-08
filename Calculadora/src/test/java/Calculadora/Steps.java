package Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Steps {

	private Calculadora calc;
	private int numero1;
	private int numero2; 
	
	@Dado("que eu escolha a operação SOMA")
	public void que_eu_escolha_a_operação_soma() {
	}
	@Quando("eu entrar com o primeiro valor {int}")
	public void eu_entrar_com_o_primeiro_valor(Integer int1) {
	    numero1 = int1;
	}
	@Quando("eu entrar com o segundo valor {int}")
	public void eu_entrar_com_o_segundo_valor(Integer int1) {
	    numero2 = int1; 
	}
	@Entao("o resultado mostrado deve ser {int}")
	public void o_resultado_mostrado_deve_ser(Integer int1) {
	    this.calc = new Calculadora();
		assertEquals(int1, calc.somar(numero1, numero2));
	}

}
