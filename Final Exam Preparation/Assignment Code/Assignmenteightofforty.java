
package javaapplication34;

import java.util.*;
public class Assignmenteightofforty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s=input.nextLine();
        char[] characters=s.toCharArray();
        determinecharactertype(characters);
    }
    public static void determinecharactertype(char[] character){
        for(char ch:character)
        {
            if(Character.isLetter(ch)){
                System.out.println(ch+" is a letter.");
            }
            else if(Character.isDigit(ch)){
                System.out.println(ch+"is a digit");
            }
            else if(Character.isWhitespace(ch)){
                System.out.println("Whitespaces detected");
            }
            else {
                System.out.println(ch+" is a special character");
            }
        }
    }
    
}
