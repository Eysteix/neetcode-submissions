  class Solution{
  
  public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find the delimiter '#' to extract the length of the next string
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            int length = Integer.parseInt(str.substring(i, j));
            // Extract the exact number of characters after '#'
            i = j + 1 + length;
            res.add(str.substring(j + 1, i));
        }
        
        return res;
    }}