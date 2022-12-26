import java.util.*;

import javax.lang.model.util.ElementScanner14;
class Ticket 
{
    void generete()
    {
        System.out.println("Enter person");
        Scanner obj = new Scanner(System.in);
        int per = obj.nextInt();

        int age[] = new int[per];
        System.out.println("Enter age");
        for(int i=0;i<per;i++)
        {
            age[i]=obj.nextInt();
        }

        int price=0;
        for(int num:age)
        {
            if(num<3)
            {
                price = price+0;
            }
            else if(num>=3 && num<=12)
            {
                price = price+100;
            }
            else 
            {
                price = price+150;
            }
        }
        System.out.println(price);

    }
}




public class Test3 
{
    public static void main(String[] args) 
    {
        Ticket obj = new Ticket();
        obj.generete();   
    }
}
