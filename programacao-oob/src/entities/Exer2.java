package entities;

public class Exer2 {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.00;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
