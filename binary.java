public class Binary
{
public static int binarysearchint(int arr[], int l, int r, int x)
{

if(r>= 1 && l <= arr.length - 1) // check if we are still inside the array 
{
int mid = l + (r- 1)/ 2; // go to middle

if(arr[mid] == x) return mid; // if its at middle return it
if(arr[mid] > x) return binarysearchint(arr,l,mid-1,x); // if the thing we're searching for is less, do the search but lets go left
return binarysearchint(arr,l,mid+1,x); // if the thing we're searching for is greater, do the search but lets go right
}
return -1; // if we can't find it, return -1
}