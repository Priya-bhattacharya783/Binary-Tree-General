class Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode>node=new LinkedList<>();
        
        node.add(root);
        int level=0;

        while(!node.isEmpty())
        {
          int size = node.size();
          level++;

          for(int i=0;i<size;i++)
          {
            TreeNode  poppedNode =node.poll();
            if(poppedNode.left!=null)
            {
                node.add(poppedNode.left);
            }
            if(poppedNode.right!=null)
            {
                node.add(poppedNode.right);
            }

          }
          

        
        }
        return level;
    }
}
