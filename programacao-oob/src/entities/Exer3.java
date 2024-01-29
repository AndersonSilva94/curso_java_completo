package entities;

public class Exer3 {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double calculateMedia() {
		return n1 + n2 + n3;
	}
	
	public double verifyPoints() {
		if(calculateMedia() < 60) {
			return (double) 60 - calculateMedia(); 
		} else {
			return 0.0;
		}
	}
}
