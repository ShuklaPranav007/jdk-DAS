
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

    public static int fibo(int n){
        if(n==0 || n ==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static boolean  checkSortArray(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return checkSortArray(arr, i+1);
    }







    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        // printDec(10);
        // System.out.println(fact(4));
        // System.out.println("sum : "+ sumRec(10));
        // System.out.println(fibo(25));
        System.out.println(checkSortArray(arr, 0));
    }
}
