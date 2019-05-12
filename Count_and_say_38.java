class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        if(n == 2){
            return "11";
        }
        String a = "11";
        for(int i = 3; i<=n; i++){

            a = printNumber(a);
        }
        return a;

    }
    public String printNumber(String a){

        int count;
        String result = "";
        int i = 0;
        boolean flag = false;
        while (i<a.length()){
            count = 1;
            int j = i+1;
            if(j!=a.length()) {
                while (a.charAt(i) == a.charAt(j)) {
                    count++;
                    j++;
                    flag = true;
                    if (j == a.length()) {
                        break;
                    }
                }
            }
            result = result + String.valueOf(count) + a.charAt(i);
            if(flag) {
                i = j;
            }else {
                i++;
            }

        }
        return result;
    }
}