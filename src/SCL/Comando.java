package SCL;

public class Comando {
	 String comando [] = new String [8];
	 String informacion[] = new String[8];
	 
	 Comando() {
		 comando[0]="suma";
		 comando[1]= "resta";
		 comando[2]="multiplicaci�n";
		 comando[3]="divisi�n";
		 comando[4]="residuo";
		 comando[5] ="help";
		 comando[6] ="exit";
		 comando[7] = "TemasExtra";
		 
		 informacion[0]="Esta funci�n puede recibir decimales y enteros.\n ";
		 informacion[1]= "En la funci�n resta se ingresan 2 n�meros, \npuede recibir decimales y enteros.\n";
		 informacion[2]="Al igual que las anteriores se ingresa datos en \ndecimales y enteros, facilitando el ingreso.\n";
		 informacion[3]="Recibiendo dos cantidades ya sea en decimales te \nayudar� a dividirlas.\n";
		 informacion[4]="Genera el resultado de la divisi�n.\n";
		 informacion[5] ="Te da a conocer los comandos existentes\nen el programa\n";
		 informacion[6] ="Est� funci�n te ayuda a finalizar el programa, \nen caso de que ya no quieras seguir utilizando.\n";
		 informacion[7] = "En la siguiente funci�n puedes encontrar temas \nextra para informarte m�s.";
	 }
}
