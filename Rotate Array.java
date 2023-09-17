/*
Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, 
where D is a positive integer. 

Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated
by 2 elements, it becomes 3 4 5 1 2.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void reverse(int[] arr,int start,int end){
        while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
        
    }
    static void rotateArr(int arr[], int d, int n)
    {
        if(n<=1){
            return; // Nothing to rotate.
        }
         d=d%n;// Handle the case when d is greater than n.
       reverse(arr, 0, n - 1); // Reverse the entire array.
        reverse(arr, 0, n - d - 1); // Reverse the first part of the array.
        reverse(arr, n - d, n - 1);// Reverse the second part of the array
        
    }
}
