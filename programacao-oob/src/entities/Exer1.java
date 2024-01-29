package entities;

public class Exer1 {
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(largura, 2.0) + Math.pow(altura, 2.0)));
	}
}
