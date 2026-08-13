import java.util.*;

public class Strings {

    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i =0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();  
        System.out.println(isPalindrome(str));

        // length() is used in srings as function 
        // arr.length is used a property in array
        // System.out.println(name.length());

    }
}
