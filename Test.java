import java.util.*;
class Number
{
    void count()
    {
        System.out.println("enter range");
        Scanner obj = new Scanner(System.in);       
        int num=obj.nextInt();
        int x=0,y=0,z=0,sum=0,rem=0,re=0;

        for(int i=1; i<=num;i++)
        {            
            int b=i/10;
            int count=1;
            
            while(b!=0){
                b=b/10;
                ++count;
                
            }
        
            
                if(count%2==0)
                {
                    if(count%4==0)
                        {
                            y=y+count*4;  
                        }
                    else{
                            y=y+count*3;
                        }
                    
                }
                else if(count%2!=0)
                {
                    
                x=x+count*2;
                
                }
            
            
        }
            sum= x+y;
          
        for (int l=1;sum!=0;l++)
        {        
            rem=rem+sum%10;
            sum=sum/10;        
        
        }
        
   
  
        for (int l=1;rem!=0;l++)
        {       
            re=re+rem%10;
            rem=rem/10;      
        }
            System.out.println(re);
   }
}

public class Test 
{
    public static void main(String[] args) 
    {
        Number ob = new Number();
        ob.count();
    }
}
