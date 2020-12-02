package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		Process proceso;
		String salidaConsola;
		try (BufferedWriter filtroSalida = new BufferedWriter(new FileWriter("SalidaComando.txt"))){
			if (System.getProperty("os.name").contains("Windows")) {
				proceso = rt.exec("CMD /C dir");
			} else {
				proceso = rt.exec("ls /");
			}
			BufferedReader filtroEntrada = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
			
			while ((salidaConsola = filtroEntrada.readLine()) != null) {
				filtroSalida.write(salidaConsola);
				filtroSalida.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
