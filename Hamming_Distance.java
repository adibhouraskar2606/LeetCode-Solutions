class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        String a = Integer.toBinaryString(y);
        String b = Integer.toBinaryString(x);
        System.out.println("String lengths - a :"+a.length()+" b : "+b.length());
        if(a.length()>b.length()){
            System.out.println("if condition");
             int n = a.length() - b.length();
            System.out.println("n : "+n);
             for(int i = 0; i<n; i++){
                 b = "0" + b;
                 System.out.println("b  value : "+b);
             }
            System.out.println("value of b : "+b);
            System.out.println("value of a : "+a);
        }else{
            int n = b.length() - a.length();
            for(int i = 0; i<n; i++){
                a = "0" + a;
                System.out.println("a  value : "+a);
            }
        }
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                count++;
            }
        }
        return count;
    }
}