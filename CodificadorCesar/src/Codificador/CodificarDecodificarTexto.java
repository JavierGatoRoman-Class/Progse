package Codificador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CodificarDecodificarTexto {

	private static final Scanner keyBoard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameFile;
		boolean error = true;
		int option = 0;

		while (option != 3) {

			System.out.print("Introduzca el nombre del fichero: ");
			nameFile = keyBoard.nextLine();
			
			try (BufferedReader inPutFlow = new BufferedReader(new FileReader(nameFile))) {

				while (!error) {
					try {
						error = true;
						System.out.println("Selecciona una opcion\n" + "1.-Encriptar el fichero\n"
								+ "2.-Desencriptar el fichero\n");
						option = Integer.parseInt(keyBoard.nextLine());

					} catch (NumberFormatException e) {
						System.out.println("Debes de escribri un numero.");
						error = false;
					}
				}
				switch (option) {
				case 1:
					System.out.println("Se va ha encriptar el fichero por el metodo cesar");
					encryptText(nameFile, inPutFlow);
					break;
				case 2:
					System.out.println("Se va ha desencriptar el fichero por el metodo cesar");
					decryptText(nameFile, inPutFlow);
					break;
				case 3:
					System.out.println("Adio");
					break;
				default:
					System.out.println("Tienes que ser un numero entre 1 y 3");
					break;
				}
			} catch (FileNotFoundException e) {
				System.out.println("Fichero " + nameFile + " no encontrado");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static final void encryptText(String nameFile, BufferedReader inPutFlow) {
		String textLine;
		try (BufferedWriter outPutFlow = new BufferedWriter(new FileWriter(nameFile.replace(".", "Encrypt.txt")))) {
			textLine = inPutFlow.readLine();
			while (textLine != null) {
				outPutFlow.write(Codificador.codifica(textLine));
				textLine = inPutFlow.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static final void decryptText(String nameFile, BufferedReader inPutFlow) throws IOException {
		String textLine;
		textLine = inPutFlow.readLine();
		while (textLine != null) {
			System.out.println(textLine);
			textLine = inPutFlow.readLine();
		}
	}

}
