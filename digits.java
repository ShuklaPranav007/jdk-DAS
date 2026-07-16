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

    public static int revNum(int num){
        int rev = 0;
        while(num>0){
            int lastdig = num%10;
            rev = (rev*10)+lastdig;
            num = num/10;
        }
        return rev;
    }
    public static void main(String args[]){
        int num = 13849800;
        int revDig = revNum(num);
        System.out.println(revDig);
    }
}
