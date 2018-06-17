package com.app;

public class Solution {

    /*
      - N is an integer within the range [1..100,000];
      - each element of array A is an integer within the range [−1,000,000..1,000,000].

      expected worst-case time complexity is O(N);
      expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
    */
    public int solution(int[] A) {
        // write your code in Java SE 8
        int res = 1;

        int[] hits = new int[1_000_000];

        for (int elem : A) {
            if (elem > 0) {
                hits[elem - 1] = 1;
            }
        }

        for (int i = 0; i < hits.length; i++) {
            if (hits[i] == 0) {
                return i + 1;
            }
        }
        return res;
    }

}
