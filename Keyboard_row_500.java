class Solution {
    public String[] findWords(String[] words) {
        int flag;
        ArrayList<String> list = new ArrayList<String>();
        int [] nums = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        for(int j = 0; j<words.length; j++){
            flag = 0;
            String s = words[j].toLowerCase();
            char [] c = s.toCharArray();
            int b = c[0]-'a';
            //System.out.println("b "+b);
            for(int i = 0; i<c.length; i++){
                //System.out.println("nums "+nums[c[i]-'a']);
                if(nums[c[i]-'a']!=nums[b]){
                    flag = 1;
                    break;
                }
            }if(flag == 0)
                list.add(words[j]);
        }
        String [] array = list.toArray(new String[list.size()]);
        return array;
    }
}