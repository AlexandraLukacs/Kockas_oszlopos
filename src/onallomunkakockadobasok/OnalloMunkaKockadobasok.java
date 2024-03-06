/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onallomunkakockadobasok;

import java.util.Random;
import java.util.Scanner;


public class OnalloMunkaKockadobasok {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in, "latin2");
    
    public static void main(String[] args) {
        
        //Lukács Alexandra
        
        System.out.print("Hányszor szeretne dobni: ");
        int dobasDb = sc.nextInt();
        
        final int dobasokDb = 13;
        int[] dobasok = new int[dobasokDb+1];
        
        for (int i = 0; i < dobasDb; i++) {
            int dobas = rnd.nextInt(1,13);
            dobasok[dobas]++;
        }
        
        int max = 0;
        for (int i = 1; i < dobasok.length; i++) {
            if (dobasok[i] > dobasok[max]){
                max = i;
            }
        }
        
        int maxErtek = dobasok[max];
        
        final int max_csillag = 40;
        for (int i = 1; i < dobasok.length; i++) {
            System.out.print(i + " ");
            int elofordulas = dobasok[i];
            
            double szamitas = dobasok[i] / max * max_csillag;
        }
        
        
        
    }
    
}
