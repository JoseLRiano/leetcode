import java.util.HashMap;

class isomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length() || s == null || t == null)
            return false;
        HashMap<Character, Character> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)).equals(t.charAt(i)))
                    continue;
                else
                    return false;
            } else {
                if (map.containsValue(t.charAt(i)))
                    return false;
                else
                    map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}