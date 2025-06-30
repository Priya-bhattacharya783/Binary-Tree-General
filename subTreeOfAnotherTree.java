class subTreeOfAnotherTree {
    String PreOrderTraversal(TreeNode node)
    {
        if(node==null)
        {
            return "null";
        }
        StringBuilder sb=new StringBuilder("^");
        sb.append(node.val);
        sb.append(PreOrderTraversal(node.left));
        sb.append(PreOrderTraversal(node.right));

        return sb.toString();
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        String fullTree=PreOrderTraversal(root);
        String subTree=PreOrderTraversal(subRoot);

        return(fullTree.contains(subTree));
  }
}
