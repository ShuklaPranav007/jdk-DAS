public class Striver {

    public static int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i];
            }
        }
        return secondMax;
    }

    public static boolean sorted(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = {2,7,4,7,3,2,2,5,7 };
        // System.out.println(largestElement(nums));
        System.out.println(sorted(nums));
    }
}
