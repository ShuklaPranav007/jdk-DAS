
public class recursion {
    public static void printDec(int n ){
        if(n==1){
            System.out.print(n +  " ");
            return;
        }
        printDec(n-1);
        System.out.print(n + " ");
    }


    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);
    }

    public static int  sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    public static void main(String[] args) {
        // printDec(10);
        // System.out.println(fact(4));
        System.out.println("sum : "+ sumRec(10));
    }
}
