class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0; 
      for(int i = 0; i < arr.length; i++){
          for(int j = i + 1; j < arr.length;j++){
              // These 2 lines are the optimization since this questions has 3 nested for loop for O(n^3)
              if(Math.abs(arr[i] - arr[j])>a)
                    continue;
              for(int k=j + 1; k < arr.length; k++){
                  if( Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c)
                      count++; 
              }
          }
      }
      return count; 
    }
}
