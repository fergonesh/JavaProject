package fanocoding;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Fergonesh
 */
public class FanoCoding {
    
    private ArrayList<Integer> probabilityList;
    private ArrayList<NumberCode> numcodeList = new ArrayList<NumberCode>();
    
    
    FanoCoding(ArrayList<Integer> prob)
    {
        this.probabilityList = new ArrayList<Integer>(prob);
    }
    
      public void getFanoCodeOfNum()
    {
        sortArrayListbyDescending();
        
        
        
    }
    
    private void sortArrayListbyDescending()
  {
      Collections.sort(this.probabilityList);
      Collections.reverse(this.probabilityList);
  }
    
        private int getCenterIndex(ArrayList<Integer> sortedList)
  {
      int sumList=0;
      for(Integer i:sortedList)
      {
          sumList+=i;
      }
      
      int centerIndex=0;
      for(int j=0;j<(sortedList.size()-1);j++)
      {
          int l = sortedList.get(j);
          int r = sortedList.get(j+1);
          if ( (l>=(sumList/2)) && (r<=(sumList/2)) )
          {
              centerIndex = l-sumList/2<=sumList/2-r ? j:j+1;
          }
      }
      
      return centerIndex;
  } 
        
}
