package A;
/**
 * Class Commercial Client
 * @author mariem hassan
 *
 */
public class CommercialClient extends Client {
    long ComercialID;
    long NationalID=000000000;
    /**
     * Default Constructor to initialize the attributes
     */
    public CommercialClient() {
    	super();
        System.out.print("Enter your Commercialid :");
        ComercialID=input.nextInt();
    }
    /**
     * CommercialID setter
     * @param ComercialID to set a value for CommercialID
     */
    public void set_ComercialID(int ComercialID) {this.ComercialID=ComercialID;}
    /**
     * CommercialID getter
     * @return CommercialID's value
     */
    public long get_ComercialID() {return ComercialID;}
    /**
     * NationalID getter
     * @return	NationalID which is zeros
     */
    public long get_NationalID() {return NationalID;}
    /**
     * Parameterized Constructor
     * @param n Commercial Client's name
     * @param comid	Commercial Client's CommercialID
     * @param addr	Commercial Client's Address
     * @param tel	Commercial Client's Phone number
     * @param acc	Commercial Client's Account information
     */
    public CommercialClient(String n,long comid,String addr,long tel,Account acc) {
        super(n,0000000000,addr,tel, acc);
        ComercialID=comid;
    }
    /**
     * Override to toString() to Display Commercial Client's information
     */
    public String toString() {return String.format("name :"+name +", address:"+address+" ,phone:"+phone+" ,Commecial id: "+ComercialID+" ,National ID: "+NationalID+" ,balance :"+a.balance+" Account number:"+a.accountnumber);}

}