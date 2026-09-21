class Solution {

    public String encode(List<String> strs) {
     StringBuilder encode = new StringBuilder();

     for(String str:strs){
        encode.append(str.length()).append('#').append(str);
     }
     return encode.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));
            int start = j+1;
            String stri = str.substring(start, start + len);
            result.add(stri);
            i = start + len;

        }

        return result;


    }
}
