package A;
import java.util.Scanner;
/**
 * Client Class
 * @author Mariem hassan
 *
 */
public class Client {
	
    Scanner input=new Scanner(System.in);
    String name,address;
    long phone,Nationalid;
    Account a=new Account();
    /**
     * this client method to describe the client name,id,address,phone,balance and account number
     * @param n the first String
     * @param id the First long
     * @param asddrr is the second String
     * @param tel is the second long
     * @param acc is the account attributes */
    public Client(String n,long id,String addr,long tel,Account acc) {
        name=n;
        Nationalid=id;
        address=addr;
        phone=tel;
        a=acc;
    }
    /** this method is to take input from user 
     * @param it takes client name
     * @param it takes client address
     * @param it takes client phone
     * @param it takes client national id
     * @param it takes client balance
     * @param it takes client number */
    public Client() {
    	System.out.print("enter your name : ");
    	name=input.next();
    	System.out.println("");
    	System.out.print("Eneter yoor address:");
    	address=input.next();
    	System.out.println("");
    	System.out.print("Enter your phone:");
    	phone=input.nextInt();
    	System.out.print("");
    	System.out.print("Enter your National id:");
    	Nationalid=input.nextInt();
        System.out.print("enter "+name+"'s balance : ");
        int b=input.nextInt();
        System.out.print("enter "+name+"'s Account number : ");
        String accnum=input.next();
        a=new Account(b,accnum);

    }
    /**
     * To set name for Client
     * @param n	Client's name
     */
    public  void set_name(String n) {name=n;}
    /**
     * To set Address of Client
     * @param a	Client's Address
     */
    public void set_adress(String a) {address=a;}
    /**
     * To Set phone number to Client
     * @param ph	Client's phone number
     */
    public void set_phone(int ph) {phone=ph;}
    /**
     * To set NationalID for Client
     * @param National	Client's NationalID
     */
public void set_Nationalid(int National) {Nationalid=National;}
/**
 * To get Client's name
 * @return	Client's name
 */
public String get_name() {return name;}
/**
 * To get Client's Address
 * @return	Client's Address
 */
public String get_address() {return address;}
/**
 *  To get Client's phone number
 * @return	Phone number
 */
public long get_phone() {return phone;}
/**
 *  To get Client's NationalID
 * @return	NationalID
 */
public long get_Nationalid() {return Nationalid;}
/** this  method to print the client info 
 * Override function
     */
public String toString() { return String.format("name :"+name +" ,address:"+address+" ,phone:"+phone+" ,Nationalid: "+Nationalid+" ,balance :"+a.balance+" ,Account number:"+a.accountnumber);
}
}