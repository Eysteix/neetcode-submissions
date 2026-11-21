class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()){
        return false;
      }

      HashMap<Character,Integer> letters = new HashMap<>();

    // Filling the HashMap Table
      for (int i = 0; i < s.length();i++){
        char word =  s.charAt(i);
        if(letters.containsKey(word)){
            letters.put(word,letters.get(word)+1);
        }
        else{
            letters.put(word,1);
        }

      }

    // Removing the values 
     
    for (int i = 0; i < t.length();i++){
        char word =  t.charAt(i);
        if(letters.containsKey(word)){
            letters.put(word,letters.get(word)-1);
        }
        else{
            return false;
        }

      }

      
    for (int i = 0; i < s.length();i++){
            char word =  s.charAt(i);
            if(letters.containsKey(word) && letters.get(word) != 0){       
                 return false;     
            }
  
        }

        
      return true;


      

    }
}
