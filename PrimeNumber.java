public class PrimeNumber implements Runnable
{
   public void run()
   {    int num;
        boolean isPrime=true;//flag declared, if isPrime is true, no is prime, else not
        System.out.println("Enter a no. to check:");
        num=Integer.parseInt(System.console().readLine());
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
               isPrime=false;
               break;
            }
        }
            if(isPrime)
              System.out.println(num + " is prime number");
            else
              System.out.println(num + "is not a prime number");

   }
      public static void main(String args[])
      {
         PrimeNumber pn = new PrimeNumber();
         Thread t1= new Thread(pn);
         t1.start();
      }
}