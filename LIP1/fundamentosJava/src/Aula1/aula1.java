package Aula1;

public class aula1 {
	
	// Simulando o sistema de um CARRO
	
	// Atributos 
	String nome;
	String marca;
	int ano;
	int vel;
	
	
	// Métodos
	void acelerar(int aceleracao) {
		vel+=aceleracao;
	}
	
	void freiar(int reduzir) {
		vel-=reduzir;
	}
	
	void buzinar() {
		System.out.println("bibibi");
	}
}
	
