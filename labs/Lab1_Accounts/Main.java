/** Testing script to ensure student code is executable and meets requirements /** Testing script to ensure student code is executable and meets requirements with respect to class methods.
*/
public class Main {

	public static void main(String[] args) {

		Double testValue = 0.0;

		//-------------------------     TEST ACCOUNT   ----------------------
		System.out.println("\n\nTesting Account class methods ...");

		Checking judy = new Checking("Judy Stein");
		Checking omar = new Checking("Aden Omar",200.00);


		omar.changeBalanceByAmount(10.0);
		testValue = omar.balance();
		if (210 != testValue.intValue()) {
			System.out.println(
				"changeBalance expect 210. Result "+omar.balance());
		}

		omar.fee(10.0);
		testValue = omar.fee();
		if (10 != testValue.intValue()) {
			System.out.println("changeBalance expect 10. Results "+omar.fee());
		}

		omar.chargeFee();
		testValue = omar.balance();
		if (200 != testValue.intValue()) {
			System.out.println("chargeFee expect 200. Results "+omar.fee());
		}

		Double balanceBefore =  omar.balance();
		omar.applyInterest();
		testValue = omar.balance();
		if (!(testValue > balanceBefore)) {
			System.out.println("applyInterest did not increase bal.");
		}

		omar.minimumBalanceLimit(0.0);
		testValue = omar.minimumBalanceLimit();
		if (0 != testValue.intValue()) {
			System.out.println(
				"set minBal expect 0. Results "+omar.minimumBalanceLimit());
		}

		omar.printTransactions();

		//-------------------------     TEST CHECKING   ----------------------
		System.out.println("\n\nTesting Checking class methods ...");
		Checking annika = new Checking("Annika Haas",100.0);

		annika.chargePurchase(10.0);
		testValue = annika.balance();
		if (90 != testValue.intValue()) {
			System.out.println(
				"chargePurchase expect 90. Results "+annika.balance());
		}
		annika.cashWithdrawal(20.0);
		testValue = annika.balance();
		if (70 !=  testValue.intValue()) {
			System.out.println(
				"cashWithdrawal expect 70. Results "+annika.balance());
		}

		annika.makeDeposit(100.00);
		testValue = annika.balance();
		if (170 != testValue.intValue()) {
			System.out.println(
				"makeDeposit expect 170. Results "+annika.balance());
		}


		//----------------------     TEST Discover   ---------------------------
		System.out.println("\n\nTesting Discover class ...");
		Discover malcolm = new Discover("Malcolm Washington");
		Discover sofia = new Discover("Sofia Ramirez",100.0);

		sofia.maximumBalanceLimit(1000.0);
		testValue = sofia.maximumBalanceLimit();
		if (1000 != testValue.intValue()) {
			System.out.println(
				"set maxBal expect 1000. Results "+sofia.maximumBalanceLimit());
		}

		sofia.chargePurchase(10.0);
		testValue = sofia.balance();
		if (110 != testValue.intValue()) {
			System.out.println(
				"chargePurchase expect 110. Results "+sofia.balance());
		}

		sofia.makePayment(100.00);
		testValue = sofia.balance();
		if (10 != testValue.intValue()) {
			System.out.println(
				"makePayment expect 10. Results "+sofia.balance());
		}

	} // end main()

} // end class Main
