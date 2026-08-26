
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

    public static int firtsOcc(int arr[], int key, int i){
        if(i== arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firtsOcc(arr, key, i+1);
    }

    public static int lastOcc(int arr[], int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int countingTiles(int n){

        if(n==1 || n==0){
            return 1;
        }
        // vertically
        int vert = countingTiles(n-1);

        // horizontal
        int hori = countingTiles(n-2);


        return vert+hori;
    }

    public static void removeDuplicateString(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx ==str.length()){
            System.out.println(newStr);
            return ;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicateString(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicateString(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "anpanaksnddncbvbc";
        removeDuplicateString(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
