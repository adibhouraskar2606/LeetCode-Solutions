class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue <TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);
        TreeNode curr;
        while (!myQueue.isEmpty()){
            int size = myQueue.size();
            double count = 0;
            double sum = 0;
            for(int i = 0; i<size; i++){
                curr = myQueue.poll();
                //System.out.print(curr.val+" ");
                count = count + 1;
                sum = sum + curr.val;
                if(curr.left!=null){
                    myQueue.add(curr.left);
                }
                if(curr.right!=null){
                    myQueue.add(curr.right);
                }
            }
            list.add(sum/count);
            //System.out.println();
        }
        return list;
    }
}