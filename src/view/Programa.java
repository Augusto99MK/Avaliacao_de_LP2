package view;

import pacote.projeto.SoftwareDistribuicao;
import pacote.projeto.SoftwareLocacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		System.out.println("Selecione uma opcao:");
		System.out.println("1. Gerar projeto SoftwareDistribuicao");
		System.out.println("2. Gerar projeto SoftwareLocacao");
		System.out.println("3. Gerar Equipe softwareDistribuicao");
		System.out.println("4. Gerar Equipe softwareLocacao");
		System.out.println("5. Gerar Deploy softwareDistribuicao");
		System.out.println("6. Gerar Deploy softwareLocacao");
		System.out.println("7. Gerar Chamado softwareDistribuicao");
		System.out.println("8. Gerar Chamado softwareLocacao");
		System.out.println("9. Gerar Relatorio softwareDistribuicao");
		System.out.println("10. Gerar Relatorio softwareLocacao");
		System.out.println("11. Gerar Tarefa softwareDistribuicao");
		System.out.println("12. Gerar Tarefa softwareLocacao");

		try (Scanner sc = new Scanner(System.in)) {
			int opcao = sc.nextInt();
			sc.nextLine();

			if (opcao == 1) {
				SoftwareDistribuicao software = new SoftwareDistribuicao();
				software.gerarProjeto();
			}

			if (opcao == 2) {
				SoftwareLocacao software = new SoftwareLocacao();
				software.gerarProjeto();
			}

			if (opcao == 3) {
				SoftwareDistribuicao software = new SoftwareDistribuicao();
				software.gerarEquipe();
			}

			if (opcao == 4) {
				SoftwareLocacao software = new SoftwareLocacao();
				software.gerarEquipe();
			}

			if (opcao == 5) {
				SoftwareDistribuicao software = new SoftwareDistribuicao();
				software.gerarDeploy();
			}

			if (opcao == 6) {
				SoftwareLocacao software = new SoftwareLocacao();
				software.gerarDeploy();
			}

			if (opcao == 7) {
				SoftwareDistribuicao software = new SoftwareDistribuicao();
				software.gerarChamado();
			}

			if (opcao == 8) {
				SoftwareLocacao software = new SoftwareLocacao();
				software.gerarChamado();
			}

			if (opcao == 9) {
				SoftwareDistribuicao software = new SoftwareDistribuicao();
				software.gerarRelatorio();
			}

			if (opcao == 10) {
				SoftwareLocacao software = new SoftwareLocacao();
				software.gerarRelatorio();
			}

			if (opcao == 11) {
				SoftwareDistribuicao software = new SoftwareDistribuicao();
				software.gerarTarefa();
			}

			if (opcao == 12) {
				SoftwareLocacao software = new SoftwareLocacao();
				software.gerarTarefa();
			}

		}
	}

}
