/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc370_homework2;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
import javax.swing.*;
//import java. 
/**
 *
 * @author samuelnwuha
 */
public class CSC370_Homework2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter list of numbers");
        
        
        String userNumbers = userInput.nextLine();
        int rights = Integer.parseInt(userNumbers);
        
        Random rand = new Random();
        int upperbound = 100;
        int minPermission = rand.nextInt(upperbound);
        System.out.println (minPermission);
        
       
      {
        if(rights < minPermission)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("A");
        }
      }
    }
    
}
