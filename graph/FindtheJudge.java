class Solution {
    // For this problem I think it can be solved in 0(n) time 
    // Use a hashset and a int array to keep track of who has seen who and how many times
    // Everytime we see a person add it to our hashset and add who they trust to our array and increment
    // Check to see if the peson is trusted by everyone else in the town and also has was not seen
    public int findJudge(int N, int[][] trust) {
        HashSet<Integer> seen = new HashSet<>(); 
        int [] trusted = new int[N]; 
        for(int i = 0; i < trust.length; i++) {
            int person = trust[i][0]; 
            int trusts = trust[i][1]; 
            seen.add(person);
            // make trusts - 1 to keep it in bounds since arrays start at 0
            trusted[trusts - 1]++; 
        } 
        if(N - seen.size() > 1 || N - seen.size() == 0)
            return -1; 
       for(int j = 0; j < N; j++) {
           // add 1 to j since our array is indexed at 0
           if(trusted[j] == N - 1 && !seen.contains(j + 1))
           {
               return j + 1;  
           }
        }
        
        return -1;  
        
        
    }
}
