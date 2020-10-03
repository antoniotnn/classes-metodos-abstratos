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
		
		if (healthExpenditures ==0) {
			if (getAnnualIncome() < 20000) {
				return ((0.15*getAnnualIncome()));
			}
			else {
				return ((0.25*getAnnualIncome()));
			}	
		}
		else if (getAnnualIncome() < 20000) {
			return ((0.15*getAnnualIncome()) - 0.5*healthExpenditures);
		}
		else {
			return ((0.25*getAnnualIncome()) - 0.5*healthExpenditures);
		}	
		
	}


		
}
