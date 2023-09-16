/*
Given an array arr[] of size N of positive integers which may have duplicates. 
The task is to find the maximum and second maximum from the array, and both of them should be different from each other,
so If no second max exists, then the second max will be -1.

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 5 4
Explanation: From the given array 
elements, 5 is the largest and 4 
is the second largest.

Input
N=4
arr[]={10,10,10,10}
Output: 10 -1

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/


class Solution {
    
    // Function to find the largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int n, int arr[]) {
        int max1 = arr[0]; // Initialize max1 to the first element
        int max2 = -1;     // Initialize max2 to -1 (no valid second largest found yet)
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;  // Update max2 before updating max1
                max1 = arr[i]; // Update max1
            } else if (arr[i] != max1 && arr[i] > max2) {
                max2 = arr[i]; // Update max2 when a different value greater than the current max2 is found
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(max1); // Add max1 to the result list
        result.add(max2); // Add max2 to the result list
        
        return result;
    }
}
