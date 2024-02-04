package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthyExpenditures() {
		return healthExpenditures;
	}

	public void setHealthyExpenditures(Double healthyExpenditures) {
		this.healthExpenditures = healthyExpenditures;
	}

	@Override
	public double tax() {
		double sum = 0.0;
		if(super.getAnualIncome() < 20000.00) {
			sum = super.getAnualIncome() * 0.15;
		} else {
			sum = super.getAnualIncome() * 0.25;
		}
		return sum - (healthExpenditures * 0.5);
	}

}
