
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
   
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i= 0;i<n;i++){
            int minIdx = i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[minIdx]){

                    minIdx = j;
                }
            }
            swapArr(arr, i, minIdx);
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i= 1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    } 
    

     public static void printArray(int arr[]) {
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {7,3,8,2,6,4,5};
        // bubbleSort(arr);
        insertionSort(arr);
        printArray(arr);
    }
}
