package ejercicios;

import java.io.IOException;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta;
		ProcessBuilder proceso;

		try {
			if (System.getProperty("os.name").contains("Windows")) {
				ruta = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
			} else {
				ruta = "chrome";
			}

			proceso = new ProcessBuilder(ruta, "iescristobaldemonroy.es");
			proceso.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
