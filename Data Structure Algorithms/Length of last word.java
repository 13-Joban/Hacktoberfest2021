class Solution {
    public int lengthOfLastWord(String s) {
     
        
        int len =0;
        
        int j= s.length() - 1;
        
            
        while( j >= 0){
            if( s.charAt(j) == ' ')     {
                j--;
                
            }       
            else {
                while( j>= 0 && s.charAt(j) != ' '){
                    j--;
                    len++;
                }
                
                break;
            }
        }
        
        return len;
        
    }
}
