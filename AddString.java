class AddString {
    public String addStrings(String num1, String num2) {
       
        int different = num1.length() - num2.length();
        if (different>0) {
            while(different!=0) {
                num2 = "0" + num2;
                different--;
            }
        } else if (different<0) {
            while(different!=0) {
                num1 = "0" + num1;
                different++;
            }
        }
        
        
        String s = "";
        int carryOver = 0;
        int j = num1.length()-1;
        
        while(j>=0) {
            int value = num1.charAt(j)-'0' + num2.charAt(j)-'0' + carryOver;  
            s = Integer.toString(value%10) + s;
            if(num1.charAt(j)-'0' + num2.charAt(j)-'0' + carryOver > 9) {
                carryOver = value/10;
            } else {
                carryOver = 0;
            }
            j--;
        }
        
        if(carryOver > 0 ) {
           s = Integer.toString(carryOver) + s;  
        }
        return s;
        
       
    }
}
