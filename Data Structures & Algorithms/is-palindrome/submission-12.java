class Solution {
    public boolean isPalindrome(String s) {
        s=s.toUpperCase().replaceAll("[^A-Za-z0-9]","");
       
            int left=0;
            int right=s.length()-1;
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    return false;
                }
                //if its  not false u ll move forward
                left++;
                right--;

            }
            return true;
        }
        
    }

