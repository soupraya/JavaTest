package JavaTest;

public class Javatest1 {
  
  public static void testArray()
    {
    System.out.println("ArrayTest");
    ArrayTest arraytest1 = new ArrayTest(5,6,7);
    arraytest1.addArray();
    System.out.println(arraytest1.getD().toString());
    double[] D = new double[arraytest1.getD().length];
    D = arraytest1.getD();
    //System.arraycopy(arraytest1.getD(),0,D,0,arraytest1.getD().length);
    for(int i=0;i<D.length;i++)
    	System.out.println(D[i]);
    arraytest1.printD();
      }
  
  public static void testList()
    {
    System.out.println("ListTest");
    ListTest listTest1 = new ListTest();
    System.out.println(listTest1.addListItem());
  }
  
  public static void main(String[] args) {     
    System.out.println("Javatest1");
    //testList();
    new FactoryTest();
    }
  	
  
}
