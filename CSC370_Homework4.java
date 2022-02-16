/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Worked with Max-Mary
package csc370_homework4;

/**
 *
 * @author samuelnwuha
 */
public class CSC370_Homework4 
{

    /**
     * @param args the command line arguments
     */
    
        public static String[] draw(int [] parent,String[] names)
        {
        int nameLength = names.length;
        String [] output = new String [nameLength];
        boolean frontIndex = false;
        //int [] indexCount = new int [parent.length];

        for(int i = 0; i < parent.length; i++)
        {
            if(parent[i]<0)
            {
                frontIndex = true;
            }
            else if(parent[parent.length-1] < 0)
            {
                frontIndex =  false;
            }
        }
        if(frontIndex)
        {
            int i;
            int j;
            int indexCount = 0;
            for(i = 0; i < parent.length; i++)
            {
                for(j = i;  j> 0; j--){
                    if(parent[i] == parent[j])
                    {
                        indexCount = j;
                    }
                    else
                    {
                        indexCount = 2;
                    }
                }
                System.out.println(indexCount+ "reg");
                output[i] = "  ".repeat(indexCount) + "+-" + names[i];
            }
        }
        else if(!frontIndex)
        {
            int i;
            int j;
            int x;
            int indexCount = 0;
            for(i = parent.length -1 , j = 0; i >= 0 && j < output.length ; i--, j++)
            {
                for(x = 1;  x < i; x++)
                {
                    if(parent[i] == parent[x])
                    {
                        indexCount = j;
                    }
                    else
                    {
                        indexCount = 2;
                    }
                }
                System.out.println(indexCount+ "reg");
                output[j] = " ".repeat(indexCount) + "+-" + names[i];
                indexCount+=2;
            }           
        }


        else
        {

        }
        return output;
    }
    
    public static void printArray(String [] dirs2)
    {
        for (int i = 0; i < dirs2.length;i++)
        {
            System.out.println(dirs2[i]);
        }
        
    }
    public static void main(String args[]) 
    {
        int [] testing1 = {-1,0,1,1,0,0,0,5,5,7,5};
        String [] test1 = {"Root","SubB","LEAF1","LEAF2","LEAF3","LEAF4","SubA","LEAF4","LEAF6","LEAF5","YH"};
        int [] testing2 = {1,2,3,4,5,6,-1};
        String [] test2 = {"A","B","C","D","E","F","G"};
        int [] testing3 = {1,2,3,4,6,6,-1};
        String [] test3 = {"A","B","C","D","E","F","G"};
        int [] testing4 = {6,2,3,4,5,6,-1};
        String [] test4 = {"A","B","C","D","E","F","G"};
        int [] testing5 = {-1,0,1,1,2,2,3,3,0,8,8,9,9,10,10};
        String [] test5 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};


      
        printArray(draw(testing1, test1));
        printArray(draw(testing2, test2));

    }
}
    
   
 
        
   
        
    
    

