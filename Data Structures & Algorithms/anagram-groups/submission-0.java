class Solution {
   
       public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // 1. Count frequency of each lowercase letter ('a' - 'z')
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            // 2. Build a unique, delimited key (e.g., "#1#0#2...")
            StringBuilder keyBuilder = new StringBuilder();
            for (int freq : count) {
                keyBuilder.append('#').append(freq);
            }
            String key = keyBuilder.toString();

            // 3. Group the original word under its canonical key
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }  
    
}
