/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomPrac;

/**
 *
 * @author piklu
 */
public class NewClass 
{
    public static void main(String[] args) throws Exception
    {
        Class x=Class.forName("RandomPrac.A");
        A obj=(A)x.newInstance();
        obj.show();
        
    }
    
}
class A
{
    public void show()
    {
        System.out.println("in A");
    }
}

