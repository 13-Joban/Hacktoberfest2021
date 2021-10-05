class Solution {
    public boolean isPalindrome(int x) {
      // if x = 0, x < 0  and x is multiple of 10 means x is not palindrome 
        

        int rem = 0;
        int original = x;
        if( x < 0 || ( x!= 0 && x %10 == 0)){
        return false;
        }
        
        while( x!= 0){
            
         
            rem = x%10 + rem*10;
            
            x = x/10;
            
        }
        
        return(rem == original);
    }
}
