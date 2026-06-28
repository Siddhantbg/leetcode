// 15. 3Sum [Medium]
// https://leetcode.com/problems/3sum/
// Language: java | Runtime: 29 ms | Memory: 59.2 MB
// Tags: Array, Two Pointers, Sorting
// Synced: 2026-06-29

class Solution{
    public List<List<Integer>> threeSum(int[] arr) {
        int l=0;
        int r=0;
        int sum=0;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i++){
            l=i+1;
            r=arr.length-1;

                if(i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            while(l<r){

            sum=arr[i]+arr[l]+arr[r];
            

            if(sum<0){
                l++;
            }else if(sum>0){
                r--;
            }else{
                result.add(List.of(arr[i], arr[l], arr[r]));
                l++;
                r--;
                 while(l < r &&
                          arr[l] == arr[l - 1]) {
                        l++;
                    }

                    // Skip duplicate r values
                    while(l < r &&
                          arr[r] == arr[r + 1]) {
                        r--;
                    }
                }
            }
        }
        return result;

        }
    }
