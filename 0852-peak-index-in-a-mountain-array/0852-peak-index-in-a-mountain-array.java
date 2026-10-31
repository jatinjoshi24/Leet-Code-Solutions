class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=1;
        int high=arr.length-2;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid-1]<arr[mid]&&arr[mid+1]<arr[mid])
                return mid;
            else if(arr[mid-1]<arr[mid]&&arr[mid+1]>arr[mid])
                low=mid+1;
            else high =mid-1;
        }
        return -1;
    }
}