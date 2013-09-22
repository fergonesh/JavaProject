package fanocoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Fergonesh
 */
public class Main {
 
    public static void main(String[] args) {

    }
    
    
  public static ArrayList getProbability()
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<Integer>();

        
    System.out.print("Enter a sentence: ");
    while (!in.hasNextLine()); {
        //input.addAll(Array.asList(   in.nextLine().split("\\s+")));
        String InputStr = in.nextLine();
        int line = InputStr.split("\\s+").length;
        String[] str = new String[line];
        
       
       str = InputStr.split("\\s+");
       System.out.println(line);
       for (String s: str)
       {
        res.add(Integer.parseInt(s));
        //System.out.println(s);
        
       }
        //input.addAll(in.nextLine().split("\\s+"));

    } 

        in.close();
        return res;
    }
}
