public class acount {

    String name;
    long ID;
    int password;
    double balance;

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
    
    // public String getName(){
    //     return this.name;
    // }
    // public long getID(){
    //     return this.ID;
    // }
    // public int getPassword(){
    //     return this.password;
    // }
    // public double getBalance(){
    //     return this.balance;
    // }

    public String getData(){
        String data = name +ID+password+balance;
        return data;
    }







}