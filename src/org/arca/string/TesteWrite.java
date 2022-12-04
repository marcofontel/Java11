package org.arca.string;

import java.io.FileWriter;
import java.io.IOException;

public class TesteWrite {
	
	
	public static void main(String[] args) {
		String file = "exemplo.txt";
		String texto = "Gostaria de informar que estamos ligados a toda força de trabalho produtiva";
		try (FileWriter escreve = new FileWriter(file)){
			escreve.write(texto);
		} catch (IOException e) {
			System.out.println(e);
					}
	}
}
