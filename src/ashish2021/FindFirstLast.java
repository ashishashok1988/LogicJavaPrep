package ashish2021;

/*
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

    If target is not found in the array, return [-1, -1].

    You must write an algorithm with O(log n) runtime complexity.
 */
public class FindFirstLast {

    public static void main(String args[]) {
        int[] nums = {5,7,7,8,8,10};
        int target = 10;

        
        System.out.println(searchRange(nums, target)[0] + " " + searchRange(nums, target)[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        range[0] = findLeftMostIndex(nums, target);
        range[1] = findRightMostIndex(nums, target);
        return range;
    }

    public static int findLeftMostIndex(int[] nums, int target) {
       int index = -1;
       int start = 0;
       int end = nums.length-1;
       
       while(start <= end) {
           int mid = start + (end-start)/2;
           if(nums[mid]>=target) {
               end = mid-1;
           } else {
               start = mid + 1;
           }

           if (nums[mid] == target) index = mid;
       }
       
       return index;
    }

    public static int findRightMostIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length-1;
        
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid]<=target) {
                start = mid+1;
            } else {
                end = mid - 1;
            }

            if (nums[mid] == target) index = mid;
        }
        
        return index;
     }
}
