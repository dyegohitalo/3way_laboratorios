package br.com.threeway;
import java.util.Scanner;
public class Calculadora {
	
	//Declarando os métodos
	
    public int somar(int num1, int num2) {
        return num1 + num2;
    }  
    public int subtrair(int num1, int num2){
        return num1 - num2;
    }  
    public int dividir(int num1,int num2){
        return num1 / num2;
    }  
    public int multiplicar(int num1, int num2){
        return num1 * num2;
    }  
    
    public static void main (String args[]){ 
        
    	//Criando um objeto c a apartir do método calculadora  
        
    	Calculadora c = new Calculadora();  
        
        //Declarando as variáveis  
    	
        int opcao = 5;  
        int num1;  
        int num2;  
		
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        
        System.out.println("-> Escolha uma operação matemática <- \n");  
        System.out.println("1. Somar \n");    
        System.out.println("2. Subtrair \n");    
        System.out.println("3. Multiplicar \n");    
        System.out.println("4. Dividir \n");    
        System.out.println("0. Sair \n");    
        System.out.println("Operação: \n");    
        
        opcao = input.nextInt();  
        
        while (opcao != 0) {
	@SuppressWarnings("resource")
	Scanner input1 = new Scanner(System.in);    
	System.out.println("Informe o primeiro Nº: \n");  
	num1 = input1.nextInt();  
	System.out.println("Informe o Segundo Nº: \n");  
	num2 = input1.nextInt();
			
	     if ( opcao == 1 ) {
		int operacao = c.somar(num1, num2);
                System.out.printf("\nO resultado da soma é: %d\n", operacao);  
                break;  
             } 
			
            else if (opcao == 2) { 
		int operacao = c.subtrair(num1, num2);
		System.out.printf("\nO resultado da subtração é: %d\n", operacao);  
		break;  
	    }
			
	    else if (opcao == 3) {
		int operacao = c.multiplicar(num1, num2); 
		System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);    
		break;  
	    }  
	    
	    else if (opcao == 4) {  
		int operacao = c.dividir(num1, num2);  
		System.out.printf("\nO resultado da divisão é: %d\n", operacao);   
		break;  
	    }  
	    
	    else{  
		System.out.println("ERROR: Operação escolhida é inválida!!!");  
		break;  
	    }      
        } // Fim do while - Usuário optou por sair
    }  // Finalizando do método principal
}
