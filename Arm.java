
/*public class Arm {


	public static void accept(int no)
	{
		
		int p=no,rem,s=0;
	do
	{
		rem=p%10;
		s=s*10+rem;
		p=p/10;
	}
	while(p!=0);
		if(s==no)
			System.out.println("it is an armstrong");
			else
	System.out.println("it is not an armstrong");
	}
	
}
*/
class Arm 
{
    public static void main(String [] args) 
    {
      Arm p = new Arm();
        p.start();
    }

    void start() 
    {
        long [] a1 = {3,4,5};
        long [] a2 = fix(a1);
        System.out.print(a1[0] + a1[1] + a1[2] + " ");
        System.out.println(a2[0] + a2[1] + a2[2]);
    }

    long [] fix(long [] a3) 
    {
        a3[1] = 7;
        return a3;
    }
}