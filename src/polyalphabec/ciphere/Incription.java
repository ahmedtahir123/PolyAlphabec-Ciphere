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
public class Incription {
ArrayList<String> A1;
    public Incription() {
    }

    String func(int w1, char arr[][], ArrayList<String> A1) throws IOException, FileNotFoundException {
         Scanner input = new Scanner(System.in);
        
        System.out.println("1-incription");
        System.out.println("2-decription");
        String ret = "";

        switch(input.nextInt()){
           
        case 1:{
        int z = 0;
        while (z != A1.size()) {
            for (int i = 0; i < w1; i++) {
                if (z < A1.size()) {
                    int g = A1.get(z).hashCode() - 97;
                    ret += Character.toString(arr[i][g]);
                    z++;
                } else {
                    break;
                }
            }
        }
            System.out.println("Incripted="+ret);
           break;
        }
        case 2:{
            
            int q=0;
            for (int i = 0; i < A1.size(); i++) {
                for (int j = 0; j < 26; j++) {
                   if(A1.get(i).equals(Character.toString(arr[q][j]))){
                       int s=j+97;
                       //System.out.print((char)s);
                       ret+=(char)s;
                       q++;
                       if(q>=3){
                           q=0;
                       }
                       break;
                   }
                }
            }
                        System.out.println("Decripted="+ret);
             break;

    }

}
        return ret;
    }
    

    
}