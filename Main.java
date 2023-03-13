
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int i=1;
        System.out.println("%d %d %d"+ i++ + --i + ++i);
        Scanner input = new Scanner(System.in);
            System.out.println(input.nextLine());

        System.out.println(input.nextLine());
        float marks = 45.67f;
        int rollno = input.nextInt();
        System.out.println("Your roll number is "+ rollno);
        int a = input.nextInt();
        int b= input.nextInt();
        float c = input.nextFloat();
        char string[];
        System.out.println(input.nextLine());
        System.out.println(" a = b = c =  "+ a + b + c);
    }
}