package JavaTest;

public class CostItemElementbasis implements CostItemInterface {
	 Integer A;
  	 Integer B;
    Integer C;
  
  
    @Override
    public void getItemA() {
        // TODO Auto-generated method stub
        
        System.out.print(A+5);
    }

    @Override
    public void getItemB() {
        // TODO Auto-generated method stub
        System.out.print(B+5);
    }

    @Override
    public void getItemC() {
        // TODO Auto-generated method stub
        System.out.print(C+5);
    }

    @Override
    public void setItemA(Integer arg0) {
        // TODO Auto-generated method stub
        A =arg0;
    }

    @Override
    public void setItemB(Integer arg0) {
        // TODO Auto-generated method stub
        B =arg0;
    }

    @Override
    public void setItemC(Integer arg0) {
        // TODO Auto-generated method stub
        C =arg0;
    }
  
}
