public class Checking extends Account implements Debit {

    public Checking(String name, Double bal) {
			super(name);
			minimumBalanceLimit(0.0);
			fee(5.0);
			interestRate(.06);
			changeBalanceByAmount(bal);
		}
    public Checking(String name) {
        this(name,0.0);
    }
    public void chargePurchase(Double amount) {
			if ((balance() - amount) > 0.0) {
				changeBalanceByAmount(amount);
			}
    }
    public void cashWithdrawal(Double amount) {
			if ((balance() - amount) > 0.0) {
				changeBalanceByAmount(-amount);
			}
    }
    public void makeDeposit(Double amount) {
			if (balance() == 0.0) {
				changeBalanceByAmount(amount/2.0);
			} else {
				changeBalanceByAmount(-amount);
			}
    }
		public void chargeFee() {
			if ((balance() - fee()) >= minimumBalanceLimit()) {
				changeBalanceByAmount(-fee());
			}
		}
}
