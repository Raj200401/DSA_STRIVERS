class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n=nums.length;
    HashMap<Integer,Integer> mpp=new HashMap<>();
    for(int i=0;i<n;i++){
        int add=target-nums[i];
        if(mpp.containsKey(add)){
            return new int[]{mpp.get(add),i};
        }else{
            mpp.put(nums[i],i);
        }
    }
    return new int []{-1,-1};
    }
}