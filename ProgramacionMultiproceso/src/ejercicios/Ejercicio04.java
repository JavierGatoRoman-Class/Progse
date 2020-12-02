package ejercicios;

import java.io.IOException;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		Process proceso;
		int status;
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				proceso = rt.exec("CMD  /C dirr");
			} else {
				proceso = rt.exec("ls /");
			}
			
			status = proceso.waitFor();
			System.out.println("El comando ha resultado "+status);
		}catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
