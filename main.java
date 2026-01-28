import java.util.Scanner;

import javax.swing.text.View;

public class main {
    public static void main(String[] args){

        bank rashed = new bank();
        Scanner input = new Scanner(System.in);
        acount userAcount;


        System.out.println("wlcome to Rashed bank");
        

        System.out.println("enter your id");
        long id = input.nextLong();

        System.out.println("enter your password");
        int password = input.nextInt();

        userAcount = rashed.login(id, password);
        if (userAcount != null) {
            
            userAcount.targetedBank(rashed);

            userAcount.loginOptions();
            
            userAcount.choiceOptions();
            
            
            








        }else System.out.println("wrong data");

    }
}
