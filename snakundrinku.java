/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prototep;
import java.util.Scanner;
/**
 *
 * @author CL2-PC19
 */
public class Prototep {

    public static void main(String[] args) 
 {
        Scanner input = new Scanner (System.in);
        
        System.out.println(" [1] - Snacks ");
        System.out.println(" [2] - Drinks ");
        
        System.out.println(" Enter your Choice ");
        int  ch1 = input.nextInt();
        
        if (ch1==1)
        {
            System.out.println(" Snacks ");
            System.out.println(" [1] - Piatos [20 Pesos] ");
            System.out.println(" [2] - Nova [20 Pesos] ");
            
            System.out.println(" Enter the snacks of your choice: ");
            int ch2 = input.nextInt();
 
            if (ch2==1)
            {
                System.out.println(" Piatos 20 Pesos ");
                int Pia, Nova;
                
                Pia = 20;
                Nova = 20;
                
                System.out.println(" Would you like to order drinks? [1] - YES or [2] - NO ");
                int ch3 = input.nextInt();
                
                if (ch3==1)
                {
                    System.out.println(" Drinks ");
                    System.out.println(" [1] - Coke [25 Pesos] ");
                    System.out.println(" [2] - Water [27 Pesos] ");
                      
                    System.out.println(" Enter the drinks of your choice: ");
                    int ch4 = input.nextInt();
                    int Coke, Water;
                      
                    Coke = 25;
                    Water = 27;
                      
                    if (ch4==1)
                    {
                        System.out.println(" Coke 25 Pesos ");
                        int tot;
                        tot = Coke + Pia;
                        
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    else
                    {
                        System.out.println(" Invalid Input ");
                        int tot;
                        tot = 25;
                    
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    
                    if (ch4==2)
                    {
                        System.out.println(" Water 27 Pesos ");
                        int tot;
                        tot = Water + Pia;
                        
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                }
                
                else if (ch3==2)
                {
                    System.out.println(" Piatos 20 Pesos ");
                    int tot;
                    tot = 20;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
                else 
                {
                    System.out.println(" Invalid Input ");
                    int tot;
                    tot = 20;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
            }
            
            if (ch2==2)
            {
                System.out.println(" Nova 20 Pesos ");
                int Pia, Nova;
                
                Pia = 20;
                Nova = 20;
                
                System.out.println(" Would you like to order drinks? [1] - YES or [2] - NO ");
                int ch6 = input.nextInt();
                    
                if (ch6==1)
                {
                    System.out.println(" Drinks ");
                    System.out.println(" [1] - Coke [25 Pesos] ");
                    System.out.println(" [2] - Water [27 Pesos] ");
                      
                    System.out.println(" Enter the drinks of your choice: ");
                    int ch7 = input.nextInt();
                    int Coke, Water;
                      
                    Coke = 25;
                    Water = 27;
                      
                    if (ch7==2)
                    {
                        System.out.println(" Water 27 Pesos ");
                        int tot;
                        tot = Water + Nova;
                        
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    
                    if (ch7==1)
                    {
                        System.out.println(" Coke 25 Pesos ");
                        int tot;
                        tot = Coke + Nova;
                        
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    else if (ch7>=3)
                    {
                        System.out.println(" Invalid Input ");
                        int tot;
                        tot = 20;
                    
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                }
                
                else if (ch6==2)
                {
                    System.out.println(" Nova 20 Pesos ");
                    int tot;
                    tot = 20;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
                else
                {
                    System.out.println(" Invalid Input ");
                    int tot;
                    tot = 20;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
            }
            else if (ch2>=3)
            {
               System.out.println(" Invalid Input ");      
            }   
        } 

        else if (ch1==2)
        {
            System.out.println(" Drinks ");
            System.out.println(" [1] - Coke [25 Pesos] ");
            System.out.println(" [2] - Water [27 Pesos] ");
            
            System.out.println(" Enter the drinks of your choice: ");
            int ch8 = input.nextInt();
            
            if (ch8==1)
            {
                System.out.println(" Coke 25 Pesos ");
                int Coke, Water;
                
                Coke = 25;
                Water = 27;
                
                System.out.println(" Would you like to order snacks? [1] - YES or [2] - NO ");
                int ch9 = input.nextInt();
                
                if (ch9==1)
                {
                    System.out.println(" Snacks ");
                    System.out.println(" [1] - Piatos [20 Pesos] ");
                    System.out.println(" [2] - Nova [20 Pesos] ");
                    
                    System.out.println(" Enter the snacks of your choice: ");
                    int ch10 = input.nextInt();
                    int Pia, Nova;
                    
                    Pia = 20;
                    Nova = 20;
                    
                    if(ch10==1)
                    {
                        System.out.println(" Piatos 20 Pesos ");
                        int tot;
                        tot = Coke + Pia;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                            
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    
                    if (ch10==2)
                    {
                        System.out.println(" Nova 20 Pesos ");
                        int tot;
                        tot = Coke + Nova;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    else if (ch10>=3)
                    {
                        System.out.println(" Invalid Input ");
                        int tot;
                        tot = 25;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                }
                
                else if (ch9==2)
                {
                    System.out.println(" Coke 25 Pesos ");
                    int tot;
                    tot = 25;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
                else
                {
                    System.out.println(" Invalid Input ");
                    int tot;
                    tot = 25;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
            }
            
            if (ch8==2)
            {
                System.out.println(" Water 27 Pesos ");
                int Coke, Water;
                
                Coke = 25;
                Water = 27;
                
                System.out.println(" Would you like to order snacks? [1] - YES or [2] - NO ");
                int ch11 = input.nextInt();
                
                if (ch11==1)
                {
                    System.out.println(" Snacks ");
                    System.out.println(" [1] - Piatos [20 Pesos] ");
                    System.out.println(" [2] - Nova [20 Pesos] ");
                    
                    System.out.println(" Enter the snacks of your choice: ");
                    int ch12 = input.nextInt();
                    int Pia, Nova;
                    
                    Pia = 20;
                    Nova = 20;
                    
                    if (ch12==1)
                    {
                        System.out.println(" Piatos 20 Pesos ");
                        int tot;
                        tot = Water + Pia;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                            
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    
                    if (ch12==2)
                    {
                        System.out.println(" Nova 20 Pesos ");
                        int tot;
                        tot = Water + Nova;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                            
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    else if (ch12>=3)
                    {
                        System.out.println(" Invalid Input ");
                        int tot;
                        tot = 27;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                }
                
                else if (ch11==2)
                {
                    System.out.println(" Water 27 Pesos ");
                    int tot;
                    tot = 27;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
                else  
                {
                    System.out.println(" Invalid Input ");
                    int tot;
                    tot = 27;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
            }
            else if (ch8>=3)
            {
               System.out.println(" Invalid Input ");
            }
        }
        else
        {
            System.out.println(" Invalid Input ");
        }
    }
}
