package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		Process proceso;
		String salidaConsola;

		try {
			if (System.getProperty("os.name").contains("Windows")) {
				proceso = rt.exec("CMD /C dirr");
			} else {
				proceso = rt.exec("lsss");
			}
			BufferedReader filtroEntrada = new BufferedReader(new InputStreamReader(proceso.getErrorStream()));

			while ((salidaConsola = filtroEntrada.readLine()) != null) {
				System.out.println(salidaConsola);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
