class same_tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

    // Loop till the queue is not empty
        while (!queue.isEmpty()) {
           TreeNode first = queue.poll();
           TreeNode second = queue.poll();

           // Check for equality
           if (first == null && second == null) {
                continue;
            } 
            else if (first == null || second == null || first.val != second.val)
            {
                return false;
            }

            // Add other nodes
             queue.add(first.left);
             queue.add(second.left);
             queue.add(first.right);
             queue.add(second.right);
        }
     return true;
    }
}