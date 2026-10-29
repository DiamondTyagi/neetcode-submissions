class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length())return false;
      HashMap<Character, Integer> mapone = new HashMap<>();
      HashMap<Character, Integer> maptwo = new HashMap<>();
      for(int i=0; i<s.length(); i++){
        char a = s.charAt(i);
        char b = t.charAt(i);
        mapone.put(a, mapone.getOrDefault(a, 0) + 1);
        maptwo.put(b, maptwo.getOrDefault(b, 0) + 1);
      }
      boolean result = mapone.equals(maptwo);
      return result;
    }
}
