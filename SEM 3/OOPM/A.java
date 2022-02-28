abstract class A
{
  abstract void callme();
}
class B extends A
{
  void callme()
  {
    System.out.println("Holidayssss...............");
  }
  public static void main(String[] args)
  {  
    B b = new B();
    b.callme();
  }
}