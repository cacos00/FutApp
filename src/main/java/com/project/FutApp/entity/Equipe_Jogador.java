package com.project.FutApp.entity;

public class Equipe_Jogador {

	private long idEquipe;
	private long idJogador;
	
	public long getIdEquipe() {
		return idEquipe;
	}

	public void setIdEquipe(long idEquipe) {
		this.idEquipe = idEquipe;
	}

	public long getIdJogador() {
		return idJogador;
	}

	public void setIdJogador(long idJogador) {
		this.idJogador = idJogador;
	}

	public Equipe_Jogador(long idEquipe, long idJogador) {
		super();
		this.idEquipe = idEquipe;
		this.idJogador = idJogador;
	}

	@Override
	public String toString() {
		return "Equipe_Jogador [idEquipe=" + idEquipe + ", idJogador=" + idJogador + "]";
	}

	public Equipe_Jogador() {
		// TODO Auto-generated constructor stub
	}

}
