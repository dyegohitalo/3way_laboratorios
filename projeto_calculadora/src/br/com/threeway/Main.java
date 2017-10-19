package br.com.threeway;

public class Main {
	public static void main (String[]args) {
		System.out.println("Testando a calculadora..." + args[0]);	
		
		Calculadora calc = new Calculadora();
		
		int resultado = calc.somar(6, 2);
		resultado = calc.dividir(4, 2);
		resultado = calc.subtrair(2, 4);
		resultado = calc.multiplicar(2, 4);
		
		System.out.println("Resultado soma: " + resultado);
	}
}
