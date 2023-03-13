package First_Idea.src;

import java.util.Scanner;

//Fibonacci Series upto n
public class solution1 {
    public static void main(String[] args) {
            int n;
            long result=0,num1=1,num2 = 1;
        Scanner input = new Scanner(System.in);
                n = input.nextInt();
                int c = 1;
                while(c != n + 1)
                {
                    if(c ==1 || c == 2)
                    {
                        System.out.print(" " + num1);
                    }
                    else
                    {
                        result = num1 + num2;
                        num1 = num2;
                        num2 = result;
                        System.out.print(" " + result);
                    }
                    c++;
                }

    }
}
