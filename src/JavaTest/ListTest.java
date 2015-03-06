package JavaTest;

import java.util.ArrayList;
import java.util.*;

public class ListTest {
  ArrayList<CostItem> myList = new ArrayList<CostItem>();
  CostItem costa = new CostItem(5,6);
  CostItem costb = new CostItem(1,2);
  CostItem costc = new CostItem(8,9);
  
  public ListTest()
  {
    myList.add(costa);
    myList.add(costb);
    myList.add(costc);
  }
  
  public Integer addListItem()
    {
    Integer result=0;
    Iterator<CostItem> It = myList.iterator();
    
    while(It.hasNext())
    {
      CostItem costItemTmp =It.next();
      result += costItemTmp.getA()*10 + costItemTmp.getB()*100;
      
    }
    return result;
    
  }
  
}
