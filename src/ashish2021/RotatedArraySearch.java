package ashish2021;

public class RotatedArraySearch {

    public int search(int[] nums, int target) {
        int index = -1;
        
        if (nums==null || nums.length == 0) {
            return index;
        }

        int left = 0;
        int right = nums.length-1;

        int mid = 0;

        while(left<right) {
            mid = left + (right-left)/2;
            
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
           
        }

        int start = left;
        left = 0;
        right = nums.length-1;;

        if (target >= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }

        while(left<=right) {
            mid = left + (right-left)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return index;
    }

    public static void main(String args[]) {
        int[] nums = {5,1,3};
        int target = 1;
        
        RotatedArraySearch rotatedArraySearch = new RotatedArraySearch();
        System.out.println(rotatedArraySearch.search(nums, target));
    }
}
