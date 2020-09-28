package entities;

public class Company extends TaxPayer {

	private Integer employeesNumber;
	
	public Company() {
		super();
		
	}
	
	public Company(String name, double annualIncome, Integer employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}
	
	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public Double taxCalc() {
		if (employeesNumber > 10) {
			return (getAnnualIncome() * (14/100*getAnnualIncome()));
		}
		else
			return (getAnnualIncome() * (16/100*getAnnualIncome()));
	}
	

}
