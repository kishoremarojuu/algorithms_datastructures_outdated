package com.algorithms_datastructures;

public class SortingAlgo_109_RankFromStream {

        static class Node {
            int data;
            Node left, right;
            int leftSize;
        }

        static Node newNode(int data)
        {
            Node temp = new Node();
            temp.data = data;
            temp.left = null;
            temp.right = null;
            temp.leftSize = 0;
            return temp;
        }

        // Inserting a new Node.
        static Node insert(Node root, int data)
        {
            if (root == null)
                return newNode(data);

            // Updating size of left subtree.
            if (data <= root.data) {
                root.left = insert(root.left, data);
                root.leftSize++;
            }
            else
                root.right = insert(root.right, data);

            return root;
        }

        // Function to get Rank of a Node x.
        static int getRank(Node root, int x)
        {
            // Step 1.
            if (root.data == x)
                return root.leftSize;

            // Step 2.
            if (x < root.data) {
                if (root.left == null)
                    return -1;
                else
                    return getRank(root.left, x);
            }

            // Step 3.
            else {
                if (root.right == null)
                    return -1;
                else {
                    int rightSize = getRank(root.right, x);
                    return root.leftSize + 1 + rightSize;
                }
            }
        }

        // Driver code
        public static void main(String[] args)
        {
            int arr[] = { 5, 1, 4, 4, 5, 9, 7, 13, 3 };
            int n = arr.length;
            int x = 4;

            Node root = null;
            for (int i = 0; i < n; i++)
                root = insert(root, arr[i]);

            System.out.println("Rank of " + x + " in stream is : "+getRank(root, x));

            x = 13;
            System.out.println("Rank of " + x + " in stream is : "+getRank(root, x));

        }
    }
