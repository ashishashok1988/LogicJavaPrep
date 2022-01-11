package ashish2021;

public class Palindrome {

    public static void main(String[] args) {
        
        String s = "abcba";
        
        Palindrome palindrome = new Palindrome();
        
        System.out.println(palindrome.isItPalindrome(s));
    }

    public boolean isItPalindrome(String s) {
        if(s.isBlank()) {
            return false;
        }


        for (int i = s.length()-1, j=0; i >= 0; i--, j++) {
           if (s.charAt(j) == s.charAt(i)) {
               continue;
           } else {
               return false;
           }
               
        }
        
        
        return true;
    }
   
}
