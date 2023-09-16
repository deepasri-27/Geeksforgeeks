/*
Given an array a[ ] of size N.find the median and mean of the array elements.
If there are odd elements, the median is simply the middle element in the sorted array. 
If there are even elements, then the median is floor of average of two middle numbers in the sorted array. print floor of it.

Input:
N = 5
a[] = {1, 2, 19, 28, 5}
Output: 11 5
Explanation: For array of 5 elements,
mean is (1 + 2 + 19  + 28  + 5)/5 = 11.
Median is 5 (middle element after 
sorting)


*/




class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       int l=0,r=N-1;
       int median;
       //if the array contains even number of elements
       if(N%2==0){
          median=(int)Math.floor(A[(l+r)/2]);
       }
       //if the number contains odd number of elements
       else{
           median=A[(l+r)/2];
       }
      return median;
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       int sum=0;
       for(int i=0;i<N;i++){
           sum+=A[i];
       }
       int avg=sum/N;
       return avg;
    }

}
