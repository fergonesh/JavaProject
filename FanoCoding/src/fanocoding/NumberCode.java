
package fanocoding;

import java.util.ArrayList;

/**
 *
 * @author Fergonesh
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
