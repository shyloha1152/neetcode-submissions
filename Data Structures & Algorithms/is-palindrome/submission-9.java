class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int l=0;
        int r=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
         
        }
        return true;
        
    }
      
}
