package encryption;
import java.util.Scanner;


import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.*;
import java.math.*;

public class sol {

  
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  
     public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(input.nextLine().getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
        System.out.println();
        
        System.out.println("\\e");
    }
}
    

