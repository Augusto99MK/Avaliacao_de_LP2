package pacote.projeto;

import java.util.Scanner;

import pacote.metodos.Deploy;
import pacote.metodos.Equipe;
import pacote.metodos.Relatorio;
import pacote.metodos.Tarefa;
import pacote.metodos.Chamado;

public class SoftwareLocacao extends Projeto {

	public Double precoLocacao;
	public int tempoMaxLocacao;

	public void gerarEquipe() {

		Equipe equipe = new Equipe();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o nome da equipe:");
			equipe.setNome(sc.nextLine());

			System.out.println("Digite a descricao da equipe:");
			equipe.setDescricaoEquipe(sc.nextLine());

			System.out.println("Digite a data de inicio da equipe:");
			equipe.setDataInicio(sc.nextLine());

			System.out.println("Digite a data final da equipe:");
			equipe.setDataFinal(sc.nextLine());

			System.out.println("Digite(Apenas Valores Inteiros) o ID da equipe:");
			equipe.setIdEquipe(sc.nextInt());
			sc.nextLine();

			System.out.println("Digite o nome do lider da equipe:");
			equipe.setLider(sc.nextLine());

			System.out.println("Digite o nome do gerente da equipe:");
			equipe.setGerente(sc.nextLine());
		}

		System.out.println("Equipe de SoftwareLocacao criada com sucesso! Seguem os detalhes:");
		System.out.println("Nome: " + equipe.getNome());
		System.out.println("Descricao: " + equipe.getDescricaoEquipe());
		System.out.println("Data de inicio: " + equipe.getDataInicio());
		System.out.println("Data final: " + equipe.getDataFinal());
		System.out.println("ID da equipe: " + equipe.getIdEquipe());
		System.out.println("Lider: " + equipe.getLider());
		System.out.println("Gerente: " + equipe.getGerente());
	}

	public void gerarProjeto() {

		SoftwareLocacao softwareLocacao = new SoftwareLocacao();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o nome do projeto:");
			softwareLocacao.setNome(sc.nextLine());

			System.out.println("Digite a descricao do projeto:");
			softwareLocacao.setDescricao(sc.nextLine());

			System.out.println("Digite a data de inicio do projeto:");
			softwareLocacao.setDataInicio(sc.nextLine());

			System.out.println("Digite a data final do projeto:");
			softwareLocacao.setDataFinal(sc.nextLine());

			System.out.println("Digite(Apenas Valores Inteiros) o ID do projeto:");
			setIdProjeto(sc.nextInt());
			sc.nextLine();

			System.out.println("Digite o nome do programador responsavel pelo projeto:");
			softwareLocacao.setProgramador(sc.nextLine());

			System.out.println("Digite a plataforma do projeto:");
			softwareLocacao.setPlataforma(sc.nextLine());

			System.out.println("Digite o preco da locacao por dia:");
			softwareLocacao.setPrecoLocacao(sc.nextDouble());

			System.out.println("Digite o tempo da locacao por dia:");
			softwareLocacao.setTempoMaxLocacao(sc.nextInt());

			sc.nextLine();
		}

		System.out.println("Projeto de locacao criado com sucesso! Seguem os detalhes:");
		System.out.println("Nome: " + softwareLocacao.getNome());
		System.out.println("Descricao: " + softwareLocacao.getDescricao());
		System.out.println("Data de inicio: " + softwareLocacao.getDataInicio());
		System.out.println("Data final: " + softwareLocacao.getDataFinal());
		System.out.println("ID do projeto: " + softwareLocacao.getIdProjeto());
		System.out.println("Programador responsavel: " + softwareLocacao.getProgramador());
		System.out.println("Plataforma: " + softwareLocacao.getPlataforma());
		System.out.println("Preco da locacao por dia: " + softwareLocacao.getPrecoLocacao());
		System.out.println("Tempo max da locacao por dia: " + softwareLocacao.getTempoMaxLocacao());
	}

	public void gerarDeploy() {

		Deploy deploy = new Deploy();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o nome do deploy:");
			deploy.setNomeDeploy(sc.nextLine());

			System.out.println("Digite a descricao da empresa host:");
			deploy.setDescricaoDeploy(sc.nextLine());

			System.out.println("Digite a data de inicio do contrato host:");
			deploy.setDataInicio(sc.nextLine());

			System.out.println("Digite a data final do contrato host:");
			deploy.setDataFinal(sc.nextLine());

			System.out.println("Digite(Apenas Valores Inteiros) o ID do deploy:");
			deploy.setIdDeploy(sc.nextInt());
			sc.nextLine();
		}

		System.out.println("geracao de deploy softwareLocacao criada com sucesso! Seguem os detalhes:");
		System.out.println("Nome do deploy: " + deploy.getNomeDeploy());
		System.out.println("Descricao da empresa: " + deploy.getDescricaoDeploy());
		System.out.println("Data de inicio: " + deploy.getDataInicio());
		System.out.println("Data final: " + deploy.getDataFinal());
		System.out.println("ID do Deploy: " + deploy.getIdDeploy());
	}

	public void gerarChamado() {
		Chamado chamado = new Chamado();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Adicione um novo chamado, digite seu nome:");
			chamado.setNomeChamado(sc.nextLine());

			System.out.println("Digite a descricao do chamado:");
			chamado.setDescricaoChamado(sc.nextLine());

			System.out.println("Digite a data de inicio do chamado:");
			chamado.setDataInicioChamado(sc.nextLine());

			System.out.println("Digite a data final do contrato host:");
			chamado.setDataFinal(sc.nextLine());

			System.out.println("Digite(Apenas Valores Inteiros) o ID do chamado:");
			chamado.setIdChamado(sc.nextInt());
			sc.nextLine();
		}

		System.out.println("geracao de chamado softwareLocacao criada com sucesso! Seguem os detalhes:");
		System.out.println("Nome: " + chamado.getNomeChamado());
		System.out.println("Descricao do chamado: " + chamado.getDescricaoChamado());
		System.out.println("Data de inicio: " + chamado.getDataInicioChamado());
		System.out.println("Data final: " + chamado.getDataFinalChamado());
		System.out.println("ID do chamado: " + chamado.getIdChamado());
	}

	public void gerarRelatorio() {
		Relatorio relatorio = new Relatorio();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o nome do relatorio:");
			relatorio.setNomeRelatorio(sc.nextLine());

			System.out.println("Digite a descricao do relatorio:");
			relatorio.setDescricaoRelatorio(sc.nextLine());

			System.out.println("Digite a data de inicio do relatorio:");
			relatorio.setDataInicioRelatorio(sc.nextLine());

			System.out.println("Digite a data final do relatorio:");
			relatorio.setDataFinalRelatorio(sc.nextLine());

			System.out.println("Digite(Apenas Valores Inteiros) o ID do relatorio:");
			relatorio.setIdRelatorio(sc.nextInt());
			sc.nextLine();
		}

		System.out.println("Relatorio gerado com sucesso em softwareLocacao! Seguem os detalhes:");
		System.out.println("Nome: " + relatorio.getNomeRelatorio());
		System.out.println("Descricao do relatorio: " + relatorio.getDescricaoRelatorio());
		System.out.println("Data de inicio: " + relatorio.getDataInicioRelatorio());
		System.out.println("Data final: " + relatorio.getDataFinalRelatorio());
		System.out.println("ID do relatorio: " + relatorio.getIdRelatorio());
	}

	public void gerarTarefa() {

		Tarefa tarefa = new Tarefa();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o nome da tarefa:");
			tarefa.setNomeTarefa(sc.nextLine());

			System.out.println("Digite a descricao da tarefa:");
			tarefa.setDescricaoTarefa(sc.nextLine());

			System.out.println("Digite a data de inicio da tarefa:");
			tarefa.setDatainicioTarefa(sc.nextLine());

			System.out.println("Digite a data final da tarefa:");
			tarefa.setDataFinalTarefa(sc.nextLine());

			System.out.println("Digite(Apenas Valores Inteiros) o ID da tarefa:");
			tarefa.setIdTarefa(sc.nextInt());
			sc.nextLine();

			System.out.println("Digite o nome do colaborador responsavel pela tarefa:");
			tarefa.setColaborador(sc.nextLine());

			System.out.println("Digite o nivel de prioridade da tarefa:");
			tarefa.setPrioridade(sc.nextLine());
		}

		System.out.println("Tarefa gerada com sucesso em softwareLocacao! Seguem os detalhes:");
		System.out.println("Nome: " + tarefa.getNomeTarefa());
		System.out.println("Descricao da tarefa: " + tarefa.getDescricaoTarefa());
		System.out.println("Data de inicio: " + tarefa.getDatainicioTarefa());
		System.out.println("Data final: " + tarefa.getDataFinalTarefa());
		System.out.println("ID da tarefa: " + tarefa.getIdTarefa());
		System.out.println("Colaborador responsavel: " + tarefa.getColaborador());
		System.out.println("Prioridade: " + tarefa.getPrioridade());
	}

	public void setPrecoLocacao(double precolocacao) {
		this.precoLocacao = precolocacao;
	}

	public void setTempoMaxLocacao(int tempoMaxLocacao) {
		this.tempoMaxLocacao = tempoMaxLocacao;

	}

	public Double getPrecoLocacao() {
		// TODO Auto-generated method stub
		return precoLocacao;
	}

	public int getTempoMaxLocacao() {
		// TODO Auto-generated method stub
		return this.tempoMaxLocacao;
	}
}
