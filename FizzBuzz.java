import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Input number from 1 to n : ");
        int n = console.nextInt();
 
        List<String> result = fizzBuzz(n);
        for (String s : result) 
        {
            System.out.print(s + " ");
        }
    }
    
    public static List<String> fizzBuzz(int n)
    {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; ++i) 
        {
            if (i % 3 == 0 && i % 5 == 0) 
            {
                result.add("FizzBuzz");
            }

            else if (i % 3 == 0) 
            {
                result.add("Fizz");
            }

            else if (i % 5 == 0) 
            {
                result.add("Buzz");
            }
            else 
            {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}

