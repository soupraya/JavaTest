package JavaTest;

public class FactoryTest {
  
  public FactoryTest()
  {
  CostItemFactory costitemfact = new CostItemFactory();
  
  CostItemInterface costitema = costitemfact.getCostItem("Day");
  CostItemInterface costitemb = costitemfact.getCostItem("NotDay");
  costitema.setItemA(5);
  costitemb.setItemA(5);
    
  costitema.getItemA();
  costitemb.getItemA();
  }
}
