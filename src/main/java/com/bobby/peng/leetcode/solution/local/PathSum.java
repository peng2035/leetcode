package com.bobby.peng.leetcode.solution.local;

import com.bobby.peng.leetcode.basic.data.structure.TreeNode;

/**
 * Created by pengtianhao on 2017/5/8.
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        return compare(root,0,sum);
    }

    public boolean compare(TreeNode node, int sum, int expect) {
        if(node.left == null && node.right == null) {
            return sum == expect;
        }

        boolean flag = false;

        if(node.left != null) {
            flag = compare(node.left , sum + node.val , expect);
        }

        if(!flag && node.right != null) {
            flag = compare(node.right, sum + node.val , expect);
        }

        return flag;
    }
}
