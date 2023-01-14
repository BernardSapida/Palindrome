package Palindrome;

import java.util.LinkedList; 

/**
 *
 * @author Ahdessa Perez
 */
public class Palindrome_Perez_Ahdessa {
    public static void main(String[] args) { 
        // should return true 
        System.out.println(checkForPalindrome("abccba")); 
        // should return true 
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?")); 
        // should return true 
        System.out.println(checkForPalindrome("I did, did I?")); 
        // should return false 
        System.out.println(checkForPalindrome("hello")); 
       // should return true 
        System.out.println(checkForPalindrome("Don't nod")); 
 
    } 
 
    public static boolean checkForPalindrome(String string) { 
        LinkedList<Character> stack = new LinkedList<Character>(); 
        LinkedList<Character> queue = new LinkedList<Character>(); 
        String lowerCase = string.toLowerCase(); 

        //loop to add elements to queue and stack 
        for (int i = 0; i < lowerCase.length(); i++) {             
            char c = lowerCase.charAt(i); 

            if (c >= 'a' && c <= 'z') {
                queue.addLast(c); 
                stack.push(c); 
            } 
        } 

        while(!stack.isEmpty()) { 
            //insert code for removing elements in the queue and comparing if it equals to the removed items in the stack (3pts)
            if(!(queue.removeFirst() == stack.removeFirst())) return false; 
        } 

        return true;
    } 
}
