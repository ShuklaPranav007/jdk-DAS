
public class demo{

    public static void recursion(int num){
        if(num==0){
            return;
        }
        recursion(num-1);
        System.out.println(num);
    }
    public static void main(String[] args){
        recursion(5);
    }
}