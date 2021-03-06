package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {

		double anualIncomeTax = (numberOfEmployees < 10) ? (getAnualIncome() * 0.16) : (getAnualIncome() * 0.14);
		return anualIncomeTax;

		/*
		 * double anualIncomeTax = 0;
		 * 
		 * if (numberOfEmployees < 10) { anualIncomeTax = (getAnualIncome() * 0.16); }
		 * else { anualIncomeTax = (getAnualIncome() * 0.14); } return anualIncomeTax;
		 */

	}
}
