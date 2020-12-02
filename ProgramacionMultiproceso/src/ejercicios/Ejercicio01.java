package ejercicios;

import java.io.IOException;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		String comando= "chrome iescristobaldemonroy.es";
		
		if(System.getProperty("os.name").contains("Windows")) {
			comando = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe iescristobaldemonroy.es";
		}
		else{
			comando= "chrome iescristobaldemonroy.es";
		}
		
		try {
			rt.exec(comando);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
