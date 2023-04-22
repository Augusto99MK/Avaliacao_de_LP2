package view;

import java.util.Scanner;

import main.SoftwareDistribuicao;

import main.SoftwareLocacao;

public class Programa {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int op;

		/* ---- MENU ---- */

		System.out.println("Selecione uma opcao:");
		System.out.println("1. Gerar projeto SoftwareDistribuicao");
		System.out.println("2. Gerar projeto SoftwareLocacao");
		System.out.println("3. Gerar Equipe softwareDistribuicao");
		System.out.println("4. Gerar Equipe softwareLocacao");
		System.out.println("5. Gerar Chamado softwareDistribuicao");
		System.out.println("6. Gerar Chamado softwareLocacao");
		System.out.println("7. Gerar Relatorio softwareDistribuicao");
		System.out.println("8. Gerar Relatorio softwareLocacao");
		System.out.println("9. Gerar Tarefa softwareDistribuicao");
		System.out.println("10. Gerar Tarefa softwareLocacao");
		System.out.println("11. Gerar Licensa SoftwareDistribuicao");
		System.out.println("12. Gerar Renovacao SoftwareLocacao");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		/* Instancias dos Softwares */
		SoftwareDistribuicao sd = new SoftwareDistribuicao();
		SoftwareLocacao sl = new SoftwareLocacao();

		switch (op = sc.nextInt()) {

		case 1:
			sc.nextLine(); // Consumir caractere de quebra de linha Enter
			sd.gerarProjeto(sd, sc); // chamada do metodo gerarProjeto herdada da classe Projeto
			sd.imprimirValores(sd, sc, "gerarProjeto");
			break;
		case 2:
			sc.nextLine();
			sl.gerarProjeto(sl, sc);
			sl.imprimirValores(sl, sc, "gerarProjeto");
			break;
		case 3:
			sc.nextLine();
			sd.gerarEquipe(sd, sc);
			sd.imprimirValores(sd, sc, "gerarEquipe");
			break;
		case 4:
			sc.nextLine();
			sl.gerarEquipe(sl, sc);
			sl.imprimirValores(sl, sc, "gerarEquipe");
			break;
		case 5:
			sc.nextLine();
			sd.gerarChamado(sd, sc);
			sd.imprimirValores(sd, sc, "gerarChamado");
			break;
		case 6:
			sc.nextLine();
			sl.gerarChamado(sl, sc);
			sl.imprimirValores(sl, sc, "gerarChamado");
			break;
		case 7:
			sc.nextLine();
			sd.gerarRelatorio(sd, sc);
			sd.imprimirValores(sd, sc, "gerarRelatorio");
			break;
		case 8:
			sc.nextLine();
			sl.gerarRelatorio(sl, sc);
			sl.imprimirValores(sl, sc, "gerarRelatorio");
			break;
		case 9:
			sc.nextLine();
			sd.gerarTarefa(sd, sc);
			sd.imprimirValores(sd, sc, "gerarTarefa");
			break;
		case 10:
			sc.nextLine();
			sl.gerarTarefa(sl, sc);
			sd.imprimirValores(sl, sc, "gerarTarefa");
			break;
		case 11:
			sc.nextLine();
			sd.distribuirSoftware(sd);
			sd.gerarLicensa(sd);
			break;
		case 12:
			sc.nextLine();
			sl.alugarSoftware(sl);
			sl.renovarLocacao(sl);
			break;
		default:
			System.out.println("Valor invalido");
		}

	}

}
