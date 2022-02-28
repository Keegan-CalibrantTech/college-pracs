class A
{
   public void methodA()
   {
      System.out.println("This is a Cube");
   }
}

class C extends A
{
  public void methodC()
  {
    int perimeter, p = 10 ;
    perimeter = 12 * p;
    System.out.println("Perimeter of the cube is "+perimeter+" units.");
  }
}
class D extends A
{
  public void methodD()
  {
    int surface, sa = 10;
    surface = 6 * sa * sa;
    System.out.println("Total Surface area of the cube is "+surface+" square units.");
  }
}
class JavaExample
{
  public static void main(String args[])
  {
     C obj2 = new C();
     D obj3 = new D();
     obj2.methodC();
     obj3.methodD();
  }
}
