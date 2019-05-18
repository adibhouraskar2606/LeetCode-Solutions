class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        
        if(root == null){
            return list;
        }
        
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode myNode = stack.peek();
            list.add(myNode.val);
            stack.pop();
            if(myNode.right != null){
                stack.push(myNode.right);
            }
            if(myNode.left != null){
                stack.push(myNode.left);
            }
        }
        return list;
    }
}