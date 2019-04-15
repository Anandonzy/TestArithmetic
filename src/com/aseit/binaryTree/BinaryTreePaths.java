package com.aseit.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-11
 * Time: 14:46
 * Description:
 * oj:https://www.lintcode.com/problem/binary-tree-paths/description
 * <p>
 * 输入：
 * <p>
 * 1
 * / \
 * 2   3
 * \
 * 5
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        // write your code here

        List<String> paths = new ArrayList<>();

        //递归的出口
        if (root == null) {
            return paths;
        }
        if (root.left == null && root.right == null) {
            paths.add(root.val + "");
            return paths;
        }

        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rightPaths = binaryTreePaths(root.right);

        for (String path : leftPaths) {
            paths.add(root.val + "->" + path);
        }

        for (String path : rightPaths) {
            paths.add(root.val + "->" + path);
        }
        return paths;
    }
}
