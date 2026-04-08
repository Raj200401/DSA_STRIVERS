class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int high=arr[0];
        int secondhigh=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>high){
                secondhigh=high;
                high=arr[i];
        }else if(arr[i]>secondhigh && arr[i]!=high){
            secondhigh=arr[i];
        }
        }
        return secondhigh;
    }
}