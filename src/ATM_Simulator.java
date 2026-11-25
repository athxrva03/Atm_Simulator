import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ATM_Simulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000.0;

        System.out.println("================================");
        System.out.println("    Welcome to Atm Simulator    ");
        System.out.println("================================");

        while(true){
            System.out.println("\n-------- Main Menu --------");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Balance Enquiry");
            System.out.println("4.Exit");

            System.out.print("Enter your choice (1-4) : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter amount to deposit : ");
                    double deposit = sc.nextDouble();
                    if( deposit <= 0){
                        System.out.println("Invalid Amount Entered !.");
                    }else{
                        balance += deposit;
                        System.out.printf("Rs. %f , Amount Deposited Sucessfully" , deposit);
                        System.out.println("\nAvailable Balance is : " + balance);
                    }
                    break;
                case 2:
                    System.out.print("Enter Amount to withdraw : ");
                    double withdraw = sc.nextDouble();
                    if(withdraw > balance){
                        System.out.println("Insufficient Balance!.");
                    }else{
                        balance -= withdraw;
                        System.out.printf("Rs. %f , Amount Withdrawal Sucessfully" , withdraw);
                        System.out.println("\nAvailable Balance is : " + balance );
                    }
                    break;
                case 3:
                    System.out.println("Available Balnce is : " + balance);
                    break;
                case 4:
                    System.out.println("Thanks for using ATM.");
                    return;
                default:
                    System.out.println("Invalid Choice!.");
            }
        }
    }
}
