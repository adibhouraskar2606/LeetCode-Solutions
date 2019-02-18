class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null){
            return list;
        }

        populateList(root);
        return list;
    }
    public void populateList(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node topNode = stack.pop();
            list.add(topNode.val);
            for(int child=topNode.children.size()-1;child>=0;child--){

                stack.push(topNode.children.get(child));

            }
        }
    }
}