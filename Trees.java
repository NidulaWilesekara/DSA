package DSA;

public class Trees {
	

    // Node class representing each node in the tree
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // BinaryTree class representing the binary tree
    static class BinaryTree {

        Node root;

        public BinaryTree() {
            root = null;
        }

        // Method to insert a new node in the tree
        public void insert(int data) {
            root = insertRec(root, data);
        }

        // Recursive function to insert a new node
        private Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }

            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }

            return root;
        }

        // Method to search for a node in the tree
        public boolean search(int data) {
            return searchRec(root, data);
        }

        // Recursive function to search for a node
        private boolean searchRec(Node root, int data) {
            if (root == null) {
                return false;
            }
            if (root.data == data) {
                return true;
            }
            return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data);
        }

        // Method to delete a node from the tree
        public void delete(int data) {
            root = deleteRec(root, data);
        }

        // Recursive function to delete a node
        private Node deleteRec(Node root, int data) {
            if (root == null) {
                return root;
            }

            if (data < root.data) {
                root.left = deleteRec(root.left, data);
            } else if (data > root.data) {
                root.right = deleteRec(root.right, data);
            } else {
                // node with only one child or no child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                // node with two children: Get the inorder successor (smallest in the right subtree)
                root.data = minValue(root.right);

                // Delete the inorder successor
                root.right = deleteRec(root.right, root.data);
            }

            return root;
        }

        // Method to find the minimum value node in the tree
        private int minValue(Node root) {
            int minValue = root.data;
            while (root.left != null) {
                minValue = root.left.data;
                root = root.left;
            }
            return minValue;
        }

        // Method to print the inorder traversal of the tree
        public void inorderTraversal() {
            inorderTraversalRec(root);
            System.out.println();
        }

        // Recursive function for inorder traversal
        private void inorderTraversalRec(Node root) {
            if (root != null) {
                inorderTraversalRec(root.left);
                System.out.print(root.data + " ");
                inorderTraversalRec(root.right);
            }
        }

        // Method to print the preorder traversal of the tree
        public void preorderTraversal() {
            preorderTraversalRec(root);
            System.out.println();
        }

        // Recursive function for preorder traversal
        private void preorderTraversalRec(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorderTraversalRec(root.left);
                preorderTraversalRec(root.right);
            }
        }

        // Method to print the postorder traversal of the tree
        public void postorderTraversal() {
            postorderTraversalRec(root);
            System.out.println();
        }

        // Recursive function for postorder traversal
        private void postorderTraversalRec(Node root) {
            if (root != null) {
                postorderTraversalRec(root.left);
                postorderTraversalRec(root.right);
                System.out.print(root.data + " ");
            }
        }

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(12);
        tree.insert(1);
        tree.insert(15);
        tree.insert(20);

        System.out.println("Inorder traversal of binary tree:");
        tree.inorderTraversal();

        System.out.println("Preorder traversal of binary tree:");
        tree.preorderTraversal();

        System.out.println("Postorder traversal of binary tree:");
        tree.postorderTraversal();

        System.out.println("Searching for node with value 12: " + tree.search(12));
        System.out.println("Searching for node with value 7: " + tree.search(7));

        tree.delete(12);
        System.out.println("Inorder traversal after deleting node with value 12:");
        tree.inorderTraversal();
       }

   }
}


