package A;
/**
 * Class to creat an Normal Bank Account
 * @author Ali mamdouh
 *
 */
public class Account {
protected float balance; protected String accountnumber;
/**
 * Constructor to initialize Client's Balance and Account number
 * @param b 	Client's Balance
 * @param an	Client's Accountnumber
 */
	public Account(int b,String an) {
		balance=b;
		accountnumber=an;
	}
	/**
	 * Default constructor
	 */
	public Account() {}
	/**
	 * Account's balance setter
	 * @param b balance value
	 */
	public void set_balance(int b) {balance=b;}
	/**
	 * Account's AccountNumber
	 * @param an AccountNumber values
	 */
	public void set_accountnumber(String an) {accountnumber=an;}
	/**
	 * Account's Balance getter
	 * @return	Balance value
	 */
	public float get_balance() {return balance;}
	/**
	 * Account's AccountNumber getter
	 * @return	AccountNumber 
	 */
	public String get_accountnumber() {return accountnumber;}
	/**
	 * Override for toString() 
	 */
	public String toString() { return String.format("balance : "+balance+" account number : "+accountnumber);}
	/**
	 * function to withdraw a value
	 * @param v value to be withdrawn
	 */
	public void withdraw(float v) {
	if(v>balance)
		System.out.println("can't do this operation because balance= "+ balance + "withdraw= "+v);
	else
		balance-=v;
		}
	/**
	 * function to deposit a value
	 * @param v	value to be deposited 
	 */
	public void deposit(float v) {balance+=v;}
}
