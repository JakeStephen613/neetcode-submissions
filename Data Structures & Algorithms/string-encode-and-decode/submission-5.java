class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s);
            encoded.append("`");
        }
        
        return encoded.toString(); 
        
    }

    public List<String> decode(String str) {

        int n = str.length();
        List<String> decoded = new ArrayList<>(); 
        int prev = 0; 

        for (int i = 0; i < n; i++){
            if (str.charAt(i) == '`'){
                decoded.add(str.substring(prev, i));
                prev = i + 1; 
            }
        }

        return decoded; 


    }
}
