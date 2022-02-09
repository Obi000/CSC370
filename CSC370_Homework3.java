/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc370_homework3;
import java.util.Arrays;
import java.util.Comparator;


/**
 *
 * @author samuelnwuha
 */
public class CSC370_Homework3 {
    public class DirCompile implements Comparator<String>
    {
        public int compare(String a, String b) 
        {
			String[] array = a.split("/");
			String[] brray = b.split("/");
			
			if (array.length - brray.length != 0) 
                        {
                            return array.length - brray.length;
                        }
			
			else 
                        {
                            for (int i = 0; i < array.length; i++) 
                            {
				int comp = array[i].compareTo(brray[i]);
				if (comp != 0) return comp;
                            }
			}
			return 0;
        }
        public String[] sort(String[] dirs) 
        {
		Arrays.sort(dirs, new DirCompile());
		return dirs;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
