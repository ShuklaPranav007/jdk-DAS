import  java.util.LinkedList;

public class JCF_LL{
    public static void main(String[] args) {
        // create
        LinkedList <Integer> ll = new LinkedList<>();

        // add
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(1);
        System.out.println(ll);
        
        // remove
        ll.remove();
        System.out.println(ll);
    }
}