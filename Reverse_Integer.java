class Solution {
    public int reverse(int x) {
        String a = Integer.toString(x);
        int flag = 0;
        long reverse = 0;
        if(a.charAt(0) == '-'){
            flag = 1;
            x = x * (-1);
        }
        int num = 0;
        while(x>0){
            reverse = reverse * 10;
            num = x % 10;
            reverse = reverse + num;
            x = x / 10;
        }
        System.out.println("reverse : "+reverse);
        if(flag == 1){
            reverse = reverse * (-1);
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        return (int)reverse;
    }
}