package br.com.dio.desafio.dominio;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Curso extends Conteudo {

	private int cargaHoraria;
	private List<Professor> professores;

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	public Curso() {
		this.professores = new ArrayList<>();
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void getProfessores() {
		System.out.println("--Professores do curso " + this.getTitulo());
		for (Professor p : this.professores) {
			System.out.println(p.getNome());
		}

	}

	public void removeProfessor(Professor professor) {
		Iterator<Professor> p = this.professores.iterator();

		while (p.hasNext()) {
			if (p.next().equals(professor)) {
				p.remove();
			}
		}

	}

	public void cadastraProfessor(Professor professor) {
		this.professores.add(professor);

	}

	@Override
	public String toString() {
		return "Curso{" + "titulo='" + getTitulo() + '\'' + ", descricao='" + getDescricao() + '\'' + ", cargaHoraria="
				+ cargaHoraria + '}';
	}
}
