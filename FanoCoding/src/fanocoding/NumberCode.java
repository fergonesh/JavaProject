/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fanocoding;

import java.util.ArrayList;

/**
 *
 * @author pasha
 */
public class NumberCode {
    private int probability;
    private ArrayList<Integer> numRecord;
    
    NumberCode(int prob, ArrayList<Integer> rec)
    {
        this.numRecord = new ArrayList<Integer>(rec);
        this.probability = prob;
    }

    public int getProbability() {
        return probability;
    }

    public ArrayList<Integer> getNumRecord() {
        return numRecord;
    }
    
    
    
}
