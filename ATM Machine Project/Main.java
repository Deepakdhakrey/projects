import java.util.*;
public class Main{
    
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        AtmOperationInterf op = new AtmOperationImpl();
        
        int atmnumber = 12345;
        int atmpin = 123;
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm Number : ");
        int atmNumber = scn.nextInt();
        System.out.print("Enter Atm Pin: ");
        int Pin = scn.nextInt();

        if(atmnumber == atmNumber && atmpin == Pin){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch = scn.nextInt();
                if(ch == 1){
                    op.viewBalance();
                }

                else if(ch == 2){
                    System.out.println("Enter amount to withdraw");
                    double withdrawAmount = scn.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }

                else if(ch == 3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount = scn.nextDouble(); // 1000
                    op.depositAmount(depositAmount);
                }
                else if(ch == 4){
                    op.viewMiniStatement();
                }

                else if(ch == 5){
                    System.out.println("Collect your ATM Card\n Thank for using ATM Machine");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Invalid Atm Number or Pin");
            System.exit(0);
        }
    }
}