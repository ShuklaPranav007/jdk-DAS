import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection {
    
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // sorting
        int activities[][]= new int[start.length][3];
        for(int i = 0; i<start.length;i++){
            activities[i][0]= i;
            activities[i][1]= start[i];
            activities[i][2]= end[i];
        }
        // sort 2D array lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        
        int maxAction = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int lastEnd = activities[0][2];
        ans.add(activities[0][0]);
        for(int i = 1;i< end.length; i++){
            if(start[i]>=lastEnd){
                maxAction++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activity : "+ maxAction);
        for(int j = 0 ; j<ans.size();j++){
            System.out.print("A" + ans.get(j) + " ");
        }
        System.out.println();

    }
}
