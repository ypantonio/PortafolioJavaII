package SCL;

import java.util.Scanner;

public class FuncionAritmetica {

	public static void sumar() {
		
		Scanner numero1 = new Scanner(System.in);
		System.out.println("numero1: ");
		double num1 = numero1.nextDouble();
		
		Scanner numero2 = new Scanner(System.in);
		System.out.println("numero2: ");
		double num2 = numero2.nextDouble();
		
		double resultado= num1 + num2;
		System.out.println("Respuesta: ");
		System.out.println(resultado);
		
	}
	
	public static void restar() {
		
		Scanner numero1 = new Scanner(System.in);
		System.out.println("numero1: ");
		double num1 = numero1.nextDouble();
		
		Scanner numero2 = new Scanner(System.in);
		System.out.println("numero2: ");
		double num2 = numero2.nextDouble();
		
		double resultado= num1-num2;
		System.out.println("respuesta: ");
		System.out.println(resultado);
		
	}
	
	public static void dividir() {
		
		Scanner numero1 = new Scanner(System.in);
		System.out.println("numero1: ");
		double num1 = numero1.nextDouble();
		
		Scanner numero2 = new Scanner(System.in);
		System.out.println("numero2: ");
		double num2 = numero2.nextDouble();
		
		double resultado= num1 / num2;
		System.out.println("respuesta: ");
		System.out.println(resultado);
		
	}
	public static void multiplicar() {
	
		Scanner numero1 = new Scanner(System.in);
		System.out.println("numero1: ");
		double num1 = numero1.nextDouble();
	
		Scanner numero2 = new Scanner(System.in);
		System.out.println("numero2: ");
		double num2 = numero2.nextDouble();
	
		double resultado= num1 * num2;
		System.out.println("respuesta: ");
		System.out.println(resultado);
		
}
	public static void residuo() {
		
		Scanner numero1 = new Scanner(System.in);
		System.out.println("numero1: ");
		double num1 = numero1.nextDouble();
	
		Scanner numero2 = new Scanner(System.in);
		System.out.println("numero2: ");
		double num2 = numero2.nextDouble();
	
		double resultado= num1 % num2;
		System.out.println("respuesta: ");
		System.out.println(resultado);
		
}
	
}
