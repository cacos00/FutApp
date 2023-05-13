package com.project.FutApp.entity;


public class Equipe_Confronto {

	private long idEquipe;
	private long idConfronto;
	private long pontuação;
	
	
	public long getIdEquipe() {
		return idEquipe;
	}


	public void setIdEquipe(long idEquipe) {
		this.idEquipe = idEquipe;
	}


	public long getIdConfronto() {
		return idConfronto;
	}


	public void setIdConfronto(long idConfronto) {
		this.idConfronto = idConfronto;
	}


	public long getPontuação() {
		return pontuação;
	}


	public void setPontuação(long pontuação) {
		this.pontuação = pontuação;
	}


	public Equipe_Confronto(long idEquipe, long idConfronto, long pontuação) {
		super();
		this.idEquipe = idEquipe;
		this.idConfronto = idConfronto;
		this.pontuação = pontuação;
	}


	@Override
	public String toString() {
		return "Equipe_Confronto [idEquipe=" + idEquipe + ", idConfronto=" + idConfronto + ", pontuação=" + pontuação
				+ "]";
	}


	public Equipe_Confronto() {
		// TODO Auto-generated constructor stub
	}

}
