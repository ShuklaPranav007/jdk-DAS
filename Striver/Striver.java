public class Striver {

    public static int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>max){
                secondMax = max;
                max = nums[i];
            }else if(nums[i]>secondMax && nums[i]!= max){
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
    public static void sorted(){}


    public static void main(String[] args) {
        int nums[] = { 7, 3, 6, 5,20,89, 1 };
        System.out.println(largestElement(nums));
    }
}
