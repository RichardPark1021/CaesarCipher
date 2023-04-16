/**
 * @Class: CaesarCipher
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: April 25, 2023
 * Description: The program will take in a message and a key from the user and output the encrypted or
 * decrypted message.
 */

public class CaesarCipher {
    private int shift;

    //constructor
    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    //This method will take in a String message to be encrypted and returns the encrypted message as a String
    public String encrypt(String message) {
        //Checks if the shift is a positive or negative number
        if(shift > 26) {
            shift = shift % 26;
        }
        else if (shift < 0) {
            shift = (shift % 26) + 26;
        }

        String cipher = "";
        int length = message.length();
        for(int i = 0; i < length; i++) {
            char ch = message.charAt(i);
            //checks if the character is a letter
            if(Character.isLetter(ch)) {
                //checks if the letter is lowercase
                if(Character.isLowerCase(ch)) {
                    char c = (char)(ch + shift);
                    //checks if char c is out of bounds
                    if(c > 'z') {
                        cipher += (char)(ch - (26 - shift));
                    }
                    else {
                        cipher += c;
                    }
                }
                //checks if the letter is uppercase
                else if(Character.isUpperCase(ch)){
                    char c = (char)(ch + shift);
                    //checks if char c is out of bounds
                    if(c > 'Z') {
                        cipher += (char)(ch - (26 - shift));
                    }
                    else {
                        cipher += c;
                    }
                }
            }
            //returns if the character is not a letter
            else {
                cipher += ch;
            }
        }

        return cipher;
    }

    //This method will take in a String message to be decrypted and returns the decrypted message as a String
    public String decrypt(String message) {
        //Checks if the shift is a positive or negative number
        if(shift > 26) {
            shift = shift % 26;
        }
        else if (shift < 0) {
            shift = (shift % 26) + 26;
        }

        String cipher = "";
        int length = message.length();
        for(int i = 0; i < length; i++) {
            char ch = message.charAt(i);
            //checks if the character is a letter
            if(Character.isLetter(ch)) {
                //checks if the letter is lowercase
                if(Character.isLowerCase(ch)) {
                    char c = (char)(ch - shift);
                    //checks if char c is out of bounds
                    if(c < 'a') {
                        cipher += (char)(ch + (26 - shift));
                    }
                    else {
                        cipher += c;
                    }
                }
                //checks if the letter is uppercase
                else if(Character.isUpperCase(ch)){
                    char c = (char)(ch - shift);
                    //checks if char c is out of bounds
                    if(c < 'A') {
                        cipher += (char)(ch + (26 - shift));
                    }
                    else {
                        cipher += c;
                    }
                }
            }
            //returns the character if it's not a letter
            else {
                cipher += ch;
            }
        }

        return cipher;
    }

}
