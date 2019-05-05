
public class Assets {
	
	/**
	 * Constructs a blank Asset object and defaults the variables 
	 */
	public Assets() {
		this.assetType = 0;
		this.amount = 0.0;
		this.yield = 0.0;
	}
	
	/**
	 * Constructs a new Asset objects and sets the instance variables equal to the values that we
	 * are passed.
	 * @param type  Type of asset
	 * @param amt   The amount of the asset that is owned
	 * @param yld   The annual yield of the assets in decimal format. .05 = 5%
	 */
	public Assets(int type, double amt, double yld) {
		this.assetType = type;
		this.amount = amt;
		this.yield = yld;
	}

	/**
	 * Getter method for assetType
	 * @return assetType
	 */
	public int getAssetType() {
		return assetType;
	}

	/**
	 * Setter method for assetType
	 * @param assetType The type of asset. Stock, bond, etc
	 */
	public void setAssetType(int assetType) {
		this.assetType = assetType;
	}
	
	/**
	 * Getter method for amount.
	 * @return amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Setter method for amount
	 * @param amount The amount of asset that is owned
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * Getter method for yield
	 * @return yield
	 */
	public double getYield() {
		return yield;
	}

	/**
	 * Setter method for yield
	 * @param yield Annual yield on the asset in decimal form.
	 */
	public void setYield(double yield) {
		this.yield = yield;
	}

	
	
}
