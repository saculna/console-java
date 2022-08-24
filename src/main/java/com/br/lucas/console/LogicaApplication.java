package com.br.lucas.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("Olá turma 2 Java IBM");

		List<String> nomes = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			System.out.println("DIGITE O " + i + "º" + " NOME: ");
			String nome = reader.readLine();
			nomes.add(nome);
		}

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("O " + (i + 1) + "º" + " NOME DIGITADO FOI: " + nomes.get(i));
		}

		// SpringApplication.run(LogicaApplication.class, args);
	}

}

// OU
// System.out.println("DIGITE O PRIMEIRO NOME: ");
// String nome1 = reader.readLine();

// System.out.println("DIGITE O SEGUNDO NOME: ");
// String nome2 = reader.readLine();

// System.out.println("DIGITE O TERCEIRO NOME: ");
// String nome3 = reader.readLine();

// System.out.println("DIGITE O QUARTO NOME: ");
// String nome4 = reader.readLine();

// System.out.println("DIGITE O QUINTO NOME: ");
// String nome5 = reader.readLine();

// System.out.println("O PRIMEIRO NOME DIGITADO FOI: "+nome1);
// System.out.println("O SEGUNDO NOME DIGITADO FOI: "+nome2);
// System.out.println("O TERCEIRO NOME DIGITADO FOI: "+nome3);
// System.out.println("O QUARTO NOME DIGITADO FOI: "+nome4);
// System.out.println("O QUINTO NOME DIGITADO FOI: "+nome5);
