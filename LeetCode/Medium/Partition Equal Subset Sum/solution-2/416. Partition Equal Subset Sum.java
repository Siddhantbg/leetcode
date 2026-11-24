// 416. Partition Equal Subset Sum [Medium]
// https://leetcode.com/problems/partition-equal-subset-sum/
// Language: java | Runtime: 47 ms | Memory: 46.6 MB
// Time:  O(m·n) (auto-detected)
// Pattern: Nested loops
// Tags: Array, Dynamic Programming, Knapsack Problem, 0-1 Knapsack
// Synced: 2026-11-25

class Solution {
    public boolean subsetSum(int[] nums, int S) {
        int n = nums.length;
        boolean[][] t = new boolean[n + 1][S + 1];

        // 0 elements se koi sum nahi banta
        for (int col = 0; col < S + 1; col++) t[0][col] = false;

        // sum 0 hamesha ban sakta hai
        for (int row = 0; row < n + 1; row++) t[row][0] = true;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < S + 1; j++) {
                if (nums[i - 1] <= j)
                    t[i][j] = t[i - 1][j - nums[i - 1]] || t[i - 1][j]; // take || notTake
                else
                    t[i][j] = t[i - 1][j];                              // notTake
            }
        }
        return t[n][S];
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int x : nums) sum += x;
        if (sum % 2 != 0) return false;   // odd sum toh 2 equal parts nahi ban sakte
        return subsetSum(nums, sum / 2);
    }
}

// class Solution {
//     int [][]t;
// // i=index
//     boolean solve(int[] nums,int i,int target){
//         if(target==0) return true;

// // elements khatam, target nahi bana
//         if(i>=nums.length) return false;

// // - `t[i][x] != -1` ka matlab hai ki ye sawaal pehle solve ho chuka hai (diary mein jawab likha hai).

// // - `return t[i][x] == 1` stored jawab ko wapas boolean bana deta hai. Value `1` hai toh `true` return hoga, aur `0` hai toh `false`.
//         if(t[i][target]!=-1) return t[i][target]==1;

//         boolean take=false;
//         if(nums[i]<=target){
//             take=solve(nums,i+1,target-nums[i]);
//         }

//         boolean notTake=solve(nums,i+1,target);

//         t[i][target]=(take||notTake) ? 1:0;
// //         if (take || notTake) {
// //     t[i][x] = 1;
// // } else {
// //     t[i][x] = 0;
// // }

//         return take||notTake;
//     }
//     public boolean canPartition(int[] nums) {
//        int n=nums.length;

//        int s=0;

//        for(int num:nums){
//         s+=num;
//        }

//        if(s%2!=0) return false;

//        int target=s/2;

//        t=new int[n][target+1];


//        for(int []row:t){
//         Arrays.fill(row,-1);
//        }
//        return solve(nums,0,target);

// //        - `for (int[] row : t)` ka matlab hai: "`t` ki har row ke liye". Har baar ek row, jo khud ek `int[]` (1D array) hai, `row` naam ke variable mein aati hai.

// // - `Arrays.fill(row, -1);` us poori row ke har khane mein `-1` daal deta hai.
// // **Example:** `t = new int[2][3]` hai, shuru mein sab 0:

// // ```
// // t[0] = [0, 0, 0]
// // t[1] = [0, 0, 0]
// // ```

// // - **Round 1:** `row = t[0]`, fill hua, toh `t[0] = [-1, -1, -1]`
// // - **Round 2:** `row = t[1]`, fill hua, toh `t[1] = [-1, -1, -1]`
//     }
// }



//  //subsequence follows a order//contiguous or non conti part of array
//       //1,2 is qubsequence of 1,3,2 arr

//         // 3,2 is a subsequence and sub arr

// // - **Subarray:** contiguous + order. `[1,3]`, `[3,2]`, `[1,3,2]`

// // - **Subsequence:** order same, skip allowed. `[1,2]` bhi chalega

// // - **Subset:** order matter nahi karta. `[2,1]` bhi chalega


// // What does dp[ind][target] mean?
// // For example:
// // dp[2][4] = 1;


// // This means:

// // Using array elements from index 0 to 2, can we form target 4?

// // Answer: Yes, using {1, 3}.

// // So we store 1.

