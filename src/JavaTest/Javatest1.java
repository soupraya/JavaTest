package JavaTest;

public class Javatest1 {
  public static void main(String[] args) {     
    System.out.println("Javatest1");
    ArrayTest arraytest1 = new ArrayTest(5,6,7);
    arraytest1.addArray();
    //System.out.println(arraytest1.getD().toString());
    double[] D = new double[arraytest1.getD().length];
    D = arraytest1.getD();
    for(int i=0;i<D.length;i++)
    System.out.println(D[i]);
    }
  
}
