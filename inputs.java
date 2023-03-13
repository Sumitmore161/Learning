package First_Idea.src;
import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter The Input");
//        int rollno = input.nextInt();
//        System.out.println("Your Roll no is "+ rollno);
        String name = input.nextLine();
        System.out.println(name);
        float marks = input.nextFloat();
        System.out.print(marks);

    }
}
