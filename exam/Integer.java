import java.util.Scanner;

public class MajorOutput01
{
  public static void main(String args[])
  {
    int l, c = 1;

    System.out.println("Enter a number :");
    Scanner in = new Scanner(System.in);

    l = in.nextInt();

    if (l > 0)
      System.out.println("Not a negative Integer!");
    else
      System.out.println("Negative Integer");
      }
    }
