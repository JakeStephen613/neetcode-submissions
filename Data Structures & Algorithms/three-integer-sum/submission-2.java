class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) continue;

                int idx = Arrays.binarySearch(nums, j + 1, nums.length, -(nums[i] + nums[j]));
                if (idx >= 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[idx]));
                }
            }
        }

        return result;
    }
}