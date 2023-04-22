package interfac3;

import java.util.Scanner;

import main.Projeto;
import main.SoftwareDistribuicao;
import main.SoftwareLocacao;

public interface IRegras {

	public default void gerarTarefa(Projeto tarefa, Scanner sc) {

		System.out.println("Digite o nome da tarefa:");
		tarefa.setNome(sc.nextLine());

		System.out.println("Digite a descricao da tarefa:");
		tarefa.setDescricao(sc.nextLine());

		System.out.println("Digite a data de Inicio da tarefa:");
		tarefa.setDataInicio(sc.nextLine());

		System.out.println("Digite a data final do projeto:");
		tarefa.setDataFinal(sc.nextLine());

		System.out.println("Digite a plataforma:");
		tarefa.setPlataforma(sc.nextLine());

		System.out.println("Digite a versao do Software:");
		tarefa.setVersaoSoftware(sc.nextLine());

	}

	public default void gerarEquipe(Projeto software, Scanner sc) {

		System.out.println("Digite o nome da equipe:");
		software.setNome(sc.nextLine());

		System.out.println("Digite a descricao da equipe:");
		software.setDescricao(sc.nextLine());

		System.out.println("Digite a data de Inicio da equipe:");
		software.setDataInicio(sc.nextLine());

		System.out.println("Digite a data final da equipe:");
		software.setDataFinal(sc.nextLine());

	}

	public default void gerarProjeto(Projeto projeto, Scanner sc) {

		System.out.println("Digite o nome do projeto:");
		projeto.setNome(sc.nextLine());

		System.out.println("Digite a descricao do projeto:");
		projeto.setDescricao(sc.nextLine());

		System.out.println("Digite a data de Inicio do projeto:");
		projeto.setDataInicio(sc.nextLine());

		System.out.println("Digite a data final do projeto:");
		projeto.setDataFinal(sc.nextLine());

		System.out.println("Digite a plataforma:");
		projeto.setPlataforma(sc.nextLine());

		System.out.println("Digite a versao do Software:");
		projeto.setVersaoSoftware(sc.nextLine());

	}

	public default void gerarChamado(Projeto chamado, Scanner sc) {

		System.out.println("Digite o seu nome:");
		chamado.setNome(sc.nextLine());

		System.out.println("Digite a descricao do chamado detalhe o maximo possivel:");
		chamado.setDescricao(sc.nextLine());

		System.out.println("Digite a data de Inicio do chamado:");
		chamado.setDataInicio(sc.nextLine());

		System.out.println("Digite a plataforma:");
		chamado.setPlataforma(sc.nextLine());

		System.out.println("Digite a versao do Software:");
		chamado.setVersaoSoftware(sc.nextLine());

	}

	public default void gerarRelatorio(Projeto relatorio, Scanner sc) {

		System.out.println("Digite o seu relatorio:");
		relatorio.setNome(sc.nextLine());

		System.out.println("Digite a descricao do relatorio:");
		relatorio.setDescricao(sc.nextLine());

	}

	Scanner sc = new Scanner(System.in);

	/*
	 * Criando a leitura de dados que irá ser herdada por SoftwareDistribuicao e
	 * SoftwareLocacao, passando como parametro Scanner
	 */

	/* impressao dos metodos */

	public default void imprimirPerguntas(Projeto imprimir, Scanner sc) {
		/* impressao dos metodos */
		imprimir.gerarEquipe(imprimir, sc);
		sc.nextLine(); // adiciona a chamada ao método nextLine()
		imprimir.gerarProjeto(imprimir, sc);
		sc.nextLine();
		imprimir.gerarChamado(imprimir, sc);
		sc.nextLine();
		imprimir.gerarRelatorio(imprimir, sc);
		sc.nextLine();
		imprimir.gerarTarefa(imprimir, sc);
		sc.nextLine();
	}

