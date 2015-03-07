package JavaTest;

public class ArrayTest {
  double A;
  double B;
  double C;
  double D[] = new double[3];
  String E;
  
  public ArrayTest(double A, double B, double C)
    {
    this.A= A;
    this.B= B;
    this.C= C;
	 }
  
  public void addArray()
    {
    D[0] = A;
    D[1] = B;
    D[2] = C;
  	}
  
  public double[] getD()
    {
    return D;
    
  }
  public void printD()
    {
    for(int i=0;i<D.length;i++)
    	System.out.println(D[i]);
  }
  	
}