class Solution {
    public int findComplement(int num) {
        String a = Integer.toBinaryString(num);
        String b = "";
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) == '0'){
                b = b + 1;
            }else{
                b = b + 0;
            }
        }
       // System.out.println(b);
        int decimal=Integer.parseInt(b,2);
      //  System.out.println(decimal);
        return decimal;
    }
}