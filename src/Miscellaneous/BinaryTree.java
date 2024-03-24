package Miscellaneous;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {

    private static void preOrderTraverseTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrderTraverseTree(root.left);
        preOrderTraverseTree(root.right);
    }

    private static void inOrderTraverseTree(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraverseTree(root.left);
        System.out.println(root.data);
        inOrderTraverseTree(root.right);
    }

    private static void postOrderTraverseTree(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraverseTree(root.left);
        postOrderTraverseTree(root.right);
        System.out.println(root.data);
    }

    private static List<List<Integer>> levelOrder(Node root) {
        // TC : O(N) SC: O(N)
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if (root == null)
            return list;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subList = new LinkedList<>();

            for (int i = 0; i < level; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().data);
            }
            list.add(subList);
        }
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        preOrderTraverseTree(root);
        System.out.println("-------------------------------");
        inOrderTraverseTree(root);
        System.out.println("-------------------------------");
        postOrderTraverseTree(root);
        System.out.println("-------------------------------");
        System.out.println(levelOrder(root));
    }

}
