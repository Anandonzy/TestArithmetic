package com.aseit.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-11
 * Time: 9:57
 * Description:https://www.lintcode.com/problem/binary-tree-preorder-traversal/description
 * 运行测试
 */
class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
        this.left = this.right = null;
    }
}

public class BinaryTreePreorder {

    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> preorder = new ArrayList<>();

        if (root == null) {
            return preorder;
        }
        stack.push(root);

        //当栈里面不为空的时候都要遍历
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            preorder.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return preorder;
    }

}

class Traverse {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    //把root为根的preorder 加入到result里面
    private void traverse(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);
    }

}
