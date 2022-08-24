// package com.br.lucas.console;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.List;

// //import org.springframework.boot.SpringApplication;

// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class LogicaApplication {

// 	public static void main(String[] args) throws IOException {
// 		BufferedReader reader = new BufferedReader(
// 				new InputStreamReader(System.in));

// 		System.out.println("Olá turma 2 Java IBM");

// 		List<String> nomes = new ArrayList<>();
// 		for (int i = 1; i <= 5; i++) {
// 			System.out.println("DIGITE O " + i + "º" + " NOME: ");
// 			String nome = reader.readLine();
// 			nomes.add(nome);
// 		}

// 		for (int i = 0; i < nomes.size(); i++) {
// 			System.out.println("O " + (i + 1) + "º" + " NOME DIGITADO FOI: " + nomes.get(i));
// 		}

// 		// SpringApplication.run(LogicaApplication.class, args);
// 	}

// }

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

//**************************************************RESOLUCAO EXERCICIO 2 ALUNOS

// package com.br.lucas.console;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.List;

// //import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class LogicaApplication {

// 	private static List<String> nomes = new ArrayList<>();
// 	private static List<String> situacao = new ArrayList<>();
// 	private static List<Double> notas = new ArrayList<>();
// 	private static int idAluno;

// 	public static void main(String[] args) throws IOException {
// 		BufferedReader scanner = new BufferedReader(
// 				new InputStreamReader(System.in));

// 		int menuEscolha = 0;

// 		System.out.println("===== Seja Bem Vindo ao sistema de cadastramento de notas. ====");
// 		System.out.println("");

// 		do {
// 			System.out.println("Selecione a Opção desejada: ");
// 			System.out.println("1 - Cadastrar Aluno.");
// 			System.out.println("2 - Exibir lista de Aluno.");

// 			System.out.println("Para sair Digite a senha: 9999.");
// 			menuEscolha = lerDadoInt();

// 			if (menuEscolha != 9999) {
// 				menuNavegacao(menuEscolha);
// 				System.out.println("");
// 			}

// 		} while (menuEscolha != 9999);

// 		System.out.println("Finalizando Sistema ...");
// 		System.out.println("Sistema Finalizado com Sucesso!");

// 	}

// 	public static void menuNavegacao(int escolha) throws NumberFormatException, IOException {

// 		int quantidadeAlunos = 0;

// 		String nomeAluno = "";
// 		double nota1 = 0;
// 		double nota2 = 0;
// 		double nota3 = 0;

// 		switch (escolha) {
// 			case 1:
// 				System.out.println("Digite a Quantidade de aluno que deseja cadastrar: ");

// 				quantidadeAlunos = lerDadoInt();

// 				for (int i = 1; i <= quantidadeAlunos; i++) {
// 					System.out.println("Digite o Nome do aluno: ");
// 					nomeAluno = lerDado();
// 					System.out.println("Digite a nota 1 de " + nomeAluno + ":");
// 					nota1 = lerDadoDouble();
// 					System.out.println("Digite a nota 2 de " + nomeAluno + ":");
// 					nota2 = lerDadoDouble();
// 					System.out.println("Digite a nota 3 de " + nomeAluno + ":");
// 					nota3 = lerDadoDouble();

// 					adicionarAluno(idAluno, nomeAluno, nota1, nota2, nota3);

// 					System.out.println("Aluno Adicionado com Sucesso!");

// 					idAluno++;
// 					System.out.println("");
// 				}
// 				break;
// 			case 2:
// 				System.out.println("=== Imprimindo Lista de Alunos. ===");
// 				imprimirAlunoSituacao();
// 				break;

// 			default:
// 				System.out.println("Opção Invalida - Tente novamente.");
// 				break;
// 		}
// 	}

// 	public static String obterSituacaoAluno(double nota1, double nota2, double nota3) {
// 		String situacao = "";
// 		double media = (nota1 + nota2 + nota3) / 3;

// 		if (media >= 7) {
// 			situacao = "APROVADO";
// 		} else if (media >= 5) {
// 			situacao = "RECUPERACAO";
// 		} else if (media < 5 && media >= 0) {
// 			situacao = "REPROVADO";
// 		}
// 		return situacao;
// 	}

// 	public static void adicionarAluno(int idAluno, String nome, double nota1, double nota2, double nota3) {
// 		nomes.add(idAluno, nome);
// 		double media = (nota1 + nota2 + nota3) / 3;
// 		notas.add(idAluno, media);
// 		situacao.add(idAluno, obterSituacaoAluno(nota1, nota2, nota3));

// 	}

// 	public static void imprimirAlunoSituacao() {
// 		for (int i = 0; i <= nomes.size() - 1; i++) {
// 			System.out.println("Nome: " + nomes.get(i) + ": " + situacao.get(i));
// 		}
// 	}

