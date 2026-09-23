class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        
        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0 ; i < arr.length-2; i++){

            int l = i+1;
            int r = arr.length-1;

            while (l<r) {
                int currSum = arr[i] + arr[l] + arr[r];

                if(currSum == 0){

                    result.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    l++;
                    r--;
                }else if (currSum<0) {
                    l++;
                }else{
                    r--;
                }
            }

            
        }
        return new ArrayList<>(result);
    }
}
