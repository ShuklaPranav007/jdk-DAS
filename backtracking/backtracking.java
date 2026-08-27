
public class backtracking {

    public static void changeArr(int arr[], int i, int val){
        if(i == arr.length){
            printArray(arr);
            return;
        }

        arr[i]= val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void findSubset(String str, int i, String newStr){
        if(i== str.length()){
            System.out.println(newStr);
            return;
        }

        findSubset(str, i+1, newStr+str.charAt(i)); //yes choice
        findSubset(str, i+1, newStr); //no choice
    }



    
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, 0, "");
    }
}
