package SCL;

public class help {
		
	public static void Comando() {
			
		Comando datos = new Comando();
		int cantidadComandos = datos.comando.length;
		
		for(int i = 0;i<cantidadComandos;i++) {
			System.out.println("°"+datos.comando[i]+"=");
			System.out.println(datos.informacion[i]);
			
		}
		
	}
	
}
