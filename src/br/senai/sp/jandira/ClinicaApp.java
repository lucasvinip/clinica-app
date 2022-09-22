package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.print.attribute.standard.Media;
import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
		
		// criar um plano de saúde
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Unimed");
		plano.setTipoDoPlano("Prata");
		
		PlanoDeSaude plano2 = new PlanoDeSaude("Amil");
		
		
		//criar um endereço
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Itajobi");
		endereco.setNumero("207");
		endereco.setCidade("Jandira");
		endereco.setBairro("Jr.Nr. de Fatima");
		endereco.setEstado(Estados.SAO_PAULO);
		endereco.setTipo("Casa");
		endereco.setComplemento("Fundos");
		endereco.setPontoDeReferencia("Igreja Leão de Judá");
		endereco.setCep("06624-110");
		
		//criar um paciente
		Paciente paciente = new Paciente();
		paciente.setNome("Laia Silva");
		paciente.setGenero(Genero.FEMININO);
		paciente.setEmail("laia@gmail.com");
		paciente.setCpf("526.077.578-35");
		paciente.setRg("123.456-99");
		paciente.setTelefone("(11)98745-6523");
		paciente.setTipoSanguineo("O+");
		paciente.setEndereco(endereco);
		paciente.setPlanoDeSaude(plano);
		
		//criar uma especialidade médica
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clínico geral");
		
		//criar um médico
		Medico medico1 = new Medico();
		medico1.setNome("Marcos Vinicius");
		medico1.setCRM("4579-5");
		medico1.setGenero(Genero.MASCULINO);
		medico1.setDataDeNascimento(LocalDate.of(1990, 6, 8));
		
		//criar a lista de especialidades do Dr.Marcos
		Especialidade[] especialidadesMedico1 = {especialidade1, especialidade3};
		
		medico1.setEspecialidade(especialidadesMedico1);
		
		Medico medico2 = new Medico();
		medico2.setNome("Fabiana Silva");
		medico2.setCRM("3154-2");
		medico2.setGenero(Genero.FEMININO);
		medico2.setDataDeNascimento(LocalDate.of(1980, 9, 7));
		
		Especialidade[] especialidadesMedico2 = {especialidade2};
		
		medico2.setEspecialidade(especialidadesMedico2);
		
		// criar uma agenda
		// A paciente patricia ligou na clinica para agendar uma consulta
		//com um clinico geral para o dia de 22/09/2020 ás 14h20.
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente);
		agenda1.setEspecialidade(especialidade3);
		agenda1.setMedico(medico1);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(14, 20));
		agenda1.setObservacao("Paciente reclamando de dor nas costas");
		agenda1.setComparecimento(false);
		
		System.out.println("Nome do paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Nome do Medico: " + agenda1.getMedico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Dia e hora: " + agenda1.getDataDaConsulta() + " / " + agenda1.getHoraDaConsulta());
		System.out.println("Plano de saúde: " + agenda1.getPaciente().getPlanoDeSaude().getDadosDoPlano());
		
	}

}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				