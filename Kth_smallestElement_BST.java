class Kth_smallestElement_BST {
    static void inorder(TreeNode root,List<Integer>list)
    {
        if(root==null)
        return;

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);


    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        inorder(root,list);

        return list.get(k-1);

    }
}
