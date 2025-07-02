import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRunner {
    public static void main(String[] args) {
        System.out.println("main Started");
        String  name = null;
       // System.out.println(name.length());

        Scanner in = new Scanner(System.in);

        int[] numbers = {56,78,89};
        //System.out.println(numbers[3]);
        try{
            int score = in.nextInt();
            System.out.println(name.length());
            System.out.println(numbers[3]);
        }catch (NullPointerException |ArrayIndexOutOfBoundsException |InputMismatchException e){

        }
        System.out.println("main ended");

    }
}
