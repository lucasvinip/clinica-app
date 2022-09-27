package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;

public class PlanoDeSaudeDAO { //Simular banco de dados

	private PlanoDeSaude planoDeSaude;
	private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

	public PlanoDeSaudeDAO() {

	}

	public void gravar(PlanoDeSaude planoDeSaude) {
		planos.add(planoDeSaude);
	}

	public static ArrayList<PlanoDeSaude> listarTodos() {
		return planos;
	}

}
