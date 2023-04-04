package pacote.metodos;

public class Tarefa {
	private String nomeTarefa;
	private String descricaoTarefa;
	private String datainicioTarefa;
	private String dataFinalTarefa;
	private int idTarefa;
	private String colaborador;
	private String prioridade;

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}

	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}

	public String getDatainicioTarefa() {
		return datainicioTarefa;
	}

	public void setDatainicioTarefa(String datainicioTarefa) {
		this.datainicioTarefa = datainicioTarefa;
	}

	public String getDataFinalTarefa() {
		return dataFinalTarefa;
	}

	public void setDataFinalTarefa(String dataFinalTarefa) {
		this.dataFinalTarefa = dataFinalTarefa;
	}

	public int getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getColaborador() {
		return colaborador;
	}

	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

}
