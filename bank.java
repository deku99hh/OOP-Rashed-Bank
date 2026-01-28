import java.util.ArrayList;
import java.util.List;

public class bank {

    private int acountsNum = 0;
    private long banksBalance = 99999999;

    ArrayList<acount> accountsList = new ArrayList<>();


    public bank() {
        // Imaginary acounts
        accountsList.add(new acount("user1", 1, 1234, 5000.0));
        accountsList.add(new acount("user2",2, 5566, 1200.0));
        accountsList.add(new acount("user3",3, 1111, 10000.0));

                        // for (acount c : accountsList) {
                        //     System.out.println(c.getData());
                        // }

    }

    public acount login(long ID,int password){

        for (acount acc : accountsList) {

            if (ID == acc.getID() && password == acc.getPassword()) {
                
                System.out.println("");
                System.out.println("login successfuly");

                return acc;

            }else continue;


        }

        // System.out.println("wrong data");
        return null;
    }

    public void thirdParty(long id, double sumOfMony){
        if (searchForTheAcount(id) != null) {
            
            searchForTheAcount(id).AddMony(sumOfMony);
            System.out.println("transfare done");

        } else System.out.println("eror");
    }
    public acount searchForTheAcount(long id){
        for (acount account : accountsList) {
            if (id == account.getID()) {
                
                return account;

            }else continue;
        }
        System.out.println("this account is not real");
        return null;
        
    }















}
