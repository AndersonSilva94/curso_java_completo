package entities;

public class Company extends TaxPayer {
	
	private Integer employeesNumber;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer employeesNumber) {
		super(name, anualIncome);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public double tax() {
		double taxToCalc = 0.0;
		if(employeesNumber <= 10) {
			taxToCalc = 0.16;
		} else {
			taxToCalc = 0.14;
		}
		return super.getAnualIncome() * taxToCalc;
	}

}
