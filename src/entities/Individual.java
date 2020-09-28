package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxCalc() {
		if (getAnnualIncome() < 20000) {
			return (getAnnualIncome() * (15/100*getAnnualIncome())
					- (healthExpenditures * (healthExpenditures*50/100)));
		}
		else
			return (getAnnualIncome() * (25/100*getAnnualIncome()) 
					- (healthExpenditures * (healthExpenditures*50/100)));
	}

}