// 	public static String lerDado() throws IOException {
// 		BufferedReader scanner = new BufferedReader(
// 				new InputStreamReader(System.in));
// 		String texto = scanner.readLine();

// 		return texto;
// 	}

// 	public static Integer lerDadoInt() throws NumberFormatException, IOException {
// 		BufferedReader scanner = new BufferedReader(
// 				new InputStreamReader(System.in));
// 		int inteiro = Integer.parseInt(scanner.readLine());

// 		return inteiro;
// 	}

// 	public static Double lerDadoDouble() throws NumberFormatException, IOException {
// 		BufferedReader scanner = new BufferedReader(
// 				new InputStreamReader(System.in));
// 		String nota = "";
// 		nota = scanner.readLine();

// 		if (nota.contains(",")) {
// 			String[] notaCorrigido = nota.split(",");
// 			nota = notaCorrigido[0] + "." + notaCorrigido[1];
// 		}

// 		double valor = Double.parseDouble(nota);

// 		while (valor > 10 || valor < 0) {
// 			System.out.println("Valor Invalido, Digite a nota Novamente: ");
// 			valor = Double.parseDouble(scanner.readLine());
// 		}

// 		return valor;
// 	}

// }

//**********************************************************RESOLUCAO PROFESSOR

package com.br.lucas.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import models.Aluno;

@SpringBootApplication
public class LogicaApplication {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException, NumberFormatException, InterruptedException {
		while (true) {
			limparTela();

			System.out.println("===== [ CADASTRO DOS ALUNOS ] ====");
			System.out.println("Qual opção você deseja?");
			System.out.println("1 - Cadastrar aluno");
			System.out.println("2 - Mostrar Relatório");
			System.out.println("3 - Sair");

			int opcao = 0;

			try {
				opcao = Integer.parseInt(reader.readLine());

			} catch (Exception e) {
			}

			limparTela();

			var sair = false;
			switch (opcao) {
				case 1:
					cadastroAluno();
					break;

				case 2:
					mostrarAlunos();
					break;

				case 3:
					sair = true;
					break;

				default:
					opcaoInvalida();
					break;
			}
			if (sair)
				break;
		}

		// SpringApplication.run(LogicaApplication.class, args);
	}

	private static void limparTela() {
		System.out.println("\033[H\033[2J");
		System.out.flush();
	}

	private static void opcaoInvalida() throws IOException, NumberFormatException, InterruptedException {
		mensagem("Opcao invalida");
	}

	private static void capturaNotasAluno(Aluno aluno) throws NumberFormatException, IOException, InterruptedException {
		System.out.println("Digite a nota do(a)" + aluno.getNome());
		if (aluno.getNotas() == null)
			aluno.setNotas(new ArrayList<Float>());

		try {
			aluno.getNotas().add(Float.parseFloat(reader.readLine()));
		} catch (Exception e) {
			mensagem("Nota Invalida");
			capturaNotasAluno(aluno);
		}

		try {
			System.out.println("Digite 1 para cadastrar mais notas ou 0 para finalizar o cadastro");
			int opcao = Integer.parseInt(reader.readLine());
			if (opcao == 1)
				capturaNotasAluno(aluno);
			return;

		} catch (Exception e) {
			mensagem("Opcao invalida, iniciando novo cadastro de nota");
			capturaNotasAluno(aluno);
		}

	}

	private static void mensagem(String string) throws InterruptedException {
		limparTela();
		System.out.println(string);
		espera(2);
		limparTela();
	}

	private static void espera(int secconds) throws InterruptedException {
		Thread.sleep(secconds * 1000);
	}

	private static void mostrarAlunos() throws InterruptedException {
		if (Aluno.all().size() == 0) {
			mensagem("Nenhum aluno cadastrado");
			return;
		}

		System.out.println("===== [RELATORIO DE ALUNOS] =====");
		for (Aluno aluno : Aluno.all()) {
			System.out.println("Nome: " + aluno.getNome());
			String notas = "";
			for (Float nota : aluno.getNotas()) {
				notas += nota + ", ";
			}
			System.out.println("Nome: " + notas);
			System.out.println("Media: " + aluno.media());
			System.out.println("Situacao: " + aluno.situacao());
			System.out.println("---------------------------------------");
		}
		espera(8);
		limparTela();
	}

	private static void cadastroAluno() throws InterruptedException, NumberFormatException, IOException {
		var aluno = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		aluno.setNome(reader.readLine());

		capturaNotasAluno(aluno);

		aluno.salvar();

		mensagem("Aluno cadastrado com sucesso!");
	}

}