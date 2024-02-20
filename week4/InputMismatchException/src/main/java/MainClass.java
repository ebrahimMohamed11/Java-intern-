import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    public static void main( String [] args){

        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two numbers");
        while (true){

            try{
                num1=scanner.nextInt();
                num2=scanner.nextInt();

                System.out.println("The sum ="+ (num1+num2));
                break;

            }catch (InputMismatchException ex){
                System.out.println("plz enter correct integer");
                scanner.nextLine();

            }

        }


    }

}
