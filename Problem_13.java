class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        if(map.containsKey(s)){
            return map.get(s);
        }
        int count = 0;
        int i = 0;
        while(i<s.length()){
            String temp = "";
            if(i!=s.length()-1) {
                temp = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1));
            }
            if(map.containsKey(temp)){
                System.out.println(map.get(String.valueOf(temp)));
                count = count + map.get(String.valueOf(temp));
                i = i+2;

            }else {
                System.out.println("At i " + map.get(String.valueOf(s.charAt(i))));
                count = count + map.get(String.valueOf(s.charAt(i)));
                System.out.println(count);
                i++;
            }
        }
        return count;
    }
}