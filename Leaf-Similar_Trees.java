class Solution {
     ArrayList<Integer> t1 = new ArrayList<Integer>();
    ArrayList<Integer> t2 = new ArrayList<Integer>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverseTree1(root1);
        traverseTree2(root2);
        for(int i = 0; i<t1.size(); i++){
            System.out.println("t1 "+t1.get(i));
        }
        for(int i = 0; i<t2.size(); i++){
            System.out.println(t2.get(i));
        }
        for(int i = 0; i<t1.size(); i++){
            if(t1.size() == t2.size()) {
                if (t1.get(i) != t2.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }
    public TreeNode traverseTree1(TreeNode root){
        if(root == null){
            return root;
        }
        traverseTree1(root.left);
        if(root.left == null && root.right == null)
            t1.add(root.val);
        traverseTree1(root.right);
        return null;
    }
    public TreeNode traverseTree2(TreeNode root){
        if(root == null){
            return root;
        }
        traverseTree2(root.left);
        if(root.left == null && root.right == null)
            t2.add(root.val);
        traverseTree2(root.right);
        return null;
    }
}