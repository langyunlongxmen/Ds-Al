class Slc242E {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for(int i = 0; i<s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int n: count) {
            if(n != 0) {
                return false;
            }
        }
        return true;
    }

}
