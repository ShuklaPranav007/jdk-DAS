import java.util.*;

public class array {
    public static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i] += 1;
        }
    }

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int marks[] = {13,53,67};
    update(marks);

    // print 
    for(int i = 0;i<marks.length;i++){
           System.out.print(marks[i]+ " ");
        }
        System.out.println();
    } 
}
