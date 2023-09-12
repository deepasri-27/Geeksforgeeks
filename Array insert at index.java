
/*You are given an array arr(0-based index). The size of the array is given by sizeOfArray. 
You need to insert an element at given index.
Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
index = 5, element = 90
Output: 1 2 3 4 5 90
Explanation: 90 is inserted at index
5(0-based indexing). After inserting,
array elements are like
1, 2, 3, 4, 5, 90.
   
  Logic:
  // You need to insert the given element at the given index. 
  // After inserting the elements at index, elements
  // from index onward should be shifted one position ahead
  // assume that the array already has sizeOfArray - 1
  // elements.*/

class Solution
{
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
             if (index >= 0 && index <=sizeOfArray - 1) {
            // Shift elements one position ahead from index to the end
            for (int i = sizeOfArray - 2; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
            // Insert the new element at the specified index
            arr[index] = element;
        }
    }


}
