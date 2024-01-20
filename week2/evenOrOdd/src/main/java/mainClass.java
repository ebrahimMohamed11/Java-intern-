import java.util.Scanner;

public class mainClass {
   public static String evenorodd(int n){
        if (n%2==0) return "Even";
        return "Odd";
    }
    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println(evenorodd(n));
    }

}
