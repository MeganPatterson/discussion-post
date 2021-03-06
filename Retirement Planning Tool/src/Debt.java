
public class Debt {
	private String debtType;  //What type of debt is it? Mortgage/HELOC/Line of credit/etc
	private double amount;  //the amount of debt outstanding
	private double interestRate; //Annual rate of interest expressed as a decimal. 5% is .05
	private double monthlyPayment;  //The clients monthly payment on the debt
	
	/**
	 * Constructs a blank debt object and defaults the variables 
	 */
	public Debt() {
		this.debtType = "";
		this.amount = 0.0;
		this.interestRate = 0.0;
		this.monthlyPayment = 0.0;
	}
	
	/**
	 * Constructs a new debt objects and sets the instance variables equal to the values that we
	 * are passed.
	 * @param type  The type of debt the client owes
	 * @param amt   The dollar amount of debt the client owes
	 * @param rate  The annual interest rate on the debt in decimal format.  5% is .05
	 * @param pmt   The monthly payment the client pays on the debt.
	 */
	public Debt(String type, double amt, double rate, double pmt) {
		this.debtType = type;
		this.amount = amt;
		this.interestRate = rate;
		this.monthlyPayment = pmt;
	}
	
	public void debtPaydown() {
	
	}

	/**
	 * Getter method for debt type
	 * @return debtType
	 */
	public String getDebtType() {
		return debtType;
	}

	/**
	 * Setter method for debt type
	 * @param debtType the type of debt the client owns
	 */
	public void setDebtType(String debtType) {
		this.debtType = debtType;
	}

	/**
	 * Getter method for amount
	 * @return amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Setter method for amount
	 * @param amount The dollar value of the debt
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * Getter method for interest rate
	 * @return interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * Setter method for interestRate
	 * @param interestRate The interest rate on the debt
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * Getter method for monthly payment
	 * @return monthlyPayment
	 */
	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	/**
	 * Setter method for monthly payment
	 * @param monthlyPayment the monthly debt payment
	 */
	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	

}
