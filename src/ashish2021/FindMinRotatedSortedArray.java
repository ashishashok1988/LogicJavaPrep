package ashish2021;

public class FindMinRotatedSortedArray {

    public static void main(String args[]) {
        int[] nums = {3,4,5,1,2};
        FindMinRotatedSortedArray findMinRotatedSortedArray = new FindMinRotatedSortedArray();
        System.out.println(findMinRotatedSortedArray.findMinElement(nums));
    }
    
    public int findMinElement(int[] nums) {
        
       int left = 0;
       int right = nums.length-1;

       int mid = 0;

       while (left < right) {
           mid = left + (right-left)/2;
           if (nums[mid] > nums[right]) {
               left = mid +1;
           } else {
               right = mid;
           }
       }

       return nums[left];
    }
        
}
