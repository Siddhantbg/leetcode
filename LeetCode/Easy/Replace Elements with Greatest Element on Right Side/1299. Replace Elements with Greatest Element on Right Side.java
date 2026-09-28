// 1299. Replace Elements with Greatest Element on Right Side [Easy]
// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
// Language: java | Runtime: 3 ms | Memory: 49.2 MB
// Time:  O(n)
// Space: O(1)
// Tags: Array
// Synced: 2026-09-29
//
// Q: What is the problem?
// A: Replace every element with the greatest element to its right.
//    Last element has nothing to its right, so replace it with -1.
// 
//    [17,18,5,4,6,1]
//    → [18,6,6,6,1,-1]
// 
// 
// Q: Why traverse from right to left?
// A: Because we need information about the elements on the RIGHT.
//    So traverse:
//    RIGHT → LEFT
// 
//    Maintain a variable:
//    maxRight = greatest element seen so far on the right.
// 
// 
// Q: Why is maxRight initially -1?
// A: The last element has nothing to its right.
//    Its replacement should be -1.
// 
//    int maxRight = -1;
// 
// 
// Q: How does -1 enter the array?
// A: Initially:
//    maxRight = -1
// 
//    At the last index:
//    nums[i] = maxRight;
// 
//    Therefore:
//    nums[5] = -1
// 
//    [17,18,5,4,6,1]
//                 ↓
//    [17,18,5,4,6,-1]
// 
// 
// Q: Then why does maxRight become 1?
// A:
//    current = 1
//    maxRight = -1
// 
//    maxRight = Math.max(-1, 1)
//             = 1
// 
//    So:
//    Array:     [17,18,5,4,6,-1]
//    maxRight:  1
// 
// 
// Q: Are we editing the same array?
// A: YES.
// 
//    nums[i] = maxRight;
// 
//    directly modifies the original nums array.
//    We are doing it IN-PLACE.
// 
// 
// Q: If we edit the array, how do we keep the original value?
// A: Save it before editing.
// 
//    int current = nums[i];
// 
//    Then:
//    nums[i] = maxRight;
// 
//    Then:
//    maxRight = Math.max(maxRight, current);
// 
//    Order:
//    1. Save current
//    2. Replace current
//    3. Update maxRight
// 
// 
// Q: Why does 6 appear three times?
// A: Because 6 is the greatest element to the right of 18, 5, AND 4.
// 
//    18 → [5,4,6,1] → 6
//    5  → [4,6,1]   → 6
//    4  → [6,1]     → 6
// 
//    Therefore:
//    [17,18,5,4,6,1]
//    → [18,6,6,6,1,-1]
// 
// 
// Q: What exactly does maxRight mean?
// A: maxRight = greatest element encountered so far while
//    moving from RIGHT to LEFT.
// 
//    It is NOT the next element.
// 
//    For [17,18,5,4,6,1]:
// 
//    -1 → 1 → 6 → 6 → 6 → 18
// 
// 
// FULL DRY RUN:
// 
// Input:
// [17,18,5,4,6,1]
// 
// i = 5
// current = 1
// maxRight = -1
// nums[5] = -1
// maxRight = max(-1,1) = 1
// 
// Array:
// [17,18,5,4,6,-1]
// 
// 
// i = 4
// current = 6
// maxRight = 1
// nums[4] = 1
// maxRight = max(1,6) = 6
// 
// Array:
// [17,18,5,4,1,-1]
// 
// 
// i = 3
// current = 4
// maxRight = 6
// nums[3] = 6
// maxRight = max(6,4) = 6
// 
// Array:
// [17,18,5,6,1,-1]
// 
// 
// i = 2
// current = 5
// maxRight = 6
// nums[2] = 6
// maxRight = max(6,5) = 6
// 
// Array:
// [17,18,6,6,1,-1]
// 
// 
// i = 1
// current = 18
// maxRight = 6
// nums[1] = 6
// maxRight = max(6,18) = 18
// 
// Array:
// [17,6,6,6,1,-1]
// 
// 
// i = 0
// current = 17
// maxRight = 18
// nums[0] = 18
// maxRight = max(18,17) = 18
// 
// Final:
// [18,6,6,6,1,-1]
// 
// 
// CODE:
// 
// class Solution {
//     public int[] replaceElements(int[] nums) {
// 
//         int maxRight = -1;
// 
//         for (int i = nums.length - 1; i >= 0; i--) {
// 
//             int current = nums[i];
// 
//             nums[i] = maxRight;
// 
//             maxRight = Math.max(maxRight, current);
//         }
// 
//         return nums;
//     }
// }
// 
// 
// KEY PATTERN:
// Right-side maximum problem
// → Traverse RIGHT to LEFT
// → Maintain maxRight
// → Save current before replacing
// → Replace with maxRight
// → Update maxRight

class Solution {
    public int[] replaceElements(int[] nums) {
        int maxRight=-1;

        for(int i=nums.length-1;i>=0;i--){
            int current=nums[i];

            nums[i]=maxRight;

            maxRight=Math.max(maxRight,current);
        }
        return nums;
    }
}
// A leader is an element such that every element to its right is smaller than it.

// ArrayList<Integer> ans=new ArrayList<>();
//         int maxRight=nums[nums.length-1];
// ans.add(maxRight);
//         for(int i=nums.length-2;i>=0;i--){
//             if(nums[i]>=maxRight){
//                 ans.add(nums[i]);
//                 maxRight=nums[i];
//             }
//         }
//                 Collections.reverse(ans);

// return ans;