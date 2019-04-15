package com.aseit.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-11
 * Time: 11:42
 * Description:二叉树中序遍历
 * oj：https://www.lintcode.com/problem/binary-tree-preorder-traversal/description
 */
public class BinaryTreeInorder {
    public ArrayList<Integer> inorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        while(root !=null){
            stack.push(root);
            root = root.left;
        }

        while (stack != null) {
            TreeNode node = stack.peek();
            result.add(node.val);

            if(node.right == null){
                node = stack.pop();
                while (!stack.isEmpty() && stack.peek().right == node) {
                    node = stack.pop();
                }
            } else {
                node = node.right;
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
        return result;
    }
}
