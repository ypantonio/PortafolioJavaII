package SCL;
	import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/*MENSAJE*/
		img mensaje = new img();
		mensaje.mensaje();
		
		boolean on = true;
		do {
		System.out.println("____________________________________");
		Scanner inputCommand = new Scanner(System.in);
		System.out.print("~$ ");
		String output = inputCommand.nextLine();
		
		Comando dateCommand = new Comando();
		FuncionAritmetica fa = new FuncionAritmetica();
		
			if(output.equals(dateCommand.comando[0])) {
				fa.sumar();
			}
			else if(output.equals(dateCommand.comando[1])) {
				fa.restar();
			}
			else if(output.equals(dateCommand.comando[2])) {
				fa.multiplicar();
			}
			else if(output.equals(dateCommand.comando[3])) {
				fa.dividir();
			}
			else if(output.equals(dateCommand.comando[4])) {
				fa.residuo();
			}
			else if(output.equals(dateCommand.comando[5])) {
			help help = new help();
				help.Comando();
			}
			else if (output.equals(dateCommand.comando[7])) {
				TemasExtra.TemasExtra();
			}
			else if (output.equals(dateCommand.comando[6])) {
				on = false;
				System.out.println("Programa finalizado. Gracias por utilizarlo.");
			}
	}while(on);
		
		
		
	}
}
