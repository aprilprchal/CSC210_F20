public class Discover extends Account implements Credit {

    public Discover(String name, Double bal) {
        super(name);
				maximumBalanceLimit(2000.0);
				fee(30.0);
				interestRate(.182);
        changeBalanceByAmount(bal);
    }
    public Discover(String name) {
        this(name,0.0);
    }
    public void chargePurchase(Double amount) {
			if ((balance() - amount) > 0.0) {
				changeBalanceByAmount(-amount);
			}
    }
    public void makePayment(Double amount) {
			if (0 == balance()) {
				changeBalanceByAmount(amount/2.0);
			} else {
				changeBalanceByAmount(amount);
			}
    }
		public void chargeFee() {
			if ((balance() + fee()) <= maximumBalanceLimit()) {
				changeBalanceByAmount(fee());
			}
		}
} // end class Discover
