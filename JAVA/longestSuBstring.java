package javaprograms;
public class longestSuBstring {
	 public int lengthOfLongestSubstring(String s) {

	        int n = s.length();
	 
	        int result = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                if (checkRepetition(s, i, j)) {
	                    result = Math.max(result, j - i + 1);
	                }
	            }
	        }
	        return result;
	    }
	    private boolean checkRepetition(String s, int start, int end) {
	        int[] chars = new int[128];
	        for (int i = start; i <= end; i++) {
	            char c = s.charAt(i);
	            chars[c]++;
	            if (chars[c] > 1) {
	            return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String args[]) {
	    	longestSuBstring substring = new longestSuBstring();
	        String s = " abcabcbbc";
	        System.out.println(substring.lengthOfLongestSubstring(s));
	    }
	

	}


