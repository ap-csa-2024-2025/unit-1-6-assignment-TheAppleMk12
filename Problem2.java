public class Problem2
{
  public static void main(String[] args)
  {
    double num1 = 57.3934;
    double num2 = 22.5211;
    int rNum1 = (int)(num1 + 0.5);
    int rNum2 = (int)(num2 + 0.5);
    int result = rNum1 + rNum2;

    System.out.println("Two original numbers: ");
    System.out.println(num1);
    System.out.println(num2);
    System.out.println("Answer: " + rNum1 + " + " + rNum2 + " = " + result);
  }
}
