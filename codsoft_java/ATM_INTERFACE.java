import java.util.Scanner;

public class ATM_INTERFACE {
    public static void main(String[] args) {
        int balance = 70000, withdraw, deposit;
        Scanner sc = new Scanner(System.in)
        ;
        while (true) {
            System.out.println("=======================ATM MACHINE!!!=======================");
            System.out.println("WELCOME......");
            System.out.println("Choose 1 for Withdraw ");
            System.out.println("Choose 2 for Deposit ");
            System.out.println("Choose 3 for Check Balance ");
            System.out.println("Choose 4 for EXIT ");
            System.out.print("Choose the operation you want to perform : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Money To Be Withdrawn : ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("==================Successful Transaction!!!==================");
                        System.out.println("Please Collect Your Money.");
                        System.out.println("Current Balance is :" + balance);
                        System.out.println("Thank You!!!.....");
                        System.out.println("==============================TRANSACTION END=============================");
                    } else {
                        System.out.println("====================Transaction Failed!!!==================");
                        System.out.println("Insufficient Balance......");
                        System.out.println("ERROR : Please Enter a Valid Amount");
                        System.out.println("==============================TRANSACTION END=============================");

                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter Money To BE Deposited : ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("==================Transaction Successful!!!==================");
                    System.out.println("Your Money Has Been Successfully Deposited.");
                    System.out.println("Current Balance Is : " + balance);
                    System.out.println("Thank You!!!......");
                    System.out.println("================================TRANSACTION END===============================");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Current Balance : " + balance);
                    System.out.println("Thank You!!!......");
                    System.out.println("================================TRANSACTION END===============================");
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}
