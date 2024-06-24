class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
      
        StringBuilder str = new StringBuilder();
        
        
        char carry = '0';
        
        while( i >= 0 || j >= 0){
          char cha = ( i >= 0)? a.charAt(i--) : '0';
            char chb = ( j>= 0)? b.charAt(j--): '0';
            
            if( cha == '1' && chb == '1' && carry == '1'){
                carry = '1';
                
                str.append('1');
                
            }
            else if(( cha == '1' && chb == '1' && carry == '0') ||( cha == '1' && chb == '0' && carry == '1') || (cha == '0' && chb == '1' && carry == '1')){
                carry = '1';
                str.append('0');
                
            }
            else if(( cha == '1' && chb == '0' && carry == '0') ||( cha == '0' && chb == '0' && carry == '1') || (cha == '0' && chb == '1' && carry == '0')){
                carry = '0';
                str.append('1');
                
            }
            else{
                carry = '0';
                
                str.append('0');
                
            }
            
        }
        
        if( carry == '1'){
            str.append('1');
        }
        
        str.reverse();
        return str.toString();
        
    }
}
