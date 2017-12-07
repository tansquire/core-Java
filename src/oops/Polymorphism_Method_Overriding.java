package oops;


public class Polymorphism_Method_Overriding 
{
    public static void main(String[] args) 
    {
        Overload obj=new Overload();
        obj.Poly();
        obj.Poly1();
        
        
        
    }
    
}
class Overriding  //same function name, same class, diff parameter
{
    public void Poly()
    {
        System.out.println("Inside Poly parent");
    }
     public void Poly1()
    {
        System.out.println("Inside Poly1 parents");
    }
  
}
class Overload extends Overriding  //same function name, diff class, same parameter
{
    public void Poly()
    {
        System.out.println("Inside Poly child");
    }
}