class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int[] sols = new int[2];
    for (int i = 0; i < numbers.length; i++) {
       sols[0] = numbers[i]; 
       sols[1] = target - sols[0]; 
        int idx = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
        if (idx >= 0) { 
            sols[0] = i + 1; 
            sols[1] = idx + 1; 
            break; 
            }    
            } 
            return sols; 
   
    }
}