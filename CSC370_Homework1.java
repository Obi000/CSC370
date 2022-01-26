/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csc370_homework1;
import java.util.Scanner;

/**
 *
 * @author samuelnwuha
 */


public class CSC370_Homework1 
{

    public static String encode(String original) {

            // if input is empty, returning empty strinG
          
            if (original.length() == 0) 
            {

                  return "";

            }

            String encoded = "";

            // finding first character

            char c = original.charAt(0);

            // starting count with 1

            int count = 1;
            
            // looping from second index to last

            for (int i = 1; i < original.length(); i++) 
            {

                  // getting current character

                  char current = original.charAt(i);

                  // checking if this char is not equal to c

                  if (c != current) 
                  {

                        // if count is 1, simply appending c to encoded (no 1 prefix)

                        if (count == 1) 
                        {

                              encoded += c;

                        } 
                  
                        else 
                        {

                              // otherwise prepending count before c and appending to

                              // encoded

                              encoded += "" + count + c;

                        }
                        
                        
                        // setting current as new c

                        c = current;

                        // setting count to 1

                        count = 1;

                  } 
                  
                  else if (c == current) 
                  {

                        // same char, updating count
                       count++;

                  }
               
            }

            
            if (count == 1) 
            {

                  encoded += c;

            } 
           else 
            {

                  encoded += "" + count + c;

            }

            return encoded;
     
      }
    
    public int countChar(String str, char c)
{
    int count = 0;

    for(int i=0; i < str.length(); i++)
    {    if(str.charAt(i) == c)
            count++;
    }

    return count;
}
    
     
      public static void main(String[] args) 
      {

   
          Scanner userInput = new Scanner(System.in);
          System.out.println("Enter list of characters");
          
          String userSequence = userInput.nextLine();
         
            String enc = encode(userSequence);


            System.out.println("Original: " + userSequence);

            System.out.println("Encoded : " + enc);

            
      }

}

