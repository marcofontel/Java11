package org.arca.string;

import java.util.function.Function;

public class TestMetodoString {

	
	public static void main(String[] args) {
		var str1 = " ";
		var str2 = "";
		var str3 = " Tem Conteudo Avançado - ";
		System.out.println(str3.repeat(3));
		
		Function<String, String> concatena = (var s) -> s + ". ";
		System.out.println(concatena.apply("testando o teste"));
	}
}
