import java.util.*;
class Stri
{
    void chak()
    {
        String sc ="My name is ramkishroe";
        char[] st = sc.toCharArray();
        StringBuffer obj = new StringBuffer();

        for (int i=0;i<st.length;i++) 
        {  
            if((st[i] !=' ')) 
            {  
                obj.append(st[i]);  
            }  
        }         
        String str1 = obj.toString(); 
        System.out.println(str1);  
    }  

    
}


public class Test2 
{    public static void main(String[] args) 
    {
        Stri obj = new Stri();
        obj.chak();
    }
    
}
