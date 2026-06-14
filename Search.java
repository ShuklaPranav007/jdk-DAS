
public class Search{
    public static int linearSearch(int num[], int key){
        for (int i = 0; i<num.length;i++){
            if(num[i]==key){
                return i+1;
            }
        }
        return -1;
    }

    public static int getLargestValue(int num[]){
        int largest = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        return largest;
    }

    public static int BinarySearch(int num[],int key){
        int start = 0; 
        int end = num.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            // compariosn
            if(num[mid]==key){
                return mid+1;
            }
            if(num[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void reverseArray(int num[]){
        int first = 0;
        int last = num.length-1;
        while(first<last){
            int temp = num[last];
            num[last]= num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int num[]){
        for(int i =0;i<num.length;i++){
            int curr = num[i];
            for(int j = i+1;j<num.length;j++){
                System.out.print(("("+curr+","+ num[j]+")"));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        printPairs(num);
    }
}