class validate_bST {
    static void inorder(TreeNode root,List<Integer>list)
    {
        if(root==null)
        return;

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);


    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        inorder(root,list);
       int prev=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)<=prev)
            {
                return false;
            }
           prev=list.get(i);
        }
        return true;
    }
}
