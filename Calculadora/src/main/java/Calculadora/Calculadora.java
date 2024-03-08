package Calculadora;

public class Calculadora {
	
	public int somar(int a, int b) {
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b ) {
		return a * b;
	}
	
	public int dividir(int a, int b) {
		return a / b;
	}

	public float media(float a, float b) {
		return (a + b)/2;
	}
	
	public float mediaComVariosNumeros(int[] numeros) {
		
		float soma = 0;
		
		for (int numero : numeros) {
			soma += numero;
		}
		
		return soma / numeros.length;
	}

}
