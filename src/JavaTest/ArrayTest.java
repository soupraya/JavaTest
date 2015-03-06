package JavaTest;

public class ArrayTest {
  double A;
  double B;
  double C;
  double D[];
  
  public ArrayTest(double A, double B, double C)
    {
    A= this.A;
    B= this.B;
    C= this.C;
	 }
  
  public void addArray()
    {
    D = new double[3];
    D[0] = A;
    D[1] = B;
    D[2] = C;
  	}
  
  public double[] getD()
    {
    return D;
    
  }
  
  
}