public class APLine
{
  private double a, b, c;
public APLine(int A, int B, int C){
  a = A;
  b = B;
  c = C;
}
  public double getSlope(){return -1*a/b;}
  public boolean isOnline(int x, int y){return a*x + b*y + c == 0;}
}
