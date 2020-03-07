package A;
import java.util.*;
import java.util.ArrayList;
/**
 * Bank class
 * @author mohammed yasser
 *
 */
public class Bank {
	/**
	 * Attributes 
	 */
Scanner s=new Scanner(System.in);
private String name,phone,Address;
private ArrayList<Account> acc=new ArrayList<Account>(12);
private ArrayList<Client> Clients=new ArrayList<Client>(12);
/**
 * Parameterized constructor
 * @param n  Name of the Bank
 * @param p	Phone Number of the Bank
 * @param A	Address of the Bank
 */
public Bank(String n,String p,String A) {
name=n;
phone=p;
Address=A;
}
/**
 * Bank's Name setter
 * @param n Name of the Bank
 */
public void Set_name(String n) {name=n;}
/**
 * Bank's Phone setter
 * @param p Phone Number of the Bank
 */
public void Set_phone(String p) {phone=p;}
/**
 * Bank's Address setter
 * @param A Address of the Bank
 */
public void Set_Address(String A) {Address=A;}
/**
 * Bank's Name getter
 * @return Bank's Name
 */
public String get_name() {return name;}
/**
 * Bank's Phone getter
 * @return Bank's Phone
 */
public String get_phone() {return phone;}
/**
 * Bank's Address getter
 * @return Bank's Address
 */
public String get_address() {return Address;}
/**
 * Method to AddClient
 * @param c Client's Object
 * @param a Account's Object
 */
public void Addclient(Client c,Account a ) {
	Clients.add(c);
	acc.add(a);
}
/**
 * Method to display All existing Clients and Accounts
 */
public void Display() {
	int Ch;
	System.out.println("Select '1' to Display existing Clients and thier Accoutns");
	System.out.println("Select '2' to Display existing Accounts only");
	Ch=s.nextInt();
	if(Ch==1) {
	for(int i=0;i<Clients.size();i++) {
		System.out.println(Clients.get(i).toString());
	}}
	else if(Ch==2) {
		for(int i=0;i<acc.size();i++) {
			System.out.println(acc.get(i).toString());
	}
	}
	else
	{
		System.out.println("invalid input");
	}
	
}
/**
 * Function to return Account of specific index
 * @param index number of index of Account
 * @return	Account in specific index
 */
public Account getacc(int index) {
	return acc.get(index);
}
/**
 * Function to count number of elements of the Account arraylist
 * @return	Size of acc array list
 */
public int getaccnumbers() {return acc.size();}
}
