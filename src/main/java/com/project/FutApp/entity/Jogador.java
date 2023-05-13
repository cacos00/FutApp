package com.project.FutApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
 @Table(name = "tb_jogador")
public class Jogador {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private long id;
	private String name; 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Jogador [id=" + id + ", name=" + name + "]";
	}
	public Jogador() {
	}
	public Jogador(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
