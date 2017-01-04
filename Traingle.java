

	
	/*public static void main(String[] args)
	{
	    int row = 4;
	    int space =0;
	    System.out.println("*");
	    for (int i=1;i<row;i++)
	    {
	        System.out.print("*");
	        for(space=0;space<i;space = space+i)
	        {
	            System.out.print(" ");
	        }
	        System.out.print("*");
	    System.out.println();
	    }



	    for(int i=0;i<=4;i++)
	    {
	        System.out.print("* ");
	    }
	}
	
}*/

public class Traingle {
	
	 public static void DrawWithStars(int dimension)
	    {
	        if(dimension < 0)
	        {
	            //Assuming that a triangle with dimension = 0 is a dot....
	            System.out.println("No valid dimension");
	        }
	        else
	        {
	            //To print the first dimension - 1 rows
	            for (int i = 0; i < dimension; i++) 
	            {
	                for (int j = 0; j < dimension - i; j++) {
	                    System.out.print(" ");
	                }

	                //Print the dot of the row 1 at the end
	                if(i != 0)
	                    System.out.print("*");

	                for (int j = 0; j < 2 * i - 1; j++) {
	                    System.out.print(" ");
	                }

	                System.out.println("*");
	            }

	            //To print the last row

	            for (int i = 0; i < dimension; i++)
	            {
	                System.out.print("* ");
	            }

	            System.out.println("*");
	        }
	    }
	}
