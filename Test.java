package A;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		String Answer;
		Scanner input=new Scanner(System.in);
		String Cname,Caddress,Bname,Baddress,Bphone,Aaccnumber,Atype;
		int Cphone,CNationalID,CCommercialID,Abalance,Choice;
		char Bchoice;
	System.out.print("enter Bank's name :");
	Bname=input.next();
	System.out.print("enter Bank's Address :");
	Baddress=input.next();
	System.out.print("enter Bank's Phone :");
	Bphone=input.next();
	Bank b=new Bank(Bname,Bphone,Baddress);
	System.out.println("Welcome to the "+Bname+"'s System ");
	do {
	System.out.println("select one of these options: ");
	System.out.println("1.enter 'A' to Add Normal/Commercial Client.");
	System.out.println("2.enter 'D' to Display all existing Clients and thier Accounts.");
	Bchoice=input.next().charAt(0);
	switch(Bchoice) {
	case 'A':{
		System.out.println("Adding a new client...");
		System.out.println("select which Client you want to add");
		System.out.println("1.Normal Client");
		System.out.println( "2.Commertial Client");
		Choice=input.nextInt();
		switch(Choice) {
		case 1:{
			System.out.println("creating a Normal Client Account...");
			System.out.print("enter Normal Client name :");
			Cname=input.next();
			System.out.print("enter Normal Client Address :");
			Caddress=input.next();
			System.out.print("enter Normal Client Phone :");
			Cphone=input.nextInt();
			System.out.print("enter Normal Client National ID :");
			CNationalID=input.nextInt();
			System.out.println("enter type of the Account (special or Normal)");
			Atype=input.next();
			System.out.print("enter Normal Client Balance :");
			Abalance=input.nextInt();
			System.out.print("enter Normal Client Account Number :");
			Aaccnumber=input.next();
			//selecting Account Type
			if(Atype.equalsIgnoreCase("Normal")) {Account acc=new Account(Abalance,Aaccnumber);
			Client c=new Client(Cname,CNationalID,Caddress,Cphone,acc);
			b.Addclient(c, acc);}
			else if (Atype.equalsIgnoreCase("Special")) {
			SpecialAccount sa=new SpecialAccount(Abalance,Aaccnumber);
			Client c=new Client(Cname,CNationalID,Caddress,Cphone,sa);
			b.Addclient(c, sa);
			}
			break;}//end of case 1
		case 2:{System.out.println("creating a Commercial Client Account...");
		System.out.print("enter Commercial Client name :");
		Cname=input.next();
		System.out.print("enter Commercial Client Address :");
		Caddress=input.next();
		System.out.print("enter Commercial Client Phone :");
		Cphone=input.nextInt();
		System.out.print("enter Commertial Client Commercial ID :");
		CCommercialID=input.nextInt();
		System.out.println("enter type of the Account (special or Normal)");
		Atype=input.next();
		System.out.print("enter Commercial Client Balance :");
		Abalance=input.nextInt();
		System.out.print("enter Commercial Client Account Number :");
		Aaccnumber=input.next();
		//selecting Account Type
		if(Atype.equalsIgnoreCase("Normal")) {Account acc=new Account(Abalance,Aaccnumber);
		Client c=new Client(Cname,CCommercialID,Caddress,Cphone,acc);
		b.Addclient(c, acc);}
		else if (Atype.equalsIgnoreCase("Special")) {
		SpecialAccount sa=new SpecialAccount(Abalance,Aaccnumber);
		Client c=new Client(Cname,CCommercialID,Caddress,Cphone,sa);
		b.Addclient(c, sa);
		}
		break;
		}//end of case 2
		default :
			System.out.println("Invalid input");
			break;
		}//end of switch 2
		break;
		
	}
	case 'D':
		String answer;
		b.Display();
		input.nextLine();
		System.out.println("Do you want to perform withdraw or deposit ?");
		answer=input.next();
		System.out.println("enter account number ");
		String Accnum=input.next();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("enter W for withdraw and D for deposit ");
			char ans;
			ans=input.next().charAt(0);
			switch(ans) {
			case 'W':
			case 'w':
					for(int i=0;i<b.getaccnumbers();i++) {
						if(Accnum.equals(b.getacc(i).accountnumber)) {
							System.out.println("enter amount of money to be withdrawn");
							float value=input.nextFloat();
							b.getacc(i).withdraw(value);
						}
						else
							System.out.println("this account number doesn't exist");

					}
				break;
			case 'D':
			case 'd':
				for(int i=0;i<b.getaccnumbers();i++) {
					if(Accnum.equals(b.getacc(i).accountnumber)) {
						System.out.println("enter amount of money to be deposited ");
						float value=input.nextFloat();
						b.getacc(i).deposit(value);
					}
					else
						System.out.println("this account number doesn't exist");
				}
				break;
				
			}//end of switch 3
			
		}//end of if
		break;
	default :
		System.out.println("Invalid input");
		break;

}
	System.out.println("Do you want to perform another operation ?");
	Answer=input.next();
	}//end of do 
		while(Answer.equalsIgnoreCase("yes"));
		input.close();
	}
	}
