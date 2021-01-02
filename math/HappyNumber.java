class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> answer = new HashSet<>(); 
        int current = 0;
        int sum = 0;
        while(n!=1) {
            // Maybe current and sum need to reset after every iteration 
            current = 0;
            sum = 0;
            current = n; 
            while(current!= 0) {
                sum+= (current%10) * (current%10);
                current = current/10; 
            }
            if(!answer.add(sum))
                return false;
            
            n = sum; 
        }
        return true; 
    }
}
