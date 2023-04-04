package pacote.metodos;

public class Chamado {

	private String nomeChamado;
	private String descricaoChamado;
	private String dataInicioChamado;
	private String dataFinalChamado;
	private int idChamado;

	public void setNomeChamado(String nomeChamado) {
		this.nomeChamado = nomeChamado;

	}

	public void setDescricaoChamado(String descricaoChamado) {
		this.descricaoChamado = descricaoChamado;

	}

	public void setDataInicioChamado(String dataInicioChamado) {
		this.dataInicioChamado = dataInicioChamado;

	}

	public void setDataFinal(String dataFinalChamado) {
		this.dataFinalChamado = dataFinalChamado;

	}

	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;

	}

	public String getNomeChamado() {
		return nomeChamado;
	}

	public String getDescricaoChamado() {
		return descricaoChamado;
	}

	public String getDataInicioChamado() {
		return dataInicioChamado;
	}

	public String getDataFinalChamado() {
		return dataFinalChamado;
	}

	public int getIdChamado() {
		return idChamado;
	}

}
