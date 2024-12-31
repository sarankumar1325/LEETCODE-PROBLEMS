class Solution {
    public long maximumTripletValue(int[] nums) {
        long result = 0;
        long maxDiff = 0;
        long maxI = 0;
        for( long num : nums)
        {
            result = Math.max(result, maxDiff * num);
            maxDiff = Math.max(maxDiff,maxI - num);
            maxI = Math.max(maxI, num);
        }
        return result;
    }
}
