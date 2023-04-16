/**
 * @Class: Main
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: April 25, 2023
 * Description: The program will take in a message and a key from the user and output the encrypted or
 * decrypted message.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Asks the user for input
        System.out.print("Enter a message to be encrypted or decrypted: ");
        String str = sc.nextLine();

        System.out.print("Enter 'E' to encrypt or 'D' to decrypt: ");
        String crypt = sc.nextLine();

        System.out.print("Enter a integer key value for encryption or decryption: ");
        int num = sc.nextInt();

        //creates an instance of the CaesarCipher class
        CaesarCipher cc = new CaesarCipher(num);

        //switch-case to check if the user wants the message to be encrypted or decrypted
        switch(crypt) {
            case "E":
                System.out.println("Encrypted message: " + cc.encrypt(str));
                break;
            case "D":
                System.out.println("Decrypted message: " + cc.decrypt(str));
                break;
        }

    }
}
