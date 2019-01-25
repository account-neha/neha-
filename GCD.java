import java.util.Scanner;
class GCD
{
public static void main(String args[])
{
  System.out.println("Enter the two numbers");
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int H;
  for(H=a<b?b:a;H>=1;H--)
{
  if(a%H==0 && b%H==0)
   break;
}
  System.out.println("HCF is " +H);
}
}
  