import java.util.Scanner;

public class Evenp{
public static void main(String[] args) {
   Scanner in= new Scanner (System.in);
   
   int sum = 0;
   System.out.print("Enter limit number: ");
   int limit = in.nextInt();
   int oddNumbers = 0;
   int evenNumbers = 0;

   for(int i= 1;i<=limit;i++)
   {
       System.out.println("Enter limit number: "+i+"");
       int numbers= in.nextInt();

       if(numbers %2==0)
       {
           evenNumbers++;
       }
       else if(numbers %2==1)
       {
           oddNumbers++;
       }
   }
   System.out.println("There are: "+oddNumbers+" odd numbers");
   System.out.println("There are :"+evenNumbers+" even numbers");

       }

   }