
package core;


public class Temp 
{
    public static void main(String[] args) 
    {
       BB obj=new BB();
       obj.display();
    }
    
}
class AA
{
    public void show()
    {
        System.out.println("Inside parent class");
    }
    
}
class BB extends AA
{
    public void display()
    {
        System.out.println("Inside child class");
    }
}