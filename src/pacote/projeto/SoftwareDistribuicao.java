package pacote.projeto;

import pacote.metodos.Equipe;
import pacote.metodos.Chamado;
import pacote.metodos.Deploy;
import pacote.metodos.Relatorio;
import pacote.metodos.Tarefa;
import java.util.Scanner;

public class SoftwareDistribuicao extends Projeto {

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

		System.out.println("Equipe de SoftwareDistribuicao criada com sucesso! Seguem os detalhes:");
		System.out.println("Nome: " + equipe.getNome());
		System.out.println("Descricao: " + equipe.getDescricaoEquipe());
		System.out.println("Data de inicio: " + equipe.getDataInicio());
		System.out.println("Data final: " + equipe.getDataFinal());
		System.out.println("ID da equipe: " + equipe.getIdEquipe());
		System.out.println("Lider: " + equipe.getLider());
		System.out.println("Gerente: " + equipe.getGerente());
	}

	public void gerarProjeto() {

		SoftwareDistribuicao softwareDistribuicao = new SoftwareDistribuicao();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o nome do projeto:");
			softwareDistribuicao.setNome(sc.nextLine());

			System.out.println("Digite a descricao do projeto:");
			softwareDistribuicao.setDescricao(sc.nextLine());

			System.out.println("Digite a data de inicio do projeto:");
			softwareDistribuicao.setDataInicio(sc.nextLine());

			System.out.println("Digite a data final do projeto:");
			softwareDistribuicao.setDataFinal(sc.nextLine());

			System.out.println("Digite(Apenas Valores Inteiros) o ID do projeto:");
			softwareDistribuicao.setIdProjeto(sc.nextInt());
			sc.nextLine();

			System.out.println("Digite o nome do programador responsavel pelo projeto:");
			softwareDistribuicao.setProgramador(sc.nextLine());

			System.out.println("Digite a plataforma do projeto:");
			softwareDistribuicao.setPlataforma(sc.nextLine());
		}

		System.out.println("Projeto de distribuicao criado com sucesso! Seguem os detalhes:");
		System.out.println("Nome: " + softwareDistribuicao.getNome());
		System.out.println("Descricao: " + softwareDistribuicao.getDescricao());
		System.out.println("Data de inicio: " + softwareDistribuicao.getDataInicio());
		System.out.println("Data final: " + softwareDistribuicao.getDataFinal());
		System.out.println("ID do projeto: " + softwareDistribuicao.getIdProjeto());
		System.out.println("Programador responsavel: " + softwareDistribuicao.getProgramador());
		System.out.println("Plataforma: " + softwareDistribuicao.getPlataforma());
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

		System.out.println("geracao de deploy softwareDistribuicao criada com sucesso! Seguem os detalhes:");
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

		System.out.println("geracao de chamado softwareDistribuicao criada com sucesso! Seguem os detalhes:");
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

		System.out.println("Relatorio gerado com sucesso em softwareDistribuicao! Seguem os detalhes:");
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

		System.out.println("Tarefa gerada com sucesso em softwareDistribuicao! Seguem os detalhes:");
		System.out.println("Nome: " + tarefa.getNomeTarefa());
		System.out.println("Descricao da tarefa: " + tarefa.getDescricaoTarefa());
		System.out.println("Data de inicio: " + tarefa.getDatainicioTarefa());
		System.out.println("Data final: " + tarefa.getDataFinalTarefa());
		System.out.println("ID da tarefa: " + tarefa.getIdTarefa());
		System.out.println("Colaborador responsavel: " + tarefa.getColaborador());
		System.out.println("Prioridade: " + tarefa.getPrioridade());

	}

}
