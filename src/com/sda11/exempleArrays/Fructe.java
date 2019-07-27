import java.util.Scanner;

public class Fructe {

    public static void main ( String []args){

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if (num >=0)
            System.out.println(num+ " " + "is positive");

    }
}

