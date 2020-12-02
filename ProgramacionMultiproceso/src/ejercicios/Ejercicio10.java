package ejercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> comando=new ArrayList<String>();
		
		if(System.getProperty("os.name").contains("Windows")) {
			comando.add("CMD");
			comando.add("/C");
			comando.add("ECHO");
			comando.add("%MI_NOMBRE%");
		}else {
			comando.add("/bin/bash");
			comando.add("-c");
			comando.add("ECHO $MI_NOMBRE");
		}
		
		ProcessBuilder proceso = new ProcessBuilder(comando);
		Map<String, String> variable = proceso.environment();
		variable.put("MI_NOMBRE","Javier");
		proceso.inheritIO();
		
		try {
			proceso.start();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
