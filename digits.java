public class digits {

    public static int digCount(int num){
        int rem = 0;
        int count = 0;
        while(num>0){
            rem = num%10;
            num = num/10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        int num = 138498;
        int sumcoutnt = digCount(num);
        System.out.println(sumcoutnt);
    }
}
