package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}
	
	public Company(Integer numberOfEmployees) {
		super();
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public Double tax() {
		if (numberOfEmployees <= 10) {
			return 0.16 * getAnualIncome();
		}
		else {
			return 0.14 * getAnualIncome();
		}
	}
}
