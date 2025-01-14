import java.util.HashMap;
class ZeroSumSubarrays {
    public static int findSubarraySumZero(int[] arr) {
        int count=0;
        HashMap<Integer, Integer> preSum=new HashMap<>();
        preSum.put(0, 1);
        int sum = 0; 
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(preSum.containsKey(sum)){
                count+=preSum.get(sum);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
     public int subarraySumK(int[] nums, int k) {
        HashMap<Integer, Integer> preSum = new HashMap<>();
        int count = 0;
        int sum = 0;
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                count += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
  public static void main(String[] args ){
    int[] arr={6, -1, -3, 4, -2, 2, 4, 6, -12, -7};
    int ans=findSubarraySumZero(arr);
    System.out.println("Number of subarrays with sum Zero is/are "+ans);
  }
}
