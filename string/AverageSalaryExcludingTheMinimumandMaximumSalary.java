class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE; 
        int max = 0; 
        double sum = 0;
        List<Integer> salaries = new ArrayList<>(); 
        for(int i : salary){
            min = Math.min(min,i); 
            max = Math.max(max, i); 
            sum+=i; 
        } 
        System.out.println(min); 
        System.out.println(max); 
        sum = (sum - min - max)/(salary.length - 2); 
        return sum; 
    }
}
