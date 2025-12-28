class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {0, 1, 0};
        System.out.println(solution.peakIndexInMountainArray(arr1));  // Output: 1

        int[] arr2 = {0, 2, 1, 0};
        System.out.println(solution.peakIndexInMountainArray(arr2));  // Output: 1

        int[] arr3 = {0, 10, 5, 2};
        System.out.println(solution.peakIndexInMountainArray(arr3));  // Output: 1
    }
}
