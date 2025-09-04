package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class teste_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate s = LocalDate.parse(sc.next(), formatador);
		System.out.println("-------------");
		String data = LocalDate.now().format(formatador);
		System.out.println(data);
		System.out.println(s);
		
	}
	
}
