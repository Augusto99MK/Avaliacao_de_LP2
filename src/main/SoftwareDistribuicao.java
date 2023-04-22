package main;

import java.util.Scanner;

public class SoftwareDistribuicao extends Projeto {

	private String nomeArquivo;
	private String destinatario;
	private String emailDestinatario;

	/* Metodos herdados de Projeto */

	public void gerarEquipe(Projeto software, Scanner sc) {
		System.out.println("-----Cadastro de Equipe Software Distribuicao:-----");
		super.gerarEquipe(software, sc);
	}

	@Override
	public void gerarProjeto(Projeto projeto, Scanner sc) {
		System.out.println("-----Cadastro de Projeto Software Distribuicao:-----");
		super.gerarProjeto(projeto, sc);
	}

	@Override
	public void gerarChamado(Projeto chamado, Scanner sc) {
		System.out.println("-----Cadastro de Chamado Software Distribuicao:-----");
		super.gerarChamado(chamado, sc);

	}

	@Override
	public void gerarRelatorio(Projeto relatorio, Scanner sc) {
		System.out.println("-----Cadastro de Relatorio Software Distribuicao:-----");
		super.gerarRelatorio(relatorio, sc);

	}

	@Override
	public void gerarTarefa(Projeto tarefa, Scanner sc) {
		System.out.println("-----Cadastro de Tarefa Software Distribuicao:-----");
		super.gerarTarefa(tarefa, sc);

	}

	@Override
	public void imprimirPerguntas(Projeto imprimir, Scanner sc) {
		super.imprimirPerguntas(imprimir, sc);

	}

	public void imprimirValores(Projeto imprimir, Scanner sc, String metodo) {
		super.imprimirValores(imprimir, sc, metodo);

	}

	/* Metodo da Classe Software Distribuicao */

	public void distribuirSoftware(SoftwareDistribuicao sd) {

		System.out.println("-----Cadastro de Distribuicao Software Distribuicao:-----");

		System.out.println("Digite o nome do arquivo do software:");
		sd.setNomeArquivo(sc.nextLine());
		System.out.println("Digite o nome do destinatario:");
		sd.setDestinatario(sc.nextLine());
		System.out.println("Digite o endereço de e-mail do destinatário:");
		sd.setEmailDestinatario(sc.nextLine());
	}

	public void gerarLicensa(SoftwareDistribuicao sd) {
		System.out.println("-----Geramento Software Distribuicao:-----");

		System.out.println("O nome do arquivo eh: \n" + sd.getNomeArquivo());
		System.out.println("O nome do destinatario eh: \n" + sd.getDestinatario());
		System.out.println("O nome do endereco eh: \n" + sd.getEmailDestinatario());

	}

	/* Métodos getters e setters */

	private String getNomeArquivo() {
		return nomeArquivo;
	}

	private void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	private String getDestinatario() {
		return destinatario;
	}

	private void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	private String getEmailDestinatario() {
		return emailDestinatario;
	}

	private void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}

}
