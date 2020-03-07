package A;
/**
 * Class to create Special Account
 * @author Ali mamdouh
 *
 */
class SpecialAccount extends  Account {
/**
 * parameterized Constructor
 * @param b		Account's balance
 * @param an	Account's AccountNumber
 */
	public SpecialAccount(int b, String an) {
		super(b, an);	}
	/**
	 * Override of Withdraw method 
	 * @param v value to be withdrawn
	 */
	public void withdraw(float v) { 
		if(v>1000)
				System.out.println("you entered a value greater than 1000 ");
		else
			{
				balance-=v;
				System.out.println("balance= "+balance);
			}
	}
}
