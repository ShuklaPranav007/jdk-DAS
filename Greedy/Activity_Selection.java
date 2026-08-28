
import java.util.ArrayList;


public class Activity_Selection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        
        int maxAction = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int lastEnd = end[0];
        ans.add(0);
        for(int i = 1;i< end.length; i++){
            if(start[i]>=lastEnd){
                maxAction++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activity : "+ maxAction);
        for(int j = 0 ; j<ans.size();j++){
            System.out.print("A" + ans.get(j) + " ");
        }
        System.out.println();

    }
}
