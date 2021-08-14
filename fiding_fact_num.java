import java.util.*;
public class fiding_fact_num {

	public static void main(String[] args) {
		
         Scanner s = new Scanner(System.in);
         System.out.println("enter a number");
         int a = s.nextInt();
         for(int i =1; i<=a;i++)
         {
        	 if(a%i ==0)
        		 System.out.println(i+" ");
         }
	}

}
