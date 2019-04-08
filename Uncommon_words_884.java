class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        ArrayList<String> list = new ArrayList<>();
        String [] brokenA = A.split(" ");
        String [] brokenB = B.split(" ");
        for(int i = 0; i<brokenA.length; i++){
            if(!map.containsKey(brokenA[i])){
                map.put(brokenA[i],1);
            }else{
                int count = map.get(brokenA[i]);
                map.put(brokenA[i], count+1);
            }
        }
        for(int i = 0; i<brokenB.length; i++){
            if(!map.containsKey(brokenB[i])){
                map.put(brokenB[i],1);
            }else{
                int count = map.get(brokenB[i]);
                map.put(brokenB[i], count+1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                list.add(entry.getKey());
            }
        }
        String [] x = list.toArray(new String[list.size()]);
        return x;
    }
}