	public default void imprimirValores(Projeto imprimir, Scanner sc, String metodo) {
		if (imprimir instanceof SoftwareDistribuicao) {
			SoftwareDistribuicao sd = (SoftwareDistribuicao) imprimir;
			switch (metodo) {
			case "gerarEquipe":
				System.out.println("Equipe Nome eh:\n" + sd.getNome());
				System.out.println("Equipe Descricao eh:\n" + sd.getDescricao());
				System.out.println("Equipe Data Inicio eh:\n" + sd.getDataInicio());
				System.out.println("Equipe Data Final eh:\n" + sd.getDataFinal());
				break;
			case "gerarProjeto":
				System.out.println("Projeto Nome eh:\n" + sd.getNome());
				System.out.println("Projeto Descricao eh:\n" + sd.getDescricao());
				System.out.println("Projeto Data Inicio eh:\n" + sd.getDataInicio());
				System.out.println("Projeto Data Final eh:\n" + sd.getDataFinal());
				System.out.println("Projeto Plataforma eh:\n" + sd.getPlataforma());
				System.out.println("Projeto Versao do Software eh:\n" + sd.getVersaoSoftware());
				break;
			case "gerarChamado":
				System.out.println("Chamado Nome eh:\n" + sd.getNome());
				System.out.println("Chamado Descricao eh:\n" + sd.getDescricao());
				System.out.println("Chamado Data Inicio eh:\n" + sd.getDataInicio());
				System.out.println("Chamado Plataforma eh:\n" + sd.getPlataforma());
				System.out.println("Chamado Versao do Software eh:\n" + sd.getVersaoSoftware());
				break;
			case "gerarRelatorio":
				System.out.println("Relatorio Nome eh:\n" + sd.getNome());
				System.out.println("Relatorio Descricao eh:\n" + sd.getDescricao());
				break;
			case "gerarTarefa":
				System.out.println("Tarefa Nome eh:\n" + sd.getNome());
				System.out.println("Tarefa Descricao eh:\n" + sd.getDescricao());
				System.out.println("Tarefa Data inicio eh:\n" + sd.getDataInicio());
				System.out.println("Tarefa Data Final eh:\n" + sd.getDataFinal());
				System.out.println("Tarefa Plataforma eh:\n" + sd.getPlataforma());
				System.out.println("Tarefa Versao do Software eh:\n" + sd.getVersaoSoftware());
				break;
			default:
				System.out.println("Método inválido.");
			}
		} else if (imprimir instanceof SoftwareLocacao) {
			SoftwareLocacao sl = (SoftwareLocacao) imprimir;
			switch (metodo) {
			case "gerarEquipe":
				System.out.println("Equipe Nome eh:\n" + sl.getNome());
				System.out.println("Equipe Descricao eh:\n" + sl.getDescricao());
				System.out.println("Equipe Data Inicio eh:\n" + sl.getDataInicio());
				System.out.println("Equipe Data Final eh:\n" + sl.getDataFinal());
				break;
			case "gerarProjeto":
				System.out.println("Projeto Nome eh:\n" + sl.getNome());
				System.out.println("Projeto Descricao eh:\n" + sl.getDescricao());
				System.out.println("Projeto Data Inicio eh:\n" + sl.getDataInicio());
				System.out.println("Projeto Data Final eh:\n" + sl.getDataFinal());
				System.out.println("Projeto Plataforma eh:\n" + sl.getPlataforma());
				System.out.println("Projeto Versao do Software eh:\n" + sl.getVersaoSoftware());
				break;
			case "gerarChamado":
				System.out.println("Chamado Nome eh:\n" + sl.getNome());
				System.out.println("Chamado Descricao eh:\n" + sl.getDescricao());
				System.out.println("Chamado Data Inicio eh:\n" + sl.getDataInicio());
				System.out.println("Chamado Plataforma eh:\n" + sl.getPlataforma());
				System.out.println("Chamado Versao do Software eh:\n" + sl.getVersaoSoftware());
				break;
			case "gerarRelatorio":
				System.out.println("Relatorio Nome eh:\n" + sl.getNome());
				System.out.println("Relatorio Descricao eh:\n" + sl.getDescricao());
				break;
			case "gerarTarefa":
				System.out.println("Tarefa Nome eh:\n" + sl.getNome());
				System.out.println("Tarefa Descricao eh:\n" + sl.getDescricao());
				System.out.println("Tarefa Data inicio eh:\n" + sl.getDataInicio());
				System.out.println("Tarefa Data Final eh:\n" + sl.getDataFinal());
				System.out.println("Tarefa Plataforma eh:\n" + sl.getPlataforma());
				System.out.println("Tarefa Versao do Software eh:\n" + sl.getVersaoSoftware());
				break;
			default:
				System.out.println("Método inválido.");
			}
		} else {
			System.out.println("Tipo de projeto inválido.");
		}
	}
}
