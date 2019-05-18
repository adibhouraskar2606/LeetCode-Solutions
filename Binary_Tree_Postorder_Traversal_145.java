class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return list;
        }
        while(true)
        {
            while(root!=null){
                stack.push(root);
                stack.push(root);
                root = root.left;
            }
            if(stack.empty()){
                break;
            }
            root = stack.pop();
            if(!stack.empty() && stack.peek() == root){
                root = root.right;
            }else{
                list.add(root.val);
                root = null;
            }
        }
        return list;
    }
}