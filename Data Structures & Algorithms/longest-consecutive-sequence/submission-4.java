class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int streak = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {  // only start at sequence beginnings
                int length = 1;
                while (set.contains(n + length)) length++;
                streak = Math.max(streak, length);
            }
        }
        return streak;
    }
}