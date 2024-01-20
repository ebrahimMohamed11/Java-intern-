import java.util.Scanner;

public class mainClass {
    public static void div(int range,int num){
        while (range>0){

            if (range%num==0) System.out.println(range/num);
            range-=1;
        }
    }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        int range= sc.nextInt();
        int num= sc.nextInt();
        div(range,num);



    }
}
