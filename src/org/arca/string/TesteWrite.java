package org.arca.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TesteWrite {
	
	
	public static void main(String[] args) {
		String file = "exemplo.txt";
		String texto = "Gostaria de informar que estão ligados a toda força de trabalho produtiva";
		String s;
		try{
			Files.writeString(new File(file).toPath(), texto, StandardCharsets.UTF_8);
			BufferedReader r = new BufferedReader(new FileReader(file));
			String conteudo = Files.readString(new File(file).toPath()); 
			System.out.println(conteudo);
		} catch (IOException e) {
			
		}
		
		
		
	}
}
