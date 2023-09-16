/*Given an array arr[] of n positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j 
and return 0  incase no such index found.
Input:
N = 2
A[] = {1, 10}
Output:
1
Explanation:
A[0]<A[1] so (j-i) is 1-0 = 1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/


class Solution {
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int arr[], int n) { 
        
        int maxDiff;
        int i, j;
        
        // Right side element should be greater than the left side element
        int[] RMax = new int[n];
        // Left side element should be less than that of the right side element
        int[] LMin = new int[n];
        
        // Initialize LMin and RMax arrays
        LMin[0] = arr[0];
        for (i = 1; i < n; i++) {
            LMin[i] = Math.min(arr[i], LMin[i - 1]);
        }
        
        RMax[n - 1] = arr[n - 1];
        for (j = n - 2; j >= 0; j--) {
            RMax[j] = Math.max(arr[j], RMax[j + 1]);
        }
        
        // Traverse both the arrays LMin and RMax array find the j-i;
        i = 0;
        j = 0;
        maxDiff = -1;
        while (j < n && i < n) {
            if (LMin[i] <= RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j = j + 1;
            } else {
                i = i + 1;
            }
        }
        return maxDiff;
    }
}
