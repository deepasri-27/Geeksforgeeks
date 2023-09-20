
/*Naive Approach
 TC=O(n^3)
 sc=O(1)
boolean isTriplet(int[]arr,int n,int x)
{
   for(int i=0;i<n-2;i++)
   {
     for(int j=i+1;j<n-1;j++)
     {
       for(int k=j+1;k<n;k++)
         {
           if(arr[i]+arr[j]+arr[k]==x)
            {
              return true;
            }
         }
     }
   }
return false;
}*/




Optimized solution
  
/*TC=O(n^2)
SC=O(1)

1.Traverse the array from left to right
2. For every element arr[i] ,check if there is a pair on right side with sum (x-arr[i])

arr-->array,n-->size of the array,x-->target value for pair of element where 1 value of the Array is fixed,si-->starting index after fixing the first element*/

boolean isPair(int[]arr,int n,int x,int si)
{
   int i=si,j=n-1;
   while(i<j)
  {  
      if(arr[i]+arr[j]==x)
        return true;
       else if(arr[i]+arr[j]<x)
         i++;
       else
         j--;
    
  }
return false;
}

boolean isTriplet(int[]arr,int n,int x)
{
for(int i=0;i<n-2;i++)
{
   if(isPair(arr,n,x-arr[i],i+1))
      return true;

}

return false;
}


