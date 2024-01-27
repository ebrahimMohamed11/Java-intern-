import java.util.Scanner;

public class mainClass {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int n= s.length()-1;
        for (int i=n ; i>=0 ; i--){
            System.out.print(s.charAt(i));
        }


    }
}
