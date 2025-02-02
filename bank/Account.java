package bank;
import java.util.*;

class Account{
    String AccountNo, AccountType;
    float AccountBalance ;
    Scanner scan = new Scanner(System.in);

    Account (String AccountNo, String AccountType, float AccountBalance){
        this.AccountNo = AccountNo;
        this.AccountType = AccountType;
        this.AccountBalance = AccountBalance;
    }

    // deposit method
    void  deposit(){
        System.out.print("How much do you wish to deposit? ");
        float amountDeposited = scan.nextFloat();
        AccountBalance += amountDeposited;
        System.out.println("Your new balance is "+ AccountBalance);
    }

    // withdraw method
    void withdraw() {
        System.out.print("How much do you want to withdraw? ");
        float withdrawAmount = scan.nextFloat();

        if (AccountBalance<withdrawAmount){
            System.out.println("Insufficient Balance");
        }else{
            AccountBalance -= withdrawAmount;
            System.out.println("withdrawal successful");
            System.out.println("Your new balance is "+ AccountBalance);

        }
//        scan.close();
    }

}
