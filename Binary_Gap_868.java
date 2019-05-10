class Solution {
     int longest = 0;
    public int binaryGap(int N) {
        String binary = Integer.toBinaryString(N);
        for(int i = 0; i<binary.length(); i++){
            int count = 0;
            if(binary.charAt(i) == '1'){
                count = checkDistance(i,binary);
            }
            if(longest<count){
                longest = count;
            }
        }
        return longest;
    }
     private int checkDistance(int index, String binary){
        int count = 0;
        for(int i = index+1; i<binary.length(); i++){
            if(binary.charAt(i) == '1'){
                count++;
                break;
            }else{
                count++;
            }
            if(i == binary.length()-1 && binary.charAt(i)!='1'){
                return 0;
            }
        }
        return count;
    }
}
