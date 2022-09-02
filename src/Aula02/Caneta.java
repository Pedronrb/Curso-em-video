package Aula02;
public class Caneta {
	String modelo;
	String cor = "azul";
	float ponta;
	int carga;
	boolean tampada;
	
	void rabiscar() {
		if(tampada == true) {
			System.out.println("Erro!!");
		}else {
			System.out.println("Rabisque!");
		}
		
	}
	
	void tampar() {
		tampada = true;
		
	}
	
	void destampar() {
		tampada = false;
	}
	
	void mudaCor(String novaCor) {
		cor = novaCor;
	}
	
}
