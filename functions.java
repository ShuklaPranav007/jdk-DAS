import java.util.*;

public class functions {
    public static void printHello(){
        System.out.println("fuck you bitch");
        return;
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int multiply(int x, int y){
        int prod =  x * y;
        return prod;
    }

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int calculateSum = sum(a,b);
        System.out.println("sum = "+ calculateSum);

        int calculateProd = multiply(a,b);
        System.out.println("prod = "+ calculateProd);
    }    
}
