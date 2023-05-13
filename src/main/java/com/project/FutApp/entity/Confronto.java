package com.project.FutApp.entity;

import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_confronto")
public class Confronto {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	private Calendar data;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Confronto(long id, Calendar data) {
		super();
		this.id = id;
		this.data = data;
	}

	@Override
	public String toString() {
		return "Confronto [id=" + id + ", data=" + data + "]";
	}

	public Confronto() {
		// TODO Auto-generated constructor stub
	}

}
