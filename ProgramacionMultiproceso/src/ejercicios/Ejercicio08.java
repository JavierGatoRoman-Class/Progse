package ejercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder proceso1 = new ProcessBuilder();
		Map<String, String> variablesEntorno = proceso1.environment();
		System.out.println(variablesEntorno);
	
		List<String> comandos = new ArrayList<String>();
		comandos.add("CMD");
		comandos.add("/C");
		comandos.add("DIRR");
		
		ProcessBuilder proceso2 = new ProcessBuilder(comandos);
		System.out.println(proceso2.command());
		
		try {
			proceso2.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
