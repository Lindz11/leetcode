class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length; 
        List<Integer> l = new ArrayList<>(); 
        for(int i = 0; i < length; i++){
            if(arr[i] == 0){
                l.add(arr[i]); 
                l.add(0); 
            }
            else{
                l.add(arr[i]); 
            }    
        }
        
        for(int j = 0; j < length; j++){
            arr[j] = l.get(j); 
        }
            
    } 
}
