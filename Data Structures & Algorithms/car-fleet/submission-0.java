class Solution {
    
    private double time(int target, int position, int speed) {
        return (double)(target - position) / speed;
    }
    
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> b[0] - a[0]); // descending by position

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            double t = time(target, cars[i][0], cars[i][1]);
            if (stack.isEmpty() || t > stack.peek()) {
                stack.push(t);  // new fleet
            }
            // else: car catches up to fleet ahead, don't push
        }

        return stack.size();
    }
}