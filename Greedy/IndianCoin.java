
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,1000,2000};
        int amount = 2458;
        int count = 0;
        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i<coins.length; i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }
        System.out.println("coins : "+ count +" "+ ans );
        
    }
}
