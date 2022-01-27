package com.idat.demodrools.model;

public class Modulo {

	private String banco;
	private Integer tiempo;
	private String tasa;

	public Modulo() {
		super();
	}

	public Modulo(String banco, Integer tiempo) {
		super();
		this.banco = banco;
		this.tiempo = tiempo;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Integer getTiempo() {
		return tiempo;
	}

	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}

	public String getTasa() {
		return tasa;
	}

	public void setTasa(String tasa) {
		this.tasa = tasa;
	}

}
