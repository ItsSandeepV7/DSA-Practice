package Recursion;

public class SearchInSortArray {

    // Helper function using recursion
    public static int helperFunc(int[] nums, int tar, int si, int ei) {

        // Base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Target found
        if (nums[mid] == tar) {
            return mid;
        }

        // Case 1: Left half is sorted
        if (nums[si] <= nums[mid]) {

            // Target lies in left half
            if (nums[si] <= tar && tar < nums[mid]) {
                return helperFunc(nums, tar, si, mid - 1);
            }
            // Otherwise search right half
            else {
                return helperFunc(nums, tar, mid + 1, ei);
            }

        }
        // Case 2: Right half is sorted
        else {

            // Target lies in right half
            if (nums[mid] < tar && tar <= nums[ei]) {
                return helperFunc(nums, tar, mid + 1, ei);
            }
            // Otherwise search left half
            else {
                return helperFunc(nums, tar, si, mid - 1);
            }
        }
    }

    // Public search method
    public static int search(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        return helperFunc(nums, target, 0, nums.length - 1);
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(nums, target);
        System.out.println("Target index = " + result);
    }
}
