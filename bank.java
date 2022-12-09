import java.util.Scanner;
import java.lang.Math;

class Account{

    String customer_name = new String();
    String account_type = new String();
    int account_number;
}
class Current extends Account{

    int balance;
    Scanner s = new Scanner(System.in);

    Current (String type){
        System.out.println("Enter customer name and account number:");
        customer_name = s.next();
        account_number = s.nextInt();
        account_type = type;
        balance = 0;
    }
    void deposit (){
        System.out.println("Enter the amount to deposit:");
        balance += s.nextInt();

        if (balance < 500){
            System.out.println("500 INR service charge. Account balance falls below minumum required balance 500 INR");
        }
    }
    void display (){
        System.out.printf("\nName: %s\nAccount number: %d\nAccount type: %s\nBalance: %d", customer_name, account_number, account_type, balance);
    }
    void withdraw (){
        int with;

        System.out.println("Enter the amount to withdraw:");
        with = s.nextInt();

        if (with > balance){
            System.out.println("Balance is less than withdraw amounth!");
        }
        else{
            balance -= with;
        }
        if (balance < 500){
            System.out.println("500 INR service charge. Account balance falls below minumum required balance 500 INR");
        }
    }

}
class Savings extends Account{

    double balance;

    Scanner s = new Scanner(System.in);

    Savings (String type){
        System.out.println("Enter customer name and account number:");
        customer_name = s.next();
        account_number = s.nextInt();
        account_type = type;
        balance = 0;
    }
    void deposit (){
        System.out.println("Enter the amount to deposit:");
        balance += s.nextInt();
    }
    void display (){
        System.out.printf("\nName: %s\nAccount number: %d\nAccount type: %s\nBalance: %.2f\n", customer_name, account_number, account_type, balance);
    }
    void withdraw (){
        int with;

        System.out.println("Enter the amount to withdraw:");
        with = s.nextInt();
        if (with>balance){
            System.out.println("Balance is less than withdraw amounth!");
        }
        else{
            balance -= with;
        }
        if (balance < 500){
            System.out.println("500 INR service charge. Account balance falls below minumum required balance 500 INR");
        }
    }
    void interest(){
        int years, no;
        double rate, total;

        System.out.println ("Enter time in years, percentage of interest and number of times per year:");
        years = s.nextInt();
        rate = s.nextDouble();
        no = s.nextInt();
        total = balance*(Math.pow((1+(rate/100)/no), (no*years)));
        System.out.println ("Interest is= "+total);
        balance+=total;
    }
}
class Bank{
    public static void main(String[] args) {
        
        int choice, x=0;
        String type = new String();
        Scanner s = new Scanner(System.in);

        System.out.printf("\n1:Create current account\n2:Create savings account\n");
        choice = s.nextInt();

        switch (choice){

            case 1:type = "Current";
            Current c1 = new Current(type);

            while (x==0){
                
                System.out.printf("\n1:Deposit\n2:Withdraw\n3:Display balance\n4:Exit\n");
                choice = s.nextInt();
    
                switch (choice){

                    case 1:c1.deposit();
                    c1.display();
                    break;

                    case 2:c1.withdraw();
                    c1.display();
                    break;

                    case 3:c1.display();
                    break;

                    case 4:x=1;
                    break;

                    default:System.out.println("Enter a valid input!");
                    break;
                }
            }
            break;

            case 2:type = "Savings";
            Savings s1 = new Savings(type);

            while (x==0){
                
                System.out.printf("\n1:Deposit\n2:Withdraw\n3:Display balance\n4:Check interest\n5:Exit\n");
                choice = s.nextInt();

                switch (choice){

                    case 1:s1.deposit();
                    s1.display();
                    break;

                    case 2:s1.withdraw();
                    s1.display();
                    break;

                    case 3:s1.display();
                    break;
                    
                    case 4:s1.interest();
                    s1.display();
                    break;

                    case 5:x=1;
                    break;

                    default:System.out.println("Enter a valid input!");
                    break;
                }
            }
            break;

            default:System.out.println("Enter a valid input!");
        }
        s.close();
    }
}
