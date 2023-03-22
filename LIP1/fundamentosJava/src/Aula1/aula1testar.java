package Aula1;

public class aula1testar {

	public static void main(String[] args) {
		
		aula1 c1 = new aula1();
		
		c1.nome = "Uno";
		c1.marca = "Fiat";
		c1.ano = 2015;
		c1.vel = 60;
		
		c1.acelerar(10);
		System.out.println("Velocidade: " + c1.vel + "km/h");
		
		c1.freiar(30);
		System.out.println("Velocidade: " + c1.vel + "km/h");
		

	}

}
