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

    public static int factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int biCoeff = n_fact/(r_fact*nmr_fact);
        return biCoeff;
    }

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int calculateSum = sum(a,b);
        // System.out.println("sum = "+ calculateSum);

        // int calculateProd = multiply(a,b);
        // System.out.println("prod = "+ calculateProd);
    
        int fact = factorial(7);
        System.out.println(fact);
        
        int binoCoeff =  binCoeff(5,4);
        System.out.println(binoCoeff);

    }   

}
