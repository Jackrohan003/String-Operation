/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Defanging an IP Address
Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

*/
public String defangIPaddr(String address) {
        
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i<address.length(); i++) {
            if(address.charAt(i)=='.') {
                sb.append("[.]");   
            } else {
                sb.append(address.charAt(i));
            }     
            
        }
        return sb.toString();
    }
