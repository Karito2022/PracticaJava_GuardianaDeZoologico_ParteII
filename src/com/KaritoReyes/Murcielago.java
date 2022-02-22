package com.KaritoReyes;

public class Murcielago extends Mamifero {
	public Murcielago() {
		super.setNivelDeEnergia(300);
	}
	
	public void volar() {
		System.out.println("Vuela....shhhhh");
		setNivelDeEnergia(getNivelDeEnergia()-50);
	}
	public void comerHumanos() {
		System.out.println("Comiendo...yomi yomi");
		setNivelDeEnergia(getNivelDeEnergia()+25);
	}
	public void atacarPueblo() {
		System.out.println("Fuego...plosh");
		setNivelDeEnergia(getNivelDeEnergia()-100);
	}
}