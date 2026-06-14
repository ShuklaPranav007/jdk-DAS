
public class Search {

    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int getLargestValue(int num[]) {
        int largest = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static int BinarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // compariosn
            if (num[mid] == key) {
                return mid + 1;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int num[]) {
        int first = 0;
        int last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }

    public static void subArray(int num[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                maxSum = Math.max(maxSum,sum);
                minSum = Math.min(minSum,sum);
                System.out.print("sum : "+ sum);
                ts++;

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray : "+ ts);
        System.out.println("maxsub :"+ maxSum);
        System.out.println("minsum: "+ minSum);
    }

    // public static void printPairs(int num[]) {
    //     for (int i = 0; i < num.length; i++) {
    //         int curr = num[i];
    //         for (int j = i + 1; j < num.length; j++) {
    //             System.out.print(("(" + curr + "," + num[j] + ")"));
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        int num[] = {12,-3,64,87,-23,7,91};
        subArray(num);
    }
}
