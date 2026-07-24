class Solution {

    public String encode(List<String> strs) {
        StringBuilder f= new StringBuilder();
        for(String s : strs){
            f.append(s.length()).append('#').append(s);
        }
        return f.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
        while(j < str.length() && str.charAt(j) != '#'){
            j++;
        }
        if (j == str.length()) break;
        int len = Integer.parseInt(str.substring(i,j));
        j++;
        res.add(str.substring(j,j+len));
        i = j+len;
        }
        return res;
    }
}
