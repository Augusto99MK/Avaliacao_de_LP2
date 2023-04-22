package main;

import interfac3.IRegras;

public abstract class Projeto implements IRegras {

	public String nome;
	public String descricao;
	public String dataInicio;
	public String dataFinal;
	public String plataforma;
	public String versaoSoftware;

	/* Getters e Setters */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getVersaoSoftware() {
		return versaoSoftware;
	}

	public void setVersaoSoftware(String versaoSoftware) {
		this.versaoSoftware = versaoSoftware;
	}

}
