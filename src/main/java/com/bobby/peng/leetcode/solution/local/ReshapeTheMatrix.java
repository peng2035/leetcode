package com.bobby.peng.leetcode.solution.local;

/**
 * Created by peng2035 on 2017/5/1.
 */
public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums == null) return null;
        int or = nums.length;
        int oc = nums[0].length;

        if(or * oc != r * c) return nums;

        int[][] result = new int[r][c];

        int tr=0,tc=0;
        for(int i=0;i<or;i++) {
            for(int j=0;j<oc;j++) {
                if(tc == c) {
                    tc = 0;
                    tr++;
                }
                result[tr][tc] = nums[i][j];
                tc++;
            }
        }

        return result;
    }

}
