package carros.assuncao;

public class Carro {
	
	// ATRIBUTOS
	String nome;
	String marca;
	int ano;
	float vel;
	
	// MÉTODO
	public void acelerar(int aceleracao) {
		vel+=aceleracao;
	}
	
	public void freiar(int reduzir) {
		vel-=reduzir;
	}

	public void buzinar() {
		System.out.println("bububu");
	}
	
}
