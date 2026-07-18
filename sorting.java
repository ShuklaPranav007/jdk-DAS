
public class sorting {

    public static void swapArr(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0;i<n-1;i++){
            boolean swapped = false;
            for(int j = 0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swapArr(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped){break;}
        }
    }

    public static void printArray(int arr[]) {
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,7,2};
        bubbleSort(arr);
        printArray(arr);
    }
}
