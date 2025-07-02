public static void preOrderTraversal(TreeNode root) {

    // Terminating condition
    if (root == null)
      return;

    // Print the root node
    System.out.print(root.val + " -> ");

    // Traverse the left node
    preOrderTraversal(root.left);

    // Go to the right node
    preOrderTraversal(root.right);
  }

 public static void postOrderTraversal(TreeNode root) {

    // Terminating condition
    if (root == null)
      return;

    // Traverse the left node
    postOrderTraversal(root.left);

    // Go to the right node
    postOrderTraversal(root.right);

    // Print the root node
    System.out.print(root.val + " -> ");
  }

 public static void inOrderTraversal(TreeNode root) {

    // Terminating condition
    if (root == null)
      return;

    // Traverse the left node
    inOrderTraversal(root.left);

    // Print the root node
    System.out.print(root.val + " -> ");

    // Go to the right node
    inOrderTraversal(root.right);
  }
