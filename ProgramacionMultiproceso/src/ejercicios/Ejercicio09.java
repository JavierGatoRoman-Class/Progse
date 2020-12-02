package ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder proceso;
		List<String>comando =  new ArrayList<String>();
		
		if(System.getProperty("os.name").contains("Windows")) {
			comando.add("CMD");
			comando.add("/C");
			comando.add("dir");
		} else {
			comando.add("ls");
		}
		
		try {
			proceso = new ProcessBuilder(comando);
			proceso.start();
			
			File ficheroSalida = new File("salida_ejercicio9.txt");
			File ficheroError =  new File("log_ejercicio9.txt");
			
			proceso.redirectInput(ficheroSalida);
			proceso.redirectError(ficheroError);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
