import java.util.Scanner;

public class acount {
    Scanner choiceinput = new Scanner(System.in);

    private String name;
    private long ID;
    private int password;
    private double balance;
    bank myBank;

    public acount(){
        this.name = "no name";
        this.ID = 0000000000;
        this.password = 0000;
        this.balance = 0.00;
    }
    public acount(String name,long ID,int password,double balance){
        this.name = name;
        this.ID = ID;
        this.password = password;
        this.balance = balance;
    }
    
    public String getName(){
        return this.name;
    }
    public long getID(){
        return this.ID;
    }
    public int getPassword(){
        return this.password;
    }
    public double getBalance(){
        return this.balance;
    }

    public void targetedBank(bank myBank){
        this.myBank = myBank;
    }

    public void Reduce(double sumOfMony){
        this.balance = this.balance - sumOfMony;
    }
    public void Withdrawal(double sumOfMony){
        Reduce(sumOfMony);
        System.out.println("you have Withdrawed " + sumOfMony);
        System.out.println("your balance is " + this.balance);
    }

    public void AddMony(double sumOfMony){
        this.balance = this.balance + sumOfMony;
    }
    public void deposit(double sumOfMony){
        AddMony(sumOfMony);
        System.out.println("you have deposited " + sumOfMony);
        System.out.println("your balance is " + this.balance);
    }

    public void Transfer(long otherAccountID){
        System.out.println("how mutch mony to transfare");
        double mony = choiceinput.nextDouble();
        myBank.thirdParty(otherAccountID, mony);
        Reduce(mony);
    }


    public String getData(){
        String data = name +ID+password+balance;
        return data;
    }

    public void loginOptions(){
        System.out.println("welcome back ," + this.getName());

        System.out.println("1- View Balance");
        System.out.println("2- Withdrawal");
        System.out.println("3- Cash deposit");
        System.out.println("4- Transfer Funds");
        System.out.println("5- exit");


    }

    public void choiceOptions(){

        int choice = 111;

        while (choice != 5) {
            choice = choiceinput.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("your balance is " + this.balance + "$");     
                    break;               
                case 2:
                    System.out.println("how mutch would you want to Withdrawal ");
                    Withdrawal(choiceinput.nextDouble());
                    break;
                case 3:
                    System.out.println("how mutch would you want to deposit ");
                    deposit(choiceinput.nextDouble());
                    break;
                case 4:
                    System.out.println("enter other account's id ");
                    Transfer(choiceinput.nextLong());
                    break;
                case 5:
                    break;
            }
            System.out.println("");
            loginOptions();
        }

    }



}