class Solution {
    public int lengthOfLastWord(String s) {
        if(s.trim().equals("")){
            return 0;
        }
        String [] abc = s.split(" ");
        int len = abc.length;
        return abc[len - 1].length();
    }
}