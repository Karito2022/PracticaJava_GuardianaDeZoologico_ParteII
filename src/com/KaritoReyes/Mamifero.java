package com.KaritoReyes;

public class Mamifero {
	private int nivelDeEnergia;
	
	public Mamifero() {
		nivelDeEnergia=100;
	}
	
	public int mostrarEnergia() {
		System.out.println("Nivel de energ�a: "+nivelDeEnergia);
		return nivelDeEnergia;
	}

	public int getNivelDeEnergia() {
		return nivelDeEnergia;
	}

	public void setNivelDeEnergia(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}
}