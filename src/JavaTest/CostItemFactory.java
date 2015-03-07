package JavaTest;

public class CostItemFactory {
  public CostItemInterface getCostItem(String type)
    {
    if(type == "Day")
    	return new CostItemDayBasis();
    else 
    	return new CostItemElementbasis();
  }
  
}
