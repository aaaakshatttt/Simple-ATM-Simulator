import java.util.Scanner;
public class banking_system {
    static Scanner sc = new Scanner(System.in);
    static double balance = 100;//i initialized this varibale here so that we can use balance variable anywherre in the code not just inside main class


    public static void deposite(){
        System.out.print("Enter Deposit Amount = ");
        double deposit = sc.nextDouble();
        balance = balance + deposit;
        System.out.println("Updated Balance = $" + balance);

    }


    public static void checkbalance(){
        System.out.println("------------------------------");
        System.out.println("current balance = $" + balance);
        System.out.println("------------------------------");
    }



    public static void withdraw(){
        System.out.print("Enter Withdrawing Amount = ");
        double wamount = sc.nextDouble();
        if (wamount > balance){
            System.out.println("insufficient balance");
            double remainin = wamount-balance;
            System.out.println("add atleast " + remainin + " to withdraw " + wamount );

        }
        else if (wamount <= 0){
            System.out.println("invalid entry");
        }
        else{
            balance = balance - wamount;
            System.out.println("Withdrawing successful");
            System.out.println("balance left = $" + balance);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome To The Bank-----");
        while(true) {//wrapping the whole code in a while(true) will make it run infinite times rather than just once so user gets to decide whwn to exit
            System.out.println("1.Deposite");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Enter Choice = ");
            int choice = sc.nextInt();

            if (choice == 1) {
                deposite();
            } else if (choice == 2) {
                withdraw();
            } else if (choice == 3) {
                checkbalance();
            } else if (choice == 4) {
                System.out.println("Thankyou For Visiting!! Exited");
                break;//using this the code will be exited or else while will take over againa and loop will run again
            }
            else{
                System.out.println("invalid entry! try againn");
            }

        }
    }
    }