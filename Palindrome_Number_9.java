class Solution {
    public boolean isPalindrome(int x) {
        int flag = 0;
        String a = Integer.toString(x);
        for(int i = 0; i<a.length()/2; i++){
            System.out.println("first loop");
            for(int j = (a.length()-1)-i; j>=a.length()/2; j--){
                System.out.println("second loop");
                if(a.charAt(j) != a.charAt(i)){
                    flag = 1;
                    break;
                }else{
                    break;
                }
            }
            if(flag == 1){
                return false;
            }
        }
        return true;
    }
}