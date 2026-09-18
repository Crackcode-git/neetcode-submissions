class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String string : strs){
          char[] ca = string.toCharArray();
          Arrays.sort(ca);
          String ns = new String(ca);
          map.putIfAbsent(ns, new ArrayList<>());
          map.get(ns).add(string);
        }
        return new ArrayList<>(map.values());
        
    }
}
