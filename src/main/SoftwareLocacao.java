package main;

import java.util.Scanner;

public class SoftwareLocacao extends Projeto {

	private String nomeAlugar;
	private String dataAlugar;
	private String emailDestinatario;

	/* Metodos herdados de Projeto */

	public void gerarEquipe(Projeto software, Scanner sc) {
		System.out.println("-----Cadastro de Equipe Software Locacao:-----");
		super.gerarEquipe(software, sc);
	}

	@Override
	public void gerarProjeto(Projeto projeto, Scanner sc) {
		System.out.println("-----Cadastro de Projeto Software Locacao:-----");
		super.gerarProjeto(projeto, sc);
	}

	@Override
	public void gerarChamado(Projeto chamado, Scanner sc) {
		System.out.println("-----Cadastro de Chamado Software Locacao:-----");
		super.gerarChamado(chamado, sc);

	}

	@Override
	public void gerarRelatorio(Projeto relatorio, Scanner sc) {
		System.out.println("-----Cadastro de Relatorio Software Locacao:-----");
		super.gerarRelatorio(relatorio, sc);

	}

	@Override
	public void gerarTarefa(Projeto tarefa, Scanner sc) {
		System.out.println("-----Cadastro de Tarefa Software Locacao:-----");
		super.gerarTarefa(tarefa, sc);

	}

	@Override
	public void imprimirPerguntas(Projeto imprimir, Scanner sc) {
		super.imprimirPerguntas(imprimir, sc);

	}

	public void imprimirValores(Projeto imprimir, Scanner sc, String metodo) {
		super.imprimirValores(imprimir, sc, metodo);

	}

	/* Metodos da Classe Software Locacao */

	public void alugarSoftware(SoftwareLocacao sl) {
		System.out.println("-----Cadastro de Alugar Software Locacao:-----");
		System.out.println("Digite qual software quer alugar:");
		sl.setNomeAlugar(sc.nextLine());
		System.out.println("Quanto tempo vc pretende alugar?:");
		sl.setDataAlugar(sc.nextLine());
		System.out.println("Digite o endereço de e-mail do destinatario:");
		sl.setEmailDestinatario(sc.nextLine());
	}

	public void renovarLocacao(SoftwareLocacao sl) {
		System.out.println("-----Renovar Software Locacao:-----");

		System.out.println("O software que voce pretende alugar eh:\n" + sl.getNomeAlugar());
		System.out.println("O tempo que voce quer alugar eh:\n" + sl.getDataAlugar());
		System.out.println("O endereco de email eh:\n" + sl.getEmailDestinatario());
	}

	private String getNomeAlugar() {
		return nomeAlugar;
	}

	private void setNomeAlugar(String nomeAlugar) {
		this.nomeAlugar = nomeAlugar;
	}

	private String getDataAlugar() {
		return dataAlugar;
	}

	private void setDataAlugar(String dataAlugar) {
		this.dataAlugar = dataAlugar;
	}

	private String getEmailDestinatario() {
		return emailDestinatario;
	}

	private void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}
}
