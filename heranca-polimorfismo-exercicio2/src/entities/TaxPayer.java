package entities;

public abstract class TaxPayer {
	private String name;
	private Double anualIncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double annualIncome) {
		this.name = name;
		this.anualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double annualIncome) {
		this.anualIncome = annualIncome;
	}
	
	public abstract double tax();
}
