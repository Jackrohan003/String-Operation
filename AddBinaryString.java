// time: O(max(n, m)) | n = len(a), m = len(b)
// space: O(max(n, m));
// binary:
// 0 + 0 = 0
// 1 + 0 = 1
// 1+ 1 = 10
// 1 + 1 + 1= 11
class AddBinaryString {
    public String addBinary(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        
        if (lena < lenb) {
            return addBinary(b, a);
        }
        
        int i = lena - 1;
        int j = lenb - 1;
        StringBuilder sb = new StringBuilder();

        char carry = '0';
        while (i >= 0 && j >= 0) {
            char A = a.charAt(i);
            i -= 1;
            
            char B = b.charAt(j);
            j -= 1;

            if (A == '1' && B == '1') {
                sb.append(carry == '1' ? '1' : '0');
                carry = '1';
            } else if (A == '1' || B == '1') {
                sb.append(carry == '1' ? '0' : '1');
                
            } else if (carry == '1'){
                sb.append('1');
                carry = '0';
            } else {
                sb.append('0');
            }
        }
        
        while (i >= 0) {
            char A = a.charAt(i);
            i -= 1;

            if (A == '1') {
                sb.append(carry == '1' ? '0' : '1');
            } else if (carry == '1') {
                sb.append('1');
                carry = '0';
            } else {
                sb.append('0');
            }
        }
        if (carry == '1') {

            sb.append('1');
        }
        
        return sb.reverse().toString();
    }
}
