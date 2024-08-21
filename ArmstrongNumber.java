import java.util.Scanner;
public class ArmstrongNumber
{
    static boolean isArmstrongNumber(int number)
    {
        String digits= Integer.toString(number);
        int numdigits=digits.length();
        int sum=0;
        for(int i=0;i<numdigits;i++)
        {
            int digit = Character.getNumericValue(digits.charAt(i));
            sum += Math.pow(digit,numdigits);
        }
        return sum==number;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any Number");
        int number=sc.nextInt();
        if(isArmstrongNumber(number))
        {
            System.out.println("Number is ArmstrongNumber");
        }
        else{
            System.out.println("Number is Not ArmstrongNumber");
        }
    }

}
