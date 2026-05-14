import java.util.*;

public class app {
    private int balance  = 15000;

    public void setBalance(int amt){
        balance += amt;
    }

    public int getBalance(){return balance;}

    public static void main(String[] args) {
       app acc = new app();
       acc.setBalance(500);
       System.out.println("balance :"+ acc.getBalance());
    }
}