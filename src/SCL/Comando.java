package SCL;

public class Comando {
	 String comando [] = new String [8];
	 String informacion[] = new String[8];
	 
	 Comando() {
		 comando[0]="suma";
		 comando[1]= "resta";
		 comando[2]="multiplicación";
		 comando[3]="división";
		 comando[4]="residuo";
		 comando[5] ="help";
		 comando[6] ="exit";
		 comando[7] = "TemasExtra";
		 
		 informacion[0]="Esta función puede recibir decimales y enteros.\n ";
		 informacion[1]= "En la función resta se ingresan 2 números, \npuede recibir decimales y enteros.\n";
		 informacion[2]="Al igual que las anteriores se ingresa datos en \ndecimales y enteros, facilitando el ingreso.\n";
		 informacion[3]="Recibiendo dos cantidades ya sea en decimales te \nayudará a dividirlas.\n";
		 informacion[4]="Genera el resultado de la división.\n";
		 informacion[5] ="Te da a conocer los comandos existentes\nen el programa\n";
		 informacion[6] ="Está función te ayuda a finalizar el programa, \nen caso de que ya no quieras seguir utilizando.\n";
		 informacion[7] = "En la siguiente función puedes encontrar temas \nextra para informarte más.";
	 }
}
