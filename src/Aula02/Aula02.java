package Aula02;

public class Aula02 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.tampar();
		c1.mudaCor("verde");
		c1.rabiscar();
		
		System.out.println(c1.cor);
		
		Caneta c2 = new Caneta();
		c2.destampar();
		c2.rabiscar();
		
		System.out.println(c2.cor);
		System.out.println(c2.modelo);
	}
}
