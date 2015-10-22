
package calculator;
import java.util.Scanner;
import java.util.Random;
public class lotery {
    
    public static void code()
	{
		int codeid,i;
		int nber;
		Scanner input=new Scanner(System.in);
		System.out.println("Number Between 0-50::");
		
		Random gene=new Random();
		for (i=0;i<=49;i++)
		{
			codeid=1+gene.nextInt(49);
			nber=input.nextInt();
			if (nber==codeid)
			{
				System.out.println("Congz, You have Picked the right nber");
								
			}
			else
			{
				System.out.println("Sorry You have Lost, Try Again Please!");
				System.out.print("The Number Was:\t");
				System.out.print(codeid);
			}	
		
                }
        }
		
public static void main(String[] args)
	{
		lotery object=new lotery();
		object.code();
		

	}
                
                
}
