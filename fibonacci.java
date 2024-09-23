/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac;
import java.util.Scanner;
/**
 *
 * @author Otep
 */
public class Prac {

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of term in the Fibonacci Series: ");
        
        int numTerm = input.nextInt();
        
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series");
        
        for (int i = 1; i <= numTerm; i++)
        {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
