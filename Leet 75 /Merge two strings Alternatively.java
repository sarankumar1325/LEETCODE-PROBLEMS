class Solution {
    public String mergeAlternately(String word1, String word2)
    {
      StringBuilder merger = new StringBuilder();
      int i = 0;
      while( i < word1.length() || i < word2.length()){
        if( i < word1.length()){
            merger.append(word1.charAt(i));
        }
        if( i < word2.length()){
            merger.append(word2.charAt(i));
        }
        i++;
      }
      return merger.toString();  
    }
}
