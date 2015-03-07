package JavaTest;

public class CostItemDayBasis implements CostItemInterface {
	 Integer A;
  	 Integer B;
    Integer C;
  
  
    @Override
    public void getItemA() {
        // TODO Auto-generated method stub
        System.out.print(A);
    }

    @Override
    public void getItemB() {
        // TODO Auto-generated method stub
        System.out.print(B);
    }

    @Override
    public void getItemC() {
        // TODO Auto-generated method stub
        System.out.print(C);
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
