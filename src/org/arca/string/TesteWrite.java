package org.arca.string;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteWrite {
	
	
	public static void main(String[] args) {
		String file = "exemplo.txt";
		String texto = "Gostaria de informar que estamos ligados a toda força de trabalho produtiva";
		try (BufferedWriter buff = new BufferedWriter(new FileWriter(file))){
			buff.write(texto);
		} catch (IOException e) {
			System.out.println(e);
					}
	}
}
