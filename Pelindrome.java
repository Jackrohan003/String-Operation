public class Solution {
	public int isPalindrome(String a) {
	    // check if char at i = char at n - i with two pointers, ignoring non alphanumeric
	    int n = a.length();
	    int startIdx = 0;
	    int endIdx = n - 1;
	    
	    while(startIdx < endIdx) {
	        char head = a.charAt(startIdx);
	        head = Character.toLowerCase(head);
	        
	        if(!Character.isLetterOrDigit(head)) {
	            // head is not alphanumeric, move on
	            startIdx++;
	        } else {
                char tail = a.charAt(endIdx);
                tail = Character.toLowerCase(tail);
            
                if(!Character.isLetterOrDigit(tail)) {
                    // tail is not alphanumeric, move on
                    endIdx--;
	            } else {
	                // at this point both are alphanumeric, check equality
                    if(head != tail) {
                        return 0;
        	        }
        	        
        	        // chars are equal, move on to next pair
        	        startIdx++;
        	        endIdx--;
	            }
	        }
	    }
	    
	    return 1;
	}
}

