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
			return (0.14*getAnnualIncome());
		}
		else
			return (0.16*getAnnualIncome());
	}
	

}
