
import java.util.Scanner;

class atm{
    float balance;
    int PIN=5634;

    void checkpin(){
        System.out.println("Enter the PIN number ");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();


        if(pin==PIN){
            menu();

        }
        else{
            System.err.println("Enter a valid PIN number ");
            
        }
    }

    void menu(){
        System.out.println("ENTER YOUR CHOICE  ");
        System.out.println("1.CHECK BALANCE ");
        System.out.println("2.WITHDRAW MONEY ");
        System.out.println("3.DEPOSIT MONEY");
        System.out.println("4.EXIT ");

        Scanner sc =new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1){
            checkbalance();
        }
        else if(opt==2){
            withdraw();
        }
        else if(opt==3){
            deposit();
        }
        else if(opt==4){
            exit();
        }
        else{
            System.out.println("ENTER A VALID OPTION ");
        }
        


    }

    void checkbalance(){
        System.out.println("BALANCE "+balance);
        menu();
    }
    void withdraw(){
        System.out.println("Enter the amount to be withdrawn ");
        Scanner sc=new Scanner(System.in);
        float wamount=sc.nextFloat();
         if(wamount>balance){
            System.err.println("INSUFFICIENT FUNDS");
         }
         else{
            System.out.println("MONEY WITHDRAWL SUCCESFULLY ");
         }
        balance=balance-wamount;
        menu();
    }

    void deposit(){
        System.out.println("Enter the amount to be deposited ");
        Scanner sc=new Scanner(System.in);
        float damount=sc.nextFloat();

        System.out.println("MONEY DEPOSITED SUCCESFULLY");
        balance=balance+damount;
        menu();
    }

    void exit(){
        return;
    }
}

public class AtmMachine{
    public static void main(String[] args) {
        atm obj1=new atm();
        obj1.checkpin();


    }
}