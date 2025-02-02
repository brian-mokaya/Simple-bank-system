package bank;
import java.util.*;

class gCustomer{
    String CustomerID, Name, Contact;
    int Age;

    Scanner scanCustDetails = new Scanner(System.in);

    String AccNo;
    String AccType;

    Account acc = new Account("NOT Created","NOt created",0);


    // Customer details form
    void insertDetail(){

        System.out.print("Enter the customer id:");
        String ID = scanCustDetails.next();
        System.out.println("Enter your name:");
        String name = scanCustDetails.next();
        System.out.println("Enter your phone number:");
        String cont = scanCustDetails.next();
        System.out.println("Enter your age:");
        int ag = scanCustDetails.nextInt();
        System.out.println("Enter your account number:");
        String AN = scanCustDetails.next();
        System.out.println("Enter your account type:");
        String AT = scanCustDetails.next();

        CustomerID = ID;
        Name = name;
        Contact = cont;
        Age = ag;
        acc.AccountType = AT;
        acc.AccountNo = AN;

    }

    void ShowDetails(){
        System.out.println(CustomerID + "\n" + Name + "\n" + Age + "\n" + Contact + "\n" + acc.AccountNo + "\n" + acc.AccountType) ;
        System.out.println("Account Successfully created");
    }

//  Withdraw method
    void customerWithdraw(){
        acc.withdraw();
    }

//   Deposit method
void customerDeposit(){
    acc.deposit();
}



    void OPs(){
        System.out.println("Which operation do you want?");
        System.out.println("1. Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check balance");
        int Operation = scanCustDetails.nextInt();
        switch(Operation){
            case 1: acc.withdraw();
                break;
            case 2: acc.deposit();
            default:
                System.out.println("Choose the right Operation");
        }

    }
}

