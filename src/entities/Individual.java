package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;

	public Individual(Double healthExpenditures) {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double tax() {
		double tax;
		if (getAnualIncome() < 20000.00) {
			tax = 0.15 * getAnualIncome();
		}
		else {
			tax = 0.25 * getAnualIncome();
		}
		
		if (healthExpenditures != 0) {
			return tax - 0.5 * healthExpenditures;
		}
		else {
			return tax;
		}
	}
}
