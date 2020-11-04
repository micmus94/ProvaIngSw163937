package intermedExam.quickstart;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	MyListUtil mlu=new MyListUtil();
        List<Integer>numeri=Arrays.asList(4,6,1,2,9,8);  
        System.out.println(mlu.Crescente(numeri));
        System.out.println();
        System.out.println(mlu.Decrescente(numeri));
        
    }
}
