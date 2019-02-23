/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polyalphabec.ciphere;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class PolyAlphabecCiphere {

    /**
     * @param args the command line arguments
     */
//    
    public static void main(String[] args) throws IOException /*throws FileNotFoundException, IOException*/ {
       
        ArrayList<String> A1 = new ArrayList<String>();
        ArrayList<Integer> A2 = new ArrayList();

        FileReader fr;
        String s = "C:\\Users\\dell\\Documents\\NetBeansProjects\\the_vigenere_cipher\\src\\the_vigenere_cipher\\Plaintext.txt";
        BufferedReader br = new BufferedReader(new FileReader(s));
        String h = br.readLine();

        String w[] = h.split("");
        for (int i = 0; i < w.length; i++) {
            if (w[i].charAt(0) == (char) 127) {
            } else {
                A1.add((Character.toString(w[i].charAt(0))));
            }
        }
        
        
        System.out.println("Input no of rows");
        Scanner input = new Scanner(System.in);
        int w1 = input.nextInt();

        int y;
        char arr[][] = new char[w1][26];
        for (int j = 0; j < w1; j++) {
            for (int i = 0; i < 26;) {
                y = (int) (Math.random() * 26 + 97);
                if (!A2.contains(y)) {
                    A2.add(y);
                    i++;
                }
            }
            
            for (int i = 0; i < 26; i++) {
                arr[j][i] = (char) A2.get(i).hashCode();
            }
            A2 = new ArrayList<>();

        }
        
        y = 65;
        for (int i = 0; i < 26; i++) {
            System.out.print((char) y + " ");
            y++;
        }
        System.out.println("");
        for (int i = 0; i < w1; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println("");
        }

        Incription n = new Incription();

         n.func(w1, arr, A1);

    }

}
