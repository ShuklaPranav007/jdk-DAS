public class digits {

    public static int digCount(int num){
        // int count = 0;
        // while(num>0){
        //     num = num/10;
        //     count++;
        // }

        
        // digits with log
        int count = (int)(Math.log10(num))+1;
        return count;
    }
    public static void main(String args[]){
        int num = 138498;
        int sumcoutnt = digCount(num);
        System.out.println(sumcoutnt);
    }
}
