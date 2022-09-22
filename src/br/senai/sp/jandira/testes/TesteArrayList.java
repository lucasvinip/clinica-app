package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) {
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		
		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		dao.gravar(plano1);
		dao.gravar(plano2);
		
		System.out.println(dao.listarTodos());
	}

}

////Vetor com 3 planos de saúde
//PlanoDeSaude plano1 = new PlanoDeSaude();
//plano1.setOperadora("Unimed");
//plano1.setTipoDoPlano("Bronze");
//
//
//PlanoDeSaude[] planos = {
//		plano1, 
//		new PlanoDeSaude("Porto Seguro"),
//		new PlanoDeSaude("Allianz", "Ouro")};                                                            
//
//System.out.println(planos[0].getOperadora());
//System.out.println(planos[1].getOperadora());
//System.out.println(planos[2].getDadosDoPlano());
//
////Utilização do ArrayList
//ArrayList<String> cidades = new ArrayList<>();
//cidades.add("São Paulo");
//cidades.add("Jandira");
//cidades.add("Barueri");
//cidades.add("Itapevi");
//cidades.add("Cotia");
//cidades.add("Carapicuíba");
//
//System.out.println(cidades.get(4));
//System.out.println(cidades.size());
//
//ArrayList<PlanoDeSaude> planos2 = new ArrayList<>();
//planos2.add(new PlanoDeSaude("Notredame"));
//planos2.add(new PlanoDeSaude("Ativia", "Advanced"));
//planos2.add(new PlanoDeSaude("Bio Saúde"));
//planos2.add(new PlanoDeSaude("Blue Med", "Exclusive"));
//
//PlanoDeSaude planoNovo = new PlanoDeSaude();
//planoNovo.setOperadora("Ameplan");
//planoNovo.setTipoDoPlano("Prata");
//
//planos2.add(planoNovo);
//
////Adicionar o tipo do plano no plano Notedrame
//planos2.get(0).setTipoDoPlano("Basic");
//
//System.out.println(planos2.get(4).getDadosDoPlano());
//System.out.println(planos2.get(0).getDadosDoPlano());
//
//Integer nota2 = 5;
//
//ArrayList<Double> precosList = new ArrayList<>();
//precosList.add(5.9);