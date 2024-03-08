# language: pt

Funcionalidade: Operações Básicas da Calculadora
	Cenario: Calcular a soma de 2 números
		Vamos rodar dois exemplos, um com parâmetros corretos, outro com parâmetros incorretos
		para termos dois resultados de teste.
			
			Dado que eu escolha a operação SOMA
			Quando eu entrar com o primeiro valor <valor1>
			E eu entrar com o segundo valor <valor2>
			Entao o resultado mostrado deve ser <resultado>
			
			Exemplos:
			|valor1|valor2|resultado|
			|2|2|4|
			|2|3|6|