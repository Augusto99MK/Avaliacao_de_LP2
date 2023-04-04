package pacote.projeto;

import pacote.interfac3.iRegrasDeProjeto;

public abstract class Projeto implements iRegrasDeProjeto {

	/*
	 * Atributos da Classe precisam ser declarados como protected para poderem ser
	 * acessados pelas subclasses filhas.
	 */

	protected String nome;
	protected String descricao;
	protected String dataInicio;
	protected String dataFinal;
	protected int idProjeto;
	protected String programador;
	protected String plataforma;
	protected String versaoSoftware;

	/*
	 * Construtor da Classe ele constroe Objeto Vazio, para então depois colocar
	 * dados nos atributos da Classe Projeto
	 */

	public Projeto() {
	}

	// Métodos getters e Setters

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}

	public void setProgramador(String programador) {
		this.programador = programador;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public void setVersaoSoftware(String versaoSoftware) {
		this.versaoSoftware = versaoSoftware;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public int getIdProjeto() {
		return idProjeto;
	}

	public String getProgramador() {
		return programador;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public String getVersaoSoftware() {
		return versaoSoftware;
	}

}
