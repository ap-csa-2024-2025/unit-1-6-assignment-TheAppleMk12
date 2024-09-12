public class Problem3
{
    public static void main(String[] args)
    {
        double num1;
        num1 = 67.3424;
        int amount;
        amount = 4;

        System.out.println("Decimal number: " + num1);
        System.out.print("Answer: ");

        while (amount > 0){
            int digit;
            num1 = (num1 % 1) * 10;
            digit = (int)(num1);
            amount--;
            System.out.print(digit + " ");
        }
    }
}
