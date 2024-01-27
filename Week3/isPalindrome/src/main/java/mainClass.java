import java.util.Scanner;

public class mainClass {

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int end=s.length()/2-1;
        int start=s.length()-1;
        boolean flag=true;
        for (int i=0 ; i<=end ; i++){
            if (s.charAt(i)!=s.charAt(start)){
                flag=false;
                break;
            }
            start--;

        }
        System.out.println((flag ? "YES" : "NO"));

    }

}
