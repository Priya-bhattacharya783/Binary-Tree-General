
class BinaryTree_Level_order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;;

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        
        // Start with the first/root node
        treeNodeQueue.add(root);

        // Run a loop till this queue is not empty
        while (!treeNodeQueue.isEmpty()) {
            int size=treeNodeQueue.size();
            ArrayList<Integer>list=new ArrayList<>();

            for(int i=0;i<size;i++)
            {
                TreeNode treeNode = treeNodeQueue.poll();
                list.add(treeNode.val);
                if (treeNode.left != null)
                    treeNodeQueue.add(treeNode.left);

            
                if (treeNode.right != null)
                    treeNodeQueue.add(treeNode.right);
            }
           result.add(list);
        }
        return result;
    }
  }

    
