package com.br.lucas.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("Olá turma 2 Java IBM");
		System.out.println("====[DIGITE UM NOME ABAIXO]====");

		

		for (int i = 1; i <= 5; i++) {
			String nome = reader.readLine();
			System.out.println("====[DIGITE MAIS UM NOME ABAIXO]====");
			System.out.println("O nome digitado foi: " +nome);
		}

		// SpringApplication.run(LogicaApplication.class, args);
	}

}
