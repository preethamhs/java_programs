package pattern;

public class Sp5
{
	
 public static void main(String args[])
 { 
 int i,j;
 int n=5;
 /*Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no of lines");
     n = sc.nextInt();*/
    
 for(i=1;i<=n;i++)
     {
         for(j=i;j<=n;j++)
         {
             System.out.print(" ");
         }
         for(j=1;j<=i;j++)
         {
             System.out.print("* ");
         }
         System.out.println();
     } 
 }
}
