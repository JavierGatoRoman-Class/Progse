package ejercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> comando = new ArrayList<String>();
		comando.add("java");
		comando.add("ProgramacionMultiproceso.ejercicios.Ejercicio10");
		ProcessBuilder proceso = new ProcessBuilder(comando);
		String classpath = "C:\\Users\\JavierRoman\\Desktop\\Progse\\ProgramacionMultiproceso\\bin";
		
		proceso.environment().put("CLASSPATH", classpath);
		proceso.inheritIO();
		
		try {
			proceso.start();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
