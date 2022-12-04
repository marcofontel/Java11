package org.arca.string;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestMetodoString {

	
	public static void main(String[] args) {
		var str1 = " ";
		var str2 = "";
		var str3 = "Tem\nConteudo\nAvançado";
		System.out.println(str3);
		
		System.out.println(str3.lines().collect(Collectors.toList()));
		
		
	}
}
