/*
Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).
Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect 
square, floor of square_root of 5 is 2.
Input:
x = 4
Output: 2
Explanation: Since, 4 is a perfect 
square, so its square root is 2.
Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)
*/


//Naive Approach(TC=O(sqrt(N)))
// class Solution
// {
//      long floorSqrt(long x)
// 	 {
// 	    int i=1;
// 	    while(i*i<=x){
// 	        i++;
// 	    }
// 	    return (i-1);
// 	 }
// }

// Optimized Approach this calculate the sruare root of the target element in O(logN) time complexity with the help of binary Search
class Solution {
    long floorSqrt(long x) {
        // Initialize low and high pointers for binary search.
        long low = 1, high = x, mid = 0, ans = -1;
        
        // Binary search loop
        while (low <= high) {
            // Calculate the middle value
            mid = (low + high) / 2;
            
            // Calculate the square of the middle value
            long msq = mid * mid;
            
            // If the square of the middle value is equal to x, we have found the floor square root.
            if (msq == x) {
                return mid;
            } else if (msq > x) {
                // If the square of the middle value is greater than x, reduce the search range to the left half.
                high = mid - 1;
            } else {
                // If the square of the middle value is less than x, update the answer and search in the right half.
                low = mid + 1;
                ans = mid;
            }
        }
        
        // Return the answer, which is the floor square root of x.
        return ans;
    }
}